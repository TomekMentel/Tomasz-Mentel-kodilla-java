package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephaniClarckson = new Employee("Stephani", "Clarckson");
        Employee lindaKovalski = new Employee("Linda", "Kovalski");

        Company softwareMachine = new Company("Software Maschine");
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
        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaester);
        int dataMasterId = dataMaester.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();
        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMasterId);
        Assert.assertNotEquals(0, greyMatterId);
        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMasterId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testNamedQueries() {
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
        //When
        List<Company> findCompany = companyDao.retrieveCompanyName("sof");
        List<Employee> findEmployee = employeeDao.retrieveEmployeeByName("Linda");
        //Then
        Assert.assertEquals(1, findEmployee.size());
        Assert.assertEquals(1, findCompany.size());
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

