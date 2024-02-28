package entities;

public class Adresse {
    private int id;
    private String Ville;
    private String Quartier;
    private int NumV;
    private Client client;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getVille() {
        return Ville;
    }
    public void setVille(String ville) {
        Ville = ville;
    }
    public String getQuartier() {
        return Quartier;
    }
    public void setQuartier(String quartier) {
        Quartier = quartier;
    }
    public int getNumV() {
        return NumV;
    }
    public void setNumV(int numV) {
        NumV = numV;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    
}
