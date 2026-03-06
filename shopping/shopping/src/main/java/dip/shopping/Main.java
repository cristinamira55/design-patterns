package dip.shopping;

public class Main {

    public static void main(String[] args) {

        Shopping shopping = new Shopping("Item 1", 20.0, 1);
        DataBase dataBase = new SqlDataBase();
        Payment payment = new CreditCard();

        ShoppingBasket shoppingBasket = new ShoppingBasket(dataBase,payment);
        shoppingBasket.buy(shopping);
    }
}
