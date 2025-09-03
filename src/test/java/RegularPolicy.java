public class RegularPolicy implements DiscountPolicy {
    public double apply(double amount) {
        return amount * 0.10; // 10% de desconto
    }
}
