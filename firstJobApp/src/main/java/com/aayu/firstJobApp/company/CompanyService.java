package com.aayu.firstJobApp.company;

import com.aayu.firstJobApp.job.Job;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    boolean updateCompany(Company company, Long id);
    void createCompany(Company company);
    boolean deleteCompanyById(Long id);
    Company getCompanyByID(Long id);
}
