package com.fetisov.threehundredbucks.Entities;

import com.fetisov.threehundredbucks.Enumerations.Difficulty;
import com.fetisov.threehundredbucks.Enumerations.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "course")
public class Course extends BaseCourseEntity {

    public Course(UUID id, String name, Type type, String description, Difficulty difficulty, Author author) {
        super(id, name, type, description, difficulty);
        this.author = author;
    }

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id")
    private Author author;

    public Course() {

    }
}
