
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Empleados;
import model.EmpleadosDao;
import static model.EmpleadosDao.rol;
import views.SystemView;

public class EmpleadosController implements ActionListener {
   //encapsulamos las variables 
    private Empleados empleados;
    private EmpleadosDao empleadosDao;
    private SystemView views;
    //Rol
    String rol_usuario =rol;

    public EmpleadosController(Empleados empleados, EmpleadosDao empleadosDao, SystemView views) {
        this.empleados = empleados;
        this.empleadosDao = empleadosDao;
        this.views = views;
        //boton de registrar empleado 
        this.views.btn_registro_Empleado.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==views.btn_registro_Empleado) {
            //verificar si los campos estan vacios 
            if (views.txt_ID_Empleado.getText().equals("") || views.txt_nombre_Empleado.getText().equals("")
                    || views.txt_user_Empleado.getText().equals("") || views.txt_direc_Empleado.getText().equals("")
                    || views.txt_telefono_Empleado.getText().equals("") || views.txt_correo_Empleado.getText().equals("")
                    || views.cmb_Rol.getSelectedItem().toString().equals("")|| String.valueOf(views.txt_contra_Empleado.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
                
            }else{
              //insertar datos 
              empleados.setId_empleados(Integer.parseInt(views.txt_ID_Empleado.getText().trim()));
              empleados.setNombreCompleto(views.txt_nombre_Empleado.getText().trim());
              empleados.setNombreUsuario(views.txt_user_Empleado.getText().trim());
              empleados.setDireccion(views.txt_direc_Empleado.getText().trim());
              empleados.setTelefono(views.txt_telefono_Empleado.getText().trim());
              empleados.setEmail(views.txt_correo_Empleado.getText().trim());
              empleados.setRol(views.cmb_Rol.getSelectedItem().toString());
              empleados.setPassword(String.valueOf(views.txt_contra_Empleado.getPassword()));
              
                if (empleadosDao.registerEmpleadoQuery(empleados)) {
                    JOptionPane.showMessageDialog(null, "Empleados registrado con exito");
                }else{
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar al empleado");
                }
            }
    
        }
    }
    
}
