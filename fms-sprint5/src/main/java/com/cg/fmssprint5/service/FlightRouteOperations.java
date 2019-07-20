package com.cg.fmssprint5.service;

import java.util.List;

import com.cg.fmssprint5.bean.RouteDTO;
import com.cg.fmssprint5.exception.FRSException;


public interface FlightRouteOperations {
	public boolean modifyDestination(RouteDTO route) throws  FRSException;
	public  List<RouteDTO> viewRouteDetails() throws FRSException;
	public boolean modifySource(RouteDTO route) throws FRSException;

}
