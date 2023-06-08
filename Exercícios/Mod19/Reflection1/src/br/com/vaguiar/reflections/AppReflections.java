package br.com.vaguiar.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// This class is responsible to test Reflections of Product attributes, methods and other fields of the Product class.
public class AppReflections {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class class1 = Product.class; // Using reflection.
        System.out.println(class1); // Printing class name.

        Product prod1 = new Product(); // Instantiating the class.
        Class class2 = prod1.getClass(); // Using reflection.
        System.out.println(class2); // Printing class name.

        Method[] Method = prod1.getClass().getDeclaredMethods(); // Returning type and name using Reflections / Array
        for (Method m1 : Method) {
            Class<?> type = m1.getReturnType();
            String name = m1.getName();
            System.out.println(type);
            System.out.println(name);
        }

    }
}
