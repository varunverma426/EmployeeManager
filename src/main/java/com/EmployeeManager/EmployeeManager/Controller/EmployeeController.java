package com.EmployeeManager.EmployeeManager.Controller;

import com.EmployeeManager.EmployeeManager.Entities.EmployeeEntities;
import com.EmployeeManager.EmployeeManager.Services.Interface.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
//@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeServices empInfoServices;

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody EmployeeEntities e){
        return this.empInfoServices.addEmployee(e);
    }

    @GetMapping("/getAllEmployee")
    public List<EmployeeEntities> getAllEmployee(){
        return this.empInfoServices.getAllEmployee();
    }

    @GetMapping("/getEmployeeById/{id}")
    public EmployeeEntities getEmployeeById(@PathVariable String id){
        return this.empInfoServices.getEmployeeById(id);
    }

    @PutMapping("/updateEmployee")
    public String updateEmployee(@RequestBody EmployeeEntities e){
        return this.empInfoServices.updateEmployee(e);
    }

    @DeleteMapping("/deleteEmployeeRecord/{id}")
    public String deleteEmployee(@PathVariable String id){
        return this.empInfoServices.deleteEmployee(id);
    }


}
