package com.EmployeeManager.EmployeeManager.Services.Impl;

import com.EmployeeManager.EmployeeManager.DAO.DeskDAO;
import com.EmployeeManager.EmployeeManager.DAO.EmployeeDAO;
import com.EmployeeManager.EmployeeManager.Entities.DeskEntities;
import com.EmployeeManager.EmployeeManager.Entities.EmployeeEntities;
import com.EmployeeManager.EmployeeManager.Services.Interface.DeskServices;
import com.EmployeeManager.EmployeeManager.Services.Interface.EmployeeServices;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DeskServicesImpl implements DeskServices {
    @Autowired
    private EmployeeDAO dao;
    @Autowired
    private EmployeeServices employeeServices;
    @Autowired
    private DeskDAO deskDao;



    @Override
    public String addDesk(JSONObject desk) {

        DeskEntities deskEntities =new DeskEntities();
        String dept_name=desk.getString("dept_name");
        long emp_id=desk.getLong("emp_id");
        deskEntities.setDeptName(dept_name);
        deskEntities.setEmp_id(emp_id);
        if(dept_name.equalsIgnoreCase("IT")){
               deskEntities.setTowerName("TOWWER A");
               deskEntities.setFloorNo("Second");
               deskEntities.setDeskNo(Long.parseLong(""));
        }
//        long emp_id = Long.parseLong(String.valueOf(map.get("id")));
//        EmployeeEntities e = new EmployeeEntities();
//        try {
//            e = dao.findById(emp_id).get();
//
//        } catch (Exception f) {
//            return "Cannot find record with this Emp Id";
//        }
//
//        if (e != null && e.getDeskNo() == null) {
//
//            deskEntities.setDoj(e.getDateOfJoining());
//
//            //Set Id using Id generator
//            IDGenerator idGenerator = new IDGenerator();
//            deskEntities.setDeskNo(idGenerator.generateID());
//
//            deskDao.save(deskEntities);
//            //Update the employye record with desk Number
//            e.setDeskNo(String.valueOf(deskEntities.getDeskNo()));
//            employeeServices.updateEmployee(e);
//
//            return "Record Updated Sucessfully!!";
//        } else {
//            return "Record could not be updated";
//        }
        return "";
    }

//    public int checkAvailabilityInTower(String towerName){
//        Map<String, Array> map=new HashMap<>();
//    }
    @Override
    public List<DeskEntities> getAllDeskDetails() {
        return deskDao.findAll();
    }

    @Override
    public DeskEntities getDeskById(String deskNo) {
        long desk_id = Long.parseLong(deskNo);
        return deskDao.findById(desk_id).get();
    }

    @Override
    public String updateDeskDetails(DeskEntities deskEntities) {
        ObjectMapper oMapper = new ObjectMapper();
        Map<String, Object> map = oMapper.convertValue(deskEntities, Map.class);

        //Extract id from Req Payload

        //long emp_idLong=Long.parseLong(map.get("id").toString());

        //Check weather id is present in the database using get By id call
        DeskEntities deskentity = new DeskEntities();
        try {
            deskentity = this.getDeskById(map.get("deskNo").toString());

        } catch (Exception f) {
            return f.toString();
        }
        if (deskentity.getDeskNo() == deskEntities.getDeskNo()) {
            deskDao.save(deskEntities);
        }
        return "Record Updated Sucessfully";
    }

    @Override
    public String deleteDeskData(String deskNo) {

        //Extract id before deleting the table
        String id = String.valueOf(this.getDeskById(deskNo).getDeskNo());
        //get details of Desk and delete
        try {
            deskDao.delete(this.getDeskById(deskNo));
        } catch (Exception e) {
            return e.toString() + " Exception occured in deleting desk Data";
        }
        //delete desk number from Employee data

        try {
            EmployeeEntities employeeServices1 = employeeServices.getEmployeeById(id);
            employeeServices1.setDeskNo(null);
            dao.save(employeeServices1);
        } catch (Exception e) {
            return e.toString() + " Exception occured in updating the Employee data";
        }
        return "Record Deleted Sucessfully!!";
    }


}
