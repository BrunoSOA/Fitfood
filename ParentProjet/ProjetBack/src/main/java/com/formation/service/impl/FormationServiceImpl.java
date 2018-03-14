package com.formation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.formation.dao.IFormationDao;
import com.formation.entity.Formation;
import com.formation.service.IFormationService;

@Transactional
@Component
public class FormationServiceImpl implements IFormationService {
	
	@Autowired
	IFormationDao formationDao;

	public void save(Formation entity) {
		formationDao.save(entity);

	}

	public void delete(Formation entity) {
		formationDao.delete(entity);

	}

	public Formation find(int entityID) {
		return formationDao.find(entityID);
	}

	public List<Formation> findAll() {
		return formationDao.findAll();
	}

	public Formation update(Formation entity) {

		return formationDao.update(entity);
	}
}
