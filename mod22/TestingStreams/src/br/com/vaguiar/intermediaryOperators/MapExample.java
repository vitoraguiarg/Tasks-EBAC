package br.com.vaguiar.intermediaryOperators;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapExample {
    public static void main(String[] args) {
        List<People> list =  new People().populatedPeoples();

        Stream<Integer> stream = list.stream()
                .filter(people -> people.getNationality().equals("Brasil"))
                .map(People::getAge);

        // or.

        IntStream intStream = list.stream()
                .filter(people -> people.getNationality().equals("England"))
                .mapToInt(People::getAge);

        // Search just for integer objects.


    }
}
