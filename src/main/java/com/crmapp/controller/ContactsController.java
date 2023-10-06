package com.crmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmapp.entities.Contact;
import com.crmapp.entities.Lead;
import com.crmapp.services.ContactService;
import com.crmapp.services.LeadService;

@Controller
public class ContactsController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/convertToContact")
	public String convertToContact(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadService.findLeadById(id);
		
		Contact contact = new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setLeadSource(lead.getLeadSource());
		contact.setMobile(lead.getMobile());
		
		contactService.saveContact(contact);
		
		leadService.deleteLeadById(id);
		
		List<Contact> contacts = contactService.getAllContacts();
		
		model.addAttribute("contacts", contacts);
		
		return "contacts_result";
	}
	
	@RequestMapping("/listcontacts")
	public String listContacts(ModelMap model){
		List<Contact> contacts = contactService.getAllContacts();
		
		model.addAttribute("contacts", contacts);
		
		return "contacts_result";
	}
	
	@RequestMapping("/getIdForBilling")
	public String getIdForBilling(@RequestParam("id") long id, ModelMap model) {
		Contact contact = contactService.findContactById(id);
		
		model.addAttribute("contact", contact);
		return "billing_info";
	}
	
}
