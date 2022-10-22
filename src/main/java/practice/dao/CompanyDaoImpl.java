package practice.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import practice.model.Company;

import java.util.Comparator;
import java.util.List;

@Repository
@Transactional
public class CompanyDaoImpl implements CompanyDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Company> getAllCompanies() {
        List<Company> companies = entityManager.createQuery("FROM Company", Company.class).getResultList();//HQL
        Comparator<Company> comparator = ((o1, o2) -> (int) (o1.getId() - o2.getId()));
        companies.sort(comparator);
        return companies;
    }

    @Override
    public void addCompany(Company company) {
        entityManager.persist(company);
    }

    @Override
    public Company getCompanyById(long id) {
        return entityManager.find(Company.class, id);
    }

    @Override
    public void updateCompany(Company company) {
        entityManager.merge(company);

    }

    @Override
    public void deleteCompany(Company company) {
        entityManager.remove(entityManager.contains(company) ? company : entityManager.merge(company));

    }
}
