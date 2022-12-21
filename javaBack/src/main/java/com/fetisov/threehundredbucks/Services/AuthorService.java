package com.fetisov.threehundredbucks.Services;

import com.fetisov.threehundredbucks.Entities.BasicAuthorEntity;


import java.util.List;
import java.util.UUID;

public interface AuthorService<T extends BasicAuthorEntity,UUID> {
    public abstract T save(T entity);
    public abstract List<T> findAll();
    public abstract T update(T entity);

}
