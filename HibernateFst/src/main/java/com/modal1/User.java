package com.modal1;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userID;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="passportID")
	private Passport passport;
	
	public User() {
	}

	public User(int userID, String name, Passport passport) {
		super();
		this.userID = userID;
		this.name = name;
		this.passport = passport;
		
	}
	
	public User(String name, Passport passport) {
		super();
		this.name = name;
		this.passport = passport;
		
	}
	

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", name=" + name + ", passport=" + passport + "]";
	}
	
	
	

}
