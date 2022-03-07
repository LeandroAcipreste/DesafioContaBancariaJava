import java.util.Scanner;

public abstract class Conta  implements IConta {

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }




    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {return numero;}

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public void transferir(double valor, IConta contadestino) {
        this.sacar(valor);
        contadestino.depositar(valor);
    }

    protected void imprimirInfosComuns(){
        System.out.printf("Agência: %d%n", this.agencia);
        System.out.printf("Agência: %d%n", this.numero);
        System.out.println("Nome: "+this.cliente);
        System.out.printf("Agência: %.2f%n", this.saldo);
    }


    @Override
    public void pagarBoleto(double valor) {
        saldo -= valor;
    }



}



