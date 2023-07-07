package br.com.vaguiar.intermediaryOperators;

import java.util.List;
import java.util.stream.Stream;

public class FilterExample {
    public static void main(String[] args) {
       List<People> list = new People().populatedPeoples();
       Stream<People> stream = list.stream().filter(people -> people.getNationality().equals("England"));
       // Will filter all elements that were born in Brasil.
    }
    
}
