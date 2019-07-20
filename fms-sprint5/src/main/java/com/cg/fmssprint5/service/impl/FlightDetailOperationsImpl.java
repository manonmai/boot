package com.cg.fmssprint5.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fmssprint5.bean.FlightDTO;
import com.cg.fmssprint5.dao.FlightDetailDao;
import com.cg.fmssprint5.exception.FRSException;
import com.cg.fmssprint5.service.FlightDetailOperations;
/**
 * Service class for flight detail operations
 * @author seeta
 *
 */

@Service
public class FlightDetailOperationsImpl implements FlightDetailOperations {
	@Autowired
	 FlightDetailDao daoImpl;
	 public void setDaoImpl(FlightDetailDao daoImpl) {
		this.daoImpl = daoImpl;
	}
	/**
	  * service method to modify flight details
	  */
	public boolean modifyFlightDetails(FlightDTO flight) throws  FRSException {
		// TODO Auto-generated method stub
		boolean flag;
		flag = false;
			if(daoImpl.modifyCapacity(flight)) {
				flag=true;
			}
		return flag;
	}
	/**
	 * service method to view flight details
	 */

	public List<FlightDTO> viewFlightDetails() throws  FRSException
	{
		// TODO Auto-generated method stub
		List<FlightDTO>flightList;
		flightList=(daoImpl.getFlightList());
		return flightList;
		}

}
