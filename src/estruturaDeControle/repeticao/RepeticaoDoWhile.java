package estruturaDeControle.repeticao;

public class RepeticaoDoWhile {

    public static void main(String[] args) {

        //ela e parecida com while com diferença que ela e testada no final
        // assim garantindo que ela sera executada pelomenos uma vez

        int num= 10;

        //do para por bloco de codigo
        do {
            System.out.println(num);
            num--;
        }while (num>0);//verificação observe aqui vc precisa de ";"
    }
}
