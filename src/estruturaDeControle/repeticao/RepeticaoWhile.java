package estruturaDeControle.repeticao;

import java.util.Scanner;

public class RepeticaoWhile {

    public static void main(String[] args) {

        //while vc usa quando não sabe quando ira durar

        Scanner entradaDados= new Scanner(System.in);

        //cuidado pois while pode acontece rum loop infito se não adc a condição de saida
        int  sair= 0;//condição de saida
        while (sair!=1){//verifica condição

            System.out.println("repetiu");
            System.out.println("deseja sair? digite 1");
            sair=entradaDados.nextInt();//condição sendo modificada
        }
        System.out.println("saiu");
        entradaDados.close();
    }
}
