package practice.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "")
    @SequenceGenerator(name = "company_generator",
    sequenceName = "company_sequence",
    allocationSize = 1)
    private long id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "located_country")
    private String locatedCountry;

    @OneToMany(fetch = FetchType.EAGER,
    cascade = {CascadeType.MERGE, CascadeType.REMOVE},
    mappedBy = "company")
    private List<Course> course;

    public Company() {
    }

    public Company(String companyName, String locatedCountry) {
        this.companyName = companyName;
        this.locatedCountry = locatedCountry;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocatedCountry() {
        return locatedCountry;
    }

    public void setLocatedCountry(String locatedCountry) {
        this.locatedCountry = locatedCountry;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", locatedCountry='" + locatedCountry + '\'' +
                '}';
    }
}
