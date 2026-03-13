package dicount.calculator;

public class RegularDiscount implements CustomerDiscounts {
    @Override
    public double calculateDiscount(Product product) {
        return product.getPrice() * 0.1;
    }
}
