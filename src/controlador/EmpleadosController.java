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
import model.Empleados;
import model.EmpleadosDao;
import static model.EmpleadosDao.id_empleados;
import views.SystemView;
import static model.EmpleadosDao.rol_usuario;

public class EmpleadosController implements ActionListener, MouseListener, KeyListener {
    //encapsulamos las variables 

    private Empleados empleados;
    private EmpleadosDao empleadosDao;
    private SystemView views;
    //Rol
    String rol = rol_usuario;
    DefaultTableModel model = new DefaultTableModel();

    public EmpleadosController(Empleados empleados, EmpleadosDao empleadosDao, SystemView views) {
        this.empleados = empleados;
        this.empleadosDao = empleadosDao;
        this.views = views;
        //boton de registrar empleado 
        this.views.btn_registro_Empleado.addActionListener(this);
        //boton de modificar empleado 
        this.views.btn_modificar_Empleado.addActionListener(this);
        //boton de eliminar empleado
        this.views.btn_eliminar_Empleado.addActionListener(this);
        //Boton de cancelar 
        this.views.btn_cancelar_Empleado.addActionListener(this);
        //Boton modificar perfil 
        this.views.btn_modificar_Perfil.addActionListener(this);
        //panel de navegacion lateral, para empleados
        this.views.jLabelEmployers.addMouseListener(this);
        this.views.tabla_Empleados.addMouseListener(this);
        this.views.txt_buscar_Empleado.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btn_registro_Empleado) {
            //Registrar empleado
            //verificar si los campos estan vacios 
            if (views.txt_ID_Empleado.getText().equals("") || views.txt_nombre_Empleado.getText().equals("")
                    || views.txt_nombreUsuario_Empleado.getText().equals("") || views.txt_direc_Empleado.getText().equals("")
                    || views.txt_telefono_Empleado.getText().equals("") || views.txt_correo_Empleado.getText().equals("")
                    || views.cmb_Rol.getSelectedItem().toString().equals("") || String.valueOf(views.txt_contra_Empleado.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");

            } else {
                //si no lo estan insertar datos 
                empleados.setId_empleados(Integer.parseInt(views.txt_ID_Empleado.getText().trim()));
                empleados.setNombreCompleto(views.txt_nombre_Empleado.getText().trim());
                empleados.setNombreUsuario(views.txt_nombreUsuario_Empleado.getText().trim());
                empleados.setDireccion(views.txt_direc_Empleado.getText().trim());
                empleados.setTelefono(views.txt_telefono_Empleado.getText().trim());
                empleados.setEmail(views.txt_correo_Empleado.getText().trim());
                empleados.setRol(views.cmb_Rol.getSelectedItem().toString());
                empleados.setPassword(String.valueOf(views.txt_contra_Empleado.getPassword()));

                if (empleadosDao.registerEmpleadoQuery(empleados)) {
                    limpiarTabla();
                    limpiarCampos();
                    listarTodosEmpleados();
                    JOptionPane.showMessageDialog(null, "Empleados registrado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar al empleado");
                }
            }//Modificar empleado 
        } else if (e.getSource() == views.btn_modificar_Empleado) {
            if (views.txt_ID_Empleado.equals("")) {
                JOptionPane.showMessageDialog(null, "selecciona una fila para continuar");
            } else {
                //verificar si los campos estan vacios 
                if (views.txt_ID_Empleado.getText().equals("") || views.txt_nombre_Empleado.getText().equals("") || views.cmb_Rol.getSelectedItem().toString().equals("")) {
                    JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
                } else {
                    empleados.setId_empleados(Integer.parseInt(views.txt_ID_Empleado.getText().trim()));
                    empleados.setNombreCompleto(views.txt_nombre_Empleado.getText().trim());
                    empleados.setNombreUsuario(views.txt_nombreUsuario_Empleado.getText().trim());
                    empleados.setDireccion(views.txt_direc_Empleado.getText().trim());
                    empleados.setTelefono(views.txt_telefono_Empleado.getText().trim());
                    empleados.setEmail(views.txt_correo_Empleado.getText().trim());
                    empleados.setRol(views.cmb_Rol.getSelectedItem().toString());
                    empleados.setPassword(String.valueOf(views.txt_contra_Empleado.getPassword()));
                    if (empleadosDao.ActualizarEmpleadoQuery(empleados)) {
                        limpiarTabla();
                        limpiarCampos();
                        listarTodosEmpleados();
                        views.btn_registro_Empleado.setEnabled(true);
                        JOptionPane.showMessageDialog(null, "Datos del empleado modificados son exito");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ha ocurrido un error al modificar al empleado");

                    }
                }
            }
            //eliminar empleado
        } else if (e.getSource() == views.btn_eliminar_Empleado) {
            int row = views.tabla_Empleados.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar un empleado para eliminar");
            } else if (views.tabla_Empleados.getValueAt(row, 0).equals(id_empleados)) {
                JOptionPane.showMessageDialog(null, "No puede eliminar al usuario");
            } else {
                int id = Integer.parseInt(views.tabla_Empleados.getValueAt(row, 0).toString());
                int question = JOptionPane.showConfirmDialog(null, "¿En realizada quiere eliminar este empleado?");

                if (question == 0 && empleadosDao.eliminarEmpleadoQuery(id) != false) {
                    limpiarTabla();
                    limpiarCampos();
                    views.btn_registro_Empleado.setEnabled(true);
                    views.txt_contra_Empleado.setEnabled(true);
                    listarTodosEmpleados();
                    JOptionPane.showMessageDialog(null, "Empleado eliminado con exito");

                }
            }

        } else if (e.getSource() == views.btn_cancelar_Empleado) {
            limpiarCampos();
            views.btn_registro_Empleado.setEnabled(true);
            views.txt_contra_Empleado.setEnabled(true);
            views.txt_ID_Empleado.setEnabled(true);

        } else if (e.getSource() == views.btn_modificar_Perfil) {
            // Cambiar contraseña
            // Recolectamos la información de la caja contraseña
            String password = String.valueOf(views.txt_NuevaContra_Perfil.getPassword());
            String confirm_password = String.valueOf(views.txt_ConfirmContra_Perfil.getPassword());

            // Verificar si las cajas de texto están vacías 
            if (!password.equals("") && !confirm_password.equals("")) {
                // Verificamos que las contraseñas sean iguales 
                if (password.equals(confirm_password)) {
                    empleados.setPassword(String.valueOf(views.txt_NuevaContra_Perfil.getPassword()));
                    if (empleadosDao.actualizarContraEmpleado(empleados) != false) {
                        JOptionPane.showMessageDialog(null, "Contraseña modificada con éxito");
                    } else {
                        JOptionPane.showMessageDialog(null, "Ha ocurrido un error al modificar la contraseña");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            }
        }
    }

    //Listar todos los emepleados 
    public void listarTodosEmpleados() {
        System.out.println("Listar todos los empleados iniciado...");
        if (rol.equals("Administrador")) {
            System.out.println("Rol del usuario: Administrador");
            List<Empleados> list = empleadosDao.listEmpleadosQuery(views.txt_buscar_Empleado.getText());
            if (list.isEmpty()) {
                System.out.println("La lista de empleados está vacía.");
            } else {
                System.out.println("Número de empleados en la lista: " + list.size());
            }
            model = (DefaultTableModel) views.tabla_Empleados.getModel();
            Object[] row = new Object[7];
            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getId_empleados();
                row[1] = list.get(i).getNombreCompleto();
                row[2] = list.get(i).getNombreUsuario();
                row[3] = list.get(i).getDireccion();
                row[4] = list.get(i).getTelefono();
                row[5] = list.get(i).getEmail();
                row[6] = list.get(i).getRol();
                model.addRow(row);
            }
        } else {
            System.out.println("Rol del usuario: No es Administrador");
        }
        System.out.println("Listar todos los empleados completado.");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.tabla_Empleados) {
            int row = views.tabla_Empleados.rowAtPoint(e.getPoint());

            views.txt_ID_Empleado.setText(views.tabla_Empleados.getValueAt(row, 0).toString());
            views.txt_nombre_Empleado.setText(views.tabla_Empleados.getValueAt(row, 1).toString());
            views.txt_nombreUsuario_Empleado.setText(views.tabla_Empleados.getValueAt(row, 2).toString());
            views.txt_direc_Empleado.setText(views.tabla_Empleados.getValueAt(row, 3).toString());
            views.txt_telefono_Empleado.setText(views.tabla_Empleados.getValueAt(row, 4).toString());
            views.txt_correo_Empleado.setText(views.tabla_Empleados.getValueAt(row, 5).toString());
            views.cmb_Rol.setSelectedItem(views.tabla_Empleados.getValueAt(row, 6).toString());
            //deshabilitar 
            views.txt_ID_Empleado.setEnabled(false);
            views.txt_contra_Empleado.setEnabled(false);
            views.btn_registro_Empleado.setEnabled(false);

        } else if (e.getSource() == views.jLabelEmployers) {
            if (rol.equals("Administrador")) {
                views.menuNavegacion.setSelectedIndex(3);//colocamos la posicion de la pestaña 
                limpiarTabla();
                limpiarTabla();
                listarTodosEmpleados();
            } else {
                views.menuNavegacion.setEnabledAt(3, false);//si no es administrador, deshabilitamos la pestaña 
                views.jLabelEmployers.setEnabled(false);
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
        if (e.getSource() == views.txt_buscar_Empleado) {
            limpiarTabla();
            listarTodosEmpleados();
        }
    }

    public void limpiarCampos() {
        //Coloca los campos vacios 
        views.txt_ID_Empleado.setText("");
        views.txt_ID_Empleado.setEnabled(true);
        views.txt_nombre_Empleado.setText("");
        views.txt_nombreUsuario_Empleado.setText("");
        views.txt_direc_Empleado.setText("");
        views.txt_telefono_Empleado.setText("");
        views.txt_correo_Empleado.setText("");
        views.txt_contra_Empleado.setText("");
        views.cmb_Rol.setSelectedIndex(0);

    }

    public void limpiarTabla() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

}
