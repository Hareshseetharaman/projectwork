package com.haresh.addressbook.core;

import java.util.List;

public class Contact {
	
	private int id;
	private Name name;
	private List<Location> locations;
	private List<Phone> phoneNumber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public List<Location> getLocations() {
		return locations;
	}
	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	public List<Phone> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(List<Phone> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	

}
