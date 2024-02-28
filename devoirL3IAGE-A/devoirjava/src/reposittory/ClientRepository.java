package reposittory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entities.Client;

public class ClientRepository extends Database {
    private final  String SQL_SELECT_ALL="select * from client" ;
        private final  String SQL_INSERT="INSERT INTO client (nom_client) VALUES (?)";
       
       public void insertClient(Client client){
            openConnexion();
            try {
                initPreparedStatement(SQL_INSERT);
                statement.setString(1, client.getNomC());
                int nbreLigne=executeUpdate();
            closeConnexion();
            } catch (SQLException e) {
            e.printStackTrace();
            }
       }
       public List<Client> getAllClients(){
            List<Client> clients=new ArrayList<>();
       try {
           openConnexion();
           initPreparedStatement(SQL_SELECT_ALL);
           ResultSet rs= executeSelect();
             while (rs.next()) {
                  Client client=new Client();
                   client.setId(rs.getInt("id_client"));
                   client.setNomC(rs.getString("nom_client"));
                   client.setTel(rs.getInt("tel_client"));
                   client.setEmail(rs.getString("email_client"));
                    clients.add(client);
             }
             rs.close();
           closeConnexion();
        }
         catch (SQLException e) {
              System.out.println("Erreur de Connexion a la BD");
        }
        return  clients;
       }
}
