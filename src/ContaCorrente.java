public class ContaCorrente extends Conta{
    
    public static final String AGENCIA_PADRAO = "001";

    public ContaCorrente(Client client) {
        super(client);
    }


    public void imprimirExtrato(){
        System.out.println("\n== Extrato Conta Corrente == ");
        System.out.println(AGENCIA_PADRAO);
        super.imprimirInfoContas();
    }
}
