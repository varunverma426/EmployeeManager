package com.EmployeeManager.EmployeeManager.Controller;

import com.EmployeeManager.EmployeeManager.Entities.DeskEntities;
import com.EmployeeManager.EmployeeManager.Services.Interface.DeskServices;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class DeskController {

    @Autowired
    private DeskServices deskServices;

    @PostMapping("/addDesk")
    public String addDesk(@RequestBody JSONObject desk) {
        return this.deskServices.addDesk(desk);
    }

    @GetMapping("/getAllDeskDetails")
    public List<DeskEntities> getAllDeskDetails() {
        return this.deskServices.getAllDeskDetails();
    }

    @GetMapping("/getDeskById/{deskNo}")
    public DeskEntities getDeskById(@PathVariable String deskNo){
        return this.deskServices.getDeskById(deskNo);
    }

    @PutMapping("/updateDeskDetails")
    public String updateDeskDetails(@RequestBody DeskEntities deskEntities){
        return this.deskServices.updateDeskDetails(deskEntities);
    }

    @DeleteMapping("/deleteDeskRecord/{deskNo}")
    public String deleteDeskData(@PathVariable String deskNo){
        return this.deskServices.deleteDeskData(deskNo);
    }
}
