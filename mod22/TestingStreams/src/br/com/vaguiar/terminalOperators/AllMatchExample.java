package br.com.vaguiar.terminalOperators;

import java.util.Arrays;
import java.util.List;

public class AllMatchExample {
    public static void main(String[] args) {

        // Example 1
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        boolean allPairs = numbers.stream().allMatch(n -> n % 2 == 0);

        System.out.println(allPairs); // return - true

    }
}
