package com.fetisov.threehundredbucks.Repos;

import com.fetisov.threehundredbucks.Entities.BaseAuthorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public abstract class AuthorRepositoryImpl<T extends BaseAuthorEntity,UUID> implements AuthorRepository {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorRepositoryImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


}
