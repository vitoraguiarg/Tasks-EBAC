package br.com.vaguiar.terminalOperators;

import br.com.vaguiar.intermediaryOperators.People;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {

        // Example 1
        List<String> words = Arrays.asList("Olá", "Mundo", "do", "Java");

        List<String> colectedList = words.stream().collect(Collectors.toList());

        System.out.println(colectedList); // Saída: [Olá, Mundo, do, Java]

        // Example 2
        List<People> peoples = new People().populatedPeoples();
        List<People> peoplesWithV = peoples.stream()
                .filter(people -> people.getName().startsWith("V"))
                .collect(Collectors.toList());
        peoplesWithV.forEach(people -> System.out.println(people.getName()));
        
    }
}
