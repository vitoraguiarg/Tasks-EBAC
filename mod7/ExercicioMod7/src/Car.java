public class Car {
    private String name;
    private String model;
    private String color;
    private int year;

    // Constructor
    public Car(String name, String model, String color, int year) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // methods
    public void accelerate() {
        System.out.println(name + " " + model + " is accelerating!");
    }

    public void brake() {
        System.out.println(name + " " + model + " is braking!");
    }

    public void drift() {
        System.out.println(name + " " + model + " is drifting!");
    }

    // ToString method
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
