package dicount.calculator;

public class DiscontCalculator {
    private CustomerDiscounts discount;

    public DiscontCalculator(CustomerDiscounts discount) {
        this.discount = discount;
    }

    public double calculateDiscount(Product product) {
        return discount.calculateDiscount(product);
    }
}
