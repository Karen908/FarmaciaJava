
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

public class ProveedoresDao {
     //1)Instanciamos la conexion
    ConnectionMYSQL1 conexion = new ConnectionMYSQL1();
    Connection conn; 
    PreparedStatement pst; 
    ResultSet rs; 
    
    //Metodo de registro proveedor 
      public boolean registerProveedoresQuery(Proveedores proveedores ){
        String query ="INSERT INTO proveedores(nombre,descripcion,telefono,direccion,email,ciudad,fecha_creacion,fecha_actualizacion)"
                + " VALUE(?,?,?,?,?,?,?,?)";
        //Variable para obtener la fecha y la hora exacta de creacion y actualizacion 
        
        Timestamp datetime = new Timestamp(new Date().getTime());
       
        try{
           conn = conexion.getConnection();
           pst = conn.prepareStatement(query);
           pst.setString(1, proveedores.getNombre());
           pst.setString(2, proveedores.getDescripcion());
           pst.setString(3, proveedores.getTelefono());
           pst.setString(4, proveedores.getDireccion());
           pst.setString(5, proveedores.getEmail());
           pst.setString(6, proveedores.getCiudad());
           pst.setTimestamp(7, datetime);
           pst.setTimestamp(8, datetime);
           pst.execute();
           return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al registrar al proveedor"+e);
           return false;
        }
    }
      // Método para listar proveedores
public List<Proveedores> listProveedoresQuery(String value) {
    List<Proveedores> list_proveedores = new ArrayList<>();
    String query = "SELECT * FROM proveedores";
    String query_buscar_proveedores = "SELECT * FROM proveedores WHERE nombre LIKE ?";
    
    try {
        conn = conexion.getConnection();
        if (value == null || value.trim().isEmpty()) {
            try (PreparedStatement pst = conn.prepareStatement(query);
                 ResultSet rs = pst.executeQuery()) {
                 
                while (rs.next()) {
                    Proveedores proveedores = new Proveedores();
                    proveedores.setId_proveedores(rs.getInt("id_proveedores"));
                    proveedores.setNombre(rs.getString("nombre"));
                    proveedores.setDescripcion(rs.getString("descripcion"));
                    proveedores.setDireccion(rs.getString("direccion"));
                    proveedores.setTelefono(rs.getString("telefono"));
                    proveedores.setEmail(rs.getString("email"));
                    proveedores.setCiudad(rs.getString("ciudad"));
                    list_proveedores.add(proveedores);
                }
            }
        } else {
            try (PreparedStatement pst = conn.prepareStatement(query_buscar_proveedores)) {
                pst.setString(1, "%" + value.trim() + "%");
                try (ResultSet rs = pst.executeQuery()) {
                    while (rs.next()) {
                        Proveedores proveedores = new Proveedores();
                        proveedores.setId_proveedores(rs.getInt("id_proveedores"));
                        proveedores.setNombre(rs.getString("nombre"));
                        proveedores.setDescripcion(rs.getString("descripcion"));
                        proveedores.setDireccion(rs.getString("direccion"));
                        proveedores.setTelefono(rs.getString("telefono"));
                        proveedores.setEmail(rs.getString("email"));
                        proveedores.setCiudad(rs.getString("ciudad"));
                        list_proveedores.add(proveedores);
                    }
                }
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    return list_proveedores;
}

     //Metodo para:Modificar proveedores
    public boolean actualizarProveedoresQuery(Proveedores proveedores){
        String query ="UPDATE proveedores SET nombre=?,descripcion=?,telefono=?,direccion=?,email=?,ciudad=?,fecha_actualizacion=?"
                + "WHERE id_proveedores=?";
        //Variable para obtener la fecha y la hora exacta de creacion y actualizacion 
        
        Timestamp datetime = new Timestamp(new Date().getTime());
       
        try{
           conn = conexion.getConnection();
           pst = conn.prepareStatement(query);
           pst.setString(1, proveedores.getNombre());
           pst.setString(2, proveedores.getDescripcion());
           pst.setString(3, proveedores.getTelefono());
           pst.setString(4, proveedores.getDireccion());
           pst.setString(5, proveedores.getEmail());
           pst.setString(6, proveedores.getCiudad());
           pst.setTimestamp(7, datetime);
           pst.setInt(8, proveedores.getId_proveedores());
           pst.execute();
           return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al modificar los datos del proveedor"+e);
           return false;
        }
    }
    //Metodo para:Eliminar proveedores
    public boolean eliminarProveedoresQuery(int id_proveedores){
        String query = "DELETE FROM proveedores WHERE id_proveedores= "+id_proveedores;
        
        try{
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            pst.execute();
            return true;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No puede eliminar un proveedor, que tenga relacion con otra tabla ");
            return false;
        } 
    }
}
