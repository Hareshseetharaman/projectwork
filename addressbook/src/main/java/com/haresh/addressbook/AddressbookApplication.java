package com.haresh.addressbook;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.haresh.addressbook.core.AddressCache;
import com.haresh.addressbook.core.Contact;
import com.haresh.addressbook.core.Name;

@SpringBootApplication
public class AddressbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressbookApplication.class, args);
		Contact c1 = new Contact();
		Scanner sc = new Scanner(System.in);
		int x;
		String y;
		System.out.println("Enter the ID and \n 2.The name of the Contact");
		x=sc.nextInt();
		c1.setId(x);
		Name n1 = new Name();
		y=sc.next();
		n1.setFirstName("y");
		c1.setName(n1);
		Contact c2  = new Contact();
//		c2.setId(2);
//		Name n2 = new Name();
//		n2.setFirstName("Jack Sparrow");
//		c2.setName(n2);
//		
		AddressCache cache = AddressCache.get();
		cache.addContact(c1);
		//cache.addContact(c2);
		System.out.println("Enter the ID of the user you'd like to view");
		int idget= sc.nextInt();
		System.out.println(cache.getContact(idget));
		
	}
	
}
