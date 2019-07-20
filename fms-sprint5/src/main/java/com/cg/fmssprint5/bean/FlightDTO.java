package com.cg.fmssprint5.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * dto class of flight
 * 
 * @author seeta
 *
 */

@Entity
@Table(name = "flight")
public class FlightDTO  implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FlightDTO(int flightId, int capacity) {
		super();
		this.flightId = flightId;
		this.capacity = capacity;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FLIGHT_SEQ")
	@SequenceGenerator(name = "FLIGHT_SEQ", sequenceName = "flight_seq")
	@Column(name = "flight_id", updatable = false, nullable = false)
	private int flightId;
	@Column(name = "capacity")
	private int capacity;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "schedule_id", referencedColumnName = "schedule_id")
	private ScheduleDTO scheduleDTO;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "route_id", referencedColumnName = "route_id")
	private RouteDTO routeDTO;

	public ScheduleDTO getScheduleDTO() {
		return scheduleDTO;
	}

	public void setScheduleDTO(ScheduleDTO scheduleDTO) {
		this.scheduleDTO = scheduleDTO;
	}

	public RouteDTO getRouteDTO() {
		return routeDTO;
	}

	public void setRouteDTO(RouteDTO routeDTO) {
		this.routeDTO = routeDTO;
	}

	/**
	 * @return the flightId
	 */
	public int getFlightId() {
		return flightId;
	}

	/**
	 * @param flightId the flightId to set
	 */
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "flightId=" + flightId + ", capacity=" + capacity + ", scheduleDTO=" + scheduleDTO
				+ ", routeDTO=" + routeDTO;
	}
}
