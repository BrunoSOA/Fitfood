package com.formation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Membre {

	@Id
	@GeneratedValue
	private int idMembre;

	private String firstName;

	
	private String lastName;

	private String sexe;
	
	private int age;

	private String mail;

	private String passWord;

	public Membre(String firstName, String lastName, int age, String mail, String passWord, String sexe) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.sexe = sexe;
		this.age = age;
		this.mail = mail;
		this.passWord = passWord;
	}

	public int getIdMembre() {
		return idMembre;
	}

	public void setIdMembre(int idMembre) {
		this.idMembre = idMembre;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSexe() {
		return sexe;
	}
	
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}



	
	@Override
	public String toString() {
		return "Membre [firstName=" + firstName + ", sexe=" + sexe + ", lastName=" + lastName + ", age=" + age
				+ ", mail=" + mail + ", passWord=" + passWord + "]";
	}

	public Membre() {
	}
}
