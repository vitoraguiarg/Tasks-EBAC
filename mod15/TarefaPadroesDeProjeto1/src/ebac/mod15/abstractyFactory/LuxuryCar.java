package ebac.mod15.abstractyFactory;
// Abstract Luxury Car class
public abstract class LuxuryCar {
    protected String model;
    protected String engine;
    protected String transmission;

    public LuxuryCar(String model, String engine, String transmission) {
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
    }

    public abstract void drive();


}
