import java.util.ArrayList;
import java.util.List;
// Class to list the cars
public class CarList <T extends Car> {
    private List<T> cars;

    public CarList() {
        cars = new ArrayList<>();
    }

    public void addCar(T car) {
        cars.add(car);
    }

    public void listCars() {
        for (T car : cars) {
            car.accelerate();
        }
    }
}
