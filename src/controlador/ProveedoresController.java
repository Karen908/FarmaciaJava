package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Proveedores;
import model.ProveedoresDao;
import views.SystemView;
import static model.EmpleadosDao.rol_usuario;

public class ProveedoresController implements ActionListener, MouseListener, KeyListener {

    private Proveedores proveedores;
    private ProveedoresDao proveedoresDao;
    private SystemView views;
    String rolProveedor = rol_usuario;
    DefaultTableModel model = new DefaultTableModel();

    public ProveedoresController(Proveedores proveedores, ProveedoresDao proveedoresDao, SystemView views) {
        this.proveedores = proveedores;
        this.proveedoresDao = proveedoresDao;
        this.views = views;
        //Boton para registrar proveedor
        this.views.btn_registrar_Proveedor.addActionListener(this);
        //boton para modificar proveedor
        this.views.btn_modificar_Proveedor.addActionListener(this);
        //boton para eliminar proveedor
        this.views.btn_eliminar_Proveedor.addActionListener(this);
        //boton para cancelar proveedor 
        this.views.btn_cancelar_Proveedor.addActionListener(this);
        //habilitar menu de navegacion 
        this.views.jLabelSuppliers.addMouseListener(this);
        
        this.views.tabla_Prevedor.addMouseListener(this);
        //ponemos a la escucha el buscador 
        this.views.txt_buscar_Proveedor.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btn_registrar_Proveedor) {
            //verificamos si los campos estan vacios 
            if (views.txt_nombre_Proveedor.getText().equals("") || views.txt_descripcion_Proveedor.getText().equals("") || views.txt_telefono_Proveedor.getText().equals("")
                    || views.txt_correo_Proveedor.getText().equals("") || views.txt_direccion_Proveedor.getText().equals("") || views.cmb_ciudad_Proveedor.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                //Realizar insercion 
                proveedores.setNombre(views.txt_nombre_Proveedor.getText().trim());
                proveedores.setDescripcion(views.txt_descripcion_Proveedor.getText().trim());
                proveedores.setTelefono(views.txt_telefono_Proveedor.getText().trim());
                proveedores.setEmail(views.txt_correo_Proveedor.getText().trim());
                proveedores.setDireccion(views.txt_direccion_Proveedor.getText().trim());
                proveedores.setCiudad(views.cmb_ciudad_Proveedor.getSelectedItem().toString());
                proveedores.setId_proveedores(Integer.parseInt(views.txt_ProductoID.getText()));

                if (proveedoresDao.registerProveedoresQuery(proveedores)) {
                    limpiarTabla();
                    limpiarCampos();
                    ListarTodosProveedores();
                    JOptionPane.showMessageDialog(null, "Proveedor registrado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar al proveedor");

                }
            }//Modificar proveedor
        } else if (e.getSource() == views.btn_modificar_Proveedor) {
            if (views.txt_ID_Proveedor.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecciona una fila para continuar");
            } else if (views.txt_nombre_Proveedor.getText().trim().equals("")
                    || views.txt_direccion_Proveedor.getText().trim().equals("")
                    || views.txt_telefono_Proveedor.getText().trim().equals("")
                    || views.txt_correo_Proveedor.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                try {
                    int idProveedor = Integer.parseInt(views.txt_ID_Proveedor.getText().trim());
                    proveedores.setId_proveedores(idProveedor);
                    proveedores.setNombre(views.txt_nombre_Proveedor.getText().trim());
                    proveedores.setDescripcion(views.txt_descripcion_Proveedor.getText().trim());
                    proveedores.setDireccion(views.txt_direccion_Proveedor.getText().trim());
                    proveedores.setTelefono(views.txt_telefono_Proveedor.getText().trim());
                    proveedores.setEmail(views.txt_correo_Proveedor.getText().trim());
                    proveedores.setCiudad(views.cmb_ciudad_Proveedor.getSelectedItem().toString());

                    if (proveedoresDao.actualizarProveedoresQuery(proveedores)) {
                        limpiarTabla();
                        limpiarCampos();
                        ListarTodosProveedores();
                        views.btn_registrar_Proveedor.setEnabled(true);
                        JOptionPane.showMessageDialog(null, "Datos del proveedor modificados con éxito");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al modificar los datos del proveedor");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "ID del proveedor inválido");
                }
            }
        } else if (e.getSource() == views.btn_eliminar_Proveedor) {
            int row = views.tabla_Prevedor.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar un proveedor para eliminar");
            } else {
                int id = Integer.parseInt(views.tabla_Prevedor.getValueAt(row, 0).toString());
                int question = JOptionPane.showConfirmDialog(null, "¿Estas seguro de que quieres eliminar este proveedor?");
                if (question == 0 && proveedoresDao.eliminarProveedoresQuery(id) != false) {
                    limpiarTabla();
                    limpiarCampos();
                    ListarTodosProveedores();
                    JOptionPane.showMessageDialog(null, "Proveedor eliminado con exito");
                }
            }
        }else if (e.getSource() == views.btn_cancelar_Proveedor){
            limpiarCampos();
            views.btn_registrar_Proveedor.setEnabled(true);
            
            
        }
    }

    // Listar proveedores
public void ListarTodosProveedores() {
    if (rolProveedor.equals("Administrador")) {
        String buscarTexto = views.txt_buscar_Proveedor.getText().trim();
        System.out.println("Texto de búsqueda: " + buscarTexto); // Depuración

        List<Proveedores> list = proveedoresDao.listProveedoresQuery(buscarTexto);
        System.out.println("Número de proveedores encontrados: " + list.size()); // Depuración

        DefaultTableModel model = (DefaultTableModel) views.tabla_Prevedor.getModel();
        model.setRowCount(0); // Limpia la tabla antes de agregar nuevos datos

        Object[] row = new Object[7];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId_proveedores();
            row[1] = list.get(i).getNombre();
            row[2] = list.get(i).getDescripcion();
            row[3] = list.get(i).getDireccion();
            row[4] = list.get(i).getTelefono();
            row[5] = list.get(i).getEmail();
            row[6] = list.get(i).getCiudad();
            model.addRow(row);
        }

        views.tabla_Prevedor.setModel(model);
        System.out.println("Tabla actualizada con proveedores"); // Depuración
    }
}


    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.tabla_Prevedor) {
            int row = views.tabla_Prevedor.rowAtPoint(e.getPoint());
            views.txt_ID_Proveedor.setText(views.tabla_Prevedor.getValueAt(row, 0).toString());
            views.txt_nombre_Proveedor.setText(views.tabla_Prevedor.getValueAt(row, 1).toString());
            views.txt_descripcion_Proveedor.setText(views.tabla_Prevedor.getValueAt(row, 2).toString());
            views.txt_direccion_Proveedor.setText(views.tabla_Prevedor.getValueAt(row, 3).toString());
            views.txt_telefono_Proveedor.setText(views.tabla_Prevedor.getValueAt(row, 4).toString());
            views.txt_correo_Proveedor.setText(views.tabla_Prevedor.getValueAt(row, 5).toString());
            views.cmb_ciudad_Proveedor.setSelectedItem(views.tabla_Prevedor.getValueAt(row, 6).toString());
            //Deshabilitamos algunos botones 
            views.btn_registrar_Proveedor.setEnabled(false);
            views.txt_ID_Proveedor.setEnabled(false);
        }else if (e.getSource() == views.jLabelSuppliers){
            if(rolProveedor.equals("Administrador")) {
                views.menuNavegacion.setSelectedIndex(8);
                //Limpiar tabla 
                limpiarTabla();
                //limpiar campos 
                limpiarCampos();
                //Listar proveedores 
                ListarTodosProveedores();
            }else{
                views.menuNavegacion.setEnabledAt(8,false);
                views.jLabelSuppliers.setEnabled(false);
                JOptionPane.showMessageDialog(null, "No tienes privilegios acceder a esta vista");
            }
  
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
        if (e.getSource() == views.txt_buscar_Proveedor) {
            limpiarTabla();
            ListarTodosProveedores();
        }
    }


    public void limpiarTabla() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

    public void limpiarCampos() {
        //Coloca los campos vacios 
        views.txt_ID_Proveedor.setText("");
        views.txt_ID_Proveedor.setEnabled(true);
        views.txt_nombre_Proveedor.setText("");
        views.txt_descripcion_Proveedor.setText("");
        views.txt_direccion_Proveedor.setText("");
        views.txt_telefono_Proveedor.setText("");
        views.txt_correo_Proveedor.setText("");
        views.cmb_ciudad_Proveedor.setSelectedIndex(0);
    }
}
