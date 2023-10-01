package estruturaDeControle.operadores;

public class OperadoresComparacao {

    public static void main(String[] args) {

//        são operadores que resultam em booleanos ou seja true ou false

        int num = 10;
        int num2= 5;
        boolean ativo=true;

        boolean eMaior= num>num2;// verificar se e maior  ">"
        boolean eMaiorOuigual= num>=num2;// verificar se e maior ou igual  ">="

        boolean eMenor= num<num2;// verificar se e menor  "<"
        boolean eMenorOuIgual= num>num2;// verificar se e menor ou igual  "<="

        boolean eIgual= num==num2;// verificar se e igual "=="
        boolean operadorUnario = !ativo;//isso  nega o valor  dela logo se for true  vira false e vice versa
        boolean operadorUnario2 = !!ativo;// nega e nega dnv basicamente  trazendo ao valor normal
        boolean naoEigual= num!=num2;// verificar se não e igual  "!="

//        obs se for string ou objeto use equals tera  uma explicação melhor a frente sobre isso..
    }
}
