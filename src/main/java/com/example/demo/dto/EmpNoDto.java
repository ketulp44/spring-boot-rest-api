/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dto;

/**
 *
 * @author ketul
 */
public class EmpNoDto {
    private Integer empType;
    private Long noOfEmployee;

    public EmpNoDto() {
    }

    public EmpNoDto(Integer empType, Long noOfEmployee) {
        this.empType = empType;
        this.noOfEmployee = noOfEmployee;
    }

    public Integer getEmpType() {
        return empType;
    }

    public void setEmpType(Integer empType) {
        this.empType = empType;
    }

    public Long getNoOfEmployee() {
        return noOfEmployee;
    }

    public void setNoOfEmployee(Long noOfEmployee) {
        this.noOfEmployee = noOfEmployee;
    }

    @Override
    public String toString() {
        return "dto{" + "empType=" + empType + ", noOfEmployee=" + noOfEmployee + '}';
    }
    
}
