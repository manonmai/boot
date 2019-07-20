package com.cg.fmssprint5.dao;

import java.util.List;

import com.cg.fmssprint5.bean.ScheduleDTO;
import com.cg.fmssprint5.exception.FRSException;


public interface FlightScheduleDao {
	public List<ScheduleDTO> getList() throws FRSException;

	public boolean modifyDepartureDate(ScheduleDTO scheduleDTO) throws FRSException;

	public boolean modifyArrivalDate(ScheduleDTO scheduleDTO) throws FRSException;

	public boolean modifyDepartureTime(ScheduleDTO scheduleDTO)  throws FRSException;

	public boolean modifyArrivalTime(ScheduleDTO scheduleDTO)  throws FRSException;

	public boolean modifyPrice(ScheduleDTO scheduleDTO)  throws FRSException;

}
