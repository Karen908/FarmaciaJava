
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionMYSQL1 {
    private String database_name = "farmacia";
    private String user= "root";
    private String password = "administrador";
    private String url ="jdbc:mysql://localhost:3306/"+database_name;
    //variable para conectarnos a la base de datos  
    Connection conn= null;
    
    //metodo para conectar java con mysql

    public Connection getConnection() {
        try{
         //obtener valor de Driver
         Class.forName("com.mysql.cj.jdbc.Driver");
         //Obtener la conexion
         conn= DriverManager.getConnection(url,user,password);
        }catch(ClassNotFoundException e){
            System.err.println("Ha ocurrido un ClassNotFoundException"+ e.getMessage()); 
            //Catch que retorne la conexion 
        }catch(SQLException e){
            System.err.println("Ha ocurrido un SQLExeption"+ e.getMessage());
        }
        return conn;
    }
   
    }