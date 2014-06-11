package com.javahash.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.javahash.spring.Model.Contact;

@Controller
@SessionAttributes
public class ContactController extends BaseController {

	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact")
							Contact contact, BindingResult result) {
		
		System.out.println("First Name:" + contact.getFirstname() + 
					"Last Name:" + contact.getLastname());
		
		return "redirect:contacts.html";
	}
	
	@RequestMapping("/contacts.do")
	public ModelAndView showContacts() {
		
		System.out.println("Here is show Contacts method");
		
		float f = 8/0;
		
		return new ModelAndView("contactABC", "command", new Contact());
	}
}