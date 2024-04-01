public interface ShippingStrategy {
    double calculateShippingCost(double weight, double distance);
}

class RegularShipping implements ShippingStrategy {
    private static final double RATE_PER_KG = 5_000; // Tarif per kilogram

    @Override
    public double calculateShippingCost(double weight, double distance) {
        return RATE_PER_KG * weight;
    }
}

class ExpressShipping implements ShippingStrategy {
    private static final double RATE_PER_KG = 10_000; // Tarif per kilogram

    @Override
    public double calculateShippingCost(double weight, double distance) {
        return RATE_PER_KG * weight;
    }
}

class DistanceBasedShipping implements ShippingStrategy {
    private static final double RATE_PER_KM = 1_000; // Tarif per kilometer

    @Override
    public double calculateShippingCost(double weight, double distance) {
        return RATE_PER_KM * distance;
    }
}

class FlatRateShipping implements ShippingStrategy {
    private static final double FLAT_RATE = 10_000;

    @Override
    public double calculateShippingCost(double weight, double distance) {
        return FLAT_RATE;
    }
}
class ShippingCostCalculator {
    public double calculateShippingCost(ShippingStrategy strategy, double weight, double distance) {
        return strategy.calculateShippingCost(weight, distance);
    }
}
