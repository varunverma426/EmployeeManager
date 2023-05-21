package com.EmployeeManager.EmployeeManager.Services.Interface;


import com.EmployeeManager.EmployeeManager.Entities.BCGEntities;

import java.util.Map;

public interface BCGServices {


     String performBCG(BCGEntities bcgEntity);

     Map<String,Integer> getAllRules();


     BCGEntities checkBCGStatusById(String id);
}
