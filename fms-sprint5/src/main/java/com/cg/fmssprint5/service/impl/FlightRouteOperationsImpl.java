package com.cg.fmssprint5.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fmssprint5.bean.RouteDTO;
import com.cg.fmssprint5.dao.FlightRouteDao;
import com.cg.fmssprint5.exception.FRSException;
import com.cg.fmssprint5.service.FlightRouteOperations;


/**
 * service class to perform flight route operations
 * @author seeta
 *
 */
@Service
public class FlightRouteOperationsImpl implements FlightRouteOperations{
	@Autowired
	FlightRouteDao dao;

	/**
	 * service method to modify source
	 */
	public boolean modifySource(RouteDTO route) throws FRSException
	{
			return dao.modifySource(route);

	}
	public void setDaoImpl(FlightRouteDao daoImpl) {
		this.dao = daoImpl;
	}
	/**
	 * service method to modify destination
	 */
	public boolean modifyDestination(RouteDTO route) throws FRSException
	{
		return dao.modifyDestination(route);
	}
	public List<RouteDTO> viewRouteDetails() throws FRSException
	{
		// TODO Auto-generated method stub
		

		List<RouteDTO>routeList;
		routeList=(dao.getRouteList());
		return routeList;
	}
	







}