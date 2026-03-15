package furniturevisitor;

public class FurnitureShop {

    public static void main(String[] args) {

        FurnitureItem chair = new Chair("Small",  5.0);
        FurnitureItem table = new Table("Large",  25.0);
        FurnitureItem sofa  = new Sofa ("Medium", 45.0);

        FlatRateShipping      flatRate     = new FlatRateShippingService();
        DistanceBasedShipping distanceRate = new DistanceBasedShippingService();

        int distanceKm = 50;

        System.out.println("=== Furniture Shipping Cost Calculator ===\n");

        System.out.println("-- Flat Rate Shipping --");
        System.out.println(chair.accept(flatRate));
        System.out.println(table.accept(flatRate));
        System.out.println(sofa.accept(flatRate));

        System.out.println("\n-- Distance-Based Shipping (Distance: " + distanceKm + " km) --");
        System.out.println(chair.accept(distanceRate, distanceKm));
        System.out.println(table.accept(distanceRate, distanceKm));
        System.out.println(sofa.accept(distanceRate, distanceKm));
    }
}