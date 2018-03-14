package com.formation.dao;

import java.util.List;

import com.formation.entity.Membre;

public interface IMembreDao {
	
	public void save(Membre entity);

	public void delete(Membre entity);

	public Membre find(int entityID);
	
	public Membre findByMail(String mail);

	public List<Membre> findAll();
	
	public Membre update(Membre entity);

}
