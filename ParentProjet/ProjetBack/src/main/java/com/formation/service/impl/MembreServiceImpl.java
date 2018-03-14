
package com.formation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.formation.dao.IMembreDao;
import com.formation.entity.Membre;
import com.formation.service.IMembreService;

@Transactional
@Component
public class MembreServiceImpl implements IMembreService{

	@Autowired
	IMembreDao membreDao;
	
	public void save(Membre entity) {
		membreDao.save(entity);
	}

	public Membre findByMail(String mail) {
		return null;
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
