package ebac.mod15.abstractyFactory;
// Concrete Popular Car Factory
public class PopularCarFactory implements CarFactory {
    @Override
    public LuxuryCar createLuxuryCar() {
        return new MidsizeCar();
    }

    @Override
    public PopularCar createPopularCar() {
        return new EconomyCar();
    }
}
