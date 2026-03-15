package furniturevisitor;

public class FlatRateShippingService implements FlatRateShipping {

    @Override
    public String computeFlatRate(String furnitureType, String size) {
        double rate;

        switch (furnitureType) {
            case Chair.TYPE:
                switch (size) {
                    case "Small":  rate = 150.00; break;
                    case "Medium": rate = 200.00; break;
                    case "Large":  rate = 250.00; break;
                    default:       rate = 0.00;
                }
                break;
            case Table.TYPE:
                switch (size) {
                    case "Small":  rate = 300.00; break;
                    case "Medium": rate = 400.00; break;
                    case "Large":  rate = 500.00; break;
                    default:       rate = 0.00;
                }
                break;
            case Sofa.TYPE:
                switch (size) {
                    case "Small":  rate = 500.00; break;
                    case "Medium": rate = 700.00; break;
                    case "Large":  rate = 900.00; break;
                    default:       rate = 0.00;
                }
                break;
            default:
                rate = 0.00;
        }

        return String.format("Flat rate shipping for %s (%s size): ₱%.2f", furnitureType, size, rate);
    }
}