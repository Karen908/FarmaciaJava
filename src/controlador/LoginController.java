
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Empleados;
import model.EmpleadosDao;
import views.LoginView;
import views.SystemView;

public class LoginController implements ActionListener {
    //Encapsulamos las variables 
    //llamamos a una interfaz, con el implement, ActionListener, nos sirve para escuchar cuando se realiza una accion en algun elemento de la interfaz
    private Empleados empleados;
    private EmpleadosDao empleados_Dao;
    private LoginView login_view;

    public LoginController(Empleados empleados, EmpleadosDao empleados_Dao, LoginView login_view) {
        this.empleados = empleados;
        this.empleados_Dao = empleados_Dao;
        this.login_view = login_view;
        this.login_view.btn_Ingresar.addActionListener(this); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //obtenemos los datos de la vista 
        //usamos en metodo trim, para eliminar los espacios en blanco 
           System.out.println("Acción realizada: " + e.getActionCommand());

        //revisamos si el usuario hizo click en el botton ingresar
       
        if(e.getSource()==login_view.btn_Ingresar){
             String nombreUsuario = login_view.txf_Usuario.getText().trim();
        String password = String.valueOf(login_view.txt_Contrasena.getPassword());
        System.out.println("Nombre de usuario: " + nombreUsuario);
        System.out.println("Contraseña: " + password);
            //validamos que los campos no esten vacios 
            if (!nombreUsuario.equals("")|| !password.equals("")) {
            //pasamos los parametros al metodo login 
            empleados = empleados_Dao.loginQuery(nombreUsuario, password);
            //verificamos la existencia del usuario
                if (empleados.getNombreUsuario() !=null) {
                  if(empleados.getRol().equals("Administrador")){
                      SystemView admin = new SystemView();
                      admin.setVisible(true);
                  }  else{
                      SystemView auxiliar = new SystemView();
                      auxiliar.setVisible(true);
                  }
                  this.login_view.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
                }
            
            }else{
                JOptionPane.showMessageDialog(null, "Los campos estan vacios ");
            }
        }
    }
    
}