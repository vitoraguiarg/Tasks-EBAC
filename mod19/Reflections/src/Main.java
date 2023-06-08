public class Main {
    public static void main(String[] args) {
        // Obtenha a classe
        Class<MinhaClasse> classe = MinhaClasse.class;

        // Verifique se a anotação está presente na classe
        if (classe.isAnnotationPresent(MinhaAnotacao.class)) {
            // Obtenha a instância da anotação
            MinhaAnotacao anotacao = classe.getAnnotation(MinhaAnotacao.class);

            // Obtenha o valor da anotação
            String valor = anotacao.valor();

            // Imprima o valor no console
            System.out.println("Valor da anotação: " + valor);
        } else {
            System.out.println("A anotação não está presente na classe.");
        }
    }
}