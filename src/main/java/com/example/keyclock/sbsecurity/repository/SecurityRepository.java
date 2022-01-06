package com.example.keyclock.sbsecurity.repository;

import com.example.keyclock.sbsecurity.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityRepository extends JpaRepository<Employee, Integer>{
}
