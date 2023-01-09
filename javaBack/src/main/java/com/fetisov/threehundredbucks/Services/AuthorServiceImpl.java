package com.fetisov.threehundredbucks.Services;

import com.fetisov.threehundredbucks.DTO.AuthorDTO;
import com.fetisov.threehundredbucks.Entities.Author;
import com.fetisov.threehundredbucks.Entities.BaseAuthorEntity;
import com.fetisov.threehundredbucks.Exceptions.AuthorNotFoundException;
import com.fetisov.threehundredbucks.Mappers.MyMapper;
import com.fetisov.threehundredbucks.Repos.AuthorRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService{

    private AuthorRepository authorRepository;
    private MyMapper myMapper;
    private ModelMapper modelMapper;
    public Author create(Author author){
        return authorRepository.save(author);
    }


    public Optional<BaseAuthorEntity> getAllAuthorsByName(String name) throws AuthorNotFoundException {
        Optional<BaseAuthorEntity> authorsEntity = authorRepository.findAllByName(name);
        if (authorsEntity.isPresent())
            return authorsEntity;
        else
            throw new AuthorNotFoundException("Authors not found");
    }

    public void updateAuthor(Author author, UUID id){
       Optional<Author> authorToChange = authorRepository.findById(id);

    }
    @Override
    public Author save(AuthorDTO dto){
        return authorRepository.save(myMapper.dtoToEntity(dto));
    }
    @Override
    public AuthorDTO get(UUID id){
        return myMapper.entityToDto(authorRepository.getOne(id));
    }
}
