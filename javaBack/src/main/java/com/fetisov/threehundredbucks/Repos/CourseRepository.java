package com.fetisov.threehundredbucks.Repos;

import com.fetisov.threehundredbucks.Entities.BaseCourseEntity;
import com.fetisov.threehundredbucks.Entities.BasicAuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.UUID;

@NoRepositoryBean
public interface CourseRepository  extends JpaRepository<BaseCourseEntity, UUID> {

    BaseCourseEntity update(BaseCourseEntity baseCourseEntity);


}
