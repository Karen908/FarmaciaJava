
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class ClientesDao {
    //1)Instanciamos la conexion
    ConnectionMYSQL1 conexion = new ConnectionMYSQL1();
    //Llamamos a la variable 
    Connection conn; //Para realizar la conexion 
    PreparedStatement pst; //Sirve para consultar 
    ResultSet rs; //Sirve para obtener datos de la consulta
 
    //METODO PARA REGISTRO CLIENTE
     public boolean registerClienteQuery(Clientes clientes){
        String query ="INSERT INTO clientes(id_Clientes,nombre,direccion,telefono,email,fecha_creacion,fecha_actualizacion)"
                + " VALUE(?,?,?,?,?,?,?)";
        //Variable para obtener la fecha y la hora exacta de creacion y actualizacion 
        
        Timestamp datetime = new Timestamp(new Date().getTime());
       
        try{
           conn = conexion.getConnection();
           pst = conn.prepareStatement(query);
           pst.setInt(1, clientes.getId_Clientes());
           pst.setString(2, clientes.getNombre());
           pst.setString(3, clientes.getDireccion());
           pst.setString(4, clientes.getTelefono());
           pst.setString(5, clientes.getEmail());
           pst.setTimestamp(6, datetime);
           pst.setTimestamp(7, datetime);
           pst.execute();
           return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al registrar al cliente"+e);
           return false;
        }
    }
    //METODO PARA LISTAR CLIENTE
     public List listClienteQuery(String value){
      List<Clientes>  list_clientes= new ArrayList();
      String query = "SELECT*FROM clientes ";
      String query_buscar_clientes = "SELECT * FROM clientes WHERE id_Clientes LIKE '%"+value+"%'";
      
      try{
          conn = conexion.getConnection();
          if(value.equalsIgnoreCase("")){
              pst = conn.prepareStatement(query);
              rs = pst.executeQuery(); 
          }else{
              pst= conn.prepareStatement(query_buscar_clientes);
              rs= pst.executeQuery();    
          }
          //para recorrer , los registros, rs nos trae todos los resultados que tenga esa consulta 
          while(rs.next()){
              Clientes clientes =new Clientes();
              clientes.setId_Clientes(rs.getInt("id_Clientes"));
              clientes.setNombre(rs.getString("nombre"));
              clientes.setDireccion(rs.getString("direccion"));
              clientes.setTelefono(rs.getString("telefono"));
              clientes.setEmail(rs.getString("email"));
              
              list_clientes.add(clientes);
          }
      }catch(SQLException e){
          JOptionPane.showMessageDialog(null, e.toString());
      }
      return list_clientes;
    }
     //Metodo para:Modificar clientes
    public boolean ActualizarClienteQuery(Clientes clientes){
        String query ="UPDATE clientes SET nombre=?,direccion=?,telefono=?,email=?,fecha_actualizacion=?"
                + "WHERE id_Clientes=?";
        //Variable para obtener la fecha y la hora exacta de creacion y actualizacion 
        
        Timestamp datetime = new Timestamp(new Date().getTime());
       
        try{
           conn = conexion.getConnection();
           pst = conn.prepareStatement(query);
           pst.setString(1, clientes.getNombre());
           pst.setString(2, clientes.getDireccion());
           pst.setString(3, clientes.getTelefono());
           pst.setString(4, clientes.getEmail());
           pst.setTimestamp(5, datetime);
           pst.setInt(6, clientes.getId_Clientes());
           pst.execute();
           return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al modificar los datos del cliente"+e);
           return false;
        }
    }
    //Metodo para:Eliminar cliente
    public boolean eliminarClienteQuery(int id_Clientes){
        String query = "DELETE FROM clientes WHERE id_Clientes= "+id_Clientes;
        
        try{
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            pst.execute();
            return true;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No puede eliminar un cliente, que tenga relacion con otra tabla ");
            return false;
        } 
    }
}
