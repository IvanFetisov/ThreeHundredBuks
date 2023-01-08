package com.fetisov.threehundredbucks.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
public class AuthorDTO extends BaseAuthorDTO{
    private UUID id;

    private String name;


    private String surname;


    private String email;


    private String lastname;


}
