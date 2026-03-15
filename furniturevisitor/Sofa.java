package furniturevisitor;

public class Sofa implements FurnitureItem {

    public static final String TYPE = "Sofa";

    private String size;
    private double weight;

    public Sofa(String size, double weight) {
        this.size   = size;
        this.weight = weight;
    }

    @Override
    public String accept(FlatRateShipping flatRate) {
        return flatRate.computeFlatRate(TYPE, size);
    }

    @Override
    public String accept(DistanceBasedShipping distanceRate, int distanceKm) {
        return distanceRate.computeDistanceRate(TYPE, weight, distanceKm);
    }

    @Override
    public String getFurnitureType() { return TYPE;   }

    @Override
    public String getSize()          { return size;   }

    @Override
    public double getWeight()        { return weight; }
}