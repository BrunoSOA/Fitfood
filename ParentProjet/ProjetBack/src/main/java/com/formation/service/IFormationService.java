package com.formation.service;

import java.util.List;

import com.formation.entity.Formation;

public interface IFormationService {
	
	public void save(Formation entity);

	public void delete(Formation entity);

	public Formation find(int entityID);

	public List<Formation> findAll();
	
	public Formation update(Formation entity);

}
