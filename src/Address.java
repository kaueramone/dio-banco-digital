
public class Address {

    private String rua;
    private int number;
    private String cep;


    public Address(String rua, int number, String cep) {
        this.rua = rua;
        this.number = number;
        this.cep = cep;
    }


    public String getrua(){
        return this.rua;
    }

    public int getNumber(){
        return this.number;
    }

    public String getcep(){
        return this.cep;
    }

    @Override
    public String toString() {
        
        return "\trua: "+getRua()+"\n"+
               "\tNumber: "+getNumber()+"\n"+
               "\tcep: "+getCep()+"\n";
    }

}
