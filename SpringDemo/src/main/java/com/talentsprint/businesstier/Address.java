package com.talentsprint.businesstier;

public class Address {
	private Integer doorNumber;
	private String streetName;
	private String city;
	private String state;
	private String country;
	
	
	public Address(){
		
	}


	public Address(Integer doorNumber, String streetName, String city, String state, String country) {
		super();
		this.doorNumber = doorNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.country = country;
	}


	public Integer getDoorNumber() {
		return doorNumber;
	}


	public void setDoorNumber(Integer doorNumber) {
		this.doorNumber = doorNumber;
	}


	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
