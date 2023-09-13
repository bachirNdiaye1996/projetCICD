package com.example.demo.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "eleve")
public class Test implements Serializable {

    private static final long serialVersionUID = -7778522737437953454L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(length = 100)
    private String nom;

    @Column(length = 100)
    private String prenom;


    private int actif;
}
