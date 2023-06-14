package br.com.vaguiar.lambas.interfaceAnonima;

import br.com.vaguiar.lambas.TesteLambdas;
// Classe utilizando interface anonima
public class AnonimasTeste {
    public static void main(String[] args) {
        MyEventConsumer anonima = new MyEventConsumer() {
            @Override
            public void consumer(Object value) {
                System.out.println(value);
            }
        };
        anonima.consumer("teste de interface anonima");

        // Abaixo utilizando expressão lambda
        MyEventConsumer anonimaLambda = (Object value) -> System.out.println(value);
        anonimaLambda.consumer(10);

    }

    // Utilizando em método
    private static void receberInterface(MyEventConsumer anonimaLambda) {
        anonimaLambda.consumer(220);
    }
}
