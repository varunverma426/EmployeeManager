package com.EmployeeManager.EmployeeManager.Services.Impl;

import ID_Generation.IDGenerator;
import com.EmployeeManager.EmployeeManager.DAO.EmployeeDAO;
import com.EmployeeManager.EmployeeManager.Entities.BCGEntities;
import com.EmployeeManager.EmployeeManager.Entities.EmployeeEntities;
import com.EmployeeManager.EmployeeManager.Services.Interface.BCGServices;
import com.EmployeeManager.EmployeeManager.Services.Interface.EmployeeServices;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EmployeeServicesImpl implements EmployeeServices {

 /* @Autowired
  private EmployeeEntities entity;*/

  @Autowired
  private EmployeeDAO dao;

  @Autowired
  private BCGServices bcgServices;



    public String addEmployee(EmployeeEntities e){

        //Setting  the employee id before sending to background verification
        IDGenerator id=new IDGenerator();
        e.setEmp_id(id.generateID());

        //Converting the Entitiy into map
        ObjectMapper oMapper = new ObjectMapper();
        Map<String, Object> map = oMapper.convertValue(e, Map.class);

        BCGEntities bcg=new BCGEntities();
        bcg.setAdhaarNumber(e.getAdhaarNumber());
        bcg.setPanNumber(e.getPanNumber());
        bcg.setExperience(e.getExperience());
        bcg.setIntermediateGrade(e.getIntermediateGrade());
        bcg.setHighschoolGrade(e.getHighschoolGrade());
        bcg.setCollegeGPA(e.getCollegeGPA());
        bcg.setCriminalRecord(e.getCriminalRecord());
        bcg.setEmp_id(e.getEmp_id());


        String bcgresult=bcgServices.performBCG(bcg);
        //Set values to be sent to BCG check


        if(!bcgresult.equalsIgnoreCase("PASSED")){
            e.setErrorMsg("Employee Failed at BCG");
            return "Employee Failed at BCG";
        }
        else{
            e.setStatusBCG(bcgresult);
            dao.save(e);
            return "Employee Background Verfication is Passed. Request you to kindly start the Onboarding Formalities \n "+"Employee Id "+e.getEmp_id();
        }

    }

    @Override
    public List<EmployeeEntities> getAllEmployee() {
        return dao.findAll();
    }


    @Override
    public EmployeeEntities getEmployeeById(String id) {
        long emp_id=Long.parseLong(id);
        return dao.findById(emp_id).get();
    }

    @Override
    public String updateEmployee(EmployeeEntities e) {
        ObjectMapper oMapper = new ObjectMapper();
        Map<String, Object> map = oMapper.convertValue(e, Map.class);

        //Extract id from Req Payload

        //long emp_idLong=Long.parseLong(map.get("id").toString());

        //Check weather id is present in the database using get By id call
        EmployeeEntities empEntity=new EmployeeEntities();
        try{
             empEntity=this.getEmployeeById(map.get("id").toString());

        }
        catch (Exception f){
            return f.toString();
        }
        if(empEntity.getEmp_id()==e.getEmp_id()){
            dao.save(e);
        }
        return "Record Updated Sucessfully";
    }

    @Override
    public String deleteEmployee(String id) {

        EmployeeEntities empEntity=new EmployeeEntities();
        try{
            empEntity=this.getEmployeeById(id);

        }
        catch (Exception f){
            return f.toString();
        }
        dao.delete(empEntity);
        return "Record of id "+id+" deleted Sucessfully!!";
    }
}
