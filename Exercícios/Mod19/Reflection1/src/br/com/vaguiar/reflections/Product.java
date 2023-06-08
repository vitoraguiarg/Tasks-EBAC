package br.com.vaguiar.reflections;

public class Product {
    private long id;
    private String description;
    private double value;

    public Product () {
    }

    public Product(long id, String description, double value) {
        this.id = id;
        this.description = description;
        this.value = value;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}


