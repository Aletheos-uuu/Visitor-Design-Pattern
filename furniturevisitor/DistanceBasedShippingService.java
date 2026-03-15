package furniturevisitor;

public class DistanceBasedShippingService implements DistanceBasedShipping {

    @Override
    public String computeDistanceRate(String furnitureType, double weight, int distanceKm) {
        double ratePerKmPerKg;

        switch (furnitureType) {
            case Chair.TYPE: ratePerKmPerKg = 0.10; break;
            case Table.TYPE: ratePerKmPerKg = 0.20; break;
            case Sofa.TYPE:  ratePerKmPerKg = 0.35; break;
            default:         ratePerKmPerKg = 0.15;
        }

        double shippingCost = weight * distanceKm * ratePerKmPerKg;

        return String.format(
            "Distance-based shipping for %s (%.1f kg, %d km @ ₱%.2f/kg/km): ₱%.2f",
            furnitureType, weight, distanceKm, ratePerKmPerKg, shippingCost
        );
    }
}