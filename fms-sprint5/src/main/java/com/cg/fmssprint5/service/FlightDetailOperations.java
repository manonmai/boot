package com.cg.fmssprint5.service;

import java.util.List;

import com.cg.fmssprint5.bean.FlightDTO;
import com.cg.fmssprint5.exception.FRSException;


public interface FlightDetailOperations {
	public boolean modifyFlightDetails(FlightDTO flight)throws FRSException;
	public List<FlightDTO> viewFlightDetails()throws  FRSException;

}
