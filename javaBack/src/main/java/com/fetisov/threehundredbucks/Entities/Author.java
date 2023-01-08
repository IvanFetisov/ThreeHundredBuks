package com.fetisov.threehundredbucks.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Entity
@Getter
@Setter
@Table(name = "author")
@AllArgsConstructor
@NoArgsConstructor

public class Author extends BasicAuthorEntity{


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "course_id")
    private  List<Course> course;

}
