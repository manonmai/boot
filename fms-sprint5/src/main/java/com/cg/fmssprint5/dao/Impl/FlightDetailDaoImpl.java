package com.cg.fmssprint5.dao.Impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.fmssprint5.bean.FlightDTO;
import com.cg.fmssprint5.dao.FlightDetailDao;
import com.cg.fmssprint5.exception.FRSException;
import com.cg.fmssprint5.utility.Queries;

/**
 * daoImpl class of flight details
 * 
 * @author seeta
 *
 */
@Repository
@Transactional
public class FlightDetailDaoImpl implements FlightDetailDao {
	/**
	 * method to get flight details
	 */
	@PersistenceContext
	private EntityManager entityManager;

	public List<FlightDTO> getFlightList() throws FRSException {
		String sql = Queries.GETFLIGHTLIST;
		TypedQuery<FlightDTO> query = (TypedQuery<FlightDTO>) entityManager.createQuery(sql);
		List<FlightDTO> routelist = new ArrayList();
		routelist = query.getResultList();
		return routelist;
	}

	/**
	 * method to modify capacity
	 */

	public boolean modifyCapacity(FlightDTO flight) throws FRSException {

		int flightId;
		int capacity;
		flightId = flight.getFlightId();
		capacity = flight.getCapacity();
		boolean flag = false;
		FlightDTO flight1 = entityManager.find(FlightDTO.class, flightId);
		if (flight1 != null) {
			flight1.setCapacity(capacity);
			flag = true;
			entityManager.getTransaction().commit();
		}
		return flag;
	}
}
