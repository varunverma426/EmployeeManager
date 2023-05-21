package com.EmployeeManager.EmployeeManager.Entities;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BCGEntities {

    @Id
    private long emp_id;

    private int collegeGPA;
    private String criminalRecord;
    private String adhaarNumber;
    private String panNumber;

    private String dateOfBirth;

    private int experience;
    private int intermediateGrade;



    private int highschoolGrade;

    private String status_bcg;
    private String message;

    public BCGEntities(long emp_id, int collegeGPA, String criminalRecord, String adhaarNumber, String panNumber, String dateOfBirth, int experience, int intermediateGrade, int highschoolGrade,String status_bcg,String message) {
        this.emp_id = emp_id;
        this.collegeGPA = collegeGPA;
        this.criminalRecord = criminalRecord;
        this.adhaarNumber = adhaarNumber;
        this.panNumber = panNumber;
        this.dateOfBirth = dateOfBirth;
        this.experience = experience;
        this.intermediateGrade = intermediateGrade;
        this.highschoolGrade = highschoolGrade;
        this.status_bcg=status_bcg;
        this.message=message;
    }

    public BCGEntities() {
        super();
    }

    public BCGEntities(EmployeeEntities e) {

    }

    public String getStatus_bcg() {
        return status_bcg;
    }

    public void setStatus_bcg(String status_bcg) {
        this.status_bcg = status_bcg;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    public int getCollegeGPA() {
        return collegeGPA;
    }

    public void setCollegeGPA(int collegeGPA) {
        this.collegeGPA = collegeGPA;
    }

    public String getCriminalRecord() {
        return criminalRecord;
    }

    public void setCriminalRecord(String criminalRecord) {
        this.criminalRecord = criminalRecord;
    }

    public String getAdhaarNumber() {
        return adhaarNumber;
    }

    public void setAdhaarNumber(String adhaarNumber) {
        this.adhaarNumber = adhaarNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getIntermediateGrade() {
        return intermediateGrade;
    }

    public void setIntermediateGrade(int intermediateGrade) {
        this.intermediateGrade = intermediateGrade;
    }

    public int getHighschoolGrade() {
        return highschoolGrade;
    }

    public void setHighschoolGrade(int highschoolGrade) {
        this.highschoolGrade = highschoolGrade;
    }


}
