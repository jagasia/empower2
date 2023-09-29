package com.empower.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Candidate {
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	
	public Candidate() {}

	public Candidate(Integer id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	
}
