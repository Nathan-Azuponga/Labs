public class Trader {
    private String name;

    Trade trade = new Trade("T1", "APPL",100, 15.25);
    Account newAccount = new Account(100);

    public Trader(String name, Trade trade) {
        this.name = name;
        this.trade = trade;
    }

    public double addTrade(){
        double total = trade.getPrice() * trade.getQuantity() + newAccount.getValue();

        return total;
    }
}
