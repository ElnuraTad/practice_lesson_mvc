package practice.service;

import practice.model.Course;

public interface CourseService {

    void addCCourse(Course course);

    Course getCourseById(long id);

    void updateCourse(Course course);

    void deleteCourse(Course course);
}
