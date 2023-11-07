package StrategyPattern;
//наценка

public class MarkupPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double basePrice) {
        return basePrice * 1.2;
    }
}