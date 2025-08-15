package com.modal1;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {

	@Id
	private int passportNumber;
	private String issuedPlace;
	
	@OneToOne(mappedBy = "passport", cascade = CascadeType.ALL)
	private User user;
	
	
	public Passport(){
	}

	public int getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getIssuedPlace() {
		return issuedPlace;
	}

	public void setIssuedPlace(String issuedPlace) {
		this.issuedPlace = issuedPlace;
	}

	public Passport(int passportNumber, String issuedPlace) {
		super();
		this.passportNumber = passportNumber;
		this.issuedPlace = issuedPlace;
	}
	
	public Passport(String issuedPlace) {
		super();
		this.issuedPlace = issuedPlace;
	}
	
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Passport(int passportNumber, String issuedPlace, User user) {
		super();
		this.passportNumber = passportNumber;
		this.issuedPlace = issuedPlace;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Passport [passportNumber=" + passportNumber + ", issuedPlace=" + issuedPlace + "]";
	}
	
	
	
}
