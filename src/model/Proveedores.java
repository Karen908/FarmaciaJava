
package model;

public class Proveedores {
    private int id_proveedores;
    private String nombre;
    private String descripcion;
    private String telefono;
    private String direccion;
    private String email;
    private String ciudad;
    private String fecha_creacion;
    private String fecha_actualizacion;

    public Proveedores() {
    }

    public Proveedores(int id_proveedores, String nombre, String descripcion, String telefono, String direccion, String email, String ciudad, String fecha_creacion, String fecha_actualizacion) {
        this.id_proveedores = id_proveedores;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.ciudad = ciudad;
        this.fecha_creacion = fecha_creacion;
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public int getId_proveedores() {
        return id_proveedores;
    }

    public void setId_proveedores(int id_proveedores) {
        this.id_proveedores = id_proveedores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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
