package com.fetisov.threehundredbucks.Services;

import com.fetisov.threehundredbucks.DTO.AuthorDTO;
import com.fetisov.threehundredbucks.Entities.Author;


import java.util.UUID;

public interface AuthorService {
    Author save (AuthorDTO authorDTO);

    AuthorDTO get(UUID id);
}
