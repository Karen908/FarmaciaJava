package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Compras;
import model.ComprasDao;
import model.DynamicCMB;
import model.EmpleadosDao;
import static model.EmpleadosDao.id_empleados;
import static model.EmpleadosDao.rol_usuario;
import model.Productos;
import model.ProductosDao;
import views.SystemView;

public class ComprasController implements ActionListener, KeyListener {

    private Compras compras;
    private ComprasDao comprasDao;
    private SystemView views;
    private int item = 0;
    private int getIdProveedor = 0;
    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel temp;
    //instanciamos el modelo productos 
    Productos productos = new Productos();
    ProductosDao productosDao = new ProductosDao();
    String rol = rol_usuario;

    public ComprasController(Compras compras, ComprasDao comprasDao, SystemView views) {
        this.compras = compras;
        this.comprasDao = comprasDao;
        this.views = views;
        //Llamamos al boton de agregar compra 
        this.views.btn_Agregar_Compra.addActionListener(this);
        //Llamo al boton comprar 
        this. views.btn_Confirmar_Compra.addActionListener(this);
        //Llamamos al componente codigo de la compra 
        this.views.txt_CodigoCompra.addKeyListener(this);
        //Llamamos al componente  precio de compra
        this.views.txt_Precio_Compra.addKeyListener(this);
        //Llamamos la componente  cantidad de compra 
        this.views.txt_Cantidad_Compra.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btn_Agregar_Compra) {
            DynamicCMB proveedorCMB = (DynamicCMB) views.cmb_Proveedor_Compra.getSelectedItem();
            int proveedorID = proveedorCMB.getId();
            // Condicional para verificar si el usuario ya asignó un proveedor
            if (getIdProveedor == 0) {
                getIdProveedor = proveedorID;
            } else {
                if (getIdProveedor != proveedorID) {
                    JOptionPane.showMessageDialog(null, "No puede realizar una misma compra a varios proveedores");
                } else {
                    // Verificar si los campos no están vacíos antes de la conversión
                    if (views.txt_Cantidad_Compra.getText().isEmpty()
                            || views.txt_Precio_Compra.getText().isEmpty()
                            || views.txt_ID_Compra.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos requeridos.");
                        return;
                    }
                    try {
                        int cantidad = Integer.parseInt(views.txt_Cantidad_Compra.getText());
                        double precio = Double.parseDouble(views.txt_Precio_Compra.getText());
                        int compraID = Integer.parseInt(views.txt_ID_Compra.getText());
                        String producto_nombre = views.txt_Nombre_Compra.getText();
                        String nombreProveedor = views.cmb_Proveedor_Compra.getSelectedItem().toString();

                        if (cantidad > 0) {
                            DefaultTableModel temp = (DefaultTableModel) views.campras_Tabla.getModel();
                            for (int i = 0; i < views.campras_Tabla.getRowCount(); i++) {
                                if (views.campras_Tabla.getValueAt(i, 1).equals(views.txt_NombreProducto.getText())) {
                                    JOptionPane.showMessageDialog(null, "El producto ya está registrado en la tabla de compras");
                                    return;
                                }
                            }
                            // Utilizamos un arreglo dinámico 
                            ArrayList<Object> list = new ArrayList<>();
                            item = 1;
                            list.add(item);
                            list.add(compraID);
                            list.add(producto_nombre);
                            list.add(cantidad);
                            list.add(precio);
                            list.add(cantidad * precio);
                            list.add(nombreProveedor);

                            // Creamos un objeto 
                            Object[] obj = new Object[6];
                            obj[0] = list.get(1);
                            obj[1] = list.get(2);
                            obj[2] = list.get(3);
                            obj[3] = list.get(4);
                            obj[4] = list.get(5);
                            obj[5] = list.get(6);

                            temp.addRow(obj);
                            views.campras_Tabla.setModel(temp);
                            limpiarCamposCompra();
                            views.cmb_Proveedor_Compra.setEditable(false);
                            views.txt_CodigoCompra.requestFocus();
                            calcularCompra();
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Error en la conversión de datos. Por favor, verifique los valores ingresados.");
                    }
                }
            }
        }else if (e.getSource() == views.btn_Confirmar_Compra) {
            InsertarCompra();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getSource() == views.txt_CodigoCompra) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                if (views.txt_CodigoCompra.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese el código del producto a comprar");
                } else {
                    try {
                        int id = Integer.parseInt(views.txt_CodigoCompra.getText());
                        productos = productosDao.buscar_codigo(id);
                        if (productos != null) {
                            views.txt_Nombre_Compra.setText(productos.getNombre());
                            views.txt_ID_Compra.setText(String.valueOf(productos.getId_productos()));
                            views.txt_Cantidad_Compra.requestFocus();
                        } else {
                            JOptionPane.showMessageDialog(null, "Producto no encontrado.");
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Código de producto inválido.");
                    }
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == views.txt_Precio_Compra || e.getSource() == views.txt_Cantidad_Compra) {
            int cantidad = 1;
            double precio = 0.0;

            if (!views.txt_Cantidad_Compra.getText().isEmpty()) {
                try {
                    cantidad = Integer.parseInt(views.txt_Cantidad_Compra.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Cantidad inválida. Por favor, ingrese un número entero.");
                    cantidad = 1;
                }
            }

            if (!views.txt_Precio_Compra.getText().isEmpty()) {
                try {
                    precio = Double.parseDouble(views.txt_Precio_Compra.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Precio inválido. Por favor, ingrese un número válido.");
                    precio = 0.0;
                }
            }

            views.txtSubtotal_Compra.setText(String.valueOf(cantidad * precio));
        }
    }
    //Metodo para insertar compra 
    private void InsertarCompra() {
    double total = Double.parseDouble(views.txt_Pagar_Compra.getText());
    int empleadoID = id_empleados;
    if (comprasDao.registrarCompraQuery(getIdProveedor, empleadoID, total)) {
        int compraId = comprasDao.CampraID();
        for (int i = 0; i < views.campras_Tabla.getRowCount(); i++) {
    int productoId = Integer.parseInt(views.campras_Tabla.getValueAt(i, 0).toString());
    int cantidadCompra = Integer.parseInt(views.campras_Tabla.getValueAt(i, 2).toString());
    double precioCompra = Double.parseDouble(views.campras_Tabla.getValueAt(i, 3).toString());
    double SubTotalCompra = precioCompra * cantidadCompra;
    // registrar detalles de la compra 
    comprasDao.registarDetallesCompraQuery(precioCompra, cantidadCompra, SubTotalCompra, productoId);
}
        // Para limpiar la tabla temporal si views no es null
        if (views != null) {
            limpiarTablaCompra();
            JOptionPane.showMessageDialog(null, "Compra registrada con exito");
            limpiarCamposCompra();
        } else {
            JOptionPane.showMessageDialog(null, "Error: views es null");
        }
    }
}

            

    //Metodo para calcular compra 
    public void calcularCompra() {
        double total = 0.00;
        int numRow = views.campras_Tabla.getRowCount();
        for (int i = 0; i < numRow; i++) {
            // Pasamos el índice de la columna que se sumará
            total += Double.parseDouble(String.valueOf(views.campras_Tabla.getValueAt(i, 4)));
        }
        views.txtSubtotal_Compra.setText("" + total); // Actualizar el subtotal

        // o actualizar el campo txt_Pagar_Compra con el valor del subtotal
        views.txt_Pagar_Compra.setText("" + total);
    }

    //Metodo para limpiar campos 
    public void limpiarCamposCompra() {
        views.txt_CodigoCompra.setText("");
        views.txt_Nombre_Compra.setText("");
        views.txt_Cantidad_Compra.setText("");
        views.cmb_Proveedor_Compra.setSelectedItem("");
        views.txt_Precio_Compra.setText("");
        views.txtSubtotal_Compra.setText("");
        views.txt_ID_Compra.setText("");
        views.txt_Pagar_Compra.setText("");
    }
    public void limpiarTablaCompra() {
    DefaultTableModel temp = (DefaultTableModel) views.campras_Tabla.getModel();
    int rowCount = temp.getRowCount();
    for (int i = rowCount - 1; i >= 0; i--) {
        temp.removeRow(i);
    }
}

}
