public class Atividade5 {
    public static void main (String [] args){
        String nome = "Lucas";
        double peso = 70.5;
        double estatura = 1.75;

        double imc = peso / (estatura * estatura);


        System.out.printf("%s, seu IMC é %.2f", nome, imc);

    }
}
