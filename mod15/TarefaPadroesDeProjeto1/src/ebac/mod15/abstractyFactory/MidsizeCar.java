package ebac.mod15.abstractyFactory;

public class MidsizeCar extends LuxuryCar {
    public MidsizeCar() {
        super("Midsize Car", "V6 engine", "Automatic transmission");
    }

    @Override
    public void drive() {
        System.out.println("Driving a Midsize Car");
    }
}
