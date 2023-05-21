package com.EmployeeManager.EmployeeManager.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AssetEntities {
    
    @Id
    private String emp_Id;
    private int  assetNo;
    private String asset_name;
    private String status_asset;
    private String status_msg;
}
