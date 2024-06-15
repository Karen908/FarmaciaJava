package model;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class ventasDao {

    //1)Instanciamos la conexion
    ConnectionMYSQL1 conexion = new ConnectionMYSQL1();
    //Llamamos a la variable 
    Connection conn; //Para realizar la conexion 
    PreparedStatement pst; //Sirve para consultar 
    ResultSet rs; //Sirve para obtener datos de la consulta

    //Metodo pra registrar una venta 
    public boolean registarVentasQuery(int clientesID_Fk, int empleadoId_FK, double total_venta) {
        String query = "INSERT INTO ventas (clientesID_Fk, empleadoId_FK, Fecha_venta, total_venta) VALUES (?, ?, ?, ?)";
        Timestamp datetime = new Timestamp(new Date().getTime());

        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, clientesID_Fk);
            pst.setInt(2, empleadoId_FK);
            pst.setDouble(3, total_venta);
            pst.setTimestamp(4, datetime);
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }

    //Metodo para registrar los detalles de la venta 
    public boolean registarDetallesVentaQuery(int productosID_FK, int ventasID_Fk, int Cantidad_venta, double precio_venta, double subTotal_venta) {
        String query = "insert into detalles_venta (productosID_FK, ventasID_Fk, Cantidad_venta, precio_venta, subTotal_venta) values (?,?,?,?,?)";
        Timestamp datetime = new Timestamp(new Date().getTime());

        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, productosID_FK);
            pst.setInt(2, ventasID_Fk);
            pst.setInt(3, Cantidad_venta);
            pst.setDouble(4, precio_venta);
            pst.setDouble(5, subTotal_venta);
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    //Metodo para obtener el id maximo de la venta 
    public int ventaId() {
        int id = 0;
        String query = "SELECT MAX(id_ventas) AS id_ventas FROM ventas";

        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();

            if (rs.next()) {
                id = rs.getInt("id_ventas");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return id;
    }

    //Metodo para listar ventas 
    public List listarTodoVentasQuery() {
        List<Ventas> list_ventas = new ArrayList();
        String query = "SELECT ventas.id_ventas AS factura, c.nombre AS clientes, e.nombreCompleto AS empleados, ventas.total_venta, ventas.Fecha_venta FROM ventas INNER JOIN clientes c ON ventas.clientesID_Fk = c.id_Clientes INNER JOIN empleados e ON ventas.empleadoId_FK = e.id_empleados ORDER BY ventas.id_ventas ASC";

        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();

            //recorremos la lista 
            while (rs.next()) {
                Ventas ventas = new Ventas();
                ventas.setId_ventas(rs.getInt("factura"));
                ventas.setNombre_cliente(rs.getString("clientes"));
                ventas.setNombre_empleado(rs.getString("empleados"));
                ventas.setTotal_venta(rs.getDouble("total_venta"));
                ventas.setFecha_venta(rs.getString("Fecha_venta"));
                list_ventas.add(ventas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return list_ventas;
    }
}
