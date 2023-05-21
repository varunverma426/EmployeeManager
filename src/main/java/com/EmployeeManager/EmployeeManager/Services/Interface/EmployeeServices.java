package com.EmployeeManager.EmployeeManager.Services.Interface;

import com.EmployeeManager.EmployeeManager.Entities.EmployeeEntities;

import java.util.List;

public interface EmployeeServices {

    public String addEmployee(EmployeeEntities e);

    List<EmployeeEntities> getAllEmployee();


    EmployeeEntities getEmployeeById(String id);

    String updateEmployee(EmployeeEntities e);

    String deleteEmployee(String id);


}
