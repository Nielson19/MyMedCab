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
    private int Prescexpdate;
    private double PrescDose;
    private int PrescFrequency;
    private String PrescFormula;

    public Prescription()
    {
    }
    public Prescription(int prescriptionID, int medID, int patientID, int pharmacyID, int doctorID, int prescexpdate, double prescDose, int prescFrequency, String formula)
    {
        this.PrescriptionID = prescriptionID;
        this.MedicineID = medID;
        this.PatientID = patientID;
        this.PharmacyID = pharmacyID;
        this.DoctorID = doctorID;
        this.Prescexpdate = prescexpdate;
        this.PrescDose = prescDose;
        this.PrescFrequency = prescFrequency;
        this.PrescFormula = formula;
    }
    
    //setters
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
    
    public void setPrescexpdate (int expirationDate)
    {
        this.Prescexpdate = expirationDate;
    }
    public void setPrescDose (double dose)
    {
        this.PrescDose = dose;
    }
    public void setPrescFrequency (int frequency)
    {
        this.PrescFrequency = frequency;
    }
    public void setFormula (String formula)
    {
        this.PrescFormula = formula;
    }
    
    //getters
    
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
    
    public int getPrescexpdate ()
    {
        return Prescexpdate;
    }
    
    public double getPrescDose()
    {
        return PrescDose;
    }
    public int getPrescFrequency()
    {
        return PrescFrequency;
    }
    public String getPrescFormula()
    {
        return PrescFormula;
    }
}

