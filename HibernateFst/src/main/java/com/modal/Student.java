package com.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQueries({@NamedQuery(name="selectquery", query="from Student"),
			  @NamedQuery(name="updatequery", query="update Student set name=?1 where id=?2")
             }) 
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studID;
	private String name;
	private int marks;
	
	public Student() {
	}
	
	public Student(String name, int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	

	public int getStudID() {
		return studID;
	}

	public void setStudID(int studID) {
		this.studID = studID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(int studID, String name, int marks) {
		super();
		this.studID = studID;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studID=" + studID + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}
