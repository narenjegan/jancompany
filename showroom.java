import java.util.*;
public class showroom{
    private ArrayList<supplies> supplyList;
    private String description;


    //default
    public showroom() {
        supplyList = new ArrayList<supplies>();
        supplyList.add(new supplies());
        description = "shotguns";
    }

    //custom
    public showroom(ArrayList<supplies> supplyList, String description){
        this.supplyList = supplyList;
        this.description = description;
    }

    //getters
    public ArrayList<supplies> getSupplyList() {
        return supplyList;
    }

    public String getDescription() {
        return description;
    }

    //Setters

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSupplyList(ArrayList<supplies> supplyList) {
        this.supplyList = supplyList;
    }

    //toString
    public String toString() {
        return("CLASS: "+description+"\n"+supplyList);
    }
}
