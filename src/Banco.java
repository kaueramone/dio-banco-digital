import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private String name;
    private List<Client> clients;
    //private Client client;

    public Banco(String name){
        this.name = name;
        clients = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addClient(Client client){
        this.clients.add(client);
    }

    public void listClient(){
        System.out.println(this.getName()+"\n"+this.clients);
    }


}
