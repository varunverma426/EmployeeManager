package com.EmployeeManager.EmployeeManager.Services.Impl;


import com.EmployeeManager.EmployeeManager.DAO.BCGDAO;
import com.EmployeeManager.EmployeeManager.Entities.BCGEntities;
import com.EmployeeManager.EmployeeManager.Services.Interface.BCGServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BCGServicesImpl implements BCGServices {
    @Autowired
    BCGDAO bcgdao;

    public String performBCG(BCGEntities bcgEntity){

        int intermediateGrade=bcgEntity.getIntermediateGrade();
        int highschoolGrade=bcgEntity.getHighschoolGrade();
        int collegeGPA= bcgEntity.getCollegeGPA();
        Map<String,Integer> rules=getAllRules();
        if(bcgEntity.getExperience()<rules.get("experience")){
            bcgEntity.setMessage("Less Work experience");
            bcgEntity.setStatus_bcg("FAILED");
            bcgdao.save(bcgEntity);
            return "Work Experience of the employee is lees than the rules";
        }
        if (intermediateGrade != 0 && highschoolGrade != 0 && collegeGPA != 0) {
            if (bcgEntity.getIntermediateGrade() < rules.get("IntermediateGrade") || bcgEntity.getHighschoolGrade() < rules.get("HighschoolGrade") || bcgEntity.getCollegeGPA() < rules.get("collegeGPA")) {
                bcgEntity.setStatus_bcg("FAILED");
                bcgEntity.setMessage("Less Academic scores");
                bcgdao.save(bcgEntity);
                return "FAILED";
            }
        }
        else{
            bcgEntity.setMessage("Academic scores are not invalid Please upload Correct marks");
            bcgEntity.setStatus_bcg("Pending");
            bcgdao.save(bcgEntity);
            return "Pending";
        }
        if(!bcgEntity.getCriminalRecord().equalsIgnoreCase("none")){
            bcgEntity.setMessage("Candidate Having Criminal Record");
            bcgEntity.setStatus_bcg("FAILED");
            bcgdao.save(bcgEntity);
            return "FAILED";
        }
        if(bcgEntity.getAdhaarNumber().length()>rules.get("adhaarLength") || bcgEntity.getPanNumber().length()>rules.get("PanLength")){
            bcgEntity.setStatus_bcg("FAILED");
            bcgEntity.setMessage("Invalid Adhaar and Pan Number");
            bcgdao.save(bcgEntity);
            return "FAILED";
        }
        bcgEntity.setStatus_bcg("Passed");
        bcgEntity.setMessage("BCG PASSED");
        bcgdao.save(bcgEntity);
        return "PASSED";
    }

    public Map<String,Integer> getAllRules() {
        int intermediateGrade=70;
        int highschoolGrade=70;
        int collegeGPA= 70;
        int adhaarLength=10;
        int panLength=10;
        int experience=2;
        HashMap<String,Integer> map=new HashMap<>();
        map.put("IntermediateGrade",intermediateGrade);
        map.put("HighschoolGrade",highschoolGrade);
        map.put("collegeGPA",collegeGPA);
        map.put("adhaarLength",adhaarLength);
        map.put("PanLength",panLength);
        map.put("experience",experience);
        return map;
    }

    public BCGEntities checkBCGStatusById(String id) {
        long emp_id=Long.parseLong(id);
        return bcgdao.findById(emp_id).get();
    }
}
