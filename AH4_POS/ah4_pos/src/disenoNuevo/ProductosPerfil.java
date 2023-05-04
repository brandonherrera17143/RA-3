package disenoNuevo;

import clases.Producto;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.JPanel;
import model.ProductoDaoRelacional;

public class ProductosPerfil extends javax.swing.JPanel {

    public int buscar;

    public ProductosPerfil() {
        initComponents();
        txtCodigo.setEnabled(false);
        txtCodigo.setVisible(false);
        lblCodigo.setVisible(false);
        jScodigo.setVisible(false);
    }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogBusCodSuc = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        btnCancelar3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtCodigoBus = new javax.swing.JTextField();
        btnBus = new javax.swing.JButton();
        jpFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jScodigo = new javax.swing.JSeparator();
        txtDescripcion = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnInsertar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txtCantidad = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        txtPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnBuscar1 = new javax.swing.JButton();
        btnCancelarBusqueda = new javax.swing.JButton();

        jDialogBusCodSuc.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Buscar Codigo");
        jDialogBusCodSuc.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 130, 30));

        btnCancelar3.setText("Cancelar");
        btnCancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar3ActionPerformed(evt);
            }
        });
        jDialogBusCodSuc.getContentPane().add(btnCancelar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 110, 20));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel11.setText("Codigo:");
        jDialogBusCodSuc.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 50, 20));
        jDialogBusCodSuc.getContentPane().add(txtCodigoBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 80, 30));

        btnBus.setText("Buscar");
        btnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusActionPerformed(evt);
            }
        });
        jDialogBusCodSuc.getContentPane().add(btnBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 20));

        setPreferredSize(new java.awt.Dimension(860, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpFondo.setBackground(new java.awt.Color(255, 255, 255));
        jpFondo.setPreferredSize(new java.awt.Dimension(860, 410));
        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PERFIL PRODUCTO");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 181, 40));

        lblCodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblCodigo.setText("Codigo");
        jpFondo.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 60, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jpFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 70, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad");
        jpFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 251, 20));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Descripcion");
        jpFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 251, 30));

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jpFondo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 460, -1));

        txtCodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCodigo.setBorder(null);
        txtCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCodigoMousePressed(evt);
            }
        });
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jpFondo.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 80, 20));

        jScodigo.setBackground(new java.awt.Color(0, 0, 0));
        jScodigo.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jScodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 80, 6));

        txtDescripcion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtDescripcion.setBorder(null);
        txtDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDescripcionMousePressed(evt);
            }
        });
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jpFondo.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 460, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 460, 6));

        btnInsertar.setBackground(new java.awt.Color(84, 166, 234));
        btnInsertar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btnInsertar.setText("INSERTAR");
        btnInsertar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnInsertar.setBorderPainted(false);
        btnInsertar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInsertar.setIconTextGap(15);
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        jpFondo.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 150, 40));

        btnActualizar.setBackground(new java.awt.Color(84, 166, 234));
        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnActualizar.setBorderPainted(false);
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnActualizar.setIconTextGap(15);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jpFondo.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 150, 40));

        btnEliminar.setBackground(new java.awt.Color(84, 166, 234));
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnEliminar.setBorderPainted(false);
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminar.setIconTextGap(15);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jpFondo.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 150, 50));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 460, 30));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 460, 30));

        txtCantidad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCantidad.setBorder(null);
        txtCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCantidadMousePressed(evt);
            }
        });
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jpFondo.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 460, -1));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 460, 6));

        txtPrecio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPrecio.setBorder(null);
        txtPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPrecioMousePressed(evt);
            }
        });
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jpFondo.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 460, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setText("Precio");
        jpFondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 251, 20));

        btnBuscar1.setBackground(new java.awt.Color(84, 166, 234));
        btnBuscar1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BUSCAR.png"))); // NOI18N
        btnBuscar1.setText("BUSCAR");
        btnBuscar1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnBuscar1.setBorderPainted(false);
        btnBuscar1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscar1.setIconTextGap(15);
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        jpFondo.add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 120, 40));

        btnCancelarBusqueda.setBackground(new java.awt.Color(84, 166, 234));
        btnCancelarBusqueda.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCancelarBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        btnCancelarBusqueda.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnCancelarBusqueda.setBorderPainted(false);
        btnCancelarBusqueda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCancelarBusqueda.setIconTextGap(15);
        btnCancelarBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarBusquedaActionPerformed(evt);
            }
        });
        jpFondo.add(btnCancelarBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 60, 40));

        add(jpFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed

    }//GEN-LAST:event_txtNombreMousePressed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCodigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoMousePressed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtDescripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionMousePressed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if (txtNombre.getText().isEmpty() || txtDescripcion.getText().isEmpty() || txtCantidad.getText().isEmpty() || txtPrecio.getText().isEmpty()) {
            camposVacios();
        } else {
            guardarProducto();
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
         if (txtNombre.getText().isEmpty() || txtDescripcion.getText().isEmpty() || txtCantidad.getText().isEmpty() || txtPrecio.getText().isEmpty()) {
            camposVacios();
        } else {
            int res = JOptionPane.showConfirmDialog(null, "Esta seguro de actualizar el producto","Alerta!",JOptionPane.YES_NO_OPTION);
            if (res == YES_OPTION) {
                 actulizarProducto();
                 vaciarCampos();
            }      
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty()|| txtDescripcion.getText().isEmpty() || txtCantidad.getText().isEmpty() || txtPrecio.getText().isEmpty()) {
            camposVacios();
        } else{
            int res = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar la producto","Alerta!",JOptionPane.YES_NO_OPTION);
            if (res == YES_OPTION) {
                 eliminarProducto();
            }
        }  
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCantidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadMousePressed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtPrecioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioMousePressed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnCancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar3ActionPerformed
        jDialogBusCodSuc.setVisible(false);
        txtCodigo.setVisible(false);
        lblCodigo.setVisible(false);
        jScodigo.setVisible(false);
    }//GEN-LAST:event_btnCancelar3ActionPerformed

    private void btnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusActionPerformed
        int cod = Integer.parseInt(txtCodigoBus.getText());
        buscarProducto(cod);
        jDialogBusCodSuc.setVisible(false);
        
    }//GEN-LAST:event_btnBusActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        jDialogBusCodSuc.setVisible(true);
        jDialogBusCodSuc.setSize(450, 200);
        jDialogBusCodSuc.setLocationRelativeTo(null);
        txtCodigo.setVisible(true);
        lblCodigo.setVisible(true);
        jScodigo.setVisible(true);
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnCancelarBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBusquedaActionPerformed
        vaciarCampos();
    }//GEN-LAST:event_btnCancelarBusquedaActionPerformed

    public void guardarProducto() {
       String nombre = txtNombre.getText();
       String des = txtDescripcion.getText();
       int cant = Integer.parseInt(txtCantidad.getText());
       float precio = Float.parseFloat(txtPrecio.getText());
       Producto agre = new Producto(nombre,des,cant,precio);
       ProductoDaoRelacional insert = new ProductoDaoRelacional();
       insert.crear_producto(agre);
       JOptionPane.showMessageDialog(null, "Producto " +nombre+ " se agrego exitosamente!");
       vaciarCampos();
    }
    
    private void actulizarProducto(){
        int codigo = Integer.parseInt(txtCodigo.getText());
       String nombre = txtNombre.getText();
       String des = txtDescripcion.getText();
       int cant = Integer.parseInt(txtCantidad.getText());
       float precio = Float.parseFloat(txtPrecio.getText());
       
       Producto actualizar = new Producto(codigo,nombre,des,cant,precio);
       ProductoDaoRelacional actu = new ProductoDaoRelacional();
       actu.modificar_producto(actualizar);
       JOptionPane.showMessageDialog(null, "Producto " +nombre+ " se actualizo exitosamente!");
       vaciarCampos();
    }
    
    private void buscarProducto(int codigo){
        int id = codigo;
        ProductoDaoRelacional bus = new ProductoDaoRelacional();
        Producto p = bus.obtener_productos(codigo);
        txtCodigo.setText(Integer.toString(p.getCodigo()));
        txtNombre.setText(p.getNombre());
        txtDescripcion.setText(p.getDescripcion());
        txtCantidad.setText(Integer.toString(p.getCantidad()));
        txtPrecio.setText(Float.toString(p.getPrecio()));
    }
    
    private void eliminarProducto(){
        int id = Integer.parseInt(txtCodigo.getText());
        ProductoDaoRelacional delet = new ProductoDaoRelacional();
        delet.eliminar_producto(id);
        JOptionPane.showMessageDialog(null, "Produto eliminado");
        vaciarCampos();
    }
    private void vaciarCampos(){
        txtCodigo.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        txtCodigo.setVisible(false);
        lblCodigo.setVisible(false);
        jScodigo.setVisible(false);
    }

    private void camposVacios() {

        if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aun no colocaste nombre del vendedor");
        } else if (txtDescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Te falta descripcion del producto");
        } else if (txtCantidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Al parecer no colocaste una cantidad");
        } else if (txtPrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregaste el precio?");
        }

    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBus;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JButton btnCancelar3;
    private javax.swing.JButton btnCancelarBusqueda;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JDialog jDialogBusCodSuc;
    private javax.swing.JDialog jDialogBusquedaCodigo;
    private javax.swing.JDialog jDialogBusquedaCodigo1;
    private javax.swing.JDialog jDialogBusquedaCodigo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jScodigo;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoBus;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
