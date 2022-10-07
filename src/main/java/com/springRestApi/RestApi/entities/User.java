package com.springRestApi.RestApi.entities;

public class User {
	
	public int id;
    public String name;
    
    //setting up constructor
   public User(int id,String name) {
	super();
	this.id=id;
	this.name=name;
}

//default constructor

public User() {
	super();
}

public void setName(String name) {
	this.name=name;
}

public String getName() {
	return name;
}

public void setId(int id) {
	this.id=id;
}

public int getId() {
	return id;
}


@Override
public String toString() {
	return name;
}



//	//setters
//	public void setPrice(double price) {
//		this.price=price;	
//	}
	
//	
//	public void setCountry(String country) {
//		this.country=country;
//	}
//
//	//getters
//	public double getPrice(double price) {
//		return price;
//	}
//	
//	public String getName(String name) {
//		return name;
//	}
//	
//	public String getCountry(String country) {
//		return country;
//	}
	
}
    

