package practice.dao;

import practice.model.Company;
import practice.model.Course;

import java.util.List;

public interface CourseDao {


    void addCourse(Course course);

    Course getCourseById(long id);

    void updateCourse(Course course);

    void deleteCourse(Course course);
}
