/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salle_sport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConnexionDB {
   public static Connection getConnection(){ 
       Connection connection=null ;
       try {
           connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_salle","root","");
       } catch (SQLException ex) {
           Logger.getLogger(ConnexionDB.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"connexion full");
       }
    return connection ;
   }
}