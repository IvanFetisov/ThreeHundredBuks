package com.fetisov.threehundredbucks.Repos;

import com.fetisov.threehundredbucks.Entities.BasicAuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AuthorRepository extends JpaRepository<BasicAuthorEntity,UUID> {


}
