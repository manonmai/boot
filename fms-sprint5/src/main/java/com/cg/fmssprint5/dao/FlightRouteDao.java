package com.cg.fmssprint5.dao;

import java.util.List;

import com.cg.fmssprint5.bean.RouteDTO;
import com.cg.fmssprint5.exception.FRSException;


public interface FlightRouteDao {
	List<RouteDTO> getRouteList() throws FRSException;

	boolean modifySource(RouteDTO route) throws FRSException;

	

	boolean modifyDestination(RouteDTO route) throws FRSException;

}
