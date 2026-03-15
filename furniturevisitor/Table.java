package furniturevisitor;

public class Table implements FurnitureItem {

    public static final String TYPE = "Table";

    private String size;
    private double weight;

    public Table(String size, double weight) {
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