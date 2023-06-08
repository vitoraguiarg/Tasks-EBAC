package ebac.mod15.abstractyFactory;
// Concrete Popular Car classes

public class CompactCar extends PopularCar {
    public CompactCar() {
        super("Compact Car", "4-cylinder Engine", "Manual transmission");
    }

    @Override
    public void drive() {
        System.out.println("Driving a Compact Car.");
    }
}
