/*
The Prescription class contains all key ID's
connecting all primary and secondary keys
 */
public class Prescription {
    private int PrescriptionID;
    private int MedicineID;
    private int PatientID;
    private int PharmacyID;
    private int DoctorID;

    public Prescription()
    {
        this(0,0,0,0,0);
    }
    public Prescription(int prescriptionID, int medID, int patientID, int pharmacyID, int doctorID)
    {
        this.PrescriptionID = prescriptionID;
        this.MedicineID = medID;
        this.PatientID = patientID;
        this.PharmacyID = pharmacyID;
        this.DoctorID = doctorID;
    }
    public void setPrescriptionID(int PrescID)
    {
        PrescriptionID = PrescID;
    }
    public void setMedicineID (int medicineID)
    {
        MedicineID = medicineID;
    }
    public void setPatientID(int patientID)
    {
        this.PatientID = patientID;
    }
    public void setPharmacyID (int pharmacyID)
    {
        this.PharmacyID = pharmacyID;
    }
    public void setDoctorID (int doctorID)
    {
        this.DoctorID = doctorID;
    }
    public int getPrescriptionID()
    {
        return PrescriptionID;
    }
    public int getMedicineID()
    {
        return MedicineID;
    }
    public int getPatientID()
    {
        return PatientID;
    }
    public int getPharmacyID()
    {
        return PharmacyID;
    }
    public int getDoctorID()
    {
        return DoctorID;
    }


}
