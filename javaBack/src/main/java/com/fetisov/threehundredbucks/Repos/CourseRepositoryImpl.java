package com.fetisov.threehundredbucks.Repos;

import com.fetisov.threehundredbucks.Entities.BaseAuthorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public abstract class CourseRepositoryImpl<T extends BaseAuthorEntity,UUID>  implements CourseRepository{

    @Autowired
    private CourseRepository courseRepository;


    public CourseRepositoryImpl(CourseRepository courseRepository){
        this.courseRepository=courseRepository;
    }

}
