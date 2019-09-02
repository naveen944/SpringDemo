package com.talentsprint.businesstier;

import java.util.Calendar;
import java.util.List;

public class PersonNew {
	private String adharCardNumber;
	private String firstName;
	private String lastName;
	private Calendar birthDate;
	private List<Address> addressList;
	
	public PersonNew(){
		
	}


	public PersonNew(String adharCardNumber, String firstName, String lastName, Calendar birthDate) {
		super();
		this.adharCardNumber = adharCardNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}


	public String getAdharCardNumber() {
		return adharCardNumber;
	}


	public void setAdharCardNumber(String adharCardNumber) {
		this.adharCardNumber = adharCardNumber;
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


	public String getBirthDate() {
		return birthDate.get(Calendar.DATE) + "/"+(birthDate.get(Calendar.MONTH)+1)
				+"/"+birthDate.get(Calendar.YEAR);
	}


	public void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}


	public List<Address> getAddressList() {
		return addressList;
	}


	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	
	

}
