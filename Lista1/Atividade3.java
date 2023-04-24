public class Atividade3 {
    public static void main (String [] args){

        String nome = "Lucas";

        int idade = 15;
        boolean maiorDe21Anos = true; 
        boolean amigoDoCarlos = true;
        boolean recebeuConvite = true; 

        if (idade >= 21 && maiorDe21Anos && amigoDoCarlos && recebeuConvite) {
            System.out.println("Bem vindo(a) " + nome + ", aproveite a festa!");
        } else {
            System.out.println(nome + ", você é um penetra. Volte para casa.");
        }

    }
}
