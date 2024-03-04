package com.attijari.badge.models;

import jakarta.persistence.*;
import jakarta.persistence.Table;

@Table(name = "Personne")
@Entity
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String lastname;
    private String firstname;
    private String email;
    private String path;
    private String job;
    private String department;
    private String datedebut;
    private String datefin;
    private String sujet;

public Personne(){}

    public String getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(String datedebut) {
        this.datedebut = datedebut;
    }

    public String getDatefin() {
        return datefin;
    }

    public void setDatefin(String datefin) {
        this.datefin = datefin;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public Personne(long id, String lastname, String firstname, String email, String path, String job, String department, String datefin, String datedebut, String sujet) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.path = path;
        this.job = job;
        this.department = department;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.sujet = sujet;
    }

    public long getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getEmail() {
        return email;
    }

    public String getPath() {
        return path;
    }

    public String getJob() {
        return job;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
