/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;
import java.sql.*;
import java.util.*;
import sql.*;

/**
 *
 * @author Rabelais
 */
public class GestionSql {
        private Connection conn;
        private Statement stmt1;
    public GestionSql()
    {
    }  
    
    public void InsererMembre(Membre unMembre)
    {
         try
        {
            // On prévoit 2 connexions à la base
              stmt1 = GestionBdd.connexionBdd(GestionBdd.TYPE_MYSQL, "forum","localhost", "root","");
                String req="INSERT INTO membre(statut,login,mdp) VALUES ('"+unMembre.getStatut()+"','"+unMembre.getLogin()+"','"+unMembre.getMdp()+"')";
                int nb1 = GestionBdd.envoiRequeteLID(stmt1, req);
        }
        catch(Exception e)
        {
            System.out.println("Erreur requete3 " + e.getMessage());
        }     
    }
        public  Membre VerifieConnexion(String login,String mdp) throws SQLException
    {
        
         Membre unMembre=new Membre();
                   
         try
        {
            // On prévoit 2 connexions à la base
              stmt1 = GestionBdd.connexionBdd(GestionBdd.TYPE_MYSQL, "forum","localhost", "root","");
                String req="SELECT * FROM membre WHERE  login='"+login+"' AND mdp='"+mdp+"'";
               ResultSet rs = GestionBdd.envoiRequeteLMD(stmt1,req);
               unMembre=new Membre(rs.getInt("id"),rs.getString("statut"),rs.getString("login"),rs.getString("mdp")); 
        }
          catch (SQLException se)
        {
            System.out.println("Erreur SQL requete getLesClients : " + se.getMessage());
        }
          return  unMembre;      
    }
}
