package com.mhr.contact.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhr.contact.date.PersianDateTime;
import com.mhr.contact.model.Contact;
import com.mhr.contact.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public Contact saveOne(Contact contact) {
		
		PersianDateTime DatePersian = new PersianDateTime();
		
		contact.setCreateDateAt(DatePersian.webDate());
		contact.setCreateTimeAt(DatePersian.webTime());
		contact.setUpdateDateAt(DatePersian.webDate());
		contact.setUpdateTimeAt(DatePersian.webTime());
		
		return this.contactRepository.save(contact);
	}
	
	@Override
	public List<Contact> findAllContacts(){
		return this.contactRepository.findAll();
	}
	
	@Override
	public Optional<Contact> findOneContact(Long contactId){
		return this.contactRepository.findById(contactId);
	}
	
	@Override
	public void deleteOneContact(Long contactId) {
	   this.contactRepository.deleteById(contactId);
	}
	
	@Override
	public void deleteAllContacts() {
		this.contactRepository.deleteAll();
	}
}
