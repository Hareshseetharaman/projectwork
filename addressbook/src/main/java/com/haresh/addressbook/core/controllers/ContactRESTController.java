package com.haresh.addressbook.core.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import com.haresh.addressbook.core.AddressCache;
import com.haresh.addressbook.core.Contact;

@RestController
public class ContactRESTController {
	
	@RequestMapping("/api/contact")
	public Contact getContact(@RequestParam (value="id") int id) {
		return AddressCache.get().getContact(id);
	}
}
