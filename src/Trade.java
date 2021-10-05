//import java.lang.*;

public class Trade {
    private String ID;
    private String Symbol;
    private int quantity;
    private double price;

    public static void main(String[] args){
        Trade t1 = new Trade("T1", "APPL",100, 15.25);

        Trader cum = new Trader("Nat",t1);
        Account newAccount = new Account(100);
        System.out.println(t1.toString());
        System.out.println(cum.addTrade());

    }
    public String toString() {
        return " ID = "+ ID + "  Symbol = " + Symbol +" quantity = "+ quantity + " price = "+ price;

    }

    public Trade(String ID, String symbol, int quantity, double price) {
        this.ID = ID;
        Symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public Trade(String ID, String symbol, int quantity) {
        this.ID = ID;
        Symbol = symbol;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price>=0){
            this.price = price;
        }else {
            throw new IllegalArgumentException("Price can not be negative value");
        }
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}


