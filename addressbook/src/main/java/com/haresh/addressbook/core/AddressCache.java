package com.haresh.addressbook.core;

import java.util.HashMap;

import java.util.Scanner;

public class AddressCache {
	private static AddressCache mInstance = null;
	
	private HashMap<Integer, Contact> addressMap1 = new HashMap<>();
	
	private AddressCache(){}
	
	public static AddressCache get(){
		if(mInstance==null){
			mInstance= new AddressCache(); //singleton
		}
		return mInstance;
	}
	Scanner scan = new Scanner(System.in);
	
	public void addContact(Contact contact) {
		addressMap1.put(contact.getId(), contact);
		} // adds according to ID 
	
	public Contact getContact(int id) {
		return addressMap1.get(id);
	}	//displays all the contents of the ID 
//	private HashMap<String, Name> addressMap2 = new HashMap<>(); //input through Keyvalue as string 
	//public void addContactString(Name name){
	//	addressMap2.put(name.getFirstName(),name);
		
	
	public void delete(int id) {
		int m;
		System.out.println("Enter the ID you'd wish to delete");
		m=scan.nextInt();
		addressMap1.remove(m); // delete the particular ID 
		
	}
	
	public void getallcontacts(int id) { 
		  for(HashMap.Entry<Integer, Contact> entry:addressMap1.entrySet()){    
		        int key=entry.getKey();  
		        Contact obj=entry.getValue();  
		        System.out.println(key+" Details:");  
		        System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getLocations()+" "+obj.getPhoneNumber());   
		    }
	}
	public int searchContact(int id){
		
	  
        System.out.println("Enter an ID to be searched for:");  
         int x= scan.nextInt();  // x is the ID that we're searching for
        if (addressMap1.containsKey(x)) {

        }
        return x ;
   
	}
}
