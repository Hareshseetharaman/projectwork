package com.haresh.addressbook.core.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.haresh.addressbook.core.AddressCache;

@Controller
public class ContactController {
	
	public ModelAndView loadContact() {
		
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("contact", AddressCache.get().getContact(2).getName().getFirstName());
		
		return mv;		
	}
}
