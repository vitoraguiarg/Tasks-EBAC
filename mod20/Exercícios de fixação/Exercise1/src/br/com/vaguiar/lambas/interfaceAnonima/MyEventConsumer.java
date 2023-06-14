package br.com.vaguiar.lambas.interfaceAnonima;
@FunctionalInterface // Anotação para indicar que é uma interface funcional
public interface MyEventConsumer {
    public void consumer(Object value);
}
