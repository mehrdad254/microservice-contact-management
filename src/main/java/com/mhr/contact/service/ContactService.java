package com.mhr.contact.service;

import java.util.List;
import java.util.Optional;

import com.mhr.contact.model.Contact;

public interface ContactService {

	Contact saveOne(Contact contact);

	List<Contact> findAllContacts();

	Optional<Contact> findOneContact(Long contactId);

	void deleteOneContact(Long contactId);

	void deleteAllContacts();

}
