import java.util.Scanner;

public class Main {




    public static void main(String[] args) {


        Cliente leandro = new Cliente();
        leandro.setNome("Leandro");

        IConta cc = new ContaCorrente(leandro);
        IConta poupanca = new ContaPoupanca(leandro);
        cc.depositar(100);
        cc.depositar(0);
        cc.transferir(0,poupanca);
        cc.pagarBoleto(51);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();



    }


}
