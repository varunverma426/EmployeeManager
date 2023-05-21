package com.EmployeeManager.EmployeeManager.Services.Interface;

import com.EmployeeManager.EmployeeManager.Entities.DeskEntities;
import org.json.JSONObject;

import java.util.List;

public interface DeskServices {
    String addDesk(JSONObject desk);

    List<DeskEntities> getAllDeskDetails();

    DeskEntities getDeskById(String deskNo);

    String updateDeskDetails(DeskEntities deskEntities);

    String deleteDeskData(String deskNo);
}
