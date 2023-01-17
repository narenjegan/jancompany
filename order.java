public class order extends supplies{

    //new Attributes
    private int quantity;

    //default
    public order(){
        super();
        quantity = 100;
    }

    //custom
    public order(String name, double price, String description, int quantity){
        super(name, price, description);
        this.quantity = quantity;
    }

    //getters
    public int getQuantity(){return quantity;}

    //setters
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //toString()
    public String toString(){
        return(super.getName()+"\n"+super.getDescription()+"\n"+super.getPrice()*quantity+"\n"+quantity);
    }
}
