package com.mhr.contact.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mhr.contact.model.Contact;
import com.mhr.contact.service.ContactService;

@RestController
@RequestMapping(value = "contact")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping(value = "/test")
	public ResponseEntity<?> test(){
		return new ResponseEntity<>("Contact api Concetion ok!",HttpStatus.OK);
	}
	
	@PostMapping(value = "/add")
	public ResponseEntity<?> saveOne(@RequestBody Contact contact){
		contact.setId((long) 0);
		return new ResponseEntity<Contact>(this.contactService.saveOne(contact),HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/update")
	public ResponseEntity<?> updateContact(@RequestBody Contact contact){
		return new ResponseEntity<Contact>(this.contactService.saveOne(contact),HttpStatus.OK);
	}
	
	@GetMapping(value = "/shows")
	public ResponseEntity<?> showAllContact(){
		return new ResponseEntity<List<Contact>>(this.contactService.findAllContacts(),HttpStatus.OK);
	}
	
	@GetMapping(value = "/show/{contactId}")
	public ResponseEntity<?> findOneContact(@PathVariable("contactId") Long contactId){
		return new ResponseEntity<Optional<Contact>>(this.contactService.findOneContact(contactId),HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/delete/{contactId}")
	public ResponseEntity<?> deleteOneContact(@PathVariable("contactId") Long contactId){
		this.contactService.deleteOneContact(contactId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/deletes")
	public ResponseEntity<?> deleteAllContact(){
		this.contactService.deleteAllContacts();
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
