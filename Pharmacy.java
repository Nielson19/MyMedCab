package backend;

/**
 * Pharamcy class contain all the information
 * about each pharmacy including: PharmacyID,
 * MedicineID, PharmacyLocation, MedicineName, and Stock
 */
public class Pharmacy {

    private int PharmacyID;
    private int MedicineID;
    private String PharmacyLocation;
    private String MedicineName;
    private int Stock;
    public Pharmacy()
    {
        this(0,0,"No Location","No Medicine Name",0);
    }
    public Pharmacy(int pharmacyID, int medicineID, String pharmacyLocation, String medicineName, int stock)
    {
        this.PharmacyID = pharmacyID;
        this.MedicineID = medicineID;
        this.PharmacyLocation = pharmacyLocation;
        this.MedicineName = medicineName;
        this.Stock = stock;
    }
    //SETTERS
    public void setPharmacyID(int pharmacyID)
    {
        this.PharmacyID = pharmacyID;
    }
    public void setMedicineID(int medicineID)
    {
        this.MedicineID = medicineID;
    }
    public void setPharmacyLocation(String pharmacyLocation)
    {
        this.PharmacyLocation = pharmacyLocation;
    }
    public void setMedicineName (String pharmacyLocation)
    {
        this.PharmacyLocation = pharmacyLocation;
    }
    public void setStock (int stock)
    {
        this.Stock = stock;
    }

    //GETTERS
    public int getPharmacyID()
    {
        return PharmacyID;
    }
    public int getMedicineID()
    {
        return MedicineID;
    }
    public String getPharmacyLocation()
    {
        return PharmacyLocation;
    }
    public String getMedicineName(String medicineName)
    {
        return MedicineName;
    }
    public int getStock()
    {
        return Stock;
    }




}
