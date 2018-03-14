package com.formation.managedbean;

import javax.faces.bean.ManagedBean;

import com.formation.entity.Membre;
import com.formation.facade.Facade;

@ManagedBean
public class ConnexionCtrl {
	
	Membre membre = new Membre();
	

	public String connexion() {
		Facade.getInstance().getMembreService().save(membre);
		return "Profil";
	}
	
	
	public String getInscription() {
		return "Inscription";
	}
	
	
	public Membre getMembre() {
		return membre;
	}
	
	public void setMembre(Membre membre) {
		this.membre = membre;
	}
}
