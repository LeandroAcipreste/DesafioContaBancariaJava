public interface IConta {
     void sacar(double valor);

     void depositar(double valor);

     void transferir(double valor, IConta contadestino);

     void imprimirExtrato();

     void pagarBoleto(double valor);

     double calculaRendimento(double valor);


}
