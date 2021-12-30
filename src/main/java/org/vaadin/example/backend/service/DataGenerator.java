package org.vaadin.example.backend.service;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import org.vaadin.example.backend.entity.Company;
import org.vaadin.example.backend.entity.Contact;
import org.vaadin.example.backend.repository.CompanyRepository;
import org.vaadin.example.backend.repository.ContactRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DataGenerator {
    private final ContactRepository contactRepository;
    private final CompanyRepository companyRepository;

    @PostConstruct
    private void generateData(){

       Company comp1 = companyRepository.save(new Company("company1"));
    //    Company comp2 = companyRepository.save(new Company("company2"));
       
       contactRepository.save(new Contact("moshe", "roth", comp1, "yes", "moshe1@gmail.com"));

       contactRepository.save(new Contact("adi", "roth", comp1, "yes", "adi@gmail.com"));
    }
}
