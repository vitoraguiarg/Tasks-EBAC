package ebac.mod15.abstractyFactory;

// Client code that uses the Abstract Factory pattern
public class CarFactoryClient {
    public static void main(String[] args) {
        // Create a Luxury Car Factory
        CarFactory luxuryFactory = new LuxuryCarFactory();
        LuxuryCar luxuryCar = luxuryFactory.createLuxuryCar();
        luxuryCar.drive(); // Output: "Driving a Luxury Sedan."

        // Create a Popular Car Factory
        CarFactory popularFactory = new PopularCarFactory();
        PopularCar popularCar = popularFactory.createPopularCar();
        popularCar.drive(); // Output: "Driving an Economy Car."
    }
}