package sg.edu.nus.iss.d11lecture.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.d11lecture.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping("/list")
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ashley", "Chew", "ashchew@visa.com.sg"));
        employees.add(new Employee("Alicia", "Ong", "aliciaong@visa.com.sg"));
        employees.add(new Employee("Darien", "Lim", "darienlim@visa.com.sg"));

        return employees;
    }
}