package com.example.keyclock.sbsecurity.service;

import com.example.keyclock.sbsecurity.model.Employee;

import java.util.List;
import java.util.Optional;

public interface ISecurityService {

    void saveAll(List<Employee> employees);
    Optional<Employee> getOneEmp(int id);
    List<Employee> getAllEmp();

}
