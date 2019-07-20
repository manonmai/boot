package com.cg.fmssprint5.bean;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;


@Entity
@Table(name = "route")
public class RouteDTO implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROUTE_SEQ")
	@SequenceGenerator(name = "ROUTE_SEQ", sequenceName = "route_seq")
	@Column(name = "route_id",updatable = false, nullable = false)
	@Digits(integer=6,fraction=0)
	@NumberFormat()
	private int routeId;
	@Column(name = "source")
	@Pattern(regexp="[A-Z]{1}[a-z]*", message = "Please enter source in correct format")
	private String source;
	@Column(name = "destination")
	@Pattern(regexp = "[A-Z]{1}[a-z]*", message = "Please enter destination in correct format")
	private String destination;
	@OneToOne(mappedBy = "routeDTO")
	private FlightDTO flightDTO;
	/**
	 * @return the routeId
	 */
	public int getRouteId() {
		return routeId;
	}
	/**
	 * @param routeId the routeId to set
	 */
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}


	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}


	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}


	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "routeId=" + routeId + ", source=" + source + ", destination=" + destination;
	}

	
	
	
}

	
	