package disenoNuevo;

import clases.Cliente;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import model.ClienteDaoRelacional;

public class ClientesPerfil extends javax.swing.JPanel {

    ClientesAdministrarUsuarios regresar;

    public ClientesPerfil() {
        initComponents();
        txtCodigo.setEnabled(false);
        txtCodigo.setVisible(false);
        lblCodigo.setVisible(false);
        jScodigo.setVisible(false);
        agregarDatosCombobox(); //inicializamos el combobox
    }

    public void agregarDatosCombobox() {
        jcGenero.addItem("m");
        jcGenero.addItem("f");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDBus = new javax.swing.JDialog();
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
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jScodigo = new javax.swing.JSeparator();
        txtNit = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jcGenero = new javax.swing.JComboBox<>();
        btnInsertar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txtCorreo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCancelarBusqueda = new javax.swing.JButton();

        jDBus.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Buscar Codigo");
        jDBus.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 130, 30));

        btnCancelar3.setText("Cancelar");
        btnCancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar3ActionPerformed(evt);
            }
        });
        jDBus.getContentPane().add(btnCancelar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 110, 20));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel11.setText("Codigo:");
        jDBus.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 50, 20));
        jDBus.getContentPane().add(txtCodigoBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 80, 30));

        btnBus.setText("Buscar");
        btnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusActionPerformed(evt);
            }
        });
        jDBus.getContentPane().add(btnBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 20));

        setPreferredSize(new java.awt.Dimension(860, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpFondo.setBackground(new java.awt.Color(255, 255, 255));
        jpFondo.setPreferredSize(new java.awt.Dimension(860, 410));
        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PERFIL VENDEDORES");
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
        jpFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 251, 20));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("NIT");
        jpFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 251, 20));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("Genero");
        jpFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 251, 29));

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
        jpFondo.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 100, 20));

        jScodigo.setBackground(new java.awt.Color(0, 0, 0));
        jScodigo.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jScodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 100, 6));

        txtNit.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNit.setBorder(null);
        txtNit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNitMousePressed(evt);
            }
        });
        txtNit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNitActionPerformed(evt);
            }
        });
        jpFondo.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 460, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 460, 6));

        jcGenero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jcGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcGeneroActionPerformed(evt);
            }
        });
        jpFondo.add(jcGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 250, 36));

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
        jpFondo.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 460, 10));

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
        jpFondo.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 460, -1));

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
        jpFondo.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 120, 40));

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
        jpFondo.add(btnCancelarBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 60, 40));

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

    private void txtNitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNitMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitMousePressed

    private void txtNitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if (txtNombre.getText().isEmpty() || txtNit.getText().isEmpty() || txtCorreo.getText().isEmpty()) {
            camposVacios();
        } else {
            guardarCliente();
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtNombre.getText().isEmpty() || txtNit.getText().isEmpty() || txtCorreo.getText().isEmpty()) {
            camposVacios();
        } else {
            int res = JOptionPane.showConfirmDialog(null, "Esta seguro de actualizar el cliente", "Alerta!", JOptionPane.YES_NO_OPTION);
            if (res == YES_OPTION) {
                actulizarCliente();
                vaciarCampos();
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         if (txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty()|| txtNit.getText().isEmpty() || txtCorreo.getText().isEmpty()) {
            camposVacios();
        } else{
            int res = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el cliente","Alerta!",JOptionPane.YES_NO_OPTION);
            if (res == YES_OPTION) {
                 eliminarCliente();
            }
        }  
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jcGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcGeneroActionPerformed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnCancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar3ActionPerformed
        jDBus.setVisible(false);
        txtCodigo.setVisible(false);
        lblCodigo.setVisible(false);
        jScodigo.setVisible(false);
    }//GEN-LAST:event_btnCancelar3ActionPerformed

    private void btnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusActionPerformed
        int cod = Integer.parseInt(txtCodigoBus.getText());
        buscarProducto(cod);
        jDBus.setVisible(false);

    }//GEN-LAST:event_btnBusActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        jcGenero.removeAllItems();
        jDBus.setVisible(true);
        jDBus.setSize(450, 200);
        jDBus.setLocationRelativeTo(null);
        txtCodigo.setVisible(true);
        lblCodigo.setVisible(true);
        jScodigo.setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBusquedaActionPerformed
        vaciarCampos();
    }//GEN-LAST:event_btnCancelarBusquedaActionPerformed

    public void guardarCliente() {

        String nombre = txtNombre.getText();
        int nit = Integer.parseInt(txtNit.getText());
        String co = txtCorreo.getText();
        String ge = String.valueOf(jcGenero.getSelectedItem());

        Cliente c = new Cliente(nombre, nit, co, ge);
        ClienteDaoRelacional in = new ClienteDaoRelacional();
        in.crear_cliente(c);
        JOptionPane.showMessageDialog(null, "Cliente " + nombre + " se agrego exitosamente!");
        vaciarCampos();
    }

    private void actulizarCliente() {
        int codigo = Integer.parseInt(txtCodigo.getText());
        String nombre = txtNombre.getText();
        int nit = Integer.parseInt(txtNit.getText());
        String co = txtCorreo.getText();
        String ge = String.valueOf(jcGenero.getSelectedItem());

        Cliente c = new Cliente(codigo,nombre, nit, co, ge);
        ClienteDaoRelacional in = new ClienteDaoRelacional();
        in.modificar_cliente(c);
        JOptionPane.showMessageDialog(null, "Cliente " + nombre + " se actualizo exitosamente!");
        vaciarCampos();
    }

    private void buscarProducto(int codigo) {
        int id = codigo;
        ClienteDaoRelacional in = new ClienteDaoRelacional();
        Cliente c = in.obtener_clientes(codigo);

        txtCodigo.setText(Integer.toString(c.getCodigo()));
        txtNombre.setText(c.getNombre());
        txtNit.setText(Integer.toString(c.getNit()));
        txtCorreo.setText(c.getCorreo());
        
        jcGenero.addItem(c.getGenero());
        if (c.getGenero().equals("m")) {
            jcGenero.addItem("f");
        } else if (c.getGenero().equals("f")) {
            jcGenero.addItem("m");
        }
    }
    
    private void eliminarCliente(){
        int id = Integer.parseInt(txtCodigo.getText());
        ClienteDaoRelacional in = new ClienteDaoRelacional();
        in.eliminar_cliente(id);
        JOptionPane.showMessageDialog(null, "Cliente eliminado");
        jcGenero.removeAllItems();
        vaciarCampos();
    }
    private void vaciarCampos() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtNit.setText("");
        txtCorreo.setText("");
        txtCodigo.setVisible(false);
        lblCodigo.setVisible(false);
        jScodigo.setVisible(false);

    }

    public void camposVacios() {

         if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aun no colocaste nombre del Cliente");
        } else if (txtNit.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El NIT es muy importante no te olvides de el");
        } else if (txtCorreo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Colocaste el correo del cliente?");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBus;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar3;
    private javax.swing.JButton btnCancelarBusqueda;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JDialog jDBus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jScodigo;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JComboBox<String> jcGenero;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoBus;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
