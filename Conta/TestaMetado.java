public class TestaMetado {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta minhaConta = new Conta();


        conta1.titular = "Bruno";
        conta1.agencia = 5555;
        conta1.saldo = 500;
        conta1.deposita(1000);
        //conta1.sacar(1700);


        minhaConta.titular = "José Antônio";
        minhaConta.agencia = 5555;
        minhaConta.saldo = 500;

        conta1.transfere(minhaConta, 500 );

        System.out.println("Titular: "+conta1.titular);
        System.out.println("Agencia: "+conta1.agencia);
        System.out.println("Saldo apos a transferencia : "+conta1.saldo);
        System.out.println("________________________");

        System.out.println("Titular: " +minhaConta.titular);
        System.out.println("Agencia: " +minhaConta.agencia);
        System.out.println("Saldo: " +minhaConta.saldo);




   // System.out.println("Saldo apos o saque: " + conta1.saldo);
        



    }
}
