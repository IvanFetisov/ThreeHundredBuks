package com.fetisov.threehundredbucks.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fetisov.threehundredbucks.Entities.Course;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDTO extends BaseAuthorDTO{

    @JsonProperty("courses")
    private List<Course> course;

}
