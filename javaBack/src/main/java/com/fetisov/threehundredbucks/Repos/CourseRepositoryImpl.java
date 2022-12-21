package com.fetisov.threehundredbucks.Repos;

import com.fetisov.threehundredbucks.Entities.BaseCourseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public abstract class CourseRepositoryImpl<T extends BaseCourseEntity,UUID> implements CourseRepository {

    private CourseRepository courseRepository;

    @Autowired
    public CourseRepositoryImpl(CourseRepository courseRepository){
        this.courseRepository=courseRepository;
    }

}
