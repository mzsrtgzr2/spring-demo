package org.vaadin.example.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.vaadin.example.backend.entity.Contact;
import org.vaadin.example.backend.repository.ContactRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContactService {
    private ContactRepository contactRepository;

    public List<Contact> findAll(){
        return contactRepository.findAll();
    }

}
