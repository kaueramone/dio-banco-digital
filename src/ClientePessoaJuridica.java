public class ClientePessoaJuridica extends Client{

    private String cnpj;

    public ClientePessoaJuridica(String cnpj, String name, String phone, Address address) {
      
        super(name, phone, address);
        this.cnpj = cnpj;
        
    }

    public String getCnpj(){
        return this.cnpj;
    }
    
}
