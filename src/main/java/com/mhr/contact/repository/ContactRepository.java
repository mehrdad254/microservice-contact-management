package com.mhr.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mhr.contact.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Long>{

}
