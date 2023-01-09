package com.fetisov.threehundredbucks.Repos;

import com.fetisov.threehundredbucks.Entities.Author;
import com.fetisov.threehundredbucks.Entities.BaseAuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;
import java.util.UUID;

@NoRepositoryBean
public interface AuthorRepository extends JpaRepository<Author,UUID> {

    Optional<Author> findById(UUID uuid);
    Optional<BaseAuthorEntity> findByEmail(String email);

    Optional<BaseAuthorEntity> findByLastname(String lastName);

    Optional<BaseAuthorEntity> findAllByName(String name);


}
