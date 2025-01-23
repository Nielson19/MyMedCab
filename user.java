//User class - This class will store the user information and return it.
//User logistics:
    //PatientID - Primary Key
    //First Name
    //Last Name
    //DOB
    //Blood Sugar
    //Blood Pressure
    //Weight


package org.example;
public class User {
    private int patientId;
    private String firstName;
    private String lastName;
    private String dob;
    private String bloodPressure;
    private String bloodSugar;
    private double weight;

    public User(){}
    public User(int patientId, String firstName, String lastName, int dob, String bloodPressure, String bloodSugar, double weight){
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.bloodPressure = bloodPressure;
        this.bloodSugar = bloodSugar;
        this.weight = weight;
    }
    public int getPatientId(){
        return patientId;
    }
    public void setPatientId(int patientId){
        this.patientId = patientId;
    }
    public String getFirstName(){
        return getFirstName();
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return getLastName();
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String dob(){
        return dob();
    }
    public void setDob(String dob){
        this.dob = dob;
    }
    public String getBloodPressure(){
        return getBloodPressure();
    }
    public void setBloodPressure(String bloodPressure){
        this.bloodPressure = bloodPressure;
    }
    public String getBloodSugar(){
        return getBloodSugar();
    }
    public void setBloodSugar(String bloodSugar){
        this.bloodSugar = bloodSugar;
    }
    public double weight(){
        return weight();
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
}

