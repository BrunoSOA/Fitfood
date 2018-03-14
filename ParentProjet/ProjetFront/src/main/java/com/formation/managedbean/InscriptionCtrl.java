package com.formation.managedbean;

import javax.faces.bean.ManagedBean;

import com.formation.entity.Membre;
import com.formation.facade.Facade;

@ManagedBean
public class InscriptionCtrl {

	private Membre membre = new Membre();
	private String confirmation;


	public String saveMembre() {
		Facade.getInstance().getMembreService().save(membre);
		return "HomeD";
	}
	
	public String getConfirmation() {
		return confirmation;
	}
	
	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}
	
	public Membre getMembre() {
		return membre;
	}
	
	public void setMembre(Membre membre) {
		this.membre = membre;
	}
}
