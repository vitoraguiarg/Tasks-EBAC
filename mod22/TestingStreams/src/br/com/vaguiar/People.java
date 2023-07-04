package br.com.vaguiar;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public class People {
    private String name;
    private int age;
    private String nationality;
    private double height;
    public People() {

    }

    public People(String name, int age, String nationality, double height) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public List<People> populatedPeoples() {
        People p1 = new People("Vitor", 21, "Brasil", 1.75);
        People p2 = new People("Jeremy", 56, "Senegal", 1.95);
        People p3 = new People("Pep", 75, "England", 1.80);
        People p4 = new People("Jaf", 31, "Spain", 1.60);
        People p5 = new People("Dom", 89, "French", 1.48);
        People p6 = new People("koly", 17, "EUA", 1.78);
        return List.of(p1,p2,p3,p4,p5,p6);
    };
}
