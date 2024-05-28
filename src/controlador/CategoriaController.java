
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
import model.CategoriaDao;
import model.Categorias;
import static model.EmpleadosDao.rol_usuario;
import views.SystemView;


public class CategoriaController implements ActionListener, MouseListener, KeyListener {
    private  Categorias categorias;
    private CategoriaDao categoriaDao;
    private SystemView view; 
    String rol = rol_usuario;
    DefaultTableModel model = new DefaultTableModel();
    

    public CategoriaController(Categorias categorias, CategoriaDao categoriaDao, SystemView view) {
        this.categorias = categorias;
        this.categoriaDao = categoriaDao;
        this.view = view;
        //boton de registrar categoria 
        this.view.btn_registrar_Categoria.addActionListener(this);
        
        this.view.tabla_Categoria.addMouseListener(this);
        //buscar categoria 
        this.view.txtBuscar_Categorias.addKeyListener(this);
        //boton modificar categoria 
        this.view.btn_modificar_Categoria.addActionListener(this);
        //boton de eliminar categoria 
        this.view.btn_eliminar_Categoria.addActionListener(this);
        //boton cancelar categoria
        this.view.btn_cancelarCategoria.addActionListener(this);
        //Para el menu de navegacion
        this.view.menuNavegacion.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btn_registrar_Categoria) {
            //miramos si los cambos estan vacios 
            if(view.txt_nombre_Categoria.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Todos los camós son obligatorios");
            }else{
                categorias.setNombre(view.txt_nombre_Categoria.getText().trim());
                if (categoriaDao.registerCategoriaQuery(categorias)) {
                    limpiarTabla();
                    limpiarCampos();
                    listarTodoCategorias();
                    JOptionPane.showMessageDialog(null, "Categoria registrada con exito");   
                }else{
                    JOptionPane.showConfirmDialog(null, "Ha ocurrido un error al registrar la categoria");
                }
            }
        }else if (e.getSource()==view.btn_modificar_Categoria) {
            //miramos si los campos estan vacios 
            if (view.txt_ID_Categoria.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecciona una fila para continuar");
            }else{
                if (view.txt_ID_Categoria.getText().equals("")
                        || view.txt_nombre_Categoria.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");

                }else{
                    //realizamos la modificacion, le enviamos por medio de los selects la informacion
                    categorias.setId_categoria(Integer.parseInt(view.txt_ID_Categoria.getText()));
                    categorias.setNombre(view.txt_nombre_Categoria.getText().trim());
                    if (categoriaDao.ActualizarCategoriaQuery(categorias)) {
                      limpiarTabla();
                      limpiarCampos();
                      view.btn_registrar_Categoria.setEnabled(true);
                      listarTodoCategorias();
                      JOptionPane.showMessageDialog(null, "Datos modificados con exito");
                    }
                }
            }
        }else if (e.getSource()== view.btn_eliminar_Categoria) {
            int row = view.tabla_Categoria.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una categoria para eliminar");
            }else{
                int id= Integer.parseInt(view.tabla_Categoria.getValueAt(row, 0).toString());
                int question = JOptionPane.showConfirmDialog(null, "¿En realidad quiere eliminar esta categoria?");
                if (question ==0 && categoriaDao.eliminarCategoriaQuery(id)!=false) {
                    limpiarTabla();
                    limpiarCampos();
                    view.btn_registrar_Categoria.setEnabled(true);
                    listarTodoCategorias();
                    JOptionPane.showMessageDialog(null, "Categoria eliminada con exito" );
                    
                }
            }
        }else if (e.getSource() == view.btn_cancelarCategoria) {
          limpiarCampos();
          view.btn_registrar_Categoria.setEnabled(true);
          
        }
    }
    // listar categorias
    public void listarTodoCategorias(){
        if(rol.equals("Administrador")){
       List <Categorias> list = categoriaDao.listCategoriaQuery(view.txtBuscar_Categorias.getText());
       model = (DefaultTableModel) view.tabla_Categoria.getModel();
       Object[] row = new Object[2];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId_categoria();
            row[1] = list.get(i).getNombre();
            model.addRow(row);
        }
        view.tabla_Categoria.setModel(model);
    }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == view.tabla_Categoria) {
            int row = view.tabla_Categoria.rowAtPoint(e.getPoint());
            view.txt_ID_Categoria.setText(view.tabla_Categoria.getValueAt(row, 0).toString());
            view.txt_nombre_Categoria.setText(view.tabla_Categoria.getValueAt(row, 1).toString());
            view.btn_registrar_Categoria.setEnabled(false);
        }else if (e.getSource() == view.menuNavegacion) {
            if (rol.equals("Administrador")) {
                view.menuNavegacion.setSelectedIndex(4);
                limpiarTabla();
                limpiarCampos();
                listarTodoCategorias();     
            }else {
                view.menuNavegacion.setEnabledAt(4, false); 
                view.jLabelCategories.setEnabled(false);
                JOptionPane.showMessageDialog(null, "No tienes privilegios de administrador");
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
        if (e.getSource() == view.txtBuscar_Categorias) {
            //limpiar tabla 
            limpiarTabla();
            listarTodoCategorias();
            
        }
    }
    public void limpiarTabla(){
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i-1;
        }
    }
    public  void limpiarCampos(){
        view.txt_ID_Categoria.setText("");
        view.txt_nombre_Categoria.setText("");
    }
    
}
