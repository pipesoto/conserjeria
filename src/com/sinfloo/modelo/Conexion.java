package com.sinfloo.modelo;
import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion {
    String url="jdbc:mysql://localhost:3306/trabajadores";
    String user="root",pass="franquito1";    
    Connection con;
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {            
        }
        return con;
    }
}
