package estruturaDeControle.condicional;

import java.util.Scanner;

public class Escolha {

    public static void main(String[] args) {

        Scanner entradaDados= new Scanner(System.in);
        System.out.println("Oque deseja assistir?");

        System.out.println("Digite \"1\" para The Big Bang Theory");
        System.out.println("Digite \"2\" para Game of Thrones");
        System.out.println("Digite \"3\" para How i met your mother");
        int num = entradaDados.nextInt();

        entradaDados.close();

        //dentro do () a variavel que vc  quer avaliar
        switch (num){

            case 1:

                System.out.println("Assistindo The Big Bang Theory");
                break;

            case 2:

                System.out.println("Assistindo Game of Thrones");
                break;

            case 3:

                System.out.println("Assistindo How i met your mother");
                break;

            default:
                System.out.println("Valor invalido");
        }

        /*Tipos que funcionam
        *
        * char, byte,short e int e seus respectivos wrappers
        * enum
        * String
        * */

        /*Use o break para interroper o fluxo do programa caso contrario ele continuara a executa todos mesmo
        com a condição comprida
        *
        Use o default  para caso não tenha opcao desejada
        * */


    }
}
