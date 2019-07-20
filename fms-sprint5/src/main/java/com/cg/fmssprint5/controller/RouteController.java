package com.cg.fmssprint5.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fmssprint5.bean.RouteDTO;
import com.cg.fmssprint5.exception.FRSException;
import com.cg.fmssprint5.service.FlightRouteOperations;
import com.cg.fmssprint5.utility.ExceptionMessages;

@RestController
@RequestMapping(value = "/route")
public class RouteController {

	@Autowired
	FlightRouteOperations routeOperations;
	public void setRouteOperations(FlightRouteOperations routeOperations) {
		this.routeOperations = routeOperations;
	}

	/**
	 * to view routes
	 * 
	 * @return
	 */
	@RequestMapping(value = "/viewlist", method = RequestMethod.GET, produces = "application/json")
	public List<RouteDTO> viewRouteDetails() {
		List<RouteDTO> routeList = new ArrayList<RouteDTO>();
		try {
			routeList = routeOperations.viewRouteDetails();
		} catch (FRSException e) {
			// TODO Auto-generated catch block
			throw new FRSException(ExceptionMessages.LISTEMPTY);
		}
		return routeList;
	}

	/**
	 * to modify source
	 * 
	 * @param dto
	 * @return
	 */
	@RequestMapping(value = "/modifySource", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public boolean modifySource(@Valid @RequestBody RouteDTO dto) {

		boolean flag = false;
		try {
			flag = routeOperations.modifySource(dto);
		} 
		
		catch (FRSException e) {
			// TODO Auto-generated catch block
			System.out.println(ExceptionMessages.NOVALUE);
		}
		if(dto.getSource()==null)
		{
			throw new FRSException(ExceptionMessages.NOVALUE);
		}
		
		return flag;

	}
	/**
	 * to modify destination
	 * 
	 * @param dto
	 * @return
	 */
	@RequestMapping( value = "/modifyDestination",  method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public boolean modifyDestination(@Valid @RequestBody RouteDTO dto) {
		boolean flag = false;
		try {
			flag = routeOperations.modifyDestination(dto);
		} catch (FRSException e) {
			// TODO Auto-generated catch block
			System.out.println(ExceptionMessages.NOVALUE);
		}
		if(dto.getDestination()==null)
		{
			throw new FRSException(ExceptionMessages.NOVALUE);
		}
		return flag;
	}
}
