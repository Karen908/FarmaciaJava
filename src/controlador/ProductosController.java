
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.Visibility;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DynamicCMB;
import static model.EmpleadosDao.rol_usuario;
import model.Productos;
import model.ProductosDao;
import views.SystemView;

public class ProductosController implements ActionListener, MouseListener, KeyListener{
    private Productos productos;
    private ProductosDao productosDao;
    private SystemView views;
    String rol = rol_usuario;
    DefaultTableModel model = new DefaultTableModel();

    public ProductosController(Productos productos, ProductosDao productosDao, SystemView views) {
        this.productos = productos;
        this.productosDao = productosDao;
        this.views = views;
        this.views.btn_RegistroProducto.addActionListener(this);
        this.views.product_tabla.addMouseListener(this);
        this.views.txt_BuscarProducto.addKeyListener(this);
        this.views.btn_actualizarP.addActionListener(this);
        this.views.btn_eliminarP.addActionListener(this);
        this.views.btn_cancelarP.addActionListener(this);
        this.views.jLabelProduct.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == views.btn_RegistroProducto) {
        // Verificamos que los campos no estén vacíos 
        if (views.txt_CodigoProducto.getText().equals("")
                || views.txt_NombreProducto.getText().equals("")
                || views.txt_DescripcionProducto.getText().equals("")
                || views.txt_PrecioV.getText().equals("")
                || views.cmb_Categoria.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        } else {
            try {
                // Insertamos los datos del registro
                productos.setCodigo(Integer.parseInt(views.txt_CodigoProducto.getText().trim()));
                productos.setNombre(views.txt_NombreProducto.getText().trim());
                productos.setDescripcion(views.txt_DescripcionProducto.getText().trim());
                productos.setPrecio(Double.parseDouble(views.txt_PrecioV.getText().trim()));
                DynamicCMB categoria_id = (DynamicCMB) views.cmb_Categoria.getSelectedItem();
                productos.setCategoria_FK(categoria_id.getId());

                if (productosDao.registerProductosQuery(productos)) {
                    limpiarTabla();
                    limpiarCampos();
                    listProductos();
                    JOptionPane.showMessageDialog(null, "Producto registrado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar el producto");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error en el formato de los datos: " + ex.getMessage());
            }
        }
    } else  if (e.getSource() == views.btn_actualizarP) {
        // Verificamos que los campos no estén vacíos 
        if (views.txt_CodigoProducto.getText().equals("")
                || views.txt_NombreProducto.getText().equals("")
                || views.txt_DescripcionProducto.getText().equals("")
                || views.txt_PrecioV.getText().equals("")
                || views.cmb_Categoria.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        } else {
            try {
                productos.setCodigo(Integer.parseInt(views.txt_CodigoProducto.getText().trim()));
                productos.setNombre(views.txt_NombreProducto.getText().trim());
                productos.setDescripcion(views.txt_DescripcionProducto.getText().trim());
                productos.setPrecio(Double.parseDouble(views.txt_PrecioV.getText().trim()));
                // Obtener el id de la categoría
                DynamicCMB categoria_id = (DynamicCMB) views.cmb_Categoria.getSelectedItem();
                productos.setCategoria_FK(categoria_id.getId());
                // Le pasamos el id al método
                productos.setId_productos(Integer.parseInt(views.txt_ProductoID.getText()));
                // Llamamos al método modificar 
                if (productosDao.ActualizarProductosQuery(productos)) {
                    limpiarTabla();
                    limpiarCampos();
                    listProductos();
                    JOptionPane.showMessageDialog(null, "Datos del producto modificados con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al insertar los datos del producto");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error en el formato de los datos: " + ex.getMessage());
            }
        }
    }//Boton para elimar producto
    else if (e.getSource() == views.btn_eliminarP) {
            int fila = views.product_tabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar un producto para eliminar ");
            } else {
                int id = Integer.parseInt(views.product_tabla.getValueAt(fila, 0).toString());
                int question = JOptionPane.showConfirmDialog(null, "¿En realidad quiere eliminar este producto?");
                if (question == 0 && productosDao.eliminarProductoQuery(id) != false) {
                    limpiarTabla();
                    limpiarCampos();
                    views.btn_Registro_Cliente.setEnabled(true);
                    listProductos();
                    JOptionPane.showMessageDialog(null, "cliente eliminado con exito");

                }
            }
        } else if (e.getSource() == views.btn_cancelarP) {
            views.btn_RegistroProducto.setEnabled(true);
            limpiarCampos();
        }
    }
    //Metodo para listar productos
    public void listProductos(){
        if (rol.equals("Administrador") || rol.equals("Auxiliar")) {
            List<Productos>list= productosDao.listProductosQuery(views.txt_BuscarProducto.getText());
            model = (DefaultTableModel) views.product_tabla.getModel();
            Object[] row = new Object[7];
            for (int i = 0; i < list.size(); i++) {
                row[0]= list.get(i).getId_productos();
                row[1]=list.get(i).getCodigo();
                row[2]=list.get(i).getNombre();
                row[3]=list.get(i).getDescripcion();
                row[4]=list.get(i).getPrecio();
                row[5]=list.get(i).getCantidad();
                row[6]=list.get(i).getNombre_Categoria();
                model.addRow(row);
            }
            views.product_tabla.setModel(model);
            if (rol.equals("Auxiliar")) {
                views.btn_RegistroProducto.setEnabled(false);
                views.btn_actualizarP.setEnabled(false);
                views.btn_eliminarP.setEnabled(false);
                views.btn_cancelarP.setEnabled(false);
                views.txt_CodigoProducto.setEnabled(false);
                views.txt_DescripcionProducto.setEnabled(false);
                views.txt_ProductoID.setEnabled(false);
                views.txt_NombreProducto.setEnabled(false);
                views.txt_PrecioV.setEnabled(false);
            }
            
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    if (e.getSource() == views.product_tabla) {
        int row = views.product_tabla.rowAtPoint(e.getPoint());
        views.txt_ProductoID.setText(views.product_tabla.getValueAt(row, 0).toString());
        productos = productosDao.buscar_producto(Integer.parseInt(views.txt_ProductoID.getText()));
        views.txt_CodigoProducto.setText("" + productos.getCodigo());
        views.txt_NombreProducto.setText(productos.getNombre());
        views.txt_DescripcionProducto.setText(productos.getDescripcion());
        views.txt_PrecioV.setText("" + productos.getPrecio());
        views.cmb_Categoria.setSelectedItem(new DynamicCMB(productos.getCategoria_FK(), productos.getNombre_Categoria()));
        // Deshabilitar
        views.btn_RegistroProducto.setEnabled(false);
    }else if (e.getSource() == views.jLabelProduct) {
            views.menuNavegacion.setSelectedIndex(0);
            //limpiar tabla 
            limpiarTabla();
            //limpiar campos
            limpiarCampos();
            //listar productos
            listProductos();
        }
}

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource()== views.txt_BuscarProducto) {
            limpiarTabla();
            listProductos();
        }
    }
    public void limpiarTabla() {
        //getRowCount nos permite realizar diversas operaciones como determinar el tamaño de una tabla, iterar sobre todas las filas de la tabla para realizar algun procedimiento
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }
    public void limpiarCampos() {
        views.txt_ProductoID.setText("");
        views.txt_CodigoProducto.setText("");
        views.txt_NombreProducto.setText("");
        views.txt_DescripcionProducto.setText("");
        views.txt_PrecioV.setText("");
    }
}

