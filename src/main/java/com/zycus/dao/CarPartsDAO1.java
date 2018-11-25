package com.zycus.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.zycus.dao.interfaces.CarPartDao;
import com.zycus.entity.CarPart;

@Component
public class CarPartsDAO1 implements CarPartDao {
	//Dependency
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private CarPartRowMapper carPartRowMapper;
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void addNewPart(CarPart carPart) throws SQLException{
		// TODO Auto-generated method stub
		entityManager.persist(carPart);
	}
	public List<CarPart> getCarParts() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("SELECT carPart FROM CarPart carPart").getResultList();
	}
	
}
