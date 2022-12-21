package com.fetisov.threehundredbucks.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseCourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;
    @Column(name ="name")
    private String name;
    @Column(name ="type")
    private String type; //Todo: Change from String to Enum
    @Column(name = "description")
    private String description;
    @Column(name = "difficulty")
    private String difficulty;


}
