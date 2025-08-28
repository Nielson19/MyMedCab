// User class - This class will store the user information and return it.
    // User logistics:
        // PatientID - Primary Key
        // First Name
        // Last Name
        // DOB
        // Blood Sugar
        // Blood Pressure
        // Weight


package backend;

import java.time.*;
import java.math.*;

public class Users {
    private int PatientID;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private BigDecimal bloodSugar;
    private short systolic;
    private short diastolic;
    private BigDecimal weight;

    public Users(){}

    public Users(int PatientID, String firstName, String lastName, LocalDate dob, BigDecimal bloodSugar,
                 short systolic, short diastolic, BigDecimal weight) {
        this.PatientID = PatientID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.bloodSugar = bloodSugar;
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.weight = weight;
    }

    public int getPatientID(){
        return PatientID;
    }

    public void setPatientID(int PatientID){
        this.PatientID = PatientID;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.firstName = lastName;
    }

    public LocalDate getDob(){
        return dob;
    }

    public void setDob(LocalDate dob){
        this.dob = dob;
    }

    public BigDecimal getBloodSugar(){
        return bloodSugar;
    }

    public void setBloodSugar(BigDecimal bloodSugar){
        this.bloodSugar = bloodSugar;
    }

    public short getSystolic(){
        return systolic;
    }

    public void setSystolic(short systolic){
        this.systolic = systolic;
    }

    public short getDiastolic(){
        return diastolic;
    }

    public void setDiastolic(short diastolic){
        this.diastolic = diastolic;
    }

    public BigDecimal getWeight(){
        return weight;
    }

    public void setWeight(BigDecimal weight){
        this.weight = weight;
    }
}
