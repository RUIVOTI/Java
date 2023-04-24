public class CriaConta {
    public static void main(String[] args) {
        Conta Lucas = new Conta();

        Lucas.titular = "Lucas";
        Lucas.agencia = 3553;
        Lucas.conta = 555;
        Lucas.saldo = 500;

        System.out.println("_______________________________ ");
        System.out.println("Banco CashBank");
        System.out.println("_______________________________");
        
        System.out.println("Titular da Conta: " + Lucas.titular );
        System.out.println("Sua agencia: " + Lucas.agencia);
        System.out.println("Numero da conta: "+ Lucas.conta);


        System.out.println("Seu saldo: "+ Lucas.saldo);
        Lucas.saldo += 200; 
        System.out.println("Seu novo saldo e de: "+ Lucas.saldo);


        System.out.println("_______________________________");

        


   //-----------------------------------------------------------------------------//     

        Conta Luc = Lucas;

        Luc.titular = "Luc";
        Luc.saldo = 100 ;

        System.out.println("_______________________________");
        
        System.out.println("Titular da Conta: " + Luc.titular );
        System.out.println("Sua agencia: " + Luc.agencia);
        System.out.println("Numero da conta: "+ Luc.conta);
        System.out.println("Seu saldo e de: "+ Luc.saldo);

        System.out.println("_______________________________");

       

    }
    
}
