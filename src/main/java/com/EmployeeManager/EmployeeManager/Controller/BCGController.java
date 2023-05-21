package com.EmployeeManager.EmployeeManager.Controller;


import com.EmployeeManager.EmployeeManager.Entities.BCGEntities;
import com.EmployeeManager.EmployeeManager.Services.Interface.BCGServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class BCGController {

   @Autowired
    private BCGServices bcgServices;

   @GetMapping("/getAllRules")
   public Map<String,Integer> getAllRules(){
       return this.bcgServices.getAllRules();
   }

   @PostMapping("/performBCG")
   public String performBCG(@RequestBody BCGEntities bcg){
       return this.bcgServices.performBCG(bcg);
   }

   @GetMapping("/checkBCGStatusById/{emp_id}")
    public BCGEntities checkBCGstatusById(@PathVariable String emp_id){
       return this.bcgServices.checkBCGStatusById(emp_id);
   }

}
