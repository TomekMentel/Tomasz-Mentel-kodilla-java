package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetrieveFacade {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(RetrieveFacade.class);

    public List<Employee> retrieveEmployeeByNameStartsLetter(String letter) throws RetrieveExceptions {
        LOGGER.info("Start searching for employees contains" + letter);
        List<Employee> employeeList = employeeDao.retrieveEmployeeByNameStartsLetter(letter);
        if (employeeList.size() == 0) {
            LOGGER.error(RetrieveExceptions.EMPLOYEE_RETRIEVER_ERR);
            throw new RetrieveExceptions(RetrieveExceptions.EMPLOYEE_RETRIEVER_ERR);
        }
        LOGGER.info("Employee has been found");
        return employeeList;
    }

    public List<Company> retrieveCompanyByNameStartsLetter(String letter) throws RetrieveExceptions {
        LOGGER.info("Start searching for company contains" + letter);
        List<Company> companyList = companyDao.retrieveCompanyByNameStartsLetter(letter);
        if (companyList.size() == 0) {
            LOGGER.error(RetrieveExceptions.COMPANY_RETRIEVER_ERR);
            throw new RetrieveExceptions(RetrieveExceptions.COMPANY_RETRIEVER_ERR);
        }
        LOGGER.info("Company has been found");
        return companyList;
    }
}
