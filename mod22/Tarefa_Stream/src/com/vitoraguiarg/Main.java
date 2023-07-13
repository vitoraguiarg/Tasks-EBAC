package com.vitoraguiarg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<People> peopleList = new ArrayList<>();

        peopleList.add(new People("Vitor", 'M'));
        peopleList.add(new People("Pedro",'M'));
        peopleList.add(new People("Raissa",'F'));
        peopleList.add(new People("Roger",'M'));
        peopleList.add(new People("Marília",'F'));


        List<People> females = peopleList.stream()
                .filter(p -> p.getSex() == 'F')
                .toList();

        for (People female : females) {
            System.out.println(female);
        }
    }
}
