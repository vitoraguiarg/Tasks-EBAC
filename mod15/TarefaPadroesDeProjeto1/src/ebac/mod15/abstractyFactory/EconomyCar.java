package ebac.mod15.abstractyFactory;

public class EconomyCar extends PopularCar {
    public EconomyCar() {
        super("Economy Car", "4-cilynder Engine", "Automatic transmission");
    }

    @Override
    public void drive() {
        System.out.println("Driving a economy car.");
    }
}
