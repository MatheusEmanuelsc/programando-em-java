package estruturaDeControle.repeticao;

public class RepeticaoFor {

    public static void main(String[] args) {

        //for se usa geralmente quando sabemos com antecedência a quantidade de repetições

        /*
        * Essa estrutura se divide em 3 partes
        *
        * a primeira parte representa variavel iniciação
        *    esse comando e executado uma unica vez com valor que vc deseja iniciar
        *
        * a segunda a condição
        *   a segunda vai verificar se pode repetir ou não a cada laço
        *
        * a terceira incremento ou decremento
        *   apos fazer a repetição ele adicionara ou diminui o valor
        *
        * */

        //exemplo:
        for ( int i = 1 ; i <=10 ; i++ ){
            System.out.println(i+" Ola!!!");
        }
    }
}
