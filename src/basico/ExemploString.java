package basico;

public class ExemploString {

    public static void main(String[] args) {
        int ex1= 10;
        int ex2=20;

        //cocatenação simples

        System.out.println("Resultado"+(ex1+ex2));

        System.out.println("Resultado"+ex1+ex2);

        /*A soma serve tanto para soma variaveis como concatenar
        *
        * ela segue padrão a ordem de precedência no caso se fosse multiplicação etc
        * eles fazeriam primeiro e depois juntariam
        *
        * mais no caso da soma vc deve por nos paretenses se não acontece como no exemplo acima
        * */
    }
}
