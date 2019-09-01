/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ketul
 */
@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="emp_id")
    private Long empId;
    @Column(name="emp_name")
    private String empName;
    @Column(name="emp_joining_date")
    private Date joiningDate;
    @Column(name="emp_type")
    private Integer empType;
    @Column(name="emp_monthly_salary")
    private Long empMonthlySalary;
    @Column(name="emp_gender")
    private String empGender;
    @Column(name="emp_status")
    private Integer empStatus;

    public Employee() {
    }

    public Employee(String empName, Date joiningDate, Integer empType, Long empMonthlySalary, String empGender, Integer empStatus) {
        this.empName = empName;
        this.joiningDate = joiningDate;
        this.empType = empType;
        this.empMonthlySalary = empMonthlySalary;
        this.empGender = empGender;
        this.empStatus = empStatus;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public Integer getEmpType() {
        return empType;
    }

    public void setEmpType(Integer empType) {
        this.empType = empType;
    }

    public Long getEmpMonthlySalary() {
        return empMonthlySalary;
    }

    public void setEmpMonthlySalary(Long empMonthlySalary) {
        this.empMonthlySalary = empMonthlySalary;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public Integer getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(Integer empStatus) {
        this.empStatus = empStatus;
    }

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName=" + empName + ", joiningDate=" + joiningDate + ", empType=" + empType + ", empMonthlySalary=" + empMonthlySalary + ", empGender=" + empGender + ", empStatus=" + empStatus + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.empId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.empId, other.empId)) {
            return false;
        }
        return true;
    }
    
}
