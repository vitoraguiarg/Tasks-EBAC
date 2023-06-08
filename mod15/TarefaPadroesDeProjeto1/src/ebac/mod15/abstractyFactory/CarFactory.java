package ebac.mod15.abstractyFactory;
// Abstract Factory interface
public interface CarFactory {
    public LuxuryCar createLuxuryCar();
    public PopularCar createPopularCar();
}
