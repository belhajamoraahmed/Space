package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="planete")
public class Planete {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column  
private long id ;	

@Column
private String nom ;

@Lob 
@Column
private String description ;
	
@Column
private String url ;

public Planete(long id, String nom, String description,String url) {
	super();
	this.id = id;
	this.nom = nom;
	this.description = description;
	this.url = url;
}

public Planete() {
	
}
	
public String getURL(){
return url;
}
	
public void setURL(String url) {
	this.url = url;
}	
	
public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}





	
}

