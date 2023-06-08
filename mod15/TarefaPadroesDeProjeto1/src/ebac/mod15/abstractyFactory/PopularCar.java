package ebac.mod15.abstractyFactory;
// Abstract Popular Car class

public abstract class PopularCar {
    protected String model;
    protected String engine;
    protected String transmission;

    public PopularCar(String model, String engine, String transmission) {
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
    }

    public abstract void drive();

}
