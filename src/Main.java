public class Main {


    public static void main(String[] args) {


        Cliente leandro = new Cliente();
        leandro.setNome("Leandro Acipreste");

        IConta cc = new ContaCorrente(leandro);
        IConta poupanca = new ContaPoupanca(leandro);
        cc.depositar(500);
        cc.transferir(200, poupanca);
        cc.pagarBoleto(500);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }


}
