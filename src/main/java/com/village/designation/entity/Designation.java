package com.village.designation.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "designations")
public class Designation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String profession;

    @Column(length = 1000)
    private String about;

    // Constructors
    public Designation() {}

    public Designation(String profession, String about) {
        this.profession = profession;
        this.about = about;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
