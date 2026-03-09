package dicount.calculator;

public class VipDiscount implements CustomerDiscounts{
    @Override
    public double calculateDiscount(Product product) {
        return product.getPrice() * 0.3;
    }
}
