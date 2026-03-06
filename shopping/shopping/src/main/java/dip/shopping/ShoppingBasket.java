package dip.shopping;

public class ShoppingBasket {

    private final DataBase dataBase;
    private final Payment payment;

    public ShoppingBasket(DataBase dataBase, Payment payment) {
        this.dataBase = dataBase;
        this.payment = payment;
    }

    public void buy(Shopping shopping) {
        dataBase.save(shopping);
        payment.pay(shopping);
    }
}
