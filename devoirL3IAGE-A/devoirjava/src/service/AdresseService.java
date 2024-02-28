package service;
import java.util.List;
import entities.Adresse;
import reposittory.AdresseRepository;

public class AdresseService {
    private AdresseRepository adresseRepository=new AdresseRepository();
    public void ajouterAdresse(Adresse adresse){
        adresseRepository.insertAdresse(adresse);
    }
    public List<Adresse> listerAdresses(){
          return  adresseRepository.getAllAdresses();
    }
}
