// This class stores the medication info.
    // Contains logistics such as:
        // MedID - Primary key and analyzes the medication.
        // Name - the name of the medication
        // dosage - how much medicine a patient should take
        // expirationDate - when does a medicine expire?
        // formula - formula type: pill or syrup
        // timeline - how often should you take

package backend;
import java.math.*;
import java.time.*;

public class Medicine {
    private int MedID;
    public String name;
    private BigDecimal dosage;
    private LocalDate expirationDate;
    private String formula;
    private int frequency;
    private String period;

    public Medicine(){}

    public Medicine(int MedID, String name, BigDecimal dosage, LocalDate expirationDate, int frequency, String period){
        this.MedID = MedID;
        this.name = name;
        this.dosage = dosage;
        this.expirationDate = expirationDate;
        this.frequency = frequency;
        this.period = period;
    }

    public int getMedID(){
        return MedID;
    }

    public void setMedID(int MedID){
        this.MedID = MedID;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public BigDecimal getDosage(){
        return dosage;
    }

    public void setDosage(BigDecimal dosage){
        this.dosage = dosage;
    }

    public LocalDate getExpirationDate(){
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate){
        this.expirationDate = expirationDate;
    }

    public String getFormula(){
        return formula;
    }

    public void setFormula(String formula){
        this.formula = formula;
    }

    public int getFrequency(){
        return frequency;
    }

    public void setFrequency(int frequency){
        this.frequency = frequency;
    }

    public String getPeriod(){
        return period;
    }

    public void setPeriod(String period){
        this.period = period;
    }
}
