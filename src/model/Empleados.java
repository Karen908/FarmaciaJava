
package model;


public class Empleados {
    private int id_empleados;
    private String nombreCompleto;
    private String nombreUsuario;
    private String direccion;
    private String telefono;
    private String email;
    private String password;
    private String rol;
    private String fecha_creacion;
    private String fecha_Actualizacion;

    public Empleados() {
    }

    public Empleados(int id_empleados, String nombreCompleto, String nombreUsuario, String direccion, String telefono, String email, String password, String rol, String fecha_creacion, String fecha_Actualizacion) {
        this.id_empleados = id_empleados;
        this.nombreCompleto = nombreCompleto;
        this.nombreUsuario = nombreUsuario;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.password = password;
        this.rol = rol;
        this.fecha_creacion = fecha_creacion;
        this.fecha_Actualizacion = fecha_Actualizacion;
    }

    public int getId_empleados() {
        return id_empleados;
    }

    public void setId_empleados(int id_empleados) {
        this.id_empleados = id_empleados;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getFecha_Actualizacion() {
        return fecha_Actualizacion;
    }

    public void setFecha_Actualizacion(String fecha_Actualizacion) {
        this.fecha_Actualizacion = fecha_Actualizacion;
    }
    
    
    
}
