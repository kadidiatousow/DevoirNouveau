package reposittory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Client;
import entities.Adresse;

public class AdresseRepository extends Database {
    private final  String SQL_SELECT_ALL="select * from add b, client z where b.client_id=c.id_client" ;
    private final  String SQL_INSERT="INSERT INTO `add` (`id`, `ville`, `numV`, `quartier`) VALUES (?,?,?,?)";
    public void insertAdresse(Adresse adresse){
            openConnexion();
            try {
                initPreparedStatement(SQL_INSERT);
                statement.setInt(1, adresse.getId());
                statement.setString(2, adresse.getVille());
                statement.setInt(4, adresse.getNumV());
                statement.setString(4, adresse.getQuartier());
                int nbreLigne=executeUpdate();
            closeConnexion();
            } catch (SQLException e) {
            e.printStackTrace();
            }
       }
       public List<Adresse> getAllAdresses(){
            List<Adresse> adresses=new ArrayList<>();
       try {
           openConnexion();
           initPreparedStatement(SQL_SELECT_ALL);
           ResultSet rs= executeSelect();
             while (rs.next()) {
                     Adresse adresse=new Adresse();
                     adresse.setId(rs.getInt("id_adresse"));
                     adresse.setVille(rs.getString("ville_add"));
                     adresse.setQuartier(rs.getString("quartier_add"));
                     adresse.setNumV(rs.getInt("Numv_add"));
                    
                     adresse.setId(rs.getInt("id_adresse"));
                     adresse.setVille(rs.getString("ville"));
                     adresse.setQuartier(rs.getString("quartier"));
                     adresse.setClient(client);
                     adresses.add(adresse);
             }
             rs.close();
            closeConnexion();
          }
          catch (SQLException e) {
              System.out.println("Erreur de Connexion a la BD");
         }
         return  adresses;
       }
    
}
