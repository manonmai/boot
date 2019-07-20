package com.cg.fmssprint5.utility;

public class Queries {
	//public static final String getList = "select aeroplane_id,capacity from aeroplane";
	//public static final String modifyCapacity = " update aeroplane set capacity = ? where aeroplane_id = ?";
	public static final String GETROUTELIST = "FROM RouteDTO route" ;
//	public static final String getscheduleList = "select flight_id,departure_date,arrival_date,departure_time,arrival_time,price from fligh";
//	public static final String modifySource = "update flight set source = ? where flight_id = ?";
//	public static final String modifyDestination = "update flight set destination = ? where flight_id = ?";
//	public static final String modifyDepartureDate = "update fligh set departure_date = ? where flight_id = ?";
//	public static final String modifyArrivalDate = "update fligh set arrival_date = ? where flight_id = ?";
//	public static final String modifyDepartureTime = "update fligh set departure_time = ? where flight_id = ?";
//	public static final String modifyArrivalTime = "update fligh set arrival_time = ? where flight_id = ?";
	public static final String GETSCHEDULELIST = "Select schedule from ScheduleDTO schedule";
	public static final String GETFLIGHTLIST = "FROM FlightDTO flight";
	

}
