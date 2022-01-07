package com.example.keyclock.sbsecurity.controller;

import com.example.keyclock.sbsecurity.model.Employee;
import com.example.keyclock.sbsecurity.service.ISecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.security.RolesAllowed;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class SecurityController {

    @Autowired
    ISecurityService securityService;

    List<Employee> employees=new ArrayList<>();

    @PostConstruct
    public void employeesInsert(){
        employees.add(new Employee(1,"Prashant","prasg@gmail.com",24000,"9008776655"));
        employees.add(new Employee(2,"Ajit","ajit@gmail.com",40000,"9008776655"));
        employees.add(new Employee(3,"praveen","praveen@gmail.com",30000,"9008776655"));
        securityService.saveAll(employees);
    }

    @GetMapping("/getMessage")
    public String getMessage(){
        return "Hello KeyCloak Spring-Security Application";
    }

    @GetMapping("/get1")

    public List<Employee> getAllEmp(){
        return securityService.getAllEmp();
    }

    @GetMapping("/get/{id}")

    public Optional<Employee> getOneEmp(@PathVariable("id") int id){
        return securityService.getOneEmp(id);
    }

}
