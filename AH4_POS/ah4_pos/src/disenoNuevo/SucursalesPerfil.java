package disenoNuevo;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import model.SucursalDaoRelacional;
import clases.Sucursales;

public class SucursalesPerfil extends javax.swing.JPanel {

    public int buscar;

    public SucursalesPerfil() {
        initComponents();
        txtCodigo.setEnabled(false);
        txtCodigo.setVisible(false);
        lblCodigo.setVisible(false);
        jScodigo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogBusquedaCodigo = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
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
        txtDireccion = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txtCorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        btnCancelarBusqueda = new javax.swing.JButton();

        jDialogBusquedaCodigo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Buscar Codigo");
        jDialogBusquedaCodigo.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 130, 30));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jDialogBusquedaCodigo.getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 110, 20));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setText("Codigo:");
        jDialogBusquedaCodigo.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 50, 20));
        jDialogBusquedaCodigo.getContentPane().add(txtCodigoBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 80, 30));

        btnBus.setText("Buscar");
        btnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusActionPerformed(evt);
            }
        });
        jDialogBusquedaCodigo.getContentPane().add(btnBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 20));

        setPreferredSize(new java.awt.Dimension(860, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpFondo.setBackground(new java.awt.Color(255, 255, 255));
        jpFondo.setPreferredSize(new java.awt.Dimension(860, 410));
        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PERFIL SUCURSALES");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 181, 40));

        lblCodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblCodigo.setText("Codigo");
        jpFondo.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 60, 20));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jpFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 251, 20));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Correo");
        jpFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 251, 20));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Direccion");
        jpFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 251, 20));

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
        jpFondo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 460, -1));

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
        jpFondo.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 90, 20));

        jScodigo.setBackground(new java.awt.Color(0, 0, 0));
        jScodigo.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jScodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 90, 6));

        txtDireccion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtDireccion.setBorder(null);
        txtDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDireccionMousePressed(evt);
            }
        });
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jpFondo.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 460, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 460, 6));

        btnBuscar.setBackground(new java.awt.Color(84, 166, 234));
        btnBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BUSCAR.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnBuscar.setBorderPainted(false);
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscar.setIconTextGap(15);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jpFondo.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 120, 40));

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
        jpFondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 460, 10));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 460, -1));

        txtCorreo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCorreo.setBorder(null);
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jpFondo.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 460, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setText("Telefono");
        jpFondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 251, 20));

        txtTelefono.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtTelefono.setBorder(null);
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTelefonoMousePressed(evt);
            }
        });
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jpFondo.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 460, 20));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 460, 6));

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

        add(jpFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 410));
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

    private void txtDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDireccionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionMousePressed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        jDialogBusquedaCodigo.setVisible(true);
        jDialogBusquedaCodigo.setSize(450, 200);
        jDialogBusquedaCodigo.setLocationRelativeTo(null);
        txtCodigo.setVisible(true);
        lblCodigo.setVisible(true);
        jScodigo.setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if (txtNombre.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtCorreo.getText().isEmpty() || txtTelefono.getText().isEmpty()) {
            camposVacios();
        } else {
            guardarSucursales();
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtCorreo.getText().isEmpty() || txtTelefono.getText().isEmpty()) {
            camposVacios();
        } else {
            int res = JOptionPane.showConfirmDialog(null, "Esta seguro de actualizar el producto", "Alerta!", JOptionPane.YES_NO_OPTION);
            if (res == YES_OPTION) {
                actualizarSucursal();
                vaciarCampos();
            }

        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtCorreo.getText().isEmpty() || txtTelefono.getText().isEmpty()) {
            camposVacios();
        } else {
            int res = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar la sucursal?", "Alerta!", JOptionPane.YES_NO_OPTION);
            if (res == YES_OPTION) {
                eliminarSucursal();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoMousePressed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnCancelarBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBusquedaActionPerformed
        vaciarCampos();
    }//GEN-LAST:event_btnCancelarBusquedaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        jDialogBusquedaCodigo.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusActionPerformed
        int cod = Integer.parseInt(txtCodigoBus.getText());
        buscarSucursal(cod);
        jDialogBusquedaCodigo.setVisible(false);
    }//GEN-LAST:event_btnBusActionPerformed

    public void guardarSucursales() {
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String correo = txtCorreo.getText();
        int telefono = Integer.parseInt(txtTelefono.getText());
        Sucursales sucursal = new Sucursales(nombre, direccion, correo, telefono);
        SucursalDaoRelacional in = new SucursalDaoRelacional();
        in.crear_sucursal(sucursal);
        JOptionPane.showMessageDialog(null, "La sucursal " + sucursal.getNombre() + " fue agregada exitosamente! ");
        vaciarCampos();
    }

    private void vaciarCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtCodigo.setVisible(false);
        lblCodigo.setVisible(false);
        jScodigo.setVisible(false);

    }

    public void buscarSucursal(int codigo) {
        SucursalDaoRelacional buscar = new SucursalDaoRelacional();
        Sucursales sucursal = buscar.obtener_sucursales(codigo);
        txtNombre.setText(sucursal.getNombre());
        txtDireccion.setText(sucursal.getDireccion());
        txtCorreo.setText(sucursal.getCorreo());
        txtTelefono.setText(sucursal.getTelefono() + "");
        txtCodigo.setText(sucursal.getCodido() + "");
    }

    private void actualizarSucursal() {

        int codigo = Integer.parseInt(txtCodigo.getText());
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String correo = txtCorreo.getText();
        int telefono = Integer.parseInt(txtTelefono.getText());

        Sucursales actualizarSucursal = new Sucursales(codigo, nombre, direccion, correo, telefono);
        SucursalDaoRelacional insertar = new SucursalDaoRelacional();
        insertar.modificar_sucursales(actualizarSucursal);
        JOptionPane.showMessageDialog(null, "Se actualizo el producto con el codigo: " + codigo);
    }

    private void eliminarSucursal() {
        int codigo = Integer.parseInt(txtCodigo.getText());
        SucursalDaoRelacional in = new SucursalDaoRelacional();
        in.eliminar_sucursales(codigo);
        JOptionPane.showMessageDialog(null, "Sucursal eliminada exitosamente!");
        vaciarCampos();
    }

    private void camposVacios() {

        if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aun no colocaste nombre de la sucursal");
        } else if (txtDireccion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregaste la direccion?");
        } else if (txtCorreo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seguro que ingresaste el correo?");
        } else if (txtTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ese telefono parece carpintero");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBus;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarBusqueda;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JDialog jDialogBusquedaCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jScodigo;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoBus;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
