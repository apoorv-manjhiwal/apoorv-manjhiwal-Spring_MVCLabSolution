package com.greatlearning.studentManagement.entity;

import javax.persistence.Entity;
import javax.persistence.table;
import javax.persistence.Id;
import javax.persistence.generatedValue;
import javax.persistence.generationType;
@Entity
@Table(name="student")

public class Student {
	
	
	@Id	
	@generatedValue(strategy=GenerationType.INDENTITY)
	@Column(name="id")
	
	



	private int id;
	@Column(name="firstName")
	
	private String firstName;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public class Student {
		@Override
		public String toString() {
			return "Student [id=" + id + ", firstName=" + "firstName" + ", lastName=" + lastName + ", course=" + course
					+ ", country=" + country + "]";
		}
		public Student() {
			
			
		}
	public Student(String lastName, String course, String country) {
			
			this.firstName = firstname;
			this.lastName = lastName;
			this.course = course;
			this.country = country;
		}
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="course")
	private String course;
	
	@Column(name="country")
	private String country;
	

}
