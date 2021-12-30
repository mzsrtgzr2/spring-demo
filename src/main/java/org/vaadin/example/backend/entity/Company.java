package org.vaadin.example.backend.entity;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class Company extends AbstractEntity implements Cloneable{
    private String name;

    @OneToMany(mappedBy = "company", fetch = FetchType.EAGER)
    private List<Contact> employees = new LinkedList<>();

    @Override
    protected Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }
}