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

public class CategoriaDao {

    //1)Instanciamos la conexion
    ConnectionMYSQL1 conexion = new ConnectionMYSQL1();
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    //Metodo para registro de categoria 
    public boolean registerCategoriaQuery(Categorias categoria) {
        String query = "INSERT INTO categorias(nombre,fecha_creacion,fecha_actualizacion)"
                + " VALUE(?,?,?)";
        //Variable para obtener la fecha y la hora exacta de creacion y actualizacion 

        Timestamp datetime = new Timestamp(new Date().getTime());

        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            pst.setString(1, categoria.getNombre());
            pst.setTimestamp(2, datetime);
            pst.setTimestamp(3, datetime);
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar la categoria " + e);
            return false;
        }
    }
    //Metodo para listar categoria 

    public List listCategoriaQuery(String value) {
        List<Categorias> list_categoria = new ArrayList();
        String query = "SELECT*FROM categorias";
        String query_buscar_categoria = "SELECT * FROM categorias WHERE nombre LIKE '%" + value + "%'";

        try {
            conn = conexion.getConnection();
            if (value.equalsIgnoreCase("")) {
                pst = conn.prepareStatement(query);
                rs = pst.executeQuery();
            } else {
                pst = conn.prepareStatement(query_buscar_categoria);
                rs = pst.executeQuery();
            }
            //para recorrer , los registros, rs nos trae todos los resultados que tenga esa consulta 
            while (rs.next()) {
                Categorias categoria = new Categorias();
                categoria.setId_categoria(rs.getInt("id_categoria"));
                categoria.setNombre(rs.getString("nombre"));
                list_categoria.add(categoria);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return list_categoria;
    }
    //Metodo para:Modificar categoria 

    public boolean ActualizarCategoriaQuery(Categorias categoria) {
        String query = "UPDATE categorias SET nombre=?,fecha_actualizacion=?"
                + "WHERE id_categoria=?";
        //Variable para obtener la fecha y la hora exacta de creacion y actualizacion 

        Timestamp datetime = new Timestamp(new Date().getTime());

        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            pst.setString(1, categoria.getNombre());
            pst.setTimestamp(2, datetime);
            pst.setInt(3, categoria.getId_categoria());
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar los datos de la categoria " + e);
            return false;
        }
    }

    //Metodo para:Eliminar categoria
    public boolean eliminarCategoriaQuery(int id_categoria) {
        String query = "DELETE FROM categorias WHERE id_categoria= " + id_categoria;

        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            pst.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No puede eliminar una categoria, que tenga relacion con otra tabla ");
            return false;
        }
    }

}
