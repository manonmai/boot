package com.cg.fmssprint5.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fmssprint5.bean.ScheduleDTO;
import com.cg.fmssprint5.exception.FRSException;
import com.cg.fmssprint5.service.FlightScheduleOperations;

/**
 * Controller for schedule operations
 * 
 * @author seeta
 *
 */
@RestController
@RequestMapping(value = "/schedule")
public class SheduleDetailController {
	@Autowired
	FlightScheduleOperations scheduleOperations;

	public void setScheduleOperations(FlightScheduleOperations scheduleOperations) {
		this.scheduleOperations = scheduleOperations;
	}

	/**
	 * to modify departure date
	 * 
	 * @param scheduledto
	 * @return boolean
	 */
	@RequestMapping(value = "/modifyDDate", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public boolean modifyDepartureDate(@RequestBody ScheduleDTO dto) {
		boolean flag = false;
		try {
			flag = scheduleOperations.modifyDepartureDate(dto);
		} catch (FRSException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return flag;

	}

	/**
	 * to modify arrival date
	 * 
	 * @param scheduledto
	 * @return boolean
	 */
	@RequestMapping(value = "/modifyADate", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public boolean modifyArrivalDate(@DateTimeFormat(pattern = "dd-MM-YYYY") @RequestBody ScheduleDTO dto) {
		boolean flag = false;
		try {
			flag = scheduleOperations.modifyArrivalDate(dto);
		} catch (FRSException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return flag;

	}

	/**
	 * to modify arrival time
	 * 
	 * @param scheduledto
	 * @return boolean
	 */
	@RequestMapping(value = "/modifyATime", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public boolean modifyArrivalTime(@RequestBody ScheduleDTO dto) {
		boolean flag = false;
		try {
			flag = scheduleOperations.modifyArrivalTime(dto);
		} catch (FRSException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return flag;

	}

	/**
	 * to modify departure time
	 * 
	 * @param scheduledto
	 * @return boolean
	 */
	@RequestMapping(value = "/modifyDTime", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public boolean modifyDepartureTime(@RequestBody ScheduleDTO dto) {
		boolean flag = false;
		try {
			flag = scheduleOperations.modifyDepartureTime(dto);
		} catch (FRSException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return flag;

	}

	/**
	 * to view schedule details
	 * 
	 * @return
	 */
	@RequestMapping(value = "/viewSchedule", method = RequestMethod.GET, produces = "application/json")
	public List<ScheduleDTO> viewScheduleDetails() {
		List<ScheduleDTO> scheduleList = new ArrayList<ScheduleDTO>();

		try {
			scheduleList = scheduleOperations.viewScheduleDetails();

		} catch (FRSException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		return scheduleList;
	}

}
