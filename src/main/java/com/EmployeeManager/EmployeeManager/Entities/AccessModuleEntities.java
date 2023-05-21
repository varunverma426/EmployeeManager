package com.EmployeeManager.EmployeeManager.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccessModuleEntities {
    @Id
    private long emp_id;
    private String status_bcg;
    private String Desko;
    private String towerNo;
    private String floor_no;
    private String dept_no;
    private String assetNo;
    private String work_email;
    private  String team_access;
    private String jira_access;
    private String bitbucket_access;
    private String idCardsNo;
    private String idCard_access;

    public AccessModuleEntities() {
        super();
    }

    public long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    public String getStatus_bcg() {
        return status_bcg;
    }

    public void setStatus_bcg(String status_bcg) {
        this.status_bcg = status_bcg;
    }

    public String getDesko() {
        return Desko;
    }

    public void setDesko(String desko) {
        Desko = desko;
    }

    public String getTowerNo() {
        return towerNo;
    }

    public void setTowerNo(String towerNo) {
        this.towerNo = towerNo;
    }

    public String getFloor_no() {
        return floor_no;
    }

    public void setFloor_no(String floor_no) {
        this.floor_no = floor_no;
    }

    public String getDept_no() {
        return dept_no;
    }

    public void setDept_no(String dept_no) {
        this.dept_no = dept_no;
    }

    public String getAssetNo() {
        return assetNo;
    }

    public void setAssetNo(String assetNo) {
        this.assetNo = assetNo;
    }

    public String getWork_email() {
        return work_email;
    }

    public void setWork_email(String work_email) {
        this.work_email = work_email;
    }

    public String getTeam_access() {
        return team_access;
    }

    public void setTeam_access(String team_access) {
        this.team_access = team_access;
    }

    public String getJira_access() {
        return jira_access;
    }

    public void setJira_access(String jira_access) {
        this.jira_access = jira_access;
    }

    public String getBitbucket_access() {
        return bitbucket_access;
    }

    public void setBitbucket_access(String bitbucket_access) {
        this.bitbucket_access = bitbucket_access;
    }

    public String getIdCardsNo() {
        return idCardsNo;
    }

    public void setIdCardsNo(String idCardsNo) {
        this.idCardsNo = idCardsNo;
    }

    public String getIdCard_access() {
        return idCard_access;
    }

    public void setIdCard_access(String idCard_access) {
        this.idCard_access = idCard_access;
    }


    public AccessModuleEntities(long emp_id, String status_bcg, String desko, String towerNo, String floor_no, String dept_no, String assetNo, String work_email, String team_access, String jira_access, String bitbucket_access, String idCardsNo, String idCard_access) {
        this.emp_id = emp_id;
        this.status_bcg = status_bcg;
        Desko = desko;
        this.towerNo = towerNo;
        this.floor_no = floor_no;
        this.dept_no = dept_no;
        this.assetNo = assetNo;
        this.work_email = work_email;
        this.team_access = team_access;
        this.jira_access = jira_access;
        this.bitbucket_access = bitbucket_access;
        this.idCardsNo = idCardsNo;
        this.idCard_access = idCard_access;
    }

}
