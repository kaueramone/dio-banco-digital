public class Conta implements IConta{

   
    private static int SEQUENCIAL = 1;

    protected String agencia;
    protected int numero;
    protected double saldo;
    private Client client;
    private IConta conta;

    public Conta(Client client){
        this.client = client;
        this.numero = SEQUENCIAL++;
    }

    public Client getClient(){
        return this.client;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        
    }

    public void imprimirInfoContas() {
    
        System.out.println("Número: "+this.numero);
        System.out.println("Saldo: "+this.getSaldo());
    }


    @Override
    public void imprimirExtrato() {
        // TODO Auto-generated method stub
        
    }

}
