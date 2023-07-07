package br.com.vaguiar.intermediaryOperators;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample {
    public static void main(String[] args) {

        // Example 1
        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 4, 5, 5);

        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctNumbers); // Output: [1, 2, 3, 4, 5]


        // Example 2



    }
}