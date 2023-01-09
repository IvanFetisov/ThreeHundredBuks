package com.fetisov.threehundredbucks.Entities;

import com.fetisov.threehundredbucks.Enumerations.Difficulty;
import com.fetisov.threehundredbucks.Enumerations.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
public class BaseCourseEntity {
    public BaseCourseEntity() {
    }

    public BaseCourseEntity(UUID id, String name, Type type, String description, Difficulty difficulty) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.difficulty = difficulty;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name ="name")
    private String name;

    @Column(name ="type")
    private Type type; //Todo: Change from String to Enum
    @Column(name = "description")
    private String description;
    @Column(name = "difficulty")
    private Difficulty difficulty;


}
