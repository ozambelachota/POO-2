/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private final String base = "bdtienda";
    private final String user = "root";
    private final String password = "260800";
    private final String url = "jdbc:mysql://localhost:33060/" + base;
    private Connection con = null;

    public Connection getConexion() {
        try {
            // Controlador para realizar la conexión
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecer la conexión
            con = DriverManager.getConnection(this.url, this.user, this.password);
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            // Manejo de excepciones
            System.err.println("Error al intentar conectar a la base de datos: " + e.getMessage());
        }
        return con;
    }

    public void cerrarConexion() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Conexión cerrada");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
