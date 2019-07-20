package com.cg.fmssprint5.dao;

import java.util.List;

import com.cg.fmssprint5.bean.FlightDTO;
import com.cg.fmssprint5.exception.FRSException;



public interface FlightDetailDao {
public List<FlightDTO> getFlightList() throws FRSException;
	
	boolean modifyCapacity(FlightDTO flight) throws FRSException;

}
