import java.util.List;
import java.util.Scanner;

import entities.Adresse;
import entities.Client;
import service.AdresseService;
import service.ClientService;


public class App {
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc=new Scanner(System.in);
        AdresseService adresseService=new AdresseService();
        ClientService clientService=new ClientService();
       
        do {
            System.out.println("1-Ajouter une adresse ");
            System.out.println("2-Lister adresse"); 
            System.out.println("3-Creer un  client"); 
            System.out.println("4-Lister client");
            System.out.println("5-Quitter"); 
             choix=sc.nextInt();
             sc.nextLine();
            switch (choix) {
                case 1:
                     System.out.println("Entrer une adresse");
                     String Quartier=sc.nextLine(); 
                     Adresse adresse=new Adresse();
                     adresse.setQuartier(Quartier);
                     adresseService.ajouterAdresse(adresse);
                    break;
                case 2:
                    List<Adresse> adresses= adresseService.listerAdresses();
                    for (Adresse ad : adresses) {
                        System.out.println("ID : "+ad.getId() ); 
                        System.out.println("ville : "+ad.getVille() );
                        System.out.println("quartier : "+ad.getQuartier() ); 
                        System.out.println("numv : "+ad.getNumV() );        
                    }
                  
                    break; 
                    
              case 3:
                     System.out.println("Entrer id du client");
                     String id=sc.nextLine(); 
                     System.out.println("Entrer le nom complet");
                     String NomC=sc.nextLine(); 
                     adresses= adresseService.listerAdresses(); 
                        for (Adresse ad : adresses) {
                            System.out.println(ad.getId()+"-"+ad.getQuartier()+"-"+ad.getVille()+"-"+ad.getNumV());   
                        }
                       System.out.println("Entrer Id d'une adresse");
                       int idAdresse=sc.nextInt();
                       adresse=new Adresse();
                       adresse.setId(idAdresse);
                       Adresse adresse2=new Adresse();
                       adresse.setId(idAdresse);
                       adresse.setQuartier(Quartier);
                       adresse.setVille(NomC);
                    adresseService.ajouterAdresse(adresse);
                   break;

                   case 4:
                   List<Client> clients=clientService.listerClient();
                   for (Client b : clients) {
                       System.out.println("ID : "+b.getId() ); 
                       System.out.println("nomc : "+b.getNomC() ); 
                       System.out.println("tel : "+b.getTel() ); 
                       System.out.println("email : "+b.getEmail() ); 
                       System.out.println("------------------------------------");      
                   }
                 
                   break; 
                    
            }
          } while (choix!=5);
    }
}
