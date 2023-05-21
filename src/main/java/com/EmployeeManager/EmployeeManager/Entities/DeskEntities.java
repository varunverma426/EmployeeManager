package com.EmployeeManager.EmployeeManager.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DeskEntities {

    @Id
   // @GeneratedValue(strategy =  GenerationType.AUTO)
    private long deskNo;

    private long  emp_id;
    private String deptName;

    private String towerName;
    private  String floorNo;

    private String statusDesk;

    public DeskEntities() {
        super();
    }

    public long getDeskNo() {
        return deskNo;
    }

    public void setDeskNo(long deskNo) {
        this.deskNo = deskNo;
    }

    public long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getTowerName() {
        return towerName;
    }

    public void setTowerName(String towerName) {
        this.towerName = towerName;
    }

    public DeskEntities(long deskNo, long emp_id, String deptName, String towerName, String floorNo, String statusDesk) {
        this.deskNo = deskNo;
        this.emp_id = emp_id;
        this.deptName = deptName;
        this.towerName = towerName;
        this.floorNo = floorNo;
        this.statusDesk = statusDesk;
    }

    public String getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }

    public String getStatusDesk() {
        return statusDesk;
    }

    public void setStatusDesk(String statusDesk) {
        this.statusDesk = statusDesk;
    }



}
