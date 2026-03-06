package dip.shopping;

public class CreditCard implements Payment{
    public void pay(Shopping shopping) {
        System.out.println("Paying " + shopping.getPrice() + " using credit card");
    }
}
