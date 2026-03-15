package furniturevisitor;

public interface FurnitureItem {
    String accept(FlatRateShipping flatRate);
    String accept(DistanceBasedShipping distanceRate, int distanceKm);
    String getFurnitureType();
    String getSize();
    double getWeight();
}