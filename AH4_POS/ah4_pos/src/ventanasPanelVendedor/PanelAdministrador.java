package ventanasPanelVendedor;

import clases.Vendedor;
import java.awt.BorderLayout;
import javax.swing.JPanel;


public class PanelAdministrador extends javax.swing.JFrame {
    
    
    public PanelAdministrador() {
        initComponents();
        initContent();
        this.setLocationRelativeTo(null);
    }

    public void initContent() {
        ShowPaneles(new PanelBienvenidaVendedor());
    }

    public void ShowPaneles(JPanel a) {
        a.setSize(910, 520);
        a.setLocation(0, 0);

        jpContenidoGeneralVendedor.removeAll();
        jpContenidoGeneralVendedor.add(a, BorderLayout.CENTER);
        jpContenidoGeneralVendedor.revalidate();
        jpContenidoGeneralVendedor.repaint();
    }
    private void textoTitulo(int entrada){
        if (entrada == 0) {
            lblTextoTituloMenu.setText("");
        }else if(entrada == 1){
            lblTextoTituloMenu.setText("PANEL NUEVA VENTA");
        } else if(entrada == 2){
            lblTextoTituloMenu.setText("PANEL VENTAS");
        }
    }
    
    public void datosCliente(Vendedor vendedor){
        lblNombreUsuario.setText("Bienvenido " + vendedor.getNombre());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new javax.swing.JPanel();
        TiuloMenu = new javax.swing.JPanel();
        menuLabel = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnNuevaVenta = new javax.swing.JButton();
        banner = new javax.swing.JLabel();
        jpTituloAdmin = new javax.swing.JPanel();
        lblNombreUsuario = new javax.swing.JLabel();
        jpContenidoGeneralVendedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jpHeader = new javax.swing.JPanel();
        lblTextoTituloMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpFondo.setBackground(new java.awt.Color(255, 255, 255));
        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TiuloMenu.setBackground(new java.awt.Color(84, 166, 234));

        menuLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        menuLabel.setForeground(new java.awt.Color(255, 255, 255));
        menuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLabel.setText("Menu");

        javax.swing.GroupLayout TiuloMenuLayout = new javax.swing.GroupLayout(TiuloMenu);
        TiuloMenu.setLayout(TiuloMenuLayout);
        TiuloMenuLayout.setHorizontalGroup(
            TiuloMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TiuloMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TiuloMenuLayout.setVerticalGroup(
            TiuloMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TiuloMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jpFondo.add(TiuloMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 80));

        jButton5.setBackground(new java.awt.Color(84, 166, 234));
        jButton5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hogar.png"))); // NOI18N
        jButton5.setText("INICIO");
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 40, 1, 1, new java.awt.Color(0, 0, 0)));
        jButton5.setBorderPainted(false);
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.setIconTextGap(25);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jpFondo.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 330, 50));

        btnVentas.setBackground(new java.awt.Color(84, 166, 234));
        btnVentas.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ventas.png"))); // NOI18N
        btnVentas.setText("VENTAS");
        btnVentas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 40, 1, 1, new java.awt.Color(0, 0, 0)));
        btnVentas.setBorderPainted(false);
        btnVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVentas.setIconTextGap(25);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        jpFondo.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 330, 50));

        btnNuevaVenta.setBackground(new java.awt.Color(84, 166, 234));
        btnNuevaVenta.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnNuevaVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/NuevaVenta.png"))); // NOI18N
        btnNuevaVenta.setText("NUEVA VENTA");
        btnNuevaVenta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 40, 1, 1, new java.awt.Color(0, 0, 0)));
        btnNuevaVenta.setBorderPainted(false);
        btnNuevaVenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevaVenta.setIconTextGap(25);
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });
        jpFondo.add(btnNuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 330, 50));

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blue.jpg"))); // NOI18N
        jpFondo.add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 630));

        jpTituloAdmin.setBackground(new java.awt.Color(84, 166, 234));

        lblNombreUsuario.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpTituloAdminLayout = new javax.swing.GroupLayout(jpTituloAdmin);
        jpTituloAdmin.setLayout(jpTituloAdminLayout);
        jpTituloAdminLayout.setHorizontalGroup(
            jpTituloAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTituloAdminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpTituloAdminLayout.setVerticalGroup(
            jpTituloAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpFondo.add(jpTituloAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 910, 60));

        jpContenidoGeneralVendedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpContenidoGeneralVendedorLayout = new javax.swing.GroupLayout(jpContenidoGeneralVendedor);
        jpContenidoGeneralVendedor.setLayout(jpContenidoGeneralVendedorLayout);
        jpContenidoGeneralVendedorLayout.setHorizontalGroup(
            jpContenidoGeneralVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        jpContenidoGeneralVendedorLayout.setVerticalGroup(
            jpContenidoGeneralVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jpFondo.add(jpContenidoGeneralVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 910, 520));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jpFondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 240, 70));

        jpHeader.setBackground(new java.awt.Color(255, 255, 255));

        lblTextoTituloMenu.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblTextoTituloMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextoTituloMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpHeaderLayout = new javax.swing.GroupLayout(jpHeader);
        jpHeader.setLayout(jpHeaderLayout);
        jpHeaderLayout.setHorizontalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTextoTituloMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        jpHeaderLayout.setVerticalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTextoTituloMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpFondo.add(jpHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 910, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
        ShowPaneles(new NuevaVentaPanelAdmin());
        textoTitulo(1);
        
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        ShowPaneles(new VentasListadoGeneral2());
        textoTitulo(2);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ShowPaneles(new PanelBienvenidaVendedor());
        textoTitulo(0);
    }//GEN-LAST:event_jButton5ActionPerformed
     
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TiuloMenu;
    private javax.swing.JLabel banner;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpContenidoGeneralVendedor;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpTituloAdmin;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblTextoTituloMenu;
    private javax.swing.JLabel menuLabel;
    // End of variables declaration//GEN-END:variables
}
