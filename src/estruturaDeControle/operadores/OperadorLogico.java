package estruturaDeControle.operadores;

import java.util.Scanner;

public class OperadorLogico {

    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("digite um numero:");
        int num=entradaDados.nextInt();
        entradaDados.close();

        //operador "&&"(e) faz duas verificaçoẽs que ambas devem ser verdadeiras
        //exemplo abaixo  (num e maior que 18) e (menor que 25)
        if (num>18 && num<25 ){
            System.out.println(" e maior que 18 e menor que 25");
        }

        //Operador "||"  (ou) faz duas verificações  nesse caso precisa apenas uma ser verdadeira

        //exemplo abaixo  (num e par?) ou (num e igual 9?) se qualquer uma das condições for verdadeira sera verdadeiro
        if(num%2==0 || num==9){
            System.out.println("numero correto");
        }


        // Obs  vc pode  fazer + de duas verificações

        //precedencia de operador logico
        //&&  e sempre avaliado primeiro

        // use () para melhorar a visualização e garantir que a operação seja do seu jeito
    }
}
