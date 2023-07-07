package br.com.vaguiar.terminalOperators;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

    public static void main(String[] args) {
        System.out.println("***********Example1*************");


        // Example 1
        List<String> names = Arrays.asList("João", "Maria", "Pedro", "Ana");

        names.forEach(nome -> System.out.println("Olá, " + nome));

        System.out.println("***********Example2*************");


        // Example 2
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        numeros.stream() // Example using stream
                .forEach(numero -> System.out.println(numero * 2));


        System.out.println("***********Example3*************");

        // Example 3
        class People {
            private String name;
            private int age;

            public People(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }

        List<People> peoples = Arrays.asList(
                new People("João", 25),
                new People("Maria", 30),
                new People("Pedro", 40)
        );

        peoples.stream()
                .forEach(people -> System.out.println(people.getName() + " - " + people.getAge()));

    }
}
