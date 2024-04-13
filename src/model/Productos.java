
package model;

public class Productos {
private int id_productos;
private int codigo;
private String nombre;
private String descripcion;
private double precio;
private int cantidad;
private String fecha_creacion;
private String fecha_actualizacion;
private int categoria_FK;
private String nombre_categoria;

    public Productos() {
    }

    public Productos(int id_productos, int codigo, String nombre, String descripcion, double precio, int cantidad, String fecha_creacion, String fecha_actualizacion, int categoria_FK, String Nombre_Categoria) {
        this.id_productos = id_productos;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fecha_creacion = fecha_creacion;
        this.fecha_actualizacion = fecha_actualizacion;
        this.categoria_FK = categoria_FK;
        this.nombre_categoria = Nombre_Categoria;
    }

    public int getId_productos() {
        return id_productos;
    }

    public void setId_productos(int id_productos) {
        this.id_productos = id_productos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    public int getCategoria_FK() {
        return categoria_FK;
    }

    public void setCategoria_FK(int categoria_FK) {
        this.categoria_FK = categoria_FK;
    }

    public String getNombre_Categoria() {
        return nombre_categoria;
    }

    public void setNombre_Categoria(String Nombre_Categoria) {
        this.nombre_categoria = Nombre_Categoria;
    }

        
}
