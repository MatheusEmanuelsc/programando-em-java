package basico.variaveisETipos;

public class ConversaoDeTipos {

    public static void main(String[] args) {


        //existe  2 tipos de conversões
        //cast e autocast

        //se o valor for de tipo menor e  for  convertido para tipo maior de mesmo tipo
        //acontece o autocast

        short menor= 10;
        int maior= menor;//aconteceu a conversão de tipos

        //cast
        int maior2= 10;
        short menor2=(short) maior2;//nesse caso vc teria que fazer cast explicito pois o compilador não tem
        //como saber em tempo de execução se havera ou não perda de dados ou ocasiorara algum erro

        //tipo de erro convert um string pro int

    }
}
