package views;

import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import model.Compras;
import model.ComprasDao;

public class Factura extends javax.swing.JFrame {

    // Instanciamos
    ComprasDao comprasDao = new ComprasDao();
    DefaultTableModel model = new DefaultTableModel();

    public Factura(int id) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Factura de compra");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        txt_invoice.setText(String.valueOf(id));
        listTodosDetallesCompra(id);
        calcularCompra();
    }

    public void listTodosDetallesCompra(int id) {
        List<Compras> list = comprasDao.listarDetallesCompraQuery(id);
        model = (DefaultTableModel) tabla_DetallesCompra.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de añadir nuevas filas

        Object[] row = new Object[7];
        for (Compras compra : list) {
            row[0] = compra.getNombre_producto();
            row[1] = compra.getCantidad_compra();
            row[2] = compra.getPrecio_compra();
            row[3] = compra.getTotal_compra();
            row[4] = compra.getProveedoraProducto();
            row[5] = compra.getCompradora();
            row[6] = compra.getFecha_compra();

            model.addRow(row);
        }
        tabla_DetallesCompra.setModel(model);
    }

    // Método para calcular compra 
    public void calcularCompra() {
        double total = 0.00;
        int numRow = tabla_DetallesCompra.getRowCount();
        for (int i = 0; i < numRow; i++) {
            // Pasamos el índice de la columna que se sumará
            total += Double.parseDouble(String.valueOf(tabla_DetallesCompra.getValueAt(i, 3)));
        }
        txt_Total.setText("" + total); // Actualizar el subtotal
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        form_Print = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_invoice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_DetallesCompra = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txt_Total = new javax.swing.JTextField();
        btn_imprimirCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        form_Print.setBackground(new java.awt.Color(0, 204, 204));
        form_Print.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoF.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 90));

        form_Print.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 70));

        jPanel1.setBackground(new java.awt.Color(18, 45, 61));

        jLabel2.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VIDA NATURAL");

        txt_invoice.setEditable(false);
        txt_invoice.setBackground(new java.awt.Color(255, 255, 255));
        txt_invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_invoiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(56, 56, 56)
                .addComponent(txt_invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_invoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        form_Print.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 70));

        jLabel3.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total:");
        form_Print.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, -1, -1));

        tabla_DetallesCompra.setBackground(new java.awt.Color(255, 255, 255));
        tabla_DetallesCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Precio", "SubTotal", "Proveedor", "CompradoPor:", "Fecha_Compra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_DetallesCompra);
        if (tabla_DetallesCompra.getColumnModel().getColumnCount() > 0) {
            tabla_DetallesCompra.getColumnModel().getColumn(0).setMinWidth(100);
            tabla_DetallesCompra.getColumnModel().getColumn(5).setMinWidth(110);
            tabla_DetallesCompra.getColumnModel().getColumn(6).setMinWidth(80);
        }

        form_Print.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 620, 300));

        jLabel4.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Detalles de la compra");
        form_Print.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txt_Total.setBackground(new java.awt.Color(255, 255, 255));
        txt_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TotalActionPerformed(evt);
            }
        });
        form_Print.add(txt_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 140, -1));

        getContentPane().add(form_Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 520));

        btn_imprimirCompra.setBackground(new java.awt.Color(0, 102, 102));
        btn_imprimirCompra.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        btn_imprimirCompra.setForeground(new java.awt.Color(255, 255, 255));
        btn_imprimirCompra.setText("Imprimir");
        btn_imprimirCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirCompraActionPerformed(evt);
            }
        });
        getContentPane().add(btn_imprimirCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_invoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_invoiceActionPerformed

    private void txt_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TotalActionPerformed

    private void btn_imprimirCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirCompraActionPerformed
        /*este nos permitira imprimir la factura
        El Toolkit devuelve un objeto deacuerdo a la plataforma que se este ejecutando, en este caso windows
        Para imprimir utilizamos el getPrintJob */
        Toolkit tk = form_Print.getToolkit();
        PrintJob pj = tk.getPrintJob(this, null, null);
        Graphics graphics = pj.getGraphics();
        form_Print.print(graphics);
        graphics.dispose();
        pj.end();
    }//GEN-LAST:event_btn_imprimirCompraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_imprimirCompra;
    private javax.swing.JPanel form_Print;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tabla_DetallesCompra;
    public javax.swing.JTextField txt_Total;
    private javax.swing.JTextField txt_invoice;
    // End of variables declaration//GEN-END:variables
}
