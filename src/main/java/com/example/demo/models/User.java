package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column  
private long id;

@Column 
private String email;

@Column 
private String mdp;

@Column 
private String groupe ;

@Column 
private String username ;




public User(long id, String email, String mdp, String group, String username) {
	this.id = id;
	this.email = email;
	this.mdp = mdp;
	this.groupe = group;
	this.username = username;
}

public User() {}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMdp() {
	return mdp;
}

public void setMdp(String mdp) {
	this.mdp = mdp;
}

public String getGroup() {
	return groupe;
}

public void setGroup(String group) {
	this.groupe = group;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}




	
}
