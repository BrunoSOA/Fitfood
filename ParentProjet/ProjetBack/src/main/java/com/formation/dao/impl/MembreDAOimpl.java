package com.formation.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.formation.dao.IMembreDao;
import com.formation.entity.Membre;

@Transactional
@Repository
public class MembreDAOimpl  implements IMembreDao{

	Logger log = Logger.getLogger(getClass());
	
	protected EntityManager em;

	@PersistenceContext(unitName = "entityManagerFactory")
	public void setEntityManager(EntityManager entityManager) {
		this.em = entityManager;
	}
	
	public Membre findByMail(String mail) {
		return em.find(Membre.class, mail);
	}

	public void save(Membre entity) {
		em.persist(entity);
	}

	public void delete(Membre entity) {
		// TODO Auto-generated method stub
		
	}

	public Membre find(int entityID) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Membre> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Membre update(Membre entity) {
		// TODO Auto-generated method stub
		return null;
	}


}
