public class Main {
    public static void main(String[] args) {
        CarList<Car> list = new CarList<>();

        SportCar sportCar = new SportCar();
        SedanCar sedanCar = new SedanCar();

        list.addCar(sportCar);
        list.addCar(sedanCar);

        list.listCars();
    }
}
