package dicount.calculator;

public class PremiumDiscount implements CustomerDiscounts{
    @Override
    public double calculateDiscount(Product product) {
        return product.getPrice() * 0.2;
    }
}
