package org.vaadin.example.backend.entity;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Contact extends AbstractEntity implements Cloneable{

    @NotEmpty
    private String firstName = "";

    @NotEmpty
    private String lastName = "";

    @ManyToOne
    @JoinColumn(name = "company_id")
    @NotNull
    @JsonIgnoreProperties({"employees"})
    private Company company;

    @NotNull
    @ManyToOne
    @Enumerated(EnumType.STRING)
    private Status status;

    @Email
    @NotEmpty
    private String email = "";

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    protected Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }
}