public class Conta {
    int agencia;
    int conta;
    double saldo;
    String titular;

    void deposita(double valor){
        this.saldo += valor; 
    }

    boolean sacar(double valor){
        this.saldo = this.saldo - valor;
        
        if (this.saldo >= valor) {
            this.saldo -= valor;

            return true;

        }else {
            System.out.println("Saldo invalido");


        }
        return false;

        }

    void transfere(Conta destino, double valor) {
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;

        System.out.println("________________________");
        System.out.println("Você fez uma transferencia para José: " + valor);

    }

    }

