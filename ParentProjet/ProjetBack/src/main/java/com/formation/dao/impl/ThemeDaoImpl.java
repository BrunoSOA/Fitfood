package com.formation.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.formation.dao.IThemeDao;
import com.formation.entity.Formation;
import com.formation.entity.Theme;

@Transactional
@Repository
public class ThemeDaoImpl implements IThemeDao {
	
	Logger log = Logger.getLogger(getClass());
	
	protected EntityManager em;

	@PersistenceContext(unitName="entityManagerFactory")
	public void setEntityManager(EntityManager entityManager) {
		this.em = entityManager;
	}

	public void save(Theme entity) {
		em.persist(entity);
	}

	public void delete(Theme entity) {
		Theme toRemoved = em.merge(entity);
		em.remove(toRemoved);
	}

	public Theme find(int idTheme) {
		return em.find(Theme.class, idTheme);
	}

	public List<Theme> findAll() {
		Query q = em.createQuery("FROM Theme" );
		return (List<Theme>) q.getResultList();
	}

	public Theme update(Theme entity) {
		return em.merge(entity);
	}

	public List<Formation> getFormationByTheme(int idTheme) {
		Query q = em.createQuery(
				"FROM Formation e WHERE e.theme.idTheme = :idTheme");
			q.setParameter("idTheme", idTheme);
		return (List<Formation>) q.getResultList();
	}
}


