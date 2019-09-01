/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import com.example.demo.dto.EmpNoDto;
import com.example.demo.model.Employee;
import java.util.List;
import java.util.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ketul
 */
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long>{
    @Query(" select new com.example.demo.dto.EmpNoDto(e.empType , count(e.empId)) from Employee e group by e.empType")
    List<EmpNoDto> getNumberOfDifferentTypeEmployee();
}
