package ebac.mod15.abstractyFactory;

public class LuxurySedan extends LuxuryCar {
    public LuxurySedan() {
        super("Luxury Sedan", "V8 engine", "Automatic Transmission");
    }

    @Override
    public void drive() {
        System.out.println("Driving a Luxury sedan.");
    }
}
