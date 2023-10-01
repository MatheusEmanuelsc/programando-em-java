package basico;

public class FormatandoComPrintf {

    public static void main(String[] args) {

        String ex = "testando";
        System.out.println("O print ln ele imprime a linha  e salta uma");

        //ja o printf ele não pula uma linha por padrão e le permite formata melhor a concatenação

        //o printf recebe 2 argumentos o primeior a string e o segundo a varivael se tiver varias variaveis
        //ele seguira pela ordem
        System.out.printf("1, 2, 3 %s%n" , ex);

        //se quiser pular linha use %n
        //se quiser trocar por string %s
        //se quiser trocar por valor inteiro %d
        //se quiser trocar por valor com ponto flutuante %f
        // se quiser trocar por tipo booleano %b
        //O de ponto flutante recebe parametros para  quantidade de casas decimais %.2f
        //entre "%" e o "f" vc pode por ".numero de casas"

        // exemplo
        double numero= 1.23455;
        System.out.printf("numero %.2f",numero);
        //caso queria ter  quantidade de numeros antes da virgula so por antes do ponto o numero desejado


    }
}
