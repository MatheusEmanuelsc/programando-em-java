package estruturaDeControle.condicional;

import java.util.Scanner;

public class SeESenao {

    public static void main(String[] args) {

        Scanner entradaDados= new Scanner(System.in);

        System.out.println("Qual a nota: ");
        int nota= entradaDados.nextInt();

        if (nota>8){
            System.out.println("Otima nota");
        } else if (nota>6 && nota <8) {
            System.out.println("boa nota");
        }else {
            System.out.println("nota ruim");
        }

        // if  se for verdadeiro faça isso
        // se não e caso vc queria fazer outra verificação else if
        // else para o resto de opções sempre depois do if não tem verificação
    }
}
