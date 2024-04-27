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
import model.Clientes;
import model.ClientesDao;
import views.SystemView;

public class ClientesController implements ActionListener, MouseListener, KeyListener {
    
    private Clientes clientes;
    private ClientesDao clientesDao;
    private SystemView views;
    DefaultTableModel model = new DefaultTableModel();
    
    public ClientesController(Clientes clientes, ClientesDao clientesDao, SystemView views) {
        this.clientes = clientes;
        this.clientesDao = clientesDao;
        this.views = views;
        //Boton de registrar clientes
        this.views.btn_Registro_Cliente.addActionListener(this);
        this.views.tabla_Clientes.addMouseListener(this);
        //Buscar cliente
        this.views.txt_Buscar_Cliente.addKeyListener(this);
        //Boton de modificar clientes 
        this.views.btn_Modificar_Cliente.addActionListener(this);
        //Boton eliminar clientes 
        this.views.btn_Eliminar_Cliente.addActionListener(this);
        //Boton de cancelar 
        this.views.btn_Cancelar_Cliente.addActionListener(this);
        //Para redirigir este menu de navegacion, con el menu lateral 
        this.views.jLabelClientes.addMouseListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btn_Registro_Cliente) {
            //Verifiacr si los campos estan vacios 
            if (views.txt_ID_Cliente.getText().equals("") || views.txt_Nombre_Cliente.getText().equals("") || views.txt_direc_Cliente.getText().equals("")
                    || views.txt_telefono_Cliente.getText().equals("") || views.txt_correo_Cliente.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
                
            } else {
                clientes.setId_Clientes(Integer.parseInt(views.txt_ID_Cliente.getText().trim()));
                clientes.setNombre(views.txt_Nombre_Cliente.getText().trim());
                clientes.setDireccion(views.txt_direc_Cliente.getText().trim());
                clientes.setTelefono(views.txt_telefono_Cliente.getText().trim());
                clientes.setEmail(views.txt_correo_Cliente.getText().trim());
                
                if (clientesDao.registerClienteQuery(clientes)) {
                    limpiarTabla();
                    listarTodos_Clientes();
                    JOptionPane.showMessageDialog(null, "Cliente registrado con exito");
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar al cliente");
                }
            }
        } else if (e.getSource() == views.btn_Modificar_Cliente) {
            if (views.txt_ID_Cliente.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecciona una fila para continuar");
            } else {
                if (views.txt_ID_Cliente.getText().equals("") || views.txt_Nombre_Cliente.getText().equals("")
                        || views.txt_direc_Cliente.getText().equals("") || views.txt_telefono_Cliente.getText().equals("") || views.txt_correo_Cliente.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
                } else {
                    clientes.setId_Clientes(Integer.parseInt(views.txt_ID_Cliente.getText().trim()));
                    clientes.setNombre(views.txt_Nombre_Cliente.getText().trim());
                    clientes.setDireccion(views.txt_direc_Cliente.getText().trim());
                    clientes.setTelefono(views.txt_telefono_Cliente.getText().trim());
                    clientes.setEmail(views.txt_correo_Cliente.getText().trim());
                    
                    if (clientesDao.ActualizarClienteQuery(clientes)) {
                        limpiarTabla();
                        limpiarCampos();
                        views.btn_Registro_Cliente.setEnabled(true);
                        JOptionPane.showMessageDialog(null, "Datos del cliente modificados con exito");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ha ocurrido un error al modificar los datos del cliente");
                        
                    }
                }
            }
        }else if(e.getSource()== views.btn_Eliminar_Cliente){
            int fila = views.tabla_Clientes.getSelectedRow();
            if (fila==-1) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar un cliente para eliminar ");
            }else{
                int id= Integer.parseInt(views.tabla_Clientes.getValueAt(fila, 0).toString());
                int question = JOptionPane.showConfirmDialog(null, "¿En realidad quiere eliminar este cliente?");
                if(question ==0 && clientesDao.eliminarClienteQuery(id)!=false ){
                    limpiarTabla();
                    limpiarCampos();
                    views.btn_Registro_Cliente.setEnabled(true);
                    listarTodos_Clientes();
                    JOptionPane.showMessageDialog(null, "cliente eliminado con exito");
                    
                }
            }
        }else if(e.getSource() == views.btn_Cancelar_Cliente){
            views.btn_Registro_Cliente.setEnabled(true);
            limpiarCampos();
        }
    }

    //Listar clientes 
    public void listarTodos_Clientes() {
        List<Clientes> list = clientesDao.listClienteQuery(views.txt_Buscar_Cliente.getText());
        model = (DefaultTableModel) views.tabla_Clientes.getModel();
        Object[] fila = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            fila[0] = list.get(i).getId_Clientes();
            fila[1] = list.get(i).getNombre();
            fila[2] = list.get(i).getDireccion();
            fila[3] = list.get(i).getTelefono();
            fila[4] = list.get(i).getEmail();
            //Agregamos todas estas filas 
            model.addRow(fila);            
        }
        views.tabla_Clientes.setModel(model);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.tabla_Clientes) {
            //el get point, nos permite saber en que cordenadas el usuario dio click
            int fila = views.tabla_Clientes.rowAtPoint(e.getPoint());
            views.txt_ID_Cliente.setText(views.tabla_Clientes.getValueAt(fila, 0).toString());
            views.txt_Nombre_Cliente.setText(views.tabla_Clientes.getValueAt(fila, 1).toString());
            views.txt_direc_Cliente.setText(views.tabla_Clientes.getValueAt(fila, 2).toString());
            views.txt_telefono_Cliente.setText(views.tabla_Clientes.getValueAt(fila, 3).toString());
            views.txt_correo_Cliente.setText(views.tabla_Clientes.getValueAt(fila, 4).toString());
            //Deshabilitar botones
            views.btn_Registro_Cliente.setEnabled(false);
            views.txt_ID_Cliente.setEnabled(false);
        }else if(e.getSource() == views.jLabelClientes){
           views.menuNavegacion.setSelectedIndex(2);
           limpiarCampos();
           limpiarTabla();
           listarTodos_Clientes();
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
        if (e.getSource() == views.txt_Buscar_Cliente) {
            //Limpiar tabla 
            limpiarTabla();
            //Listar clientes 
            listarTodos_Clientes();
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
        views.txt_ID_Cliente.setText("");
        views.txt_ID_Cliente.setEnabled(true);
        views.txt_Nombre_Cliente.setText("");
        views.txt_direc_Cliente.setText("");
        views.txt_telefono_Cliente.setText("");
        views.txt_correo_Cliente.setText("");
        
    }
}
