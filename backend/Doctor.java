package backend;

/**
 * Doctor class contain the information about
 * each doctor including name, ID, HospitalID,
 * and Specialty
 */
public class Doctor {
    private int DoctorID;
    private int HospitalID;
    private String DoctorName;
    private String DoctorSpecialty;

    public Doctor()
    {
        this(0,0,"","");
    }
    public Doctor(int doctorID, int hospitalID, String doctorName, String doctorSpecialty)
    {
        this.DoctorID = doctorID;
        this.HospitalID = hospitalID;
        this.DoctorName = doctorName;
        this.DoctorSpecialty = doctorSpecialty;
    }
    //SETTERS
    public void setDoctorID(int doctorID)
    {
        this.DoctorID = doctorID;
    }
    public void setHospitalID(int hospitalID)
    {
        this.HospitalID = hospitalID;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }

    public void setDoctorSpecialty(String doctorSpecialty) {
        DoctorSpecialty = doctorSpecialty;
    }

    //GETTERS


    public int getDoctorID() {
        return DoctorID;
    }

    public int getHospitalID() {
        return HospitalID;
    }
    public String getDoctorName()
    {
        return DoctorName;
    }

    public String getDoctorSpecialty() {
        return DoctorSpecialty;
    }
}
