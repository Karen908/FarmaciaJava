
package model;

public class Clientes {
   private int  id_Clientes;
   private String nombre;
   private String direccion;
   private String telefono;
   private String email;
   private String fecha_creacion;
   private String fecha_actualizacion;

    public Clientes() {
    }

    public Clientes(int id_Clientes, String nombre, String direccion, String telefono, String email, String fecha_creacion, String fecha_actualizacion) {
        this.id_Clientes = id_Clientes;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.fecha_creacion = fecha_creacion;
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public int getId_Clientes() {
        return id_Clientes;
    }

    public void setId_Clientes(int id_Clientes) {
        this.id_Clientes = id_Clientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(String fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

}
