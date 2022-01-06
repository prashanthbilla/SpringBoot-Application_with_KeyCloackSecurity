package com.example.keyclock.sbsecurity.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    private int empId;
    private String empName;
    private String empEmail;
    private double empSalary;
    private String empMobile;

    public Employee() {
    }

    public Employee(int empId, String empName, String empEmail, double empSalary, String empMobile) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empSalary = empSalary;
        this.empMobile = empMobile;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpMobile() {
        return empMobile;
    }

    public void setEmpMobile(String empMobile) {
        this.empMobile = empMobile;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empSalary=" + empSalary +
                ", empMobile='" + empMobile + '\'' +
                '}';
    }
}
