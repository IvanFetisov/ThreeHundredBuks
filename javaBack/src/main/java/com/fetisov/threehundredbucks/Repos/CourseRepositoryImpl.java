package com.fetisov.threehundredbucks.Repos;

import com.fetisov.threehundredbucks.Entities.BaseCourseEntity;
import com.fetisov.threehundredbucks.Entities.BasicAuthorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public abstract class CourseRepositoryImpl<T extends BasicAuthorEntity,UUID>  implements CourseRepository{

    @Autowired
    private CourseRepository courseRepository;


    public CourseRepositoryImpl(CourseRepository courseRepository){
        this.courseRepository=courseRepository;
    }

}
