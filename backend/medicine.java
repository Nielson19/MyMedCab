//This class stores the medication info.
//Contains logistics such as:
  //MedID - Primary key and analyzes the medication.
  //Name - the name of the medication
  //dosage - how much medicine a patient should take
  //expirationDate - when does a medicine expire?
  //formula - formula type: pill or syrup
  //timeline - how often should you take
package backend;
public class Medicine {
    private int MedID;
    public String name;
    public double dosage;
    public int expirationDate;
    public String formula;
    public String timeline;

    public Medicine(){}
    public Medicine(int MedID, String name, double dosage, int expirationDate, String formula, String timeline){
        this.MedID = MedID;
        this.name = name;
        this.dosage = dosage;
        this.expirationDate = expirationDate;
        this.formula = formula;
        this.timeline = timeline;
    }
    public int getMedID(){
        return MedID;
    }
    public void setMedID(int MedID){
        this.MedID = MedID;
    }
    public String getName(){
        return getName();
    }
    public void setName(String name){
        this.name = name;
    }
    public double dosage(){
        return dosage;
    }
    public void setDosage(double dosage){
        this.dosage = dosage;
    }
    public int getExpirationDate(){
        return expirationDate;
    }
    public void setExpirationDate(int expirationDate){
        this.expirationDate = expirationDate;
    }
    public String getFormula(){
        return getFormula();
    }
    public void setFormula(String formula){
        this.formula = formula;
    }
    public String getTimeline(){
        return getTimeline();
    }
    public void setTimeline(String timeline){
        this.timeline = timeline;
    }

}
