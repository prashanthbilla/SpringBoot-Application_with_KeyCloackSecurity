package com.example.keyclock.sbsecurity.service;

import com.example.keyclock.sbsecurity.model.Employee;
import com.example.keyclock.sbsecurity.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SecurityService implements ISecurityService {

    @Autowired
    SecurityRepository repository;

    @Override
    public void saveAll(List<Employee> employees) {
        repository.saveAll(employees);
    }

    @Override
    public Optional<Employee> getOneEmp(int id) {
        return repository.findById(id);
    }

    @Override
    public List<Employee> getAllEmp() {
        return repository.findAll();
    }


}
