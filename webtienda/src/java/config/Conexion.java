/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Richard Bardales
 */
public class Conexion {

   public Connection getConexion(){
       
        String url = "jdbc:mysql://localhost:3306/bdtienda";
        String user = "root";
        String pass = "123456";
        System.out.println("Conectando…");
        
         try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de MySQL: " + ex);
            }
        
        try {            
            
            //Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdtienda?" +
                                   "user=root&password=123456"+"&serverTimezone=UTC"); 
            
            System.out.println("Conectado!!");
            return con;
            /// Resto del codigo aqui
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        return null;
    }

}
