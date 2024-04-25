
package views;

import controlador.LoginController;
import model.Empleados;
import model.EmpleadosDao;

public class LoginView extends javax.swing.JFrame {
    
    //instanciamos empleados 
    Empleados empleados = new Empleados();
    EmpleadosDao empleadosDao = new EmpleadosDao();
    public LoginView() {
        initComponents();
        //Llamamos al controlador del login 
        LoginController empleado_login = new LoginController(empleados, empleadosDao, this);
        //Medidas exactas que va a tener esa ventana 
        setSize(930,395);
        //Que no pueda redimencionar esa interfaz 
        setResizable(false);
        setTitle("Ingresar al sistema");
        //Para que la ventana este siempre en el centro
        setLocationRelativeTo(null);
        //Para que todos estos cambio se apliquen 
        this.repaint();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txf_Usuario = new javax.swing.JTextField();
        btn_Ingresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_Contrasena = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        img_doctor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INICIAR SESIÓN");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Contraseña: ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        txf_Usuario.setBackground(new java.awt.Color(255, 255, 255));
        txf_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_UsuarioActionPerformed(evt);
            }
        });
        jPanel3.add(txf_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 170, 30));

        btn_Ingresar.setBackground(new java.awt.Color(0, 102, 102));
        btn_Ingresar.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        btn_Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Ingresar.setText("INGRESAR");
        btn_Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, 40));

        jLabel3.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Usuario: ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        txt_Contrasena.setBackground(new java.awt.Color(255, 255, 255));
        txt_Contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ContrasenaActionPerformed(evt);
            }
        });
        jPanel3.add(txt_Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 170, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 500, 360));

        jPanel1.setBackground(new java.awt.Color(255, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img_doctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doctorN.jpg"))); // NOI18N
        jPanel1.add(img_doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -70, 580, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ContrasenaActionPerformed

    private void btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_IngresarActionPerformed

    private void txf_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_UsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Ingresar;
    private javax.swing.JLabel img_doctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField txf_Usuario;
    public javax.swing.JPasswordField txt_Contrasena;
    // End of variables declaration//GEN-END:variables
}
