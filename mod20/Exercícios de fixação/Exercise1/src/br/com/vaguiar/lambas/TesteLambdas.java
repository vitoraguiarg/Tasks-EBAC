package br.com.vaguiar.lambas;

import java.util.function.BiFunction; // Interface funcional
import java.util.function.IntBinaryOperator; // Interface funcional

public class TesteLambdas {
    public static void main(String[] args) {
        // Intaface binaryOperator, interface funcional que recebe dois parametros, você não precisa criar nenhuma interface e ela já faz essa função pra você, sem ter que instanciar a interface, isso facilita seu código fazendo com que o código fique menor e mais prático.
        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            return a + b;
        };

        int result1 = intBinaryOperator.applyAsInt(1, 1); // ".applyAsInt" é para aplicar as instancias, no caso os valores inteiros.

        System.out.println("Utilizando intBinaryOperator - " + result1);

        // Sem isso seria necessário criar uma interface que recebe dois parãmetros, instacia-la na classe atual para que assim pudesse utiliza-la.

        // Agora com a expressão abaixo é possível definir qualquer propriedade, seja int, double, String, o que queira.
        BiFunction<Double, Double, Double> biFunction1 = (Double a, Double b) -> {
            return a + b;
        };
        double resultBi = biFunction1.apply(9.29, 89.34);
        System.out.println("Utilizando BiFunction - " + resultBi);

        // Outro exemplo de Lambda abaixo
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando no terminal de maneira comum");
            }
        };
        new Thread(r).start();

        // Maneira mais simples utilizando apenas uma linha e dispensando toda a quantidade de linha acima

        new Thread(() -> System.out.println("Executando expressão Lambda com Thread e .start e rodando no terminal com apenas 1 linha")).start();




    }
}