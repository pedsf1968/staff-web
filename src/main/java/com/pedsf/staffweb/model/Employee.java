package com.pedsf.staffweb.model;


import lombok.Data;

@Data
public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private String mail;
	private String password;
}