package com.projectbackend.project;

import com.projectbackend.project.model.Employee;
import com.projectbackend.project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee();
        employee.setFirstName("Ramesh");
        employee.setLastName("fadatare");
        employee.setEmailId("ramesh@gmail.com");
        employeeRepository.save(employee);

        Employee employee1 = new Employee();
        employee1.setFirstName("Suresh");
        employee1.setLastName("siripi");
        employee1.setEmailId("suresh@gmail.com");
        employeeRepository.save(employee1);


    }
}
