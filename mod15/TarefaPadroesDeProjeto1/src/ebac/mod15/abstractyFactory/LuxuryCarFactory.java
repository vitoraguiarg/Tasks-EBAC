package ebac.mod15.abstractyFactory;
// Concrete Luxury Car Factory
public class LuxuryCarFactory implements CarFactory {
    @Override
    public LuxuryCar createLuxuryCar() {
        return new LuxurySedan();
    }

    @Override
    public PopularCar createPopularCar() {
        return new CompactCar();
    }
}
