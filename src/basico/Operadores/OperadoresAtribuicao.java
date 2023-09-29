package basico.Operadores;

public class OperadoresAtribuicao {

    public static void main(String[] args) {

        int valorBase= 10;

        //quando vc quer atribuir um valor porem utilizando o valor anterior de base

        //soma
        valorBase += 2;
        System.out.println("soma: "+valorBase);

        //sub
        valorBase -= 2;
        System.out.println("sub: "+valorBase);

        //div
        valorBase /= 2;
        System.out.println("div: "+valorBase);

        //mult
        valorBase *= 2;
        System.out.println("mult: "+valorBase);

        //resto
        valorBase %= 2;
        System.out.println("resto: "+valorBase);

    }
}
