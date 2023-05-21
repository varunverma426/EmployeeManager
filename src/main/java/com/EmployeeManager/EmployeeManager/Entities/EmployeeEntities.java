package com.EmployeeManager.EmployeeManager.Entities;
//import javax.persistence.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class EmployeeEntities implements Serializable {


    @Id
    //@Column(name = "Employe_Id", nullable = false)
   // @GeneratedValue(strategy= GenerationType.AUTO)
    private long emp_id;



    private String firstName;
    private String lastName;
    private  int collegeGPA;
    private  String prevCompanyName;
    private String prevCompanyDesignation;
    private String criminalRecord;
    private String emergencyContactNo;
    private String emergencyContactName;
    private String adhaarNumber;
    private String panNumber;

    private String emailPersonal;

    private String salary;




    private String dateOfBirth;

    private String skills;

    private String phoneNumber;

    private String dateOfJoining;
    private int experience;
    private String designation;
    private int intermediateGrade;
    private int highschoolGrade;
    private String deskNo;
    private String errorMsg;
    private String statusBCG;

    public EmployeeEntities(long emp_id, String firstName, String lastName, int collegeGPA, String prevCompanyName, String prevCompanyDesignation, String criminalRecord, String emergencyContactNo, String emergencyContactName, String adhaarNumber, String panNumber, String emailPersonal, String salary, String dateOfBirth, String skills, String phoneNumber, String dateOfJoining,
                            int experience, String designation, int intermediateGrade, int highschoolGrade, String deskNo, String errorMsg,String statusBCG) {
        this.emp_id = emp_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.collegeGPA = collegeGPA;
        this.prevCompanyName = prevCompanyName;
        this.prevCompanyDesignation = prevCompanyDesignation;
        this.criminalRecord = criminalRecord;
        this.emergencyContactNo = emergencyContactNo;
        this.emergencyContactName = emergencyContactName;
        this.adhaarNumber = adhaarNumber;
        this.panNumber = panNumber;
        this.emailPersonal = emailPersonal;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
        this.skills = skills;
        this.phoneNumber = phoneNumber;
        this.dateOfJoining = dateOfJoining;
        this.experience = experience;
        this.designation = designation;
        this.intermediateGrade = intermediateGrade;
        this.highschoolGrade = highschoolGrade;
        this.deskNo = deskNo;
        this.errorMsg = errorMsg;
        this.statusBCG=statusBCG;
    }

    public EmployeeEntities() {
        super();
    }

    public String getStatusBCG() {
        return statusBCG;
    }

    public void setStatusBCG(String statusBCG) {
        this.statusBCG = statusBCG;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCollegeGPA() {
        return collegeGPA;
    }

    public void setCollegeGPA(int collegeGPA) {
        this.collegeGPA = collegeGPA;
    }

    public String getPrevCompanyName() {
        return prevCompanyName;
    }

    public void setPrevCompanyName(String prevCompanyName) {
        this.prevCompanyName = prevCompanyName;
    }

    public String getPrevCompanyDesignation() {
        return prevCompanyDesignation;
    }

    public void setPrevCompanyDesignation(String prevCompanyDesignation) {
        this.prevCompanyDesignation = prevCompanyDesignation;
    }

    public String getCriminalRecord() {
        return criminalRecord;
    }

    public void setCriminalRecord(String criminalRecord) {
        this.criminalRecord = criminalRecord;
    }

    public String getEmergencyContactNo() {
        return emergencyContactNo;
    }

    public void setEmergencyContactNo(String emergencyContactNo) {
        this.emergencyContactNo = emergencyContactNo;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getEmailPersonal() {
        return emailPersonal;
    }

    public void setEmailPersonal(String emailPersonal) {
        this.emailPersonal = emailPersonal;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getAdhaarNumber() {
        return adhaarNumber;
    }

    public void setAdhaarNumber(String adhaarNumber) {
        this.adhaarNumber = adhaarNumber;
    }



    public String getDeskNo() {
        return deskNo;
    }

    public void setDeskNo(String deskNo) {
        this.deskNo = deskNo;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }



    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
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




    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }



}
