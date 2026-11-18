package question2;

public class ProductCalculations implements IProductCalculations {

    private static final double VAT_RATE = 0.15;         // 15% of the product price
    private static final double COMMISSION_RATE = 0.05;  // 5% of the product price

    private final double price;

    public ProductCalculations(double price) {
        this.price = price;
    }

    @Override
    public double GetVat() {
        return price * VAT_RATE;
    }

    @Override
    public double GetCommission() {
        return price * COMMISSION_RATE;
    }

    @Override
    public double GetTotal() {
        return price + GetVat() + GetCommission();
    }
}
