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
        System.out.printf("Saldo: %.2f%n", this.saldo);

    }


    @Override
    public void pagarBoleto(double valor) {

        if ( saldo > 0 ){
            saldo -= valor;
        } else{
            System.out.println("Saldo Insuficiente.");
        }
    }

    /**@Override
    public void recargaTelefone(double valor) {
        Scanner telefone     = new Scanner(System.in);
        Scanner valorRecarga = new Scanner(System.in);

        telefone.nextInt();
        valorRecarga.nextDouble();

        if(saldo <0){
            System.out.println("Recarga Efetuada com Sucesso");
        }else{
            System.out.println("Saldo Insuficiente");
        }

    }**/
}







