package entities;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private int id;
    private String NomC;
    private int tel;
    private String email;
    List<Adresse> adresses=new ArrayList<>();
    public List<Adresse> getAdresses() {
        return adresses;
    }
    public void setBiens(List<Adresse> adresses) {
        this.adresses = adresses;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomC() {
        return NomC;
    }
    public void setNomC(String nomC) {
        NomC = nomC;
    }
    public int getTel() {
        return tel;
    }
    public void setTel(int tel) {
        this.tel = tel;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAdresses(List<Adresse> adresses) {
        this.adresses = adresses;
    }

}
