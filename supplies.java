public class supplies {

    //Attributes
    private String name;
    private double price;
    private String description;

    //default
    public supplies(){
        name = "AK-47";
        price = 3500.00;
        description = "The AK-47, officially known as the Avtomat Kalashnikova, \nis a gas-operated assault rifle that is chambered for the 7.62×39mm cartridge. \nDeveloped in the Soviet Union by Russian small-arms designer Mikhail Kalashnikov, it is the \noriginating firearm of the Kalashnikov family of rifles.";
    }

    //custom
    public supplies(String name, double price, String description){
        this.name = name;
        this.price = price;
        this.description = description;
    }

    //getters
    public String getName(){return name;}
    public String getDescription(){return description;}
    public double getPrice(){return price;}

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    //toString()
    public String toString(){
        return(name+"\n"+price+"\n"+description+"\n");
    }
}
