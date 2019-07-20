package com.cg.fmssprint5.dao.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.fmssprint5.bean.RouteDTO;
import com.cg.fmssprint5.dao.FlightRouteDao;
import com.cg.fmssprint5.exception.FRSException;
import com.cg.fmssprint5.utility.ExceptionMessages;
import com.cg.fmssprint5.utility.Queries;

/**
 * DaoImpl class for flight routes
 * 
 * @author trainee
 *
 */
@Repository
@Transactional
public class FlightRouteDaoImpl implements FlightRouteDao {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * 
	 * method to get route details
	 *
	 */

	public List<RouteDTO> getRouteList() throws FRSException {
		System.out.println("ysdrtf");

		String sql = Queries.GETROUTELIST;
		// Query route=entityManager.createQuery("Select route from RouteDTO route");
		TypedQuery<RouteDTO> route = (TypedQuery<RouteDTO>) entityManager.createQuery(sql);
		List<RouteDTO> routel = route.getResultList();
		return routel;

	}

	/**
	 * method to modify source
	 */

	public boolean modifySource(RouteDTO route) throws FRSException {
		
		
		int routeId;
		String source;
		routeId = route.getRouteId();
		source = route.getSource();
		// TODO Auto-generated method stub
		boolean flag = false;
		RouteDTO route1 = entityManager.find(RouteDTO.class, routeId);
		
		if (route1 != null && route.getSource()!=null) {
			System.out.println("test");
			route1.setSource(source);
			flag = true;
		}
		else {
			throw new FRSException(ExceptionMessages.NOVALUE);
		}
	    //entityManager.merge(route);

		return flag;
	}

	/**
	 * method to modify destination
	 */

	public boolean modifyDestination(RouteDTO route) throws FRSException {
		int routeId;
		String destination;
		routeId = route.getRouteId();
		destination = route.getDestination();
		boolean flag = false;
		RouteDTO route1 = entityManager.find(RouteDTO.class, routeId);
		if (route1 != null) {
			route1.setDestination(destination);
			flag = true;
		}
		return flag;
	}
}