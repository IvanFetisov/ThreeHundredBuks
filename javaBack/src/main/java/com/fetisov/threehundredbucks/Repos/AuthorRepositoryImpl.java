package com.fetisov.threehundredbucks.Repos;

import com.fetisov.threehundredbucks.Entities.BasicAuthorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public abstract class AuthorRepositoryImpl<T extends BasicAuthorEntity,UUID> implements AuthorRepository {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorRepositoryImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


}
