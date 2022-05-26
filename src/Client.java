public class Client {
    
    private String name;
    private String phone;
    private Address address;


    public Client(String name, String phone, Address address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        
    }

    public String getName(){
        return this.name;
    }

    public String getPhone(){
        return this.phone;
    }

    public Address getAddress(){
        return this.address;
    }

    @Override
    public String toString() {
        return "\nClient: "+getName()+"\n"+
               "Phone: "+getPhone()+"\n"+
               "Address: \n"+getAddress()+"\n";
             
             
              
    }
}
