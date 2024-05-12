
package views;

import controlador.ClientesController;
import controlador.Controller;
import controlador.EmpleadosController;
import controlador.ProveedoresController;
import model.Clientes;
import model.ClientesDao;
import model.Empleados;
import model.EmpleadosDao;
import static model.EmpleadosDao.nombreCompleto;
import static model.EmpleadosDao.rol_usuario;
import model.Proveedores;
import model.ProveedoresDao;

public class SystemView extends javax.swing.JFrame {

    //instanciamos los objetos que vamos a usar en esta vista 
    Empleados empleados = new Empleados();
    EmpleadosDao empleadosDao = new EmpleadosDao();
    //instanciamos clientes 
    Clientes clientes = new Clientes();
    ClientesDao clientesDao = new ClientesDao();
    //instanciamos proveedores
    Proveedores proveedores = new Proveedores();
    ProveedoresDao proveedoresDao = new ProveedoresDao();

    public SystemView() {
        initComponents();
        setSize(1208, 680);           //tamaño de la ventana 
        setResizable(false);             //Para que el usuario no pueda agrandar ni modificar la ventana 
        setLocationRelativeTo(null);           //Para que quede centrado
        tituloInterfaz(); //Metodo para mostrar nombre y rol de usuario
        //instanciamos el controlador (this, hace referencia a la vista)
        Controller controler = new Controller(this);
        this.repaint();  //Para mostra los cambios realizados 

        //Controlador de empleados
        EmpleadosController empleados_controller = new EmpleadosController(empleados, empleadosDao, this);
        empleados_controller.listarTodosEmpleados();
        //Controlador de clientes 
        ClientesController clientesController = new ClientesController(clientes, clientesDao, this);
        clientesController.listarTodos_Clientes();
        //Controlador proveedores 
        ProveedoresController proveedoresController = new ProveedoresController(proveedores, proveedoresDao, this);
        proveedoresController.ListarTodosProveedores();
    }
    public String tituloInterfaz(){
    setTitle("Ponel -"+rol_usuario);//Panel de administracion
    jLabel_NombreU.setText(nombreCompleto);
    jLabel_rolUsuario.setText(rol_usuario);
    return rol_usuario.trim();
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
        jLabelClientes = new javax.swing.JLabel();
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
        jLabel_rolUsuario = new javax.swing.JLabel();
        jLabel_NombreU = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        menuNavegacion = new javax.swing.JTabbedPane();
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
        txt_nombreUsuario_Empleado = new javax.swing.JTextField();
        txt_nombre_Empleado = new javax.swing.JTextField();
        txt_ID_Empleado = new javax.swing.JTextField();
        txt_telefono_Empleado = new javax.swing.JTextField();
        txt_correo_Empleado = new javax.swing.JTextField();
        cmb_Rol = new javax.swing.JComboBox<>();
        btn_registro_Empleado = new javax.swing.JButton();
        txt_contra_Empleado = new javax.swing.JPasswordField();
        btn_eliminar_Empleado = new javax.swing.JButton();
        btn_cancelar_Empleado = new javax.swing.JButton();
        btn_modificar_Empleado = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_buscar_Empleado = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_Empleados = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txt_ID_Categoria = new javax.swing.JTextField();
        txt_nombre_Categoria = new javax.swing.JTextField();
        btn_eliminar_Categoria = new javax.swing.JButton();
        btn_registrar_Categoria = new javax.swing.JButton();
        btn_modificar_Categoria = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        txt_buscar_Categoria = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabla_Categoria = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabla_TotalCompras = new javax.swing.JTable();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txt_nombre_Perfil = new javax.swing.JTextField();
        txt_direc_Perfil = new javax.swing.JTextField();
        txt_telefono_Perfil = new javax.swing.JTextField();
        txt_ID_Perfil = new javax.swing.JTextField();
        txt_correo_Perfil = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txt_NuevaContra_Perfil = new javax.swing.JPasswordField();
        txt_ConfirmContra_Perfil = new javax.swing.JPasswordField();
        btn_modificar_Perfil = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtTotalPagar_venta = new javax.swing.JTextField();
        txtCodigoP_venta = new javax.swing.JTextField();
        txtNombreP_venta = new javax.swing.JTextField();
        txtCedulaCli_venta = new javax.swing.JTextField();
        txtCantidad_venta = new javax.swing.JTextField();
        txt_IdVenta = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txt_NombreCliente_venta = new javax.swing.JTextField();
        txtStock_venta = new javax.swing.JTextField();
        txtSubTotal_venta = new javax.swing.JTextField();
        txtPrecio_venta = new javax.swing.JTextField();
        btnAgregar_venta = new javax.swing.JButton();
        btnVender_venta = new javax.swing.JButton();
        btnEliminar_venta = new javax.swing.JButton();
        btnNueva_venta = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabla_Ventas = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txt_nombre_Proveedor = new javax.swing.JTextField();
        txt_telefono_Proveedor = new javax.swing.JTextField();
        txt_correo_Proveedor = new javax.swing.JTextField();
        txt_descripcion_Proveedor = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        btn_cancelar_Proveedor = new javax.swing.JButton();
        btn_registrar_Proveedor = new javax.swing.JButton();
        btn_modificar_Proveedor = new javax.swing.JButton();
        btn_eliminar_Proveedor = new javax.swing.JButton();
        txt_ID_Proveedor = new javax.swing.JTextField();
        txt_direccion_Proveedor = new javax.swing.JTextField();
        cmb_ciudad_Proveedor = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txt_buscar_Proveedor = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla_Prevedor = new javax.swing.JTable();

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

        jLabelClientes.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabelClientes.setForeground(new java.awt.Color(0, 0, 0));
        jLabelClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes.png"))); // NOI18N
        jLabelClientes.setText(" Clientes");

        javax.swing.GroupLayout jPanelCustomersLayout = new javax.swing.GroupLayout(jPanelCustomers);
        jPanelCustomers.setLayout(jPanelCustomersLayout);
        jPanelCustomersLayout.setHorizontalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomersLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelClientes)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanelCustomersLayout.setVerticalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomersLayout.createSequentialGroup()
                .addComponent(jLabelClientes)
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
        jPanel2.add(btn_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 80, 80));

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
        jPanel2.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 110, 40));

        jLabel_rolUsuario.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel_rolUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel_rolUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 130, 20));

        jLabel_NombreU.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel_NombreU.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel_NombreU, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 130, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1030, 100));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoF.jpg"))); // NOI18N
        jPanel3.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 200, 110));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        menuNavegacion.setBackground(new java.awt.Color(255, 255, 255));
        menuNavegacion.setForeground(new java.awt.Color(0, 0, 0));
        menuNavegacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPrecioV))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabelCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_CodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_PrecioV, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_NombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
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

        menuNavegacion.addTab("Productos", jPanel4);

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
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_CodigoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_Precio_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_agregar_Compra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        menuNavegacion.addTab("Compras", jPanel5);

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
                "Identificación", "Nombre", "Direcciòn", "Telefono", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabla_Clientes);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 930, 120));

        menuNavegacion.addTab("Clientes", jPanel6);

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

        txt_nombreUsuario_Empleado.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombreUsuario_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreUsuario_EmpleadoActionPerformed(evt);
            }
        });

        txt_nombre_Empleado.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_EmpleadoActionPerformed(evt);
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
        cmb_Rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_RolActionPerformed(evt);
            }
        });

        btn_registro_Empleado.setBackground(new java.awt.Color(0, 102, 102));
        btn_registro_Empleado.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_registro_Empleado.setForeground(new java.awt.Color(255, 255, 255));
        btn_registro_Empleado.setText("Registrar");

        txt_contra_Empleado.setBackground(new java.awt.Color(255, 255, 255));

        btn_eliminar_Empleado.setBackground(new java.awt.Color(0, 102, 102));
        btn_eliminar_Empleado.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_eliminar_Empleado.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar_Empleado.setText("Eliminar");

        btn_cancelar_Empleado.setBackground(new java.awt.Color(0, 102, 102));
        btn_cancelar_Empleado.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_cancelar_Empleado.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar_Empleado.setText("Cancelar");

        btn_modificar_Empleado.setBackground(new java.awt.Color(0, 102, 102));
        btn_modificar_Empleado.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_modificar_Empleado.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificar_Empleado.setText("Modificar");

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
                                .addComponent(txt_nombre_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(txt_nombreUsuario_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(btn_modificar_Empleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registro_Empleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar_Empleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar_Empleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                        .addComponent(btn_registro_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_modificar_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
                            .addComponent(txt_nombre_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(txt_telefono_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_eliminar_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_nombreUsuario_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(txt_correo_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancelar_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_contra_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)
                        .addComponent(jLabel24)
                        .addComponent(cmb_Rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        menuNavegacion.addTab("Empleados", jPanel7);

        jPanel9.setBackground(new java.awt.Color(0, 204, 204));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(187, 187, 187));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categorías", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Javanese Text", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Nombre:");

        jLabel34.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Id  Categoría:");

        txt_ID_Categoria.setEditable(false);
        txt_ID_Categoria.setBackground(new java.awt.Color(255, 255, 255));
        txt_ID_Categoria.setEnabled(false);

        txt_nombre_Categoria.setBackground(new java.awt.Color(255, 255, 255));

        btn_eliminar_Categoria.setBackground(new java.awt.Color(0, 102, 102));
        btn_eliminar_Categoria.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_eliminar_Categoria.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar_Categoria.setText("Eliminar");
        btn_eliminar_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_CategoriaActionPerformed(evt);
            }
        });

        btn_registrar_Categoria.setBackground(new java.awt.Color(0, 102, 102));
        btn_registrar_Categoria.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_registrar_Categoria.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar_Categoria.setText("Registrar");

        btn_modificar_Categoria.setBackground(new java.awt.Color(0, 102, 102));
        btn_modificar_Categoria.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_modificar_Categoria.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificar_Categoria.setText("Modificar");
        btn_modificar_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_CategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_ID_Categoria)
                            .addComponent(txt_nombre_Categoria, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_modificar_Categoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_registrar_Categoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_eliminar_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ID_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(btn_registrar_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_nombre_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_modificar_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_eliminar_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 20, 520, 270));

        jLabel35.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Buscar:");
        jPanel9.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 71, -1));

        txt_buscar_Categoria.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.add(txt_buscar_Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 320, -1));

        tabla_Categoria.setBackground(new java.awt.Color(255, 255, 255));
        tabla_Categoria.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        tabla_Categoria.setForeground(new java.awt.Color(0, 0, 0));
        tabla_Categoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id categoría", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tabla_Categoria);

        jPanel9.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 380, 90));

        menuNavegacion.addTab("Categorías", jPanel9);

        jPanel16.setBackground(new java.awt.Color(0, 204, 204));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_TotalCompras.setBackground(new java.awt.Color(255, 255, 255));
        tabla_TotalCompras.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        tabla_TotalCompras.setForeground(new java.awt.Color(0, 0, 0));
        tabla_TotalCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Factura de compra", "Proveedor", "Total", "Fecha de venta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tabla_TotalCompras);

        jPanel16.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 890, 170));

        jLabel54.setFont(new java.awt.Font("Javanese Text", 1, 32)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 102));
        jLabel54.setText("Todas las ventas realizadas ");
        jPanel16.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, 50));

        jLabel55.setFont(new java.awt.Font("Javanese Text", 1, 32)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 102));
        jLabel55.setText("Todas las compras realizadas ");
        jPanel16.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Factura de venta", "Cliente", "Empleado", "Total", "Fecha de venta "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTable1);

        jPanel16.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 890, 190));

        menuNavegacion.addTab("Reportes", jPanel16);

        jPanel17.setBackground(new java.awt.Color(0, 204, 204));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(187, 187, 187));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar perfil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Javanese Text", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel37.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Nombre completo:");

        jLabel38.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Identificación:");

        jLabel39.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Dirección:");

        jLabel40.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("Teléfono:");

        jLabel41.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("Correo:");

        txt_nombre_Perfil.setEditable(false);
        txt_nombre_Perfil.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre_Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_PerfilActionPerformed(evt);
            }
        });

        txt_direc_Perfil.setEditable(false);
        txt_direc_Perfil.setBackground(new java.awt.Color(255, 255, 255));
        txt_direc_Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direc_PerfilActionPerformed(evt);
            }
        });

        txt_telefono_Perfil.setEditable(false);
        txt_telefono_Perfil.setBackground(new java.awt.Color(255, 255, 255));
        txt_telefono_Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefono_PerfilActionPerformed(evt);
            }
        });

        txt_ID_Perfil.setEditable(false);
        txt_ID_Perfil.setBackground(new java.awt.Color(255, 255, 255));
        txt_ID_Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_PerfilActionPerformed(evt);
            }
        });

        txt_correo_Perfil.setEditable(false);
        txt_correo_Perfil.setBackground(new java.awt.Color(255, 255, 255));
        txt_correo_Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correo_PerfilActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Confirmar contraseña:");

        jLabel43.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("Nueva contraseña:");

        txt_NuevaContra_Perfil.setBackground(new java.awt.Color(255, 255, 255));
        txt_NuevaContra_Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NuevaContra_PerfilActionPerformed(evt);
            }
        });

        txt_ConfirmContra_Perfil.setBackground(new java.awt.Color(255, 255, 255));

        btn_modificar_Perfil.setBackground(new java.awt.Color(0, 102, 102));
        btn_modificar_Perfil.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_modificar_Perfil.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificar_Perfil.setText("Modificar");
        btn_modificar_Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_PerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_ID_Perfil, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(txt_nombre_Perfil, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(txt_direc_Perfil))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(txt_NuevaContra_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(btn_modificar_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(txt_ConfirmContra_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_telefono_Perfil, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(txt_correo_Perfil))
                        .addGap(86, 86, 86))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txt_ID_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(txt_NuevaContra_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txt_nombre_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(txt_ConfirmContra_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txt_direc_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txt_telefono_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txt_correo_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 930, 270));

        menuNavegacion.addTab("Perfil", jPanel17);

        jPanel19.setBackground(new java.awt.Color(0, 204, 204));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(187, 187, 187));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva venta ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Javanese Text", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel44.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("Nombre del producto:");

        jLabel45.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("Codigo del producto:");

        jLabel46.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setText("Cantidad :");

        jLabel47.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("Id:");

        jLabel48.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setText("Total a pagar :");

        jLabel49.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("Cedula del cliente:");

        txtTotalPagar_venta.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalPagar_venta.setEnabled(false);
        txtTotalPagar_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPagar_ventaActionPerformed(evt);
            }
        });

        txtCodigoP_venta.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigoP_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoP_ventaActionPerformed(evt);
            }
        });

        txtNombreP_venta.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreP_venta.setEnabled(false);
        txtNombreP_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreP_ventaActionPerformed(evt);
            }
        });

        txtCedulaCli_venta.setBackground(new java.awt.Color(255, 255, 255));
        txtCedulaCli_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaCli_ventaActionPerformed(evt);
            }
        });

        txtCantidad_venta.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidad_ventaActionPerformed(evt);
            }
        });

        txt_IdVenta.setEditable(false);
        txt_IdVenta.setBackground(new java.awt.Color(255, 255, 255));
        txt_IdVenta.setEnabled(false);
        txt_IdVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdVentaActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("Precio:");

        jLabel51.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("Subtotal:");

        jLabel52.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("Nombre del cliente:");

        jLabel53.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setText("Stock:");

        txt_NombreCliente_venta.setBackground(new java.awt.Color(255, 255, 255));
        txt_NombreCliente_venta.setEnabled(false);
        txt_NombreCliente_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreCliente_ventaActionPerformed(evt);
            }
        });

        txtStock_venta.setBackground(new java.awt.Color(255, 255, 255));
        txtStock_venta.setEnabled(false);
        txtStock_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStock_ventaActionPerformed(evt);
            }
        });

        txtSubTotal_venta.setBackground(new java.awt.Color(255, 255, 255));
        txtSubTotal_venta.setEnabled(false);
        txtSubTotal_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotal_ventaActionPerformed(evt);
            }
        });

        txtPrecio_venta.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio_venta.setEnabled(false);
        txtPrecio_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecio_ventaActionPerformed(evt);
            }
        });

        btnAgregar_venta.setBackground(new java.awt.Color(0, 102, 102));
        btnAgregar_venta.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btnAgregar_venta.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar_venta.setText("Agregar");
        btnAgregar_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar_ventaActionPerformed(evt);
            }
        });

        btnVender_venta.setBackground(new java.awt.Color(0, 102, 102));
        btnVender_venta.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btnVender_venta.setForeground(new java.awt.Color(255, 255, 255));
        btnVender_venta.setText("Vender");
        btnVender_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVender_ventaActionPerformed(evt);
            }
        });

        btnEliminar_venta.setBackground(new java.awt.Color(0, 102, 102));
        btnEliminar_venta.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btnEliminar_venta.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar_venta.setText("Eliminar");
        btnEliminar_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar_ventaActionPerformed(evt);
            }
        });

        btnNueva_venta.setBackground(new java.awt.Color(0, 102, 102));
        btnNueva_venta.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btnNueva_venta.setForeground(new java.awt.Color(255, 255, 255));
        btnNueva_venta.setText("Nuevo");
        btnNueva_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueva_ventaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreP_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(txtCodigoP_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_IdVenta))))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCedulaCli_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCantidad_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTotalPagar_venta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPrecio_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSubTotal_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtStock_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addGap(18, 18, 18)
                        .addComponent(txt_NombreCliente_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVender_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNueva_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel47)
                    .addComponent(txtCodigoP_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_IdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50)
                    .addComponent(txtPrecio_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtNombreP_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(txtSubTotal_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVender_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtCantidad_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53)
                    .addComponent(txtStock_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(txtCedulaCli_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52)
                    .addComponent(txt_NombreCliente_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNueva_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(txtTotalPagar_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 920, 300));

        tabla_Ventas.setBackground(new java.awt.Color(255, 255, 255));
        tabla_Ventas.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        tabla_Ventas.setForeground(new java.awt.Color(0, 0, 0));
        tabla_Ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id producto", "Nombre", "Cantidad", "Precio de venta ", "SubTotal", "Nombre del cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tabla_Ventas);

        jPanel19.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 920, 150));

        menuNavegacion.addTab("Ventas ", jPanel19);

        jPanel15.setBackground(new java.awt.Color(0, 204, 204));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(187, 187, 187));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Javanese Text", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Descripción:");

        jLabel26.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Nombre: ");

        jLabel28.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Teléfono:");

        txt_nombre_Proveedor.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre_Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_ProveedorActionPerformed(evt);
            }
        });

        txt_telefono_Proveedor.setBackground(new java.awt.Color(255, 255, 255));
        txt_telefono_Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefono_ProveedorActionPerformed(evt);
            }
        });

        txt_correo_Proveedor.setBackground(new java.awt.Color(255, 255, 255));
        txt_correo_Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correo_ProveedorActionPerformed(evt);
            }
        });

        txt_descripcion_Proveedor.setBackground(new java.awt.Color(255, 255, 255));
        txt_descripcion_Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descripcion_ProveedorActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Ciudad:");

        jLabel30.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Dirección:");

        jLabel31.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Id proveedor:");

        btn_cancelar_Proveedor.setBackground(new java.awt.Color(0, 102, 102));
        btn_cancelar_Proveedor.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_cancelar_Proveedor.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar_Proveedor.setText("Cancelar");

        btn_registrar_Proveedor.setBackground(new java.awt.Color(0, 102, 102));
        btn_registrar_Proveedor.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_registrar_Proveedor.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar_Proveedor.setText("Registrar");

        btn_modificar_Proveedor.setBackground(new java.awt.Color(0, 102, 102));
        btn_modificar_Proveedor.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_modificar_Proveedor.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificar_Proveedor.setText("Modificar");

        btn_eliminar_Proveedor.setBackground(new java.awt.Color(0, 102, 102));
        btn_eliminar_Proveedor.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_eliminar_Proveedor.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar_Proveedor.setText("Eliminar");

        txt_ID_Proveedor.setEditable(false);
        txt_ID_Proveedor.setBackground(new java.awt.Color(255, 255, 255));
        txt_ID_Proveedor.setEnabled(false);
        txt_ID_Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ID_ProveedorActionPerformed(evt);
            }
        });

        txt_direccion_Proveedor.setBackground(new java.awt.Color(255, 255, 255));
        txt_direccion_Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccion_ProveedorActionPerformed(evt);
            }
        });

        cmb_ciudad_Proveedor.setBackground(new java.awt.Color(255, 255, 255));
        cmb_ciudad_Proveedor.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        cmb_ciudad_Proveedor.setForeground(new java.awt.Color(0, 0, 0));
        cmb_ciudad_Proveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogotá", "Barranquilla", "Cali", "Medellin", " " }));

        jLabel32.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Correo:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_correo_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(txt_nombre_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(txt_descripcion_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txt_telefono_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_ID_Proveedor)
                            .addComponent(cmb_ciudad_Proveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_direccion_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancelar_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registrar_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(787, Short.MAX_VALUE)))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(778, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombre_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_direccion_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_registrar_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_descripcion_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_ciudad_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefono_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ID_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_correo_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(185, Short.MAX_VALUE)))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap(166, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(35, 35, 35)))
        );

        jPanel15.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 930, 270));

        jLabel27.setFont(new java.awt.Font("Javanese Text", 1, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Buscar:");
        jPanel15.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 90, 29));

        txt_buscar_Proveedor.setBackground(new java.awt.Color(255, 255, 255));
        txt_buscar_Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscar_ProveedorActionPerformed(evt);
            }
        });
        jPanel15.add(txt_buscar_Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 164, -1));

        tabla_Prevedor.setBackground(new java.awt.Color(255, 255, 255));
        tabla_Prevedor.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        tabla_Prevedor.setForeground(new java.awt.Color(0, 0, 0));
        tabla_Prevedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id proveedor", "Nombre", "Descripción", "Dirección", "Teléfono", "Correo", "Ciudad"
            }
        ));
        jScrollPane5.setViewportView(tabla_Prevedor);

        jPanel15.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 930, 140));

        menuNavegacion.addTab("Proveedores", jPanel15);

        getContentPane().add(menuNavegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 1010, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        if (evt.getSource() == btn_salir) {
            dispose(); //Para que se cierre
            LoginView login = new LoginView();//para que deje la pantalla del login
            login.setVisible(true);
        }
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_modificar_PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_PerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificar_PerfilActionPerformed

    private void txt_NuevaContra_PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NuevaContra_PerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NuevaContra_PerfilActionPerformed

    private void txt_correo_PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correo_PerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correo_PerfilActionPerformed

    private void txt_ID_PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_PerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_PerfilActionPerformed

    private void txt_telefono_PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefono_PerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefono_PerfilActionPerformed

    private void txt_direc_PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direc_PerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direc_PerfilActionPerformed

    private void txt_nombre_PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_PerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_PerfilActionPerformed

    private void btn_modificar_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_CategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificar_CategoriaActionPerformed

    private void btn_eliminar_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_CategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminar_CategoriaActionPerformed

    private void txt_buscar_ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscar_ProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscar_ProveedorActionPerformed

    private void txt_direccion_ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccion_ProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccion_ProveedorActionPerformed

    private void txt_ID_ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ID_ProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ID_ProveedorActionPerformed

    private void txt_descripcion_ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descripcion_ProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descripcion_ProveedorActionPerformed

    private void txt_correo_ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correo_ProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correo_ProveedorActionPerformed

    private void txt_telefono_ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefono_ProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefono_ProveedorActionPerformed

    private void txt_nombre_ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_ProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_ProveedorActionPerformed

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

    private void txt_nombre_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_EmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombre_EmpleadoActionPerformed

    private void txt_nombreUsuario_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreUsuario_EmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreUsuario_EmpleadoActionPerformed

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

    private void txtTotalPagar_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPagar_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPagar_ventaActionPerformed

    private void txtCodigoP_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoP_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoP_ventaActionPerformed

    private void txtNombreP_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreP_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreP_ventaActionPerformed

    private void txtCedulaCli_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaCli_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaCli_ventaActionPerformed

    private void txtCantidad_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidad_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidad_ventaActionPerformed

    private void txt_IdVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IdVentaActionPerformed

    private void txt_NombreCliente_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreCliente_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreCliente_ventaActionPerformed

    private void txtStock_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStock_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStock_ventaActionPerformed

    private void txtSubTotal_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotal_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubTotal_ventaActionPerformed

    private void txtPrecio_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecio_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio_ventaActionPerformed

    private void btnAgregar_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregar_ventaActionPerformed

    private void btnVender_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVender_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVender_ventaActionPerformed

    private void btnEliminar_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminar_ventaActionPerformed

    private void btnNueva_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueva_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNueva_ventaActionPerformed

    private void cmb_RolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_RolActionPerformed
    }//GEN-LAST:event_cmb_RolActionPerformed

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
    public javax.swing.JButton btnAgregar_venta;
    public javax.swing.JButton btnEliminar_venta;
    public javax.swing.JButton btnNueva_venta;
    private javax.swing.JButton btnRemover_Compra;
    public javax.swing.JButton btnVender_venta;
    public javax.swing.JButton btn_Cancelar_Cliente;
    private javax.swing.JButton btn_Confirmar_Compra;
    public javax.swing.JButton btn_Eliminar_Cliente;
    public javax.swing.JButton btn_Modificar_Cliente;
    private javax.swing.JButton btn_NuevaCompra;
    private javax.swing.JButton btn_RegistroP;
    public javax.swing.JButton btn_Registro_Cliente;
    private javax.swing.JButton btn_actualizarP;
    private javax.swing.JButton btn_agregar_Compra;
    private javax.swing.JButton btn_cancelarP;
    public javax.swing.JButton btn_cancelar_Empleado;
    public javax.swing.JButton btn_cancelar_Proveedor;
    private javax.swing.JButton btn_eliminarP;
    public javax.swing.JButton btn_eliminar_Categoria;
    public javax.swing.JButton btn_eliminar_Empleado;
    public javax.swing.JButton btn_eliminar_Proveedor;
    public javax.swing.JButton btn_modificar_Categoria;
    public javax.swing.JButton btn_modificar_Empleado;
    public javax.swing.JButton btn_modificar_Perfil;
    public javax.swing.JButton btn_modificar_Proveedor;
    private javax.swing.JButton btn_photo;
    public javax.swing.JButton btn_registrar_Categoria;
    public javax.swing.JButton btn_registrar_Proveedor;
    public javax.swing.JButton btn_registro_Empleado;
    private javax.swing.JButton btn_salir;
    public javax.swing.JComboBox<Object> cmb_Categoria;
    private javax.swing.JComboBox<String> cmb_Proveedor_Compra;
    public javax.swing.JComboBox<String> cmb_Rol;
    public javax.swing.JComboBox<String> cmb_ciudad_Proveedor;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBuscarP;
    private javax.swing.JLabel jLabelCategoria;
    public javax.swing.JLabel jLabelCategories;
    public javax.swing.JLabel jLabelClientes;
    private javax.swing.JLabel jLabelCodigoP;
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
    public javax.swing.JLabel jLabel_NombreU;
    public javax.swing.JLabel jLabel_rolUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    public javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    public javax.swing.JPanel jPanel15;
    public javax.swing.JPanel jPanel16;
    public javax.swing.JPanel jPanel17;
    public javax.swing.JPanel jPanel18;
    public javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    public javax.swing.JPanel jPanel9;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTable jTable1;
    public javax.swing.JTabbedPane menuNavegacion;
    public javax.swing.JTable product_tabla;
    private javax.swing.JTable tabla_Categoria;
    public javax.swing.JTable tabla_Clientes;
    public javax.swing.JTable tabla_Empleados;
    public javax.swing.JTable tabla_Prevedor;
    public javax.swing.JTable tabla_TotalCompras;
    public javax.swing.JTable tabla_Ventas;
    public javax.swing.JTextField txtCantidad_venta;
    public javax.swing.JTextField txtCedulaCli_venta;
    public javax.swing.JTextField txtCodigoP_venta;
    public javax.swing.JTextField txtNombreP_venta;
    public javax.swing.JTextField txtPrecio_venta;
    public javax.swing.JTextField txtStock_venta;
    public javax.swing.JTextField txtSubTotal_venta;
    private javax.swing.JTextField txtSubtotal_Compra;
    public javax.swing.JTextField txtTotalPagar_venta;
    public javax.swing.JTextField txt_BuscarP;
    public javax.swing.JTextField txt_Buscar_Cliente;
    private javax.swing.JTextField txt_Cantidad_Compra;
    private javax.swing.JTextField txt_CodigoCompra;
    public javax.swing.JTextField txt_CodigoP;
    public javax.swing.JPasswordField txt_ConfirmContra_Perfil;
    public javax.swing.JTextField txt_DescripcionP;
    public javax.swing.JTextField txt_ID_Categoria;
    public javax.swing.JTextField txt_ID_Cliente;
    private javax.swing.JTextField txt_ID_Compra;
    public javax.swing.JTextField txt_ID_Empleado;
    public javax.swing.JTextField txt_ID_Perfil;
    public javax.swing.JTextField txt_ID_Proveedor;
    public javax.swing.JTextField txt_IdVenta;
    public javax.swing.JTextField txt_NombreCliente_venta;
    public javax.swing.JTextField txt_NombreP;
    public javax.swing.JTextField txt_Nombre_Cliente;
    private javax.swing.JTextField txt_Nombre_Compra;
    public javax.swing.JPasswordField txt_NuevaContra_Perfil;
    private javax.swing.JTextField txt_Pagar_Compra;
    public javax.swing.JTextField txt_PrecioV;
    private javax.swing.JTextField txt_Precio_Compra;
    public javax.swing.JTextField txt_ProductoID;
    private javax.swing.JTextField txt_buscar_Categoria;
    public javax.swing.JTextField txt_buscar_Empleado;
    public javax.swing.JTextField txt_buscar_Proveedor;
    public javax.swing.JPasswordField txt_contra_Empleado;
    public javax.swing.JTextField txt_correo_Cliente;
    public javax.swing.JTextField txt_correo_Empleado;
    public javax.swing.JTextField txt_correo_Perfil;
    public javax.swing.JTextField txt_correo_Proveedor;
    public javax.swing.JTextField txt_descripcion_Proveedor;
    public javax.swing.JTextField txt_direc_Cliente;
    public javax.swing.JTextField txt_direc_Empleado;
    public javax.swing.JTextField txt_direc_Perfil;
    public javax.swing.JTextField txt_direccion_Proveedor;
    public javax.swing.JTextField txt_nombreUsuario_Empleado;
    public javax.swing.JTextField txt_nombre_Categoria;
    public javax.swing.JTextField txt_nombre_Empleado;
    public javax.swing.JTextField txt_nombre_Perfil;
    public javax.swing.JTextField txt_nombre_Proveedor;
    public javax.swing.JTextField txt_telefono_Cliente;
    public javax.swing.JTextField txt_telefono_Empleado;
    public javax.swing.JTextField txt_telefono_Perfil;
    public javax.swing.JTextField txt_telefono_Proveedor;
    // End of variables declaration//GEN-END:variables
}
