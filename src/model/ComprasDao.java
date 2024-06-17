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

public class ComprasDao {
    //1)Instanciamos la conexion

    ConnectionMYSQL1 conexion = new ConnectionMYSQL1();
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    //Metodo de registro 
    public boolean registrarCompraQuery(int proveedorID_FK, int empleadoId_FK, double total) {
        String query = "insert into compras (proveedorID_FK,empleadoId_FK,total,fecha_compra)"
                + "values(?,?,?,?) ";
        Timestamp datetime = new Timestamp(new Date().getTime());

        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, proveedorID_FK);
            pst.setInt(2, empleadoId_FK);
            pst.setDouble(3, total);
            pst.setTimestamp(4, datetime);
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar la compra " + e);
            return false;
        }
    }

    //Metodo para registrar detalles de la compra 
   public boolean registarDetallesCompraQuery(double precio_compra, int cantidad_compra, double total_compra, int productoID_FK) {
    String query = "INSERT INTO detalles_compra (productoID_FK, precio_compra, cantidad_compra, total_compra) VALUES (?, ?, ?, ?)";
    
    try {
        conn = conexion.getConnection();
        pst = conn.prepareStatement(query);
        pst.setInt(1, productoID_FK);
        pst.setDouble(2, precio_compra);
        pst.setInt(3, cantidad_compra);
        pst.setDouble(4, total_compra);
        pst.executeUpdate();
        
        System.out.println("Detalles de compra insertados correctamente.");
        return true;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al registrar los detalles de la compra " + e);
        return false;
    } finally {
        // Cerrar recursos
        try {
            if (pst != null) {
                pst.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}



    //Metodo para obtener el id de la compra 
    public int CampraID() {
        int id = 0;
        String query = "SELECT MAX(id_Compras) AS id_Compras FROM compras";

        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();

            if (rs.next()) {
                id = rs.getInt("id_Compras");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return id;
    }

    //Metodo para listar todas las compras realizadas
    public List<Compras> listarTodasComprasQuery() {
        List<Compras> listCompras = new ArrayList<>();
        String query = "SELECT co.*, su.nombre AS Nombre_proveedor FROM compras co INNER JOIN proveedores su ON co.proveedorID_FK = su.id_proveedores ORDER BY co.id_Compras ASC";
        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                Compras compras = new Compras();
                compras.setId_Compras(rs.getInt("id_Compras"));
                compras.setProveedoraProducto(rs.getString("Nombre_proveedor")); // Corrected column name
                compras.setTotal_compra(rs.getDouble("Total"));
                compras.setFecha_compra(rs.getString("Fecha_compra"));
                listCompras.add(compras);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return listCompras;
    }
    //Metodo para imprimir factura  

    public List<Compras> listarDetallesCompraQuery(int id) {
        List<Compras> listCompras = new ArrayList<>();
        String query = "SELECT c.fecha_compra, dc.precio_compra, dc.cantidad_compra, dc.total_compra, p.nombre AS nombre_proveedor, pr.nombre AS nombre_producto, e.nombreCompleto "
                + "FROM compras c "
                + "INNER JOIN detalles_compra dc ON c.id_Compras = dc.idDetalles_compra "
                + "INNER JOIN productos pr ON dc.productoID_FK = pr.id_productos "
                + "INNER JOIN proveedores p ON c.proveedorID_FK = p.id_proveedores "
                + "INNER JOIN empleados e ON c.empleadoId_FK = e.id_empleados WHERE c.id_Compras = ?;";
        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, id);
            rs = pst.executeQuery();

            while (rs.next()) {
                Compras compras = new Compras();
                compras.setNombre_producto(rs.getString("nombre_producto"));
                compras.setCantidad_compra(rs.getInt("cantidad_compra"));
                compras.setTotal(rs.getDouble("Total")); 
                compras.setTotal_compra(rs.getDouble("total_compra")); 
                compras.setProveedoraProducto(rs.getString("nombre_proveedor")); 
                compras.setFecha_compra(rs.getString("fecha_compra"));
                compras.setCompradora(rs.getString("nombreCompleto"));
                listCompras.add(compras);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return listCompras;
    }
}

