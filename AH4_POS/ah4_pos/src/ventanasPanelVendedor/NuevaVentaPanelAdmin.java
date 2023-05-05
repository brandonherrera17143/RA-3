package ventanasPanelVendedor;
import java.awt.BorderLayout;
import javax.swing.JPanel;


public class NuevaVentaPanelAdmin extends javax.swing.JPanel {

   
    public NuevaVentaPanelAdmin() {
        initComponents();
        initContent();
        btnRegresarTabla.setVisible(false);
        btnAgregarProducto.setVisible(false);
        
    }
    
    public void initContent() {
        ShowPaneles(new NuevaVentaBienvenida());
    }
    
    
    public void ShowPaneles(JPanel a) {
        a.setSize(860, 410);
        a.setLocation(0, 0);

        jpContenidoVendedores.removeAll();
        jpContenidoVendedores.add(a, BorderLayout.CENTER);
        jpContenidoVendedores.revalidate();
        jpContenidoVendedores.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btbSaleccionarCliente = new javax.swing.JButton();
        btnAgregarProducto = new javax.swing.JButton();
        jpContenidoVendedores = new javax.swing.JPanel();
        btnRegresarTabla = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(910, 520));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btbSaleccionarCliente.setBackground(new java.awt.Color(84, 166, 234));
        btbSaleccionarCliente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btbSaleccionarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btbSaleccionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btbSaleccionarCliente.setText("SELECCIONAR CLIENTE");
        btbSaleccionarCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btbSaleccionarCliente.setBorderPainted(false);
        btbSaleccionarCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btbSaleccionarCliente.setIconTextGap(15);
        btbSaleccionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbSaleccionarClienteActionPerformed(evt);
            }
        });
        add(btbSaleccionarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 220, 50));

        btnAgregarProducto.setBackground(new java.awt.Color(84, 166, 234));
        btnAgregarProducto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cargar.png"))); // NOI18N
        btnAgregarProducto.setText("AGREGAR PRODUCTOS");
        btnAgregarProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnAgregarProducto.setBorderPainted(false);
        btnAgregarProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregarProducto.setIconTextGap(15);
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 220, 50));

        jpContenidoVendedores.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpContenidoVendedoresLayout = new javax.swing.GroupLayout(jpContenidoVendedores);
        jpContenidoVendedores.setLayout(jpContenidoVendedoresLayout);
        jpContenidoVendedoresLayout.setHorizontalGroup(
            jpContenidoVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        jpContenidoVendedoresLayout.setVerticalGroup(
            jpContenidoVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        add(jpContenidoVendedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 860, 410));

        btnRegresarTabla.setBackground(new java.awt.Color(84, 166, 234));
        btnRegresarTabla.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRegresarTabla.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/regresar.png"))); // NOI18N
        btnRegresarTabla.setText("REGRESAR");
        btnRegresarTabla.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnRegresarTabla.setBorderPainted(false);
        btnRegresarTabla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegresarTabla.setIconTextGap(15);
        btnRegresarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarTablaActionPerformed(evt);
            }
        });
        add(btnRegresarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 150, 20));
    }// </editor-fold>//GEN-END:initComponents

   
    private void btbSaleccionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbSaleccionarClienteActionPerformed
            
            ShowPaneles(new NuevaVentaSeleccionarCliente());
            botonRegresar(true);
            NuevaVentaPanelAdmin.btnAgregarProducto.setVisible(false);

    }//GEN-LAST:event_btbSaleccionarClienteActionPerformed
     
    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
            
            ShowPaneles(new NuevaVentaAgregarProductos());
            botonRegresar(true);
            
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnRegresarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarTablaActionPerformed
        ShowPaneles(new NuevaVentaBienvenida());
        botonRegresar(false);
        NuevaVentaPanelAdmin.btnAgregarProducto.setVisible(false);
    }//GEN-LAST:event_btnRegresarTablaActionPerformed

    public void botonRegresar(boolean click) {
        
        if (click) {
            btnRegresarTabla.setVisible(true);
        } else {
            btnRegresarTabla.setVisible(false);
        }

    }
    
    public void habilitarBoton(int activar){
        System.out.println("activar = "+ activar);
        if(activar == 1)
           btnAgregarProducto.setVisible(true);
        else
            btnAgregarProducto.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbSaleccionarCliente;
    public static javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnRegresarTabla;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpContenidoVendedores;
    // End of variables declaration//GEN-END:variables
}
