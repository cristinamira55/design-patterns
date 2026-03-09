package dicount.calculator;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000);

        DiscontCalculator regularCalculator = new DiscontCalculator((new RegularDiscount()));
        System.out.println("Desuento REGULAR: "+ regularCalculator.calculateDiscount(product));

        DiscontCalculator premiumCalculator = new DiscontCalculator((new PremiumDiscount()));
        System.out.println("Descuento PREMIUM " + premiumCalculator.calculateDiscount(product));

        DiscontCalculator vipCalculator = new DiscontCalculator((new VipDiscount()));
        System.out.println("Descuento VIP " + vipCalculator.calculateDiscount(product));

    }
}
