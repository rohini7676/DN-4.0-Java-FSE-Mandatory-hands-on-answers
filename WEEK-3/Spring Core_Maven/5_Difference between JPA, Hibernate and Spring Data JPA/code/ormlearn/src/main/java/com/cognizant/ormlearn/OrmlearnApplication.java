package com.cognizant.ormlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class OrmlearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmlearnApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmlearnApplication.class, args);
        EmployeeService employeeService = context.getBean(EmployeeService.class);

        LOGGER.info("Inside main - Adding 10 employees");

        employeeService.addEmployee(new Employee(1, "Elon Musk", 150000));
        employeeService.addEmployee(new Employee(2, "Sundar Pichai", 140000));
        employeeService.addEmployee(new Employee(3, "Satya Nadella", 145000));
        employeeService.addEmployee(new Employee(4, "Tim Cook", 155000));
        employeeService.addEmployee(new Employee(5, "Mark Zuckerberg", 135000));
        employeeService.addEmployee(new Employee(6, "Jeff Bezos", 160000));
        employeeService.addEmployee(new Employee(7, "Sheryl Sandberg", 130000));
        employeeService.addEmployee(new Employee(8, "Susan Wojcicki", 128000));
        employeeService.addEmployee(new Employee(9, "Reed Hastings", 125000));
        employeeService.addEmployee(new Employee(10, "Ginni Rometty", 138000));

        LOGGER.info("10 employees added successfully");

        LOGGER.info("All Employees: {}", employeeService.getAllEmployees());
    }
}
