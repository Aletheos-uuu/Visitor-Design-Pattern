package furniturevisitor;

public interface DistanceBasedShipping {
    String computeDistanceRate(String furnitureType, double weight, int distanceKm);
}