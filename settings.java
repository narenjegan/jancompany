public class settings {

    //Attributes
    private String username;
    private String passcode;
    private int balance;
    private String wca;

    //default
    public settings(){
        username = "John Doe";
        passcode = "12345";
        balance = 1000;
        wca = "Standard";
    }

    //custom
    public settings(String username, String passcode, int balance, String wca){
        this.username = username;
        this.passcode = passcode;
        this.balance = balance;
        this.wca = wca;
    }

    //half-custom
    public settings(String username, String passcode){
        this.username = username;
        this.passcode = passcode;
        balance = 0;
        wca = "Standard";
    }

    //getters
    public int getBalance(){
        return balance;
    }
    public String getUsername(){
        return username;
    }
    public String getPasscode(){
        return passcode;
    }
    public String getWca(){
        return wca;
    }

    //setters
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPasscode(String passcode){
        this.passcode = passcode;
    }
    public void setWca(String WCA){
        this.wca = WCA;
    }

    //toString
    public String toString() {
        return ("USERNAME: " + username + "\nPASSCODE: " + passcode + "\nBALANCE: " + balance + "\nWCA: " + wca);
    }
}
