package Clases;
import java.sql.*;
public class Conectar {
    Connection cn;
    Statement st;
    
    public  Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn= DriverManager.getConnection("jdbc:mysql://localhost/crud_java","root","");
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }   
        return cn;
    }
}
