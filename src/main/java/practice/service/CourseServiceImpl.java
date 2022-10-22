package practice.service;

import org.springframework.stereotype.Service;
import practice.dao.CourseDao;
import practice.model.Company;
import practice.model.Course;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    private final CourseDao courseDao;

    public CourseServiceImpl(CourseDao courseDao) {
        this.courseDao = courseDao;
    }


    @Override
    public void addCCourse(Course course) {
        courseDao.addCourse(course);

    }

    @Override
    public Course getCourseById(long id) {
        return courseDao.getCourseById(id);
    }

    @Override
    public void updateCourse(Course course) {
        courseDao.updateCourse(course);

    }

    @Override
    public void deleteCourse(Course course) {
        courseDao.deleteCourse(course);

    }
}
