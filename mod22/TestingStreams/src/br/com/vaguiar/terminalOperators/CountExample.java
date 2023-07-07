package br.com.vaguiar.terminalOperators;

import java.util.Arrays;
import java.util.List;

public class CountExample {
    public static void main(String[] args) {
        // Example 1
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        long quantity = numbers.stream().count();
        // or - "long quantity = numbers.size();"

        System.out.println("Quantity of elements: " + quantity);

    }
}
