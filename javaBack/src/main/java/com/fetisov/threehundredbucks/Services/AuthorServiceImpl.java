package com.fetisov.threehundredbucks.Services;

import com.fetisov.threehundredbucks.DTO.AuthorDTO;
import com.fetisov.threehundredbucks.Entities.Author;
import com.fetisov.threehundredbucks.Entities.BasicAuthorEntity;
import com.fetisov.threehundredbucks.Exceptions.AuthorNotFoundException;
import com.fetisov.threehundredbucks.Mappers.AuthorMapper;
import com.fetisov.threehundredbucks.Repos.AuthorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
public class AuthorServiceImpl implements AuthorService{

    private final AuthorMapper authorMapper;
    private final AuthorRepository authorRepository;

    public Author create(Author author){
        return authorRepository.save(author);
    }
    public AuthorServiceImpl(AuthorMapper authorMapper, AuthorRepository authorRepository) {
        this.authorMapper = authorMapper;
        this.authorRepository = authorRepository;
    }

//    public Optional<Author> getAllCoursesOfAuthor(Author author) throws AuthorNotFoundException {
//        Optional<Author> author1 = authorRepository.findById();
//        if (author1!=null)
//            return author1;
//        else
//            throw new AuthorNotFoundException("Author not found");
//
//    }
    public Optional<BasicAuthorEntity> getAllAuthorsByName(String name) throws AuthorNotFoundException {
        Optional<BasicAuthorEntity> authorsEntity = authorRepository.findAllByName(name);
        if (authorsEntity.isPresent())
            return authorsEntity;
        else
            throw new AuthorNotFoundException("Authors not found");
    }

    public void updateAuthor(Author author, UUID id){
       Optional<Author> authorToChange = authorRepository.findById(id);

    }
    @Override
    public AuthorDTO save(AuthorDTO dto){
        return authorMapper.toDto(authorRepository.save(authorMapper.toEntity(dto)));
    }
    @Override
    public AuthorDTO get(UUID id){
        return authorMapper.toDto(authorRepository.getOne(id));
    }
}
