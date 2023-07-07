package br.com.vaguiar.intermediaryOperators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {

        // Example 1
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);
        numbers.add(1);

        Collections.sort(numbers);

        System.out.println(numbers); // Output: [1, 2, 5, 7]


        //Example 2
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("David");

        names.sort(Comparator.comparing(String::length));

        System.out.println(names); // Output: [Bob, John, Alice, David]



    }
}
