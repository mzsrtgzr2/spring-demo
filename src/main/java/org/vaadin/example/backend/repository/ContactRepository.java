package org.vaadin.example.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.vaadin.example.backend.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{}