package com.EmployeeManager.EmployeeManager.Services.Impl;

import com.EmployeeManager.EmployeeManager.DAO.AccessModuleDAO;
import com.EmployeeManager.EmployeeManager.Entities.AccessModuleEntities;
import com.EmployeeManager.EmployeeManager.Entities.EmployeeEntities;
import com.EmployeeManager.EmployeeManager.Services.Interface.AccessModuleServices;
import com.EmployeeManager.EmployeeManager.Services.Interface.EmployeeServices;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccessModuleServicesImpl implements AccessModuleServices {
    @Autowired
    AccessModuleDAO dao;
    @Autowired
    EmployeeServices employeeServices;

    @Autowired
    AccessModuleEntities accessModuleEntities;

    public String giveAccesstoEmployee(JSONObject reqPayload){
        long emp_id=reqPayload.getLong("emp_id");
        String status_bcg=reqPayload.getString("status_bcg");
        EmployeeEntities empEntities= employeeServices.getEmployeeById(String.valueOf(emp_id));
        JSONObject obj=new JSONObject(empEntities);
        if(!(empEntities.getStatusBCG().equalsIgnoreCase("passed"))){
            return "Acess Denied.. Candidate has failed the BCG";
        }
        else{
            //Add Desk Module and Asset Module
            String work_email=empEntities.getFirstName()+"."+empEntities.getLastName()+"@varunco.com";
            String idcardNo="EMP"+String.valueOf(emp_id);

        }
        return "";
    }
}
