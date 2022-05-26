public class Main {
    
    public static void main(String[] args) {
        
        // Criando uma instância de endereço
        Address address1 = new Address("Manuel Saraiva", 123, "2346776");

        // Criando instância de clientes
        Client mary = new ClientePessoaFisica("1234553-12", "Mary Sousa", "1234-4321", address1);
        Client pall = new ClientePessoaFisica("1234553-21", "Pall Silva", "1234-5678", address1);
        
        //Criando instâncias de contas
        Conta contaCorrente = new ContaCorrente(mary);
        Conta contaCorrente1 = new ContaCorrente(pall);
        Conta contaPoupanca = new ContaPoupanca(pall);
        
        contaCorrente.depositar(20000);
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
        contaCorrente1.imprimirExtrato();

        //Criando instância de um banco
        Banco banco1 = new Banco("Banco 1");
        banco1.addClient(mary);
        banco1.addClient(pall);
        banco1.listClient();

        
    }
}
