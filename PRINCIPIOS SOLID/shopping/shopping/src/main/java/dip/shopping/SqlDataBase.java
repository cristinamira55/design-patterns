package dip.shopping;

public class SqlDataBase implements DataBase {

    public void save(Shopping shopping) {
        System.out.println("Saving " + shopping.getItemName() + " to the database");
    }
}
