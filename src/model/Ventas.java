
package model;

public class Ventas {
    private int id_ventas;
    private String Fecha_venta;
    private double total_venta;
    private int clientesID_Fk;
    private String nombre_cliente;
    private int empleadoId_FK;
    private String nombre_empleado;

    public Ventas() {
    }

    public Ventas(int id_ventas, String Fecha_venta, double total_venta, int clientesID_Fk, String nombre_cliente, int empleadoId_FK, String nombre_empleado) {
        this.id_ventas = id_ventas;
        this.Fecha_venta = Fecha_venta;
        this.total_venta = total_venta;
        this.clientesID_Fk = clientesID_Fk;
        this.nombre_cliente = nombre_cliente;
        this.empleadoId_FK = empleadoId_FK;
        this.nombre_empleado = nombre_empleado;
    }

    public int getId_ventas() {
        return id_ventas;
    }

    public void setId_ventas(int id_ventas) {
        this.id_ventas = id_ventas;
    }

    public String getFecha_venta() {
        return Fecha_venta;
    }

    public void setFecha_venta(String Fecha_venta) {
        this.Fecha_venta = Fecha_venta;
    }

    public double getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(double total_venta) {
        this.total_venta = total_venta;
    }

    public int getClientesID_Fk() {
        return clientesID_Fk;
    }

    public void setClientesID_Fk(int clientesID_Fk) {
        this.clientesID_Fk = clientesID_Fk;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public int getEmpleadoId_FK() {
        return empleadoId_FK;
    }

    public void setEmpleadoId_FK(int empleadoId_FK) {
        this.empleadoId_FK = empleadoId_FK;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }
        
}
