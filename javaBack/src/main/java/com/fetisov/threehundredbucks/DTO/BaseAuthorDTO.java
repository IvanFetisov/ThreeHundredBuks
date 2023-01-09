package com.fetisov.threehundredbucks.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class BaseAuthorDTO {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("name")
    private String name;


    @JsonProperty("surname")
    private String surname;


    @JsonProperty("email")
    private String email;


    @JsonProperty("lastname")
    private String lastname;


}
