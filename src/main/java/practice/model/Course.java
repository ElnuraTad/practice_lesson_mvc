package practice.model;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "")
    @SequenceGenerator(name = "course_generator",
    sequenceName = "course_sequence",
    allocationSize = 1)
    private long id;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "duration_in_month")
    private String durationInMonth;


    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    public Course() {
    }

    public Course(String courseName, String durationInMonth) {
        this.courseName = courseName;
        this.durationInMonth = durationInMonth;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDurationInMonth() {
        return durationInMonth;
    }

    public void setDurationInMonth(String durationInMonth) {
        this.durationInMonth = durationInMonth;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", durationInMonth='" + durationInMonth + '\'' +
                '}';
    }
}
