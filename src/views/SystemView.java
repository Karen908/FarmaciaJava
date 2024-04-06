
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
        jPanel11 = new javax.swing.JPanel();
        jLabelCodigoP = new javax.swing.JLabel();
        jLabelNombreP = new javax.swing.JLabel();
        jLabelPrecioV = new javax.swing.JLabel();
        jLabelProducto_ID = new javax.swing.JLabel();
        jLabelDescripcionP = new javax.swing.JLabel();
        jLabelCategoria = new javax.swing.JLabel();
        txt_NombreP = new javax.swing.JTextField();
        txt_CodigoP = new javax.swing.JTextField();
        txt_PrecioV = new javax.swing.JTextField();
        txt_ProductoID = new javax.swing.JTextField();
        txt_DescripcionP = new javax.swing.JTextField();
        cmb_Categoria = new javax.swing.JComboBox<>();
        btn_actualizarP = new javax.swing.JButton();
        btn_eliminarP = new javax.swing.JButton();
        btn_cancelarP = new javax.swing.JButton();
        btn_RegistroP = new javax.swing.JButton();
        jLabelBuscarP = new javax.swing.JLabel();
        txt_BuscarP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        product_tabla = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_CodigoCompra = new javax.swing.JTextField();
        txt_Precio_Compra = new javax.swing.JTextField();
        txt_ID_Compra = new javax.swing.JTextField();
        txt_Nombre_Compra = new javax.swing.JTextField();
        txt_Cantidad_Compra = new javax.swing.JTextField();
        txt_Pagar_Compra = new javax.swing.JTextField();
        txtSubtotal_Compra = new javax.swing.JTextField();
        cmb_Proveedor_Compra = new javax.swing.JComboBox<>();
        btnRemover_Compra = new javax.swing.JButton();
        btn_agregar_Compra = new javax.swing.JButton();
        btn_Confirmar_Compra = new javax.swing.JButton();
        btn_NuevaCompra = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Campras_Tabla = new javax.swing.JTable();
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

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Javanese Text", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabelCodigoP.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabelCodigoP.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCodigoP.setText("Codigo:");

        jLabelNombreP.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabelNombreP.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombreP.setText("Nombre:");

        jLabelPrecioV.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabelPrecioV.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPrecioV.setText("Precio de venta: ");

        jLabelProducto_ID.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabelProducto_ID.setForeground(new java.awt.Color(0, 0, 0));
        jLabelProducto_ID.setText("ID producto: ");

        jLabelDescripcionP.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabelDescripcionP.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDescripcionP.setText("Descripcion: ");

        jLabelCategoria.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabelCategoria.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCategoria.setText("Categoria: ");

        txt_NombreP.setBackground(java.awt.Color.white);
        txt_NombreP.setForeground(new java.awt.Color(0, 0, 0));

        txt_CodigoP.setBackground(java.awt.Color.white);
        txt_CodigoP.setForeground(new java.awt.Color(0, 0, 0));
        txt_CodigoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CodigoPActionPerformed(evt);
            }
        });

        txt_PrecioV.setBackground(java.awt.Color.white);
        txt_PrecioV.setForeground(new java.awt.Color(0, 0, 0));
        txt_PrecioV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PrecioVActionPerformed(evt);
            }
        });

        txt_ProductoID.setEditable(false);
        txt_ProductoID.setBackground(java.awt.Color.white);
        txt_ProductoID.setForeground(new java.awt.Color(0, 0, 0));
        txt_ProductoID.setText("jTextField1");
        txt_ProductoID.setEnabled(false);
        txt_ProductoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ProductoIDActionPerformed(evt);
            }
        });

        txt_DescripcionP.setBackground(java.awt.Color.white);
        txt_DescripcionP.setForeground(new java.awt.Color(0, 0, 0));
        txt_DescripcionP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DescripcionPActionPerformed(evt);
            }
        });

        cmb_Categoria.setBackground(java.awt.Color.white);
        cmb_Categoria.setForeground(new java.awt.Color(0, 0, 0));
        cmb_Categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_CategoriaActionPerformed(evt);
            }
        });

        btn_actualizarP.setBackground(new java.awt.Color(0, 102, 102));
        btn_actualizarP.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_actualizarP.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizarP.setText("Modificar");

        btn_eliminarP.setBackground(new java.awt.Color(0, 102, 102));
        btn_eliminarP.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_eliminarP.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminarP.setText("Eliminar ");
        btn_eliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarPActionPerformed(evt);
            }
        });

        btn_cancelarP.setBackground(new java.awt.Color(0, 102, 102));
        btn_cancelarP.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_cancelarP.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelarP.setText("Cancelar");

        btn_RegistroP.setBackground(new java.awt.Color(0, 102, 102));
        btn_RegistroP.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_RegistroP.setForeground(new java.awt.Color(255, 255, 255));
        btn_RegistroP.setText("Registrar");
        btn_RegistroP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistroPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabelPrecioV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_PrecioV))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabelCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_CodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabelNombreP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_NombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabelDescripcionP, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txt_DescripcionP, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btn_RegistroP, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabelProducto_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ProductoID, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmb_Categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_cancelarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_actualizarP, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(btn_eliminarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(39, 39, 39))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigoP)
                    .addComponent(jLabelDescripcionP)
                    .addComponent(txt_CodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DescripcionP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_RegistroP, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombreP, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCategoria)
                        .addComponent(txt_NombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmb_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_actualizarP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPrecioV)
                        .addComponent(txt_PrecioV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelProducto_ID)
                        .addComponent(txt_ProductoID)
                        .addComponent(btn_eliminarP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cancelarP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 920, 270));

        jLabelBuscarP.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabelBuscarP.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBuscarP.setText("Buscar producto: ");
        jPanel4.add(jLabelBuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        txt_BuscarP.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(txt_BuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 190, -1));

        product_tabla.setBackground(new java.awt.Color(255, 255, 255));
        product_tabla.setFont(new java.awt.Font("Javanese Text", 1, 12)); // NOI18N
        product_tabla.setForeground(new java.awt.Color(0, 0, 0));
        product_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID del producto", "Codigo", "Nombre", "Descripcion", "Precio de venta ", "Cantidad", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(product_tabla);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 920, 110));

        jTabbedPane1.addTab("Productos", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Javanese Text", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cantidad:");

        jLabel3.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Codigo del producto: ");

        jLabel4.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre del producto:");

        jLabel5.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Proveedor:");

        jLabel6.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Total a pagar:");

        jLabel7.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ID:");

        jLabel8.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Precio de compra: ");

        jLabel9.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Subtotal:");

        txt_CodigoCompra.setBackground(new java.awt.Color(255, 255, 255));
        txt_CodigoCompra.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        txt_CodigoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CodigoCompraActionPerformed(evt);
            }
        });

        txt_Precio_Compra.setBackground(new java.awt.Color(255, 255, 255));
        txt_Precio_Compra.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        txt_Precio_Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Precio_CompraActionPerformed(evt);
            }
        });

        txt_ID_Compra.setEditable(false);
        txt_ID_Compra.setBackground(new java.awt.Color(255, 255, 255));
        txt_ID_Compra.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        txt_ID_Compra.setEnabled(false);
        txt_ID_Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_CompraActionPerformed(evt);
            }
        });

        txt_Nombre_Compra.setBackground(new java.awt.Color(255, 255, 255));
        txt_Nombre_Compra.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        txt_Nombre_Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nombre_CompraActionPerformed(evt);
            }
        });

        txt_Cantidad_Compra.setBackground(new java.awt.Color(255, 255, 255));
        txt_Cantidad_Compra.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        txt_Cantidad_Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Cantidad_CompraActionPerformed(evt);
            }
        });

        txt_Pagar_Compra.setEditable(false);
        txt_Pagar_Compra.setBackground(new java.awt.Color(255, 255, 255));
        txt_Pagar_Compra.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        txt_Pagar_Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Pagar_CompraActionPerformed(evt);
            }
        });

        txtSubtotal_Compra.setEditable(false);
        txtSubtotal_Compra.setBackground(new java.awt.Color(255, 255, 255));
        txtSubtotal_Compra.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        txtSubtotal_Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubtotal_CompraActionPerformed(evt);
            }
        });

        cmb_Proveedor_Compra.setBackground(new java.awt.Color(255, 255, 255));
        cmb_Proveedor_Compra.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        cmb_Proveedor_Compra.setForeground(new java.awt.Color(0, 0, 0));
        cmb_Proveedor_Compra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnRemover_Compra.setBackground(new java.awt.Color(0, 102, 102));
        btnRemover_Compra.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btnRemover_Compra.setForeground(new java.awt.Color(255, 255, 255));
        btnRemover_Compra.setText("Eliminar");

        btn_agregar_Compra.setBackground(new java.awt.Color(0, 102, 102));
        btn_agregar_Compra.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_agregar_Compra.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar_Compra.setText("Agregar");
        btn_agregar_Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_CompraActionPerformed(evt);
            }
        });

        btn_Confirmar_Compra.setBackground(new java.awt.Color(0, 102, 102));
        btn_Confirmar_Compra.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_Confirmar_Compra.setForeground(new java.awt.Color(255, 255, 255));
        btn_Confirmar_Compra.setText("Comprar");

        btn_NuevaCompra.setBackground(new java.awt.Color(0, 102, 102));
        btn_NuevaCompra.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_NuevaCompra.setForeground(new java.awt.Color(255, 255, 255));
        btn_NuevaCompra.setText("Nuevo");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Cantidad_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Nombre_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_Proveedor_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_CodigoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_Pagar_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_ID_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSubtotal_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Precio_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_agregar_Compra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Confirmar_Compra, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(btnRemover_Compra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_NuevaCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_CodigoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_Precio_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregar_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Nombre_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtSubtotal_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Confirmar_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Cantidad_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_ID_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRemover_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmb_Proveedor_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txt_Pagar_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_NuevaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(273, 273, 273))
        );

        jPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 940, 310));

        Campras_Tabla.setBackground(new java.awt.Color(255, 255, 255));
        Campras_Tabla.setFont(new java.awt.Font("Javanese Text", 1, 12)); // NOI18N
        Campras_Tabla.setForeground(new java.awt.Color(0, 0, 0));
        Campras_Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Compra", "Nombre de producto", "Cantidad", "Precio", "Subtotal", "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Campras_Tabla);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 940, 100));

        jTabbedPane1.addTab("Compras", jPanel5);
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

    private void txt_ProductoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ProductoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ProductoIDActionPerformed

    private void txt_PrecioVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PrecioVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PrecioVActionPerformed

    private void btn_RegistroPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistroPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RegistroPActionPerformed

    private void btn_eliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarPActionPerformed

    private void txt_CodigoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CodigoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CodigoPActionPerformed

    private void txt_DescripcionPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DescripcionPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DescripcionPActionPerformed

    private void cmb_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_CategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_CategoriaActionPerformed

    private void txt_CodigoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CodigoCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CodigoCompraActionPerformed

    private void txt_Precio_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Precio_CompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Precio_CompraActionPerformed

    private void txt_ID_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_CompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_CompraActionPerformed

    private void txt_Nombre_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nombre_CompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nombre_CompraActionPerformed

    private void txt_Cantidad_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Cantidad_CompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Cantidad_CompraActionPerformed

    private void txt_Pagar_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Pagar_CompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Pagar_CompraActionPerformed

    private void txtSubtotal_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubtotal_CompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtotal_CompraActionPerformed

    private void btn_agregar_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_CompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_agregar_CompraActionPerformed

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
    private javax.swing.JTable Campras_Tabla;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnRemover_Compra;
    private javax.swing.JButton btn_Confirmar_Compra;
    private javax.swing.JButton btn_NuevaCompra;
    private javax.swing.JButton btn_RegistroP;
    private javax.swing.JButton btn_actualizarP;
    private javax.swing.JButton btn_agregar_Compra;
    private javax.swing.JButton btn_cancelarP;
    private javax.swing.JButton btn_eliminarP;
    private javax.swing.JButton btn_photo;
    private javax.swing.JButton btn_salir;
    public javax.swing.JComboBox<Object> cmb_Categoria;
    private javax.swing.JComboBox<String> cmb_Proveedor_Compra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBuscarP;
    private javax.swing.JLabel jLabelCategoria;
    public javax.swing.JLabel jLabelCategories;
    private javax.swing.JLabel jLabelCodigoP;
    public javax.swing.JLabel jLabelCustomers;
    private javax.swing.JLabel jLabelDescripcionP;
    public javax.swing.JLabel jLabelEmployers;
    private javax.swing.JLabel jLabelNombreP;
    private javax.swing.JLabel jLabelPrecioV;
    public javax.swing.JLabel jLabelProduct;
    private javax.swing.JLabel jLabelProducto_ID;
    public javax.swing.JLabel jLabelPurchases;
    public javax.swing.JLabel jLabelReports;
    public javax.swing.JLabel jLabelSettings;
    public javax.swing.JLabel jLabelSuppliers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    public javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    public javax.swing.JTable product_tabla;
    private javax.swing.JTextField txtSubtotal_Compra;
    public javax.swing.JTextField txt_BuscarP;
    private javax.swing.JTextField txt_Cantidad_Compra;
    private javax.swing.JTextField txt_CodigoCompra;
    public javax.swing.JTextField txt_CodigoP;
    public javax.swing.JTextField txt_DescripcionP;
    private javax.swing.JTextField txt_ID_Compra;
    public javax.swing.JTextField txt_NombreP;
    private javax.swing.JTextField txt_Nombre_Compra;
    private javax.swing.JTextField txt_Pagar_Compra;
    public javax.swing.JTextField txt_PrecioV;
    private javax.swing.JTextField txt_Precio_Compra;
    public javax.swing.JTextField txt_ProductoID;
    // End of variables declaration//GEN-END:variables
}
