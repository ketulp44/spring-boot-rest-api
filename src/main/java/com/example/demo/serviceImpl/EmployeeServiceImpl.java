/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.serviceImpl;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.dto.EmpNoDto;
import com.example.demo.service.EmployeeService;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ketul
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{
    
    private EmployeeDao employeeDao;
    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
    
    @Override
    public Map<Integer, Long> getNumberOfDifferentTypeEmployee() {
        System.out.println(" result" + this.employeeDao.getNumberOfDifferentTypeEmployee()) ;
        return this.employeeDao.getNumberOfDifferentTypeEmployee().stream().collect(Collectors.toMap(EmpNoDto::getEmpType,EmpNoDto::getNoOfEmployee));
        
    }
    
}
