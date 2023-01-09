package com.fetisov.threehundredbucks;

import com.fetisov.threehundredbucks.Controllers.AuthorController;
import com.fetisov.threehundredbucks.Entities.Author;
import com.fetisov.threehundredbucks.Entities.BaseAuthorEntity;
import com.fetisov.threehundredbucks.Entities.BaseCourseEntity;
import com.fetisov.threehundredbucks.Entities.Course;
import com.fetisov.threehundredbucks.Enumerations.Difficulty;
import com.fetisov.threehundredbucks.Enumerations.Type;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootTest
@RunWith(SpringRunner.class)
class ThreeHundredBucksApplicationTests {
	@Test
	@DisplayName("Author creation")
	void createAuthor(){
		BaseCourseEntity course = new Course();
		List<Course> courses = new ArrayList<>();
		Author author = new Author();
		author.setName("abc");
		author.setId(UUID.randomUUID());
		author.setSurname("def");
		author.setLastname("sdaf");
		author.setCourse(courses);
	}




}
