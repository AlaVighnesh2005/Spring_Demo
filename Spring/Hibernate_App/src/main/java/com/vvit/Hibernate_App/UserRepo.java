package com.vvit.Hibernate_App;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository

public class UserRepo {

	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public void save(Employee emp)
	{
		em.persist(emp);  //insert query
		
	}
	
}
