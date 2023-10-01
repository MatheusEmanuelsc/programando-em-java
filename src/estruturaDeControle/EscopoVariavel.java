package estruturaDeControle;

public class EscopoVariavel {

    public static void main(String[] args) {

        String escopoGlobal= "global";
        System.out.println(escopoGlobal);

        if (true){
            String escopoLocal= "local";
            System.out.println(escopoGlobal+" "+escopoLocal);
        }
//        System.out.println(escopoGlobal+" "+escopoLocal);

//        quando vc  criar uma variavel dentro de um bloco essa variavel e local logo existe apenas dentro dele
//        ja quando vc  cria fora do bloco e global observe no exemplo a acima
    }
}
