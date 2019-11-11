package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.RetrieveExceptions;
import com.kodilla.hibernate.manytomany.facade.RetrieveFacade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    RetrieveFacade retrieveFacade;

    @Test
    public void retrieveEmployeeTest() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephaniClarckson = new Employee("Stephani", "Clarckson");
        Employee lindaKovalski = new Employee("Linda", "Kovalski");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaester = new Company("Data Maester");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaester.getEmployees().add(stephaniClarckson);
        dataMaester.getEmployees().add(lindaKovalski);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalski);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephaniClarckson.getCompanies().add(dataMaester);
        lindaKovalski.getCompanies().add(dataMaester);
        lindaKovalski.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaester);
        int dataMasterId = dataMaester.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        //When Then

        try {
            List<Company> findCompany = retrieveFacade.retrieveCompanyByNameStartsLetter("so");
            List<Employee> findEmployess = retrieveFacade.retrieveEmployeeByNameStartsLetter("li");
            Assert.assertEquals (1,findCompany);
            Assert.assertEquals(1,findEmployess);
        } catch (RetrieveExceptions retrieveExceptions) {
            System.out.println(retrieveExceptions.getMessage());
        } finally {
            //CleanUp
            try {
                companyDao.deleteById(softwareMachineId);
                companyDao.deleteById(dataMasterId);
                companyDao.deleteById(greyMatterId);
            } catch (Exception e) {
                //do nothing
            }
        }
    }
}