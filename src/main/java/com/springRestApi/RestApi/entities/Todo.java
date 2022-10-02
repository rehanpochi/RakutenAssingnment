package com.springRestApi.RestApi.entities;

public class Todo {
	
    public String name;
    
    //setting up constructor
   public Todo(String name) {
	super();
	this.name=name;
}

//default constructor

public Todo() {
	super();
}

public void setName(String name) {
	this.name=name;
}

public String getName(String name) {
	return name;
}


@Override
public String toString() {
	return "Todo" + name;
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
    

