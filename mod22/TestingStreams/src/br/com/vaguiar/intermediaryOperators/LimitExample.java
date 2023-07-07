package br.com.vaguiar.intermediaryOperators;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitExample {
    public static void main(String[] args) {

        // Example 1
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> limitedNumbers = numbers.stream()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(limitedNumbers); // Output: [1, 2, 3]


        // Example 2
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        List<String> limitedWords = words.stream()
                .filter(w -> w.length() > 5)
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(limitedWords); // Output: [banana, cherry]


    }
}
