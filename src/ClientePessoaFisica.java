public class ClientePessoaFisica extends Client{
    
    private String cpf;

    public ClientePessoaFisica(String cpf, String name, String phone, Address address) {
        super(name, phone, address);
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    @Override
    public String toString() {

        return "\nCPF: "+this.cpf+super.toString();
    }
    
}
