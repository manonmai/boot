package com.cg.fmssprint5.bean;

import java.io.Serializable;
import java.util.Date;


/**
 * DTO class to store schedule information
 * @author seeta
 *
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "schedule")
@NamedQuery(name = "ScheduleDTO.findAll", query = "SELECT c FROM ScheduleDTO c")
public class ScheduleDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SCHEDULE_SEQ")
	@SequenceGenerator(name = "SCHEDULE_SEQ", sequenceName = "schedule_seq")
	@Column(name = "schedule_id")
	private int scheduleId;
	@Column(name = "arrival_date")
	private Date arrivalDate;
	@Column(name = "departure_date")
	private Date departureDate;
	@Column(name = "arrival_time")
	private String arrivalTime;
	@Column(name = "departure_time")
	private String departureTime;
	@Column(name = "price")
	private double price;
	@OneToOne(mappedBy = "scheduleDTO")
	private FlightDTO flightDTO;
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "scheduleId=" + scheduleId + ", arrivalDate=" + arrivalDate + ", departureDate="
				+ departureDate + ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime + ", price="
				+ price ;
	}

}
