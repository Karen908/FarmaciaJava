
package model;

public class Categorias {
    private int id_categoria;
    private String nombre;
    private String fecha_creacion;
    private String fecha_actualizacion;

    public Categorias() {
    }

    public Categorias(int id_categoria, String nombre, String fecha_creacion, String fecha_actualizacion) {
        this.id_categoria = id_categoria;
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
