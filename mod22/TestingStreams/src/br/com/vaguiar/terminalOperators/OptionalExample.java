package br.com.vaguiar.terminalOperators;

import br.com.vaguiar.intermediaryOperators.People;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        List<People> list = new People().populatedPeoples();

        Optional<People> optional = list.stream()
                .max(Comparator.comparing(People::getNationality));

        optional.ifPresent(System.out::println);
    }
}
