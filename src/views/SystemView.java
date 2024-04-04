
package views;

import controlador.Controller;

public class SystemView extends javax.swing.JFrame {

    public SystemView() {
        initComponents();
        //tamaño de la ventana 
        setSize(1208,680);
        //Para que el usuario no pueda agrandar ni modificar la ventana 
        setResizable(false);
        //Panel de administracion 
        setTitle("Ponel de administracion");
        //Para que quede centrado
        setLocationRelativeTo(null);
        
        //instanciamos el controlador 
        Controller controler = new Controller(this);
        //Para mostra los cambios realizados 
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelProduct = new javax.swing.JPanel();
        jLabelProduct = new javax.swing.JLabel();
        jPanelPurchases = new javax.swing.JPanel();
        jLabelPurchases = new javax.swing.JLabel();
        jPanelCustomers = new javax.swing.JPanel();
        jLabelCustomers = new javax.swing.JLabel();
        jPanelEmployers = new javax.swing.JPanel();
        jLabelEmployers = new javax.swing.JLabel();
        jPanelSuppliers = new javax.swing.JPanel();
        jLabelSuppliers = new javax.swing.JLabel();
        jPanelCategories = new javax.swing.JPanel();
        jLabelCategories = new javax.swing.JLabel();
        jPanelReports = new javax.swing.JPanel();
        jLabelReports = new javax.swing.JLabel();
        jPanelSettings = new javax.swing.JPanel();
        jLabelSettings = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_photo = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(18, 45, 61));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelProduct.setBackground(new java.awt.Color(255, 255, 255));

        jLabelProduct.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabelProduct.setForeground(new java.awt.Color(0, 0, 0));
        jLabelProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/producto.png"))); // NOI18N
        jLabelProduct.setText("  Productos");

        javax.swing.GroupLayout jPanelProductLayout = new javax.swing.GroupLayout(jPanelProduct);
        jPanelProduct.setLayout(jPanelProductLayout);
        jPanelProductLayout.setHorizontalGroup(
            jPanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelProduct)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanelProductLayout.setVerticalGroup(
            jPanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductLayout.createSequentialGroup()
                .addComponent(jLabelProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 35));

        jPanelPurchases.setBackground(new java.awt.Color(255, 255, 255));

        jLabelPurchases.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabelPurchases.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPurchases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compras.png"))); // NOI18N
        jLabelPurchases.setText("Compras");

        javax.swing.GroupLayout jPanelPurchasesLayout = new javax.swing.GroupLayout(jPanelPurchases);
        jPanelPurchases.setLayout(jPanelPurchasesLayout);
        jPanelPurchasesLayout.setHorizontalGroup(
            jPanelPurchasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPurchasesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelPurchases)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanelPurchasesLayout.setVerticalGroup(
            jPanelPurchasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPurchasesLayout.createSequentialGroup()
                .addComponent(jLabelPurchases)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelPurchases, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 35));

        jPanelCustomers.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCustomers.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabelCustomers.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes.png"))); // NOI18N
        jLabelCustomers.setText(" Clientes");

        javax.swing.GroupLayout jPanelCustomersLayout = new javax.swing.GroupLayout(jPanelCustomers);
        jPanelCustomers.setLayout(jPanelCustomersLayout);
        jPanelCustomersLayout.setHorizontalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomersLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelCustomers)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanelCustomersLayout.setVerticalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomersLayout.createSequentialGroup()
                .addComponent(jLabelCustomers)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 35));

        jPanelEmployers.setBackground(new java.awt.Color(255, 255, 255));

        jLabelEmployers.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabelEmployers.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEmployers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleados.png"))); // NOI18N
        jLabelEmployers.setText("  Empleados");

        javax.swing.GroupLayout jPanelEmployersLayout = new javax.swing.GroupLayout(jPanelEmployers);
        jPanelEmployers.setLayout(jPanelEmployersLayout);
        jPanelEmployersLayout.setHorizontalGroup(
            jPanelEmployersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmployersLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelEmployers)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanelEmployersLayout.setVerticalGroup(
            jPanelEmployersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmployersLayout.createSequentialGroup()
                .addComponent(jLabelEmployers)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelEmployers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 200, 35));

        jPanelSuppliers.setBackground(new java.awt.Color(255, 255, 255));

        jLabelSuppliers.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabelSuppliers.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSuppliers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/provedores.png"))); // NOI18N
        jLabelSuppliers.setText("  Proveedores");

        javax.swing.GroupLayout jPanelSuppliersLayout = new javax.swing.GroupLayout(jPanelSuppliers);
        jPanelSuppliers.setLayout(jPanelSuppliersLayout);
        jPanelSuppliersLayout.setHorizontalGroup(
            jPanelSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuppliersLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelSuppliers)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanelSuppliersLayout.setVerticalGroup(
            jPanelSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuppliersLayout.createSequentialGroup()
                .addComponent(jLabelSuppliers)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelSuppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 35));

        jPanelCategories.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCategories.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabelCategories.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCategories.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/categoria.png"))); // NOI18N
        jLabelCategories.setText("  Categoria");

        javax.swing.GroupLayout jPanelCategoriesLayout = new javax.swing.GroupLayout(jPanelCategories);
        jPanelCategories.setLayout(jPanelCategoriesLayout);
        jPanelCategoriesLayout.setHorizontalGroup(
            jPanelCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCategoriesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelCategories, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanelCategoriesLayout.setVerticalGroup(
            jPanelCategoriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCategoriesLayout.createSequentialGroup()
                .addComponent(jLabelCategories)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelCategories, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 200, 35));

        jPanelReports.setBackground(new java.awt.Color(255, 255, 255));

        jLabelReports.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabelReports.setForeground(new java.awt.Color(0, 0, 0));
        jLabelReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes.png"))); // NOI18N
        jLabelReports.setText("  Reportes");

        javax.swing.GroupLayout jPanelReportsLayout = new javax.swing.GroupLayout(jPanelReports);
        jPanelReports.setLayout(jPanelReportsLayout);
        jPanelReportsLayout.setHorizontalGroup(
            jPanelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReportsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelReports)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanelReportsLayout.setVerticalGroup(
            jPanelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReportsLayout.createSequentialGroup()
                .addComponent(jLabelReports)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 200, 35));

        jPanelSettings.setBackground(new java.awt.Color(255, 255, 255));

        jLabelSettings.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabelSettings.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N
        jLabelSettings.setText("  Configuracines ");

        javax.swing.GroupLayout jPanelSettingsLayout = new javax.swing.GroupLayout(jPanelSettings);
        jPanelSettings.setLayout(jPanelSettingsLayout);
        jPanelSettingsLayout.setHorizontalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSettingsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelSettings)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSettingsLayout.setVerticalGroup(
            jPanelSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSettingsLayout.createSequentialGroup()
                .addComponent(jLabelSettings)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 200, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 580));

        jPanel2.setBackground(new java.awt.Color(18, 45, 61));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Javanese Text", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ARMONÍA FARMACÉUTICA ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        btn_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N
        jPanel2.add(btn_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 80, 80));

        btn_salir.setBackground(new java.awt.Color(255, 255, 255));
        btn_salir.setFont(new java.awt.Font("Javanese Text", 1, 19)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(0, 0, 0));
        btn_salir.setText("Salir");
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel2.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 110, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1030, 100));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoF.jpg"))); // NOI18N
        jPanel3.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 200, 110));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel5);
        jTabbedPane1.addTab("tab3", jTabbedPane2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab5", jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab6", jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab7", jPanel9);

        jPanel10.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab8", jPanel10);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 1010, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SystemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btn_photo;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabelCategories;
    public javax.swing.JLabel jLabelCustomers;
    public javax.swing.JLabel jLabelEmployers;
    public javax.swing.JLabel jLabelProduct;
    public javax.swing.JLabel jLabelPurchases;
    public javax.swing.JLabel jLabelReports;
    public javax.swing.JLabel jLabelSettings;
    public javax.swing.JLabel jLabelSuppliers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JPanel jPanelCategories;
    public javax.swing.JPanel jPanelCustomers;
    public javax.swing.JPanel jPanelEmployers;
    public javax.swing.JPanel jPanelProduct;
    public javax.swing.JPanel jPanelPurchases;
    public javax.swing.JPanel jPanelReports;
    public javax.swing.JPanel jPanelSettings;
    public javax.swing.JPanel jPanelSuppliers;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
