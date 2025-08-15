package com.modal3;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Trainee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int traineeID;
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Trainees_courses" ,
	         joinColumns = { @JoinColumn(name="traineeId")},
			 inverseJoinColumns = { @JoinColumn(name="courseID") }
			)
	private List<Course> course;
	

	public List<Course> getCourse() {
		return course;
	}


	public void setCourse(List<Course> course) {
		this.course = course;
	}


	public Trainee() {
		// TODO Auto-generated constructor stub
	}


	public Trainee(String name) {
		super();
		this.name = name;
	}


	public int getTraineeID() {
		return traineeID;
	}


	public void setTraineeID(int traineeID) {
		this.traineeID = traineeID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Trainee [traineeID=" + traineeID + ", name=" + name + "]";
	}
	
	
	
}
