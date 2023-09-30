package basico;

import java.util.Scanner;// necessario esse import

public class EntradaDeDados {
    public static void main(String[] args) {

        Scanner entraDeDados= new Scanner(System.in);// criando entrada de dados

        System.out.println("Fale algo: ");
        String falou= entraDeDados.nextLine();

//        entraDeDados.nextLine();  pega a linha inteira em formato de string
//        entraDeDados.next();  pega apenas a primeira palavra
//        entraDeDados.nextDouble(); recebe dados double
//        entraDeDados.nextInt(); recebe dados int

        entraDeDados.close();//boa pratica desliga quando não estiver usando


//  Obs existe um pequeno problema  quando vc pegar o dado de int e depois o string com nextline
//  pois o nextline vai pegar a quebra de linha ao inves da  string pra  resolver  isso antes de pega variavel basta
//  entraDeDados.nextLine(); pra consumir a quebra de linha



    }
}
