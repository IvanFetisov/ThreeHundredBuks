package com.fetisov.threehundredbucks.Repos;

import com.fetisov.threehundredbucks.Entities.Author;
import com.fetisov.threehundredbucks.Entities.BasicAuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;
import java.util.UUID;

@NoRepositoryBean
public interface AuthorRepository extends JpaRepository<Author,UUID> {

    Optional<Author> findById(UUID uuid);
    Optional<BasicAuthorEntity> findByEmail(String email);

    Optional<BasicAuthorEntity> findByLastname(String lastName);

    Optional<BasicAuthorEntity> findAllByName(String name);


}
