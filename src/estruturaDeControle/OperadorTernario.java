package estruturaDeControle;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);
        int idade=entradaDados.nextInt();
        entradaDados.close();

        String eMaiorDeIdade = idade>=18? "E maior de idade!!!": "E menor de idade!!!";
        System.out.println(eMaiorDeIdade);
        //faz basicamente a mesma coisa que if

        //primeiro vc cria a variavel que ira armazena o resultado
        //depois faz a logica de comparação e adiciona "?"
        //o rpiemiro codigo que vem apos  isso e se  for verdadeiro
        //o segundo e se for falso

        //vc pode por um ternario dentro de um ternario embora ficar menos legivel
        //no caso vc  encadearia a partir  do segundo
        //porem não recomendo
    }
}
