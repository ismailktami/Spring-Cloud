package org.sid.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Company {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private double price;


public Company() {
	// TODO Auto-generated constructor stub
}

public Company(String name,double price) {
	this.name=name;
	this.price=price;
}
public String getName() {
	return name;
}
public double getPrice() {
	return price;
}

public void setName(String name) {
	this.name = name;
}

public void setPrice(double price) {
	this.price = price;
}
}
