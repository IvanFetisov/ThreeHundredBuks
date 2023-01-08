package com.fetisov.threehundredbucks.Services;

import com.fetisov.threehundredbucks.DTO.AuthorDTO;
import com.fetisov.threehundredbucks.Entities.BasicAuthorEntity;


import java.util.List;
import java.util.UUID;

public interface AuthorService {
    AuthorDTO save (AuthorDTO authorDTO);

    AuthorDTO get(UUID id);
}
