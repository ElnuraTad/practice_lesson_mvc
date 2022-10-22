package practice.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import practice.model.Course;

@Repository
@Transactional
public class CourseDaoImpl implements CourseDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addCourse(Course course) {
        entityManager.persist(course);
    }

    @Override
    public Course getCourseById(long id) {
        entityManager.find(Course.class, id);
        return null;
    }

    @Override
    public void updateCourse(Course course) {
        entityManager.merge(course);
    }

    @Override
    public void deleteCourse(Course course) {
        entityManager.remove(entityManager.contains(course) ? course : entityManager.merge(course));

    }
}
