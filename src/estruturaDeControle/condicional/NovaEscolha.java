package estruturaDeControle.condicional;

import java.util.Scanner;

public class NovaEscolha {

    public static void main(String[] args) {

        //Apatir do java 14 foi lançado uma nova opção do switch

        Scanner entradaDados= new Scanner(System.in);
        System.out.println("Oque deseja assistir?");

        System.out.println("Digite \"1\" para The Big Bang Theory");
        System.out.println("Digite \"2\" para Game of Thrones");
        System.out.println("Digite \"3\" para How i met your mother");
        int num = entradaDados.nextInt();

        entradaDados.close();

        //dentro do () a variavel que vc  quer avaliar
        switch (num){

            case 1-> System.out.println("Assistindo The Big Bang Theory");


            case 2-> System.out.println("Assistindo Game of Thrones");


            case 3-> System.out.println("Assistindo How i met your mother");

            default-> System.out.println("Valor invalido");
        }

        /*observe vc trocar : por ->
        não precisa mais utilizar o break pois ele ja faz isso automaticamente
        *
        se quiser mais de um caso apenas por exemplo case 1,2,3  so por a  virgula e adc os parametros

        tbm e possivel abrir um bloco de codigo apos -> {}
        * */


        //------------------------------Switch Expressions-----------------------------------------

        //e possivel vc atribuir o valor do switch a uma variavel

        String serie=switch (num){

            case 1-> "Assistindo The Big Bang Theory";


            case 2-> "Assistindo Game of Thrones";


            case 3-> "Assistindo How i met your mother";

            default-> "Valor invalido";
        };

        //caso queria produzir o valor use  yould  caso queria implmentar alguma logica
        //no caso acima e implicito mais caso seilar  tivesse uma verificação com bloco if por exemplo
        // basta por yield e por exemplo "Assistindo Game of Thrones";
    }
}
