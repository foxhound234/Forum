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
   Statement stmt = null;
    
    public GestionSql()
    {
        stmt = GestionBdd.connexionBdd(GestionBdd.TYPE_MYSQL, "forum", "localhost", "root", "");
    }  
}
