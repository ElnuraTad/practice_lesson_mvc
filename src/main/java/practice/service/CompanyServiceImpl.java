package practice.service;

import org.springframework.stereotype.Service;
import practice.dao.CompanyDao;
import practice.model.Company;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService{

    private final CompanyDao  companyDao;

    public CompanyServiceImpl(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    @Override
    public List<Company> getAllCompanies() {
        return  companyDao.getAllCompanies();
    }

    @Override
    public void addCompany(Company company) {
        companyDao.addCompany(company);

    }

    @Override
    public Company getCompanyById(long id) {
        return companyDao.getCompanyById(id);

    }

    @Override
    public void updateCompany(Company company) {
        companyDao.updateCompany(company);
    }

    @Override
    public void deleteCompany(Company company) {
        companyDao.deleteCompany(company);

    }
}
