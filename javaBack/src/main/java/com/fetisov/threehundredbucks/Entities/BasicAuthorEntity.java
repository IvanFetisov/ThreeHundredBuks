package com.fetisov.threehundredbucks.Entities;


import javax.persistence.*;
import java.util.UUID;

@MappedSuperclass
public class BasicAuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name ="name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "lastname")
    private String lastname;


}
