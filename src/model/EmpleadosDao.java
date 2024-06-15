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

public class EmpleadosDao {

    //Aqui van todos los metodos que van a permitir a java interactuar con MYSQL
    //1)Instanciamos la conexion
    ConnectionMYSQL1 conexion = new ConnectionMYSQL1();
    //Llamamos a la variable 
    Connection conn; //Para realizar la conexion 
    PreparedStatement pst; //Sirve para consultar 
    ResultSet rs; //Sirve para obtener datos de la consulta

    //variables para enviar datos estre interfaces
    //el public static es que el nos permite neviar datos desde interfaces
    public static int id_empleados = 0;
    public static String nombreCompleto = "";
    public static String nombreUsuarios = "";
    public static String direccion = "";
    public static String rol_usuario = "";
    public static String email = "";
    public static String telefono = "";

    //metodo de login 
    public Empleados loginQuery(String nombreUsuario, String password) {
        String query = "SELECT * FROM empleados where nombreUsuario = ? AND password = ?";
        Empleados empleado = new Empleados();
        try {
            //llamo a la variable conexion y consulta
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            //Enviar parametros 
            pst.setString(1, nombreUsuario);
            pst.setString(2, password);
            //llamo a la variable result, para que nos permita obtener los datos de la consulta 
            rs = pst.executeQuery();

            //verificamos si los datos de password y el nombreUsuario conciden
            if (rs.next()) {
                empleado.setId_empleados(rs.getInt("id_empleados"));
                id_empleados = empleado.getId_empleados();
                empleado.setNombreCompleto(rs.getString("nombreCompleto"));
                nombreCompleto = empleado.getNombreCompleto();
                empleado.setNombreUsuario(rs.getString("nombreUsuario"));
                nombreUsuarios = empleado.getNombreUsuario();
                empleado.setDireccion(rs.getString("direccion"));
                direccion = empleado.getDireccion();
                empleado.setTelefono(rs.getString("telefono"));
                telefono = empleado.getTelefono();
                empleado.setEmail(rs.getString("email"));
                email = empleado.getEmail();
                empleado.setRol(rs.getString("rol"));
                rol_usuario = empleado.getRol();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener al empleado " + e);
        }
        return empleado;
    }

    //metodo para registrar empleados 
    public boolean registerEmpleadoQuery(Empleados empleados) {
        String query = "INSERT INTO empleados(id_empleados,nombreCompleto,nombreUsuario,direccion,telefono,email,password,"
                + "rol,fecha_creacion,fecha_Actualizacion) VALUE(?,?,?,?,?,?,?,?,?,?)";
        //Variable para obtener la fecha y la hora exacta de creacion y actualizacion 

        Timestamp datetime = new Timestamp(new Date().getTime());

        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, empleados.getId_empleados());
            pst.setString(2, empleados.getNombreCompleto());
            pst.setString(3, empleados.getNombreUsuario());
            pst.setString(4, empleados.getDireccion());
            pst.setString(5, empleados.getTelefono());
            pst.setString(6, empleados.getEmail());
            pst.setString(7, empleados.getPassword());
            pst.setString(8, empleados.getRol());
            pst.setTimestamp(9, datetime);
            pst.setTimestamp(10, datetime);
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar al empleado" + e);
            return false;
        }
    }

    //metodo para listar el empleado
    public List listEmpleadosQuery(String value) {
        System.out.println("Ejecutando consulta para listar empleados...");
        List<Empleados> list_empleados = new ArrayList();
        String query = "SELECT * FROM empleados ORDER BY rol ASC";
        String query_buscar_empleado = "SELECT * FROM empleados WHERE id_empleados LIKE '%" + value + "%'";

        try {
            conn = conexion.getConnection();
            if (value.equalsIgnoreCase("")) {
                pst = conn.prepareStatement(query);
                rs = pst.executeQuery();
            } else {
                pst = conn.prepareStatement(query_buscar_empleado);
                rs = pst.executeQuery();
            }
            //para recorrer , los registros, rs nos trae todos los resultados que tenga esa consulta 
            while (rs.next()) {
                Empleados empleados = new Empleados();
                empleados.setId_empleados(rs.getInt("id_empleados"));
                empleados.setNombreCompleto(rs.getString("nombreCompleto"));
                empleados.setNombreUsuario(rs.getString("nombreUsuario"));
                empleados.setDireccion(rs.getString("direccion"));
                empleados.setTelefono(rs.getString("telefono"));
                empleados.setEmail(rs.getString("email"));
                empleados.setRol(rs.getString("rol"));
                list_empleados.add(empleados);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            System.out.println("Error al ejecutar la consulta: " + e.toString());
        }
        return list_empleados;
    }
    //CREAMOS LOS METODOS PARA: Modificar, Eliminar y cambiar la contraseña de los empleados 

    //Metodo para:Modificar empleados
    public boolean ActualizarEmpleadoQuery(Empleados empleados) {
        String query = "UPDATE empleados SET nombreCompleto=?,nombreUsuario=?,direccion=?,telefono=?,email=?,rol=?,fecha_Actualizacion=?"
                + "WHERE id_empleados=?";
        //Variable para obtener la fecha y la hora exacta de creacion y actualizacion 

        Timestamp datetime = new Timestamp(new Date().getTime());

        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            pst.setString(1, empleados.getNombreCompleto());
            pst.setString(2, empleados.getNombreUsuario());
            pst.setString(3, empleados.getDireccion());
            pst.setString(4, empleados.getTelefono());
            pst.setString(5, empleados.getEmail());
            pst.setString(6, empleados.getRol());
            pst.setTimestamp(7, datetime);
            pst.setInt(8, empleados.getId_empleados());
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar los datos del empleado" + e);
            return false;
        }
    }

    //Metodo para:Eliminar empleados
    public boolean eliminarEmpleadoQuery(int id_empleados) {
        String query = "DELETE FROM empleados WHERE id_empleados= " + id_empleados;

        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            pst.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No puede eliminar un empleado, que tenga relacion con otra tabla ");
            return false;
        }
    }

    //Metodo para cambiar la contraseña
    public boolean actualizarContraEmpleado(Empleados empleados) {
        String query = "UPDATE empleados SET password = ? WHERE nombreUsuario = '" + nombreUsuarios + "'";
        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            pst.setString(1, empleados.getPassword());
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al modificar la contraseña" + e);
            return false;
        }
    }
}
