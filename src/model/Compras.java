
package model;


public class Compras {
    private int id_Compras;
    private int codigo;
    private String nombre_producto;
    private int cantidad_compra;
    private double precio_compra;
    private double total_compra;
    private double total;
    private String fecha_compra;    
    private String  proveedoraProducto;
    private String compradora;

    public Compras() {
    }

    public Compras(int id_Compras, int codigo, String nombre_producto, int cantidad_compra, double precio_compra, double total_compra, double total, String fecha_compra, String proveedoraProducto, String compradora) {
        this.id_Compras = id_Compras;
        this.codigo = codigo;
        this.nombre_producto = nombre_producto;
        this.cantidad_compra = cantidad_compra;
        this.precio_compra = precio_compra;
        this.total_compra = total_compra;
        this.total = total;
        this.fecha_compra = fecha_compra;
        this.proveedoraProducto = proveedoraProducto;
        this.compradora = compradora;
    }

    public int getId_Compras() {
        return id_Compras;
    }

    public void setId_Compras(int id_Compras) {
        this.id_Compras = id_Compras;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getCantidad_compra() {
        return cantidad_compra;
    }

    public void setCantidad_compra(int cantidad_compra) {
        this.cantidad_compra = cantidad_compra;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public double getTotal_compra() {
        return total_compra;
    }

    public void setTotal_compra(double total_compra) {
        this.total_compra = total_compra;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public String getProveedoraProducto() {
        return proveedoraProducto;
    }

    public void setProveedoraProducto(String proveedoraProducto) {
        this.proveedoraProducto = proveedoraProducto;
    }

    public String getCompradora() {
        return compradora;
    }

    public void setCompradora(String compradora) {
        this.compradora = compradora;
    }

}
