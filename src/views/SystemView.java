
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
        jPanel6 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_Nombre_Cliente = new javax.swing.JTextField();
        txt_direc_Cliente = new javax.swing.JTextField();
        txt_ID_Cliente = new javax.swing.JTextField();
        txt_correo_Cliente = new javax.swing.JTextField();
        txt_telefono_Cliente = new javax.swing.JTextField();
        btn_Modificar_Cliente = new javax.swing.JButton();
        btn_Eliminar_Cliente = new javax.swing.JButton();
        btn_Cancelar_Cliente = new javax.swing.JButton();
        btn_Registro_Cliente = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txt_Buscar_Cliente = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_Clientes = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_direc_Empleado = new javax.swing.JTextField();
        txt_user_Empleado = new javax.swing.JTextField();
        txt_nombre_Empelado = new javax.swing.JTextField();
        txt_ID_Empleado = new javax.swing.JTextField();
        txt_telefono_Empleado = new javax.swing.JTextField();
        txt_correo_Empleado = new javax.swing.JTextField();
        cmb_Rol = new javax.swing.JComboBox<>();
        bnt_registro_Empleado = new javax.swing.JButton();
        txt_contra_Empleado = new javax.swing.JPasswordField();
        bnt_eliminar_Empleado = new javax.swing.JButton();
        bnt_cancelar_Empleado = new javax.swing.JButton();
        bnt_modificar_Empleado = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_buscar_Empleado = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_Empleados = new javax.swing.JTable();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();

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
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addComponent(jLabelNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47))
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addComponent(jLabelPrecioV)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabelCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_CodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_PrecioV, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_NombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelProducto_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_ProductoID, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(cmb_Categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabelDescripcionP, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_DescripcionP, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_RegistroP, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_cancelarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_actualizarP, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addComponent(btn_eliminarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(39, 39, 39))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCodigoP)
                        .addComponent(jLabelDescripcionP)
                        .addComponent(txt_CodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_DescripcionP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_RegistroP, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btn_actualizarP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminarP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancelarP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombreP)
                            .addComponent(txt_NombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCategoria)
                            .addComponent(cmb_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPrecioV)
                            .addComponent(txt_PrecioV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelProducto_ID)
                            .addComponent(txt_ProductoID))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel4.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 930, 270));

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

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 930, 130));

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
        cmb_Proveedor_Compra.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_agregar_Compra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Confirmar_Compra, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(btnRemover_Compra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_NuevaCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_CodigoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_Precio_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_agregar_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        jPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 930, 270));

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

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 930, 170));

        jTabbedPane1.addTab("Compras", jPanel5);

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Javanese Text", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre:");

        jLabel11.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Identificación:");

        jLabel12.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Telefono:");

        jLabel13.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Correo:");

        jLabel15.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Dirección: ");

        txt_Nombre_Cliente.setBackground(new java.awt.Color(255, 255, 255));
        txt_Nombre_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nombre_ClienteActionPerformed(evt);
            }
        });

        txt_direc_Cliente.setBackground(new java.awt.Color(255, 255, 255));
        txt_direc_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direc_ClienteActionPerformed(evt);
            }
        });

        txt_ID_Cliente.setBackground(new java.awt.Color(255, 255, 255));
        txt_ID_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_ClienteActionPerformed(evt);
            }
        });

        txt_correo_Cliente.setBackground(new java.awt.Color(255, 255, 255));
        txt_correo_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correo_ClienteActionPerformed(evt);
            }
        });

        txt_telefono_Cliente.setBackground(new java.awt.Color(255, 255, 255));
        txt_telefono_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefono_ClienteActionPerformed(evt);
            }
        });

        btn_Modificar_Cliente.setBackground(new java.awt.Color(0, 102, 102));
        btn_Modificar_Cliente.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_Modificar_Cliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_Modificar_Cliente.setText("Modificar");

        btn_Eliminar_Cliente.setBackground(new java.awt.Color(0, 102, 102));
        btn_Eliminar_Cliente.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_Eliminar_Cliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_Eliminar_Cliente.setText("Eliminar");

        btn_Cancelar_Cliente.setBackground(new java.awt.Color(0, 102, 102));
        btn_Cancelar_Cliente.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_Cancelar_Cliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_Cancelar_Cliente.setText("Cancelar");

        btn_Registro_Cliente.setBackground(new java.awt.Color(0, 102, 102));
        btn_Registro_Cliente.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_Registro_Cliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_Registro_Cliente.setText("Registrar");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Nombre_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_Cancelar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_direc_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Eliminar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ID_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_correo_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_telefono_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(93, 93, 93)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Registro_Cliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Modificar_Cliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 89, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Registro_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txt_ID_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txt_telefono_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Modificar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txt_Nombre_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(txt_correo_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txt_direc_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Eliminar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Cancelar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 57, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 930, 270));

        jLabel16.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Buscar:");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 90, -1));

        txt_Buscar_Cliente.setBackground(new java.awt.Color(255, 255, 255));
        txt_Buscar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Buscar_ClienteActionPerformed(evt);
            }
        });
        jPanel6.add(txt_Buscar_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 171, -1));

        tabla_Clientes.setBackground(new java.awt.Color(255, 255, 255));
        tabla_Clientes.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        tabla_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificación", "Nombre", "Teléfono", "Direcciòn", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabla_Clientes);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 930, 120));

        jTabbedPane1.addTab("Clientes", jPanel6);

        jPanel7.setBackground(new java.awt.Color(0, 204, 204));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(187, 187, 187));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Javanese Text", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Correo:");

        jLabel17.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Nombre de usuario:");

        jLabel19.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Dirección:");

        jLabel20.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Teléfono:");

        jLabel21.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Identificación: ");

        jLabel22.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Contraseña: ");

        jLabel23.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Nombre completo:");

        txt_direc_Empleado.setBackground(new java.awt.Color(255, 255, 255));
        txt_direc_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direc_EmpleadoActionPerformed(evt);
            }
        });

        txt_user_Empleado.setBackground(new java.awt.Color(255, 255, 255));
        txt_user_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_user_EmpleadoActionPerformed(evt);
            }
        });

        txt_nombre_Empelado.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre_Empelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_EmpeladoActionPerformed(evt);
            }
        });

        txt_ID_Empleado.setBackground(new java.awt.Color(255, 255, 255));
        txt_ID_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_EmpleadoActionPerformed(evt);
            }
        });

        txt_telefono_Empleado.setBackground(new java.awt.Color(255, 255, 255));
        txt_telefono_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefono_EmpleadoActionPerformed(evt);
            }
        });

        txt_correo_Empleado.setBackground(new java.awt.Color(255, 255, 255));
        txt_correo_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correo_EmpleadoActionPerformed(evt);
            }
        });

        cmb_Rol.setBackground(new java.awt.Color(255, 255, 255));
        cmb_Rol.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        cmb_Rol.setForeground(new java.awt.Color(0, 0, 0));
        cmb_Rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Auxiliar" }));

        bnt_registro_Empleado.setBackground(new java.awt.Color(0, 102, 102));
        bnt_registro_Empleado.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        bnt_registro_Empleado.setForeground(new java.awt.Color(255, 255, 255));
        bnt_registro_Empleado.setText("Registrar");

        txt_contra_Empleado.setBackground(new java.awt.Color(255, 255, 255));

        bnt_eliminar_Empleado.setBackground(new java.awt.Color(0, 102, 102));
        bnt_eliminar_Empleado.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        bnt_eliminar_Empleado.setForeground(new java.awt.Color(255, 255, 255));
        bnt_eliminar_Empleado.setText("Eliminar");

        bnt_cancelar_Empleado.setBackground(new java.awt.Color(0, 102, 102));
        bnt_cancelar_Empleado.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        bnt_cancelar_Empleado.setForeground(new java.awt.Color(255, 255, 255));
        bnt_cancelar_Empleado.setText("Cancelar");

        bnt_modificar_Empleado.setBackground(new java.awt.Color(0, 102, 102));
        bnt_modificar_Empleado.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        bnt_modificar_Empleado.setForeground(new java.awt.Color(255, 255, 255));
        bnt_modificar_Empleado.setText("Modificar");

        jLabel24.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Rol: ");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nombre_Empelado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(55, 55, 55)
                                .addComponent(txt_ID_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_direc_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefono_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_user_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmb_Rol, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_correo_Empleado, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txt_contra_Empleado))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bnt_modificar_Empleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt_registro_Empleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt_eliminar_Empleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt_cancelar_Empleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                        .addComponent(bnt_registro_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bnt_modificar_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txt_ID_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(txt_direc_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txt_nombre_Empelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(txt_telefono_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bnt_eliminar_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_user_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(txt_correo_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_contra_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24)
                    .addComponent(cmb_Rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt_cancelar_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 930, 270));

        jLabel18.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Buscar:");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 87, -1));

        txt_buscar_Empleado.setBackground(new java.awt.Color(255, 255, 255));
        txt_buscar_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscar_EmpleadoActionPerformed(evt);
            }
        });
        jPanel7.add(txt_buscar_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 306, 180, -1));

        tabla_Empleados.setBackground(new java.awt.Color(255, 255, 255));
        tabla_Empleados.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        tabla_Empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificación", "Nombre", "Nombre de usuario", "Direcciòn", "Teléfono", "Correo", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tabla_Empleados);

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 930, 90));

        jTabbedPane1.addTab("Empleados", jPanel7);
        jTabbedPane1.addTab("tab5", jTabbedPane2);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab6", jPanel15);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirActionPerformed

    private void txt_buscar_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscar_EmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscar_EmpleadoActionPerformed

    private void txt_correo_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correo_EmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correo_EmpleadoActionPerformed

    private void txt_telefono_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefono_EmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefono_EmpleadoActionPerformed

    private void txt_ID_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_EmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_EmpleadoActionPerformed

    private void txt_nombre_EmpeladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_EmpeladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_EmpeladoActionPerformed

    private void txt_user_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_user_EmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_user_EmpleadoActionPerformed

    private void txt_direc_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direc_EmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direc_EmpleadoActionPerformed

    private void txt_Buscar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Buscar_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Buscar_ClienteActionPerformed

    private void txt_telefono_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefono_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefono_ClienteActionPerformed

    private void txt_correo_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correo_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correo_ClienteActionPerformed

    private void txt_ID_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_ClienteActionPerformed

    private void txt_direc_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direc_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direc_ClienteActionPerformed

    private void txt_Nombre_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nombre_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nombre_ClienteActionPerformed

    private void btn_agregar_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_CompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_agregar_CompraActionPerformed

    private void txtSubtotal_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubtotal_CompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtotal_CompraActionPerformed

    private void txt_Pagar_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Pagar_CompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Pagar_CompraActionPerformed

    private void txt_Cantidad_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Cantidad_CompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Cantidad_CompraActionPerformed

    private void txt_Nombre_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nombre_CompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nombre_CompraActionPerformed

    private void txt_ID_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_CompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_CompraActionPerformed

    private void txt_Precio_CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Precio_CompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Precio_CompraActionPerformed

    private void txt_CodigoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CodigoCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CodigoCompraActionPerformed

    private void btn_RegistroPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistroPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RegistroPActionPerformed

    private void btn_eliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarPActionPerformed

    private void cmb_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_CategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_CategoriaActionPerformed

    private void txt_DescripcionPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DescripcionPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DescripcionPActionPerformed

    private void txt_ProductoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ProductoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ProductoIDActionPerformed

    private void txt_PrecioVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PrecioVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PrecioVActionPerformed

    private void txt_CodigoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CodigoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CodigoPActionPerformed

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
    private javax.swing.JButton bnt_cancelar_Empleado;
    private javax.swing.JButton bnt_eliminar_Empleado;
    private javax.swing.JButton bnt_modificar_Empleado;
    private javax.swing.JButton bnt_registro_Empleado;
    private javax.swing.JButton btnRemover_Compra;
    private javax.swing.JButton btn_Cancelar_Cliente;
    private javax.swing.JButton btn_Confirmar_Compra;
    private javax.swing.JButton btn_Eliminar_Cliente;
    private javax.swing.JButton btn_Modificar_Cliente;
    private javax.swing.JButton btn_NuevaCompra;
    private javax.swing.JButton btn_RegistroP;
    private javax.swing.JButton btn_Registro_Cliente;
    private javax.swing.JButton btn_actualizarP;
    private javax.swing.JButton btn_agregar_Compra;
    private javax.swing.JButton btn_cancelarP;
    private javax.swing.JButton btn_eliminarP;
    private javax.swing.JButton btn_photo;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<Object> cmb_Categoria;
    private javax.swing.JComboBox<String> cmb_Proveedor_Compra;
    private javax.swing.JComboBox<String> cmb_Rol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable product_tabla;
    private javax.swing.JTable tabla_Clientes;
    private javax.swing.JTable tabla_Empleados;
    private javax.swing.JTextField txtSubtotal_Compra;
    private javax.swing.JTextField txt_BuscarP;
    private javax.swing.JTextField txt_Buscar_Cliente;
    private javax.swing.JTextField txt_Cantidad_Compra;
    private javax.swing.JTextField txt_CodigoCompra;
    private javax.swing.JTextField txt_CodigoP;
    private javax.swing.JTextField txt_DescripcionP;
    private javax.swing.JTextField txt_ID_Cliente;
    private javax.swing.JTextField txt_ID_Compra;
    private javax.swing.JTextField txt_ID_Empleado;
    private javax.swing.JTextField txt_NombreP;
    private javax.swing.JTextField txt_Nombre_Cliente;
    private javax.swing.JTextField txt_Nombre_Compra;
    private javax.swing.JTextField txt_Pagar_Compra;
    private javax.swing.JTextField txt_PrecioV;
    private javax.swing.JTextField txt_Precio_Compra;
    private javax.swing.JTextField txt_ProductoID;
    private javax.swing.JTextField txt_buscar_Empleado;
    private javax.swing.JPasswordField txt_contra_Empleado;
    private javax.swing.JTextField txt_correo_Cliente;
    private javax.swing.JTextField txt_correo_Empleado;
    private javax.swing.JTextField txt_direc_Cliente;
    private javax.swing.JTextField txt_direc_Empleado;
    private javax.swing.JTextField txt_nombre_Empelado;
    private javax.swing.JTextField txt_telefono_Cliente;
    private javax.swing.JTextField txt_telefono_Empleado;
    private javax.swing.JTextField txt_user_Empleado;
    // End of variables declaration//GEN-END:variables
}
