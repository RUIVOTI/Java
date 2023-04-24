public class Atividade7 {
     public static void main (String [] args) {

        int nota = 70;
        int nota1 = 10;
        int frequencia = 75;

        double media = ( nota + nota1 ) / 2.0;

        if(media > 10 && frequencia >= 75) {
            System.out.println("Apto: O Aluno foi aprovado");
    }
        else if ( media >= 4 && media < 7 && frequencia >= 75){
            System.out.println("Parcialmente Apto: Recuperação ");
    }
        else {
            System.out.println("Não Apto: Reprovado ");
        }

    }
        
    
}
