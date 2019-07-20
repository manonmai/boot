package com.cg.fmssprint5.dao.Impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.fmssprint5.bean.ScheduleDTO;
import com.cg.fmssprint5.dao.FlightScheduleDao;
import com.cg.fmssprint5.exception.FRSException;
import com.cg.fmssprint5.utility.Queries;

@Repository
@Transactional
public class FlightScheduleDaoImpl implements FlightScheduleDao {
	ScheduleDTO dto = new ScheduleDTO();

	/**
	 * method to get flight schedule details
	 */

	@PersistenceContext
	private EntityManager entityManager;

	public List<ScheduleDTO> getList() throws FRSException {
		// TODO Auto-generated method stub
		String sql = Queries.GETSCHEDULELIST;
		TypedQuery<ScheduleDTO> query = (TypedQuery<ScheduleDTO>) entityManager.createQuery(sql);
		List<ScheduleDTO> scheduleList = new ArrayList<ScheduleDTO>();
		scheduleList = query.getResultList();
		return scheduleList;

	}

	/**
	 * method to modify departure date
	 */
	public boolean modifyDepartureDate(ScheduleDTO scheduleDTO) throws FRSException {

		boolean flag = false;

		ScheduleDTO schedule = entityManager.find(ScheduleDTO.class, scheduleDTO.getScheduleId());
		if (schedule != null) {
			schedule.setDepartureDate(scheduleDTO.getDepartureDate());
			flag = true;
		}
		return flag;
	}

	/**
	 * method to modify arrival time
	 */
	public boolean modifyArrivalDate(ScheduleDTO scheduleDTO) throws FRSException {
		boolean flag = false;
		ScheduleDTO schedule = entityManager.find(ScheduleDTO.class, scheduleDTO.getScheduleId());
		if (schedule != null) {
			schedule.setArrivalDate(scheduleDTO.getArrivalDate());
			flag = true;
		}

		return flag;

	}

	/**
	 * method to modify departure time
	 */
	public boolean modifyDepartureTime(ScheduleDTO scheduleDTO) throws FRSException {
		boolean flag = false;
		ScheduleDTO schedule = entityManager.find(ScheduleDTO.class, scheduleDTO.getScheduleId());
		if (schedule != null) {
			schedule.setDepartureTime(scheduleDTO.getDepartureTime());
			flag = true;
		}

		return flag;

	}

	/**
	 * method to modify arrivalTime
	 */
	public boolean modifyArrivalTime(ScheduleDTO scheduleDTO) throws FRSException {
		boolean flag = false;
		ScheduleDTO schedule = entityManager.find(ScheduleDTO.class, scheduleDTO.getScheduleId());
		if (schedule != null) {
			schedule.setArrivalTime(scheduleDTO.getArrivalTime());
			flag = true;
		}

		return flag;

	}

	/**
	 * method to modify price
	 */
	public boolean modifyPrice(ScheduleDTO scheduleDTO) throws FRSException {
		boolean flag = false;
		ScheduleDTO schedule = entityManager.find(ScheduleDTO.class, scheduleDTO.getScheduleId());
		if (schedule != null) {
			schedule.setPrice(scheduleDTO.getPrice());
			flag = true;
		}
		return flag;

	}

}
