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

public class ProductosDao {

    //1)Instanciamos la conexion
    ConnectionMYSQL1 conexion = new ConnectionMYSQL1();
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    //Metodo de registro productos 
    public boolean registerProductosQuery(Productos productos) {
        
        String query = "INSERT INTO productos(categoria_FK, codigo, nombre, descripcion, precio, fecha_creacion, fecha_actualizacion)"
                + " VALUE(?,?,?,?,?,?,?)";
        //Variable para obtener la fecha y la hora exacta de creacion y actualizacion 

        Timestamp datetime = new Timestamp(new Date().getTime());

         try {
        conn = conexion.getConnection();
        pst = conn.prepareStatement(query);
        pst.setInt(1, productos.getCategoria_FK()); // Corregir aquí
        pst.setInt(2, productos.getCodigo()); // Corregir aquí
        pst.setString(3, productos.getNombre());
        pst.setString(4, productos.getDescripcion());
        pst.setDouble(5, productos.getPrecio());
        pst.setTimestamp(6, datetime);
        pst.setTimestamp(7, datetime);

        pst.execute();
        return true;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al registrar al producto" + e);
        return false;
    }
}
    //Metodo para listar producto

    public List listProductosQuery(String value) {
        List<Productos> list_productos = new ArrayList();
        String query = "select pro.*, ca.nombre as nombre_categoria from productos pro, categorias ca where pro.categoria_FK= ca.id_categoria ";
        String query_buscar_productos = "select pro.*, ca.nombre as nombre_categoria from productos pro inner join categorias ca on pro.categoria_FK= ca.id_categoria WHERE pro.nombre LIKE '%" + value + "%'";

        try {
            conn = conexion.getConnection();
            if (value.equalsIgnoreCase("")) {
                pst = conn.prepareStatement(query);
                rs = pst.executeQuery();
            } else {
                pst = conn.prepareStatement(query_buscar_productos);
                rs = pst.executeQuery();
            }
            //para recorrer , los registros, rs nos trae todos los resultados que tenga esa consulta 
            while (rs.next()) {
                Productos productos = new Productos();
                productos.setId_productos(rs.getInt("id_productos"));
                productos.setCodigo(rs.getInt("codigo"));
                productos.setNombre(rs.getString("nombre"));
                productos.setDescripcion(rs.getString("descripcion"));
                productos.setPrecio(rs.getDouble("precio"));
                productos.setCantidad(rs.getInt("cantidad"));
                productos.setNombre_Categoria(rs.getString("nombre_categoria"));

                list_productos.add(productos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return list_productos;
    }
    //Metodo para:Modificar producto

    public boolean ActualizarProductosQuery(Productos productos) {
    String query = "UPDATE productos SET codigo=?, nombre=?, descripcion=?, precio=?, fecha_actualizacion=?, categoria_FK=? WHERE id_productos=?";
    // Variable para obtener la fecha y la hora exacta de creación y actualización 
    Timestamp datetime = new Timestamp(new Date().getTime());

    try {
        conn = conexion.getConnection();
        pst = conn.prepareStatement(query);
        pst.setInt(1, productos.getCodigo());
        pst.setString(2, productos.getNombre());
        pst.setString(3, productos.getDescripcion());
        pst.setDouble(4, productos.getPrecio());
        pst.setTimestamp(5, datetime);
        pst.setInt(6, productos.getCategoria_FK());
        pst.setInt(7, productos.getId_productos());

        pst.execute();
        return true;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al modificar los datos del producto: " + e);
        return false;
    }
}

    //Metodo para:Eliminar cliente
    public boolean eliminarProductoQuery(int id_productos) {
        String query = "DELETE FROM productos WHERE id_productos= " + id_productos;

        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            pst.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No puede eliminar un producto, que tenga relacion con otra tabla ");
            return false;
        }
    }

    //Metodo de buscar producto 
    public Productos buscar_producto(int id_productos) {
        String query = "select pro.*, ca.nombre as nombre_categoria from productos pro inner join categorias ca on pro.categoria_FK= ca.id_categoria WHERE pro.id_productos=?";
        Productos productos = new Productos();
        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, id_productos);
            rs = pst.executeQuery();

            if (rs.next()) {
                productos.setId_productos(rs.getInt("id_productos"));
                productos.setCodigo(rs.getInt("codigo"));
                productos.setNombre(rs.getString("nombre"));
                productos.setDescripcion(rs.getString("descripcion"));
                productos.setPrecio(rs.getDouble("precio"));
                productos.setCategoria_FK(rs.getInt("categoria_FK"));
                productos.setNombre_Categoria(rs.getString("nombre_categoria"));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return productos;
    }

    //Metodo buscar producto por codigo
    public Productos buscar_codigo(int codigo) {
        String query = "SELECT pro.id_productos, pro.nombre FROM productos pro WHERE pro.codigo=?";
        Productos productos = new Productos();
        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, codigo);
            rs = pst.executeQuery();

            if (rs.next()) {
                productos.setId_productos(rs.getInt("id_productos"));
                productos.setNombre(rs.getString("nombre"));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return productos;
    }

    //Metodo para traer la cantidad de productos
    public Productos buscarCantidad_ID(int id_productos) {
        String query = "select pro.cantidad  from productos pro where pro.id_productos=?";
        Productos productos = new Productos();
        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, id_productos);
            rs = pst.executeQuery();

            if (rs.next()) {
                productos.setCantidad(rs.getInt("cantidad"));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return productos;
    }
    //Metodo para actualizar el stock

    public boolean ActualizarStockQuery(int amount, int producto_id) {
        String query = "update productos set cantidad =? where id_productos=?";
        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, amount);
            pst.setInt(2, producto_id);
            rs = pst.executeQuery();
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }
}
