public class ContaPoupanca extends Conta{
    
    protected static final String AGENCIA_PADRAO = "002";

    public ContaPoupanca(Client client) {
        super(client);
    }

    
    public void imprimirExtrato(){
        System.out.println("\n== Extrato Conta Poupança == \n");
        System.out.println(AGENCIA_PADRAO);
        super.imprimirInfoContas();
    }
}
