package com.fetisov.threehundredbucks.Services;

import com.fetisov.threehundredbucks.Entities.BasicAuthorEntity;
import com.fetisov.threehundredbucks.Repos.AuthorRepositoryImpl;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;
@Service
@Transactional
public class AuthorServiceImpl<T extends BasicAuthorEntity,UUID> implements AuthorService<T,UUID> {

    @Override
    public T save(T entity) {
        return null;
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public T update(T entity) {
        return null;
    }
}
