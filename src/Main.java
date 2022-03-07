import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Cliente leandro = new Cliente();
        leandro.setNome("Leandro");

        IConta cc = new ContaCorrente(leandro);
        IConta poupanca = new ContaPoupanca(leandro);

        cc.depositar(100);
        cc.transferir(100,poupanca);
        cc.pagarBoleto(30);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();



    }


}
