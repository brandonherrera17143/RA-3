package disenoNuevo;

import clases.Vendedor;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import model.VenDaoRela;

public class VendedoresPerfil extends javax.swing.JPanel {

    PanelAdminVendedores regresar;

    public VendedoresPerfil() {
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

        jDVen = new javax.swing.JDialog();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jScodigo = new javax.swing.JSeparator();
        txtCaja = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jcGenero = new javax.swing.JComboBox<>();
        btnGenerarPass = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txtVentas = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCancelarBusqueda = new javax.swing.JButton();

        jDVen.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Buscar Codigo");
        jDVen.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 130, 30));

        btnCancelar3.setText("Cancelar");
        btnCancelar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar3ActionPerformed(evt);
            }
        });
        jDVen.getContentPane().add(btnCancelar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 110, 20));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel11.setText("Codigo:");
        jDVen.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 50, 20));
        jDVen.getContentPane().add(txtCodigoBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 80, 30));

        btnBus.setText("Buscar");
        btnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusActionPerformed(evt);
            }
        });
        jDVen.getContentPane().add(btnBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 20));

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
        jpFondo.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 50, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jpFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 251, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Ventas");
        jpFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 251, 20));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Password");
        jpFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 251, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Caja");
        jpFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 251, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("Genero");
        jpFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 251, 29));

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
        jpFondo.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 70, 20));

        jScodigo.setBackground(new java.awt.Color(0, 0, 0));
        jScodigo.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jScodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 70, 6));

        txtCaja.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCaja.setBorder(null);
        txtCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCajaMousePressed(evt);
            }
        });
        txtCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCajaActionPerformed(evt);
            }
        });
        jpFondo.add(txtCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 460, -1));

        txtPass.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPass.setBorder(null);
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassMousePressed(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        jpFondo.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 337, 460, 20));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 460, 6));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 460, 6));

        jcGenero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jcGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcGeneroActionPerformed(evt);
            }
        });
        jpFondo.add(jcGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 250, 36));

        btnGenerarPass.setBackground(new java.awt.Color(84, 166, 234));
        btnGenerarPass.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnGenerarPass.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/generarPassword.png"))); // NOI18N
        btnGenerarPass.setText("GENERAR PASSWORD");
        btnGenerarPass.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnGenerarPass.setBorderPainted(false);
        btnGenerarPass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGenerarPass.setIconTextGap(15);
        btnGenerarPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPassActionPerformed(evt);
            }
        });
        jpFondo.add(btnGenerarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 220, 30));

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

        txtVentas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtVentas.setBorder(null);
        txtVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtVentasMousePressed(evt);
            }
        });
        txtVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVentasActionPerformed(evt);
            }
        });
        jpFondo.add(txtVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 460, -1));

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
        jpFondo.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 120, 40));

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
        jpFondo.add(btnCancelarBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 60, 40));

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

    private void txtCajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCajaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCajaMousePressed

    private void txtCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCajaActionPerformed

    private void txtPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassMousePressed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void btnGenerarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPassActionPerformed
        Vendedor pass = new Vendedor();
        txtPass.setText(pass.generadorContrasenia());
    }//GEN-LAST:event_btnGenerarPassActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if (txtNombre.getText().isEmpty() || txtCaja.getText().isEmpty() || txtVentas.getText().isEmpty() || txtPass.getText().isEmpty()) {
            camposVacios();
        } else {
            guardarVendedor();
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
         if (txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty() || txtCaja.getText().isEmpty() || txtVentas.getText().isEmpty() || txtPass.getText().isEmpty()) {
            camposVacios();
        } else {
            int res = JOptionPane.showConfirmDialog(null, "Esta seguro de actualizar el vendedor", "Alerta!", JOptionPane.YES_NO_OPTION);
            if (res == YES_OPTION) {
                actualizarVendedor();
                vaciarCampos();
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty() || txtCaja.getText().isEmpty() || txtVentas.getText().isEmpty() || txtPass.getText().isEmpty()) {
            camposVacios();
        } else{
            int res = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el cliente","Alerta!",JOptionPane.YES_NO_OPTION);
            if (res == YES_OPTION) {
                 eliminarVendedor();
            }
        }  
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jcGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcGeneroActionPerformed

    private void txtVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVentasMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVentasMousePressed

    private void txtVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVentasActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        jcGenero.removeAllItems();
        jDVen.setVisible(true);
        jDVen.setSize(450, 200);
        jDVen.setLocationRelativeTo(null);
        txtCodigo.setVisible(true);
        lblCodigo.setVisible(true);
        jScodigo.setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBusquedaActionPerformed
        vaciarCampos();
    }//GEN-LAST:event_btnCancelarBusquedaActionPerformed

    private void btnCancelar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar3ActionPerformed
        jDVen.setVisible(false);
        txtCodigo.setVisible(false);
        lblCodigo.setVisible(false);
        jScodigo.setVisible(false);
    }//GEN-LAST:event_btnCancelar3ActionPerformed

    private void btnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusActionPerformed
        int cod = Integer.parseInt(txtCodigoBus.getText());
        buscarVendedor(cod);
        jDVen.setVisible(false);
    }//GEN-LAST:event_btnBusActionPerformed

    public void guardarVendedor() {
        String nombre = txtNombre.getText();
        int c = Integer.parseInt(txtCaja.getText());
        int v = Integer.parseInt(txtVentas.getText());
        String ge = String.valueOf(jcGenero.getSelectedItem());
        String pass = txtPass.getText();

        Vendedor ve = new Vendedor(nombre,c,v,ge,pass);
        VenDaoRela in = new VenDaoRela();
        in.crear_vendedor(ve);
        JOptionPane.showMessageDialog(null, "Vendedor " + nombre + " se agrego exitosamente!");
        vaciarCampos();   
    }
    
    private void vaciarCampos(){
        txtCodigo.setText("");
        txtNombre.setText("");
        txtCaja.setText("");
        txtVentas.setText("");
        txtPass.setText("");
        txtCodigo.setVisible(false);
        lblCodigo.setVisible(false);
        jScodigo.setVisible(false);
    }

    private void buscarVendedor(int codigo) {
         int id = codigo;
        VenDaoRela ac = new VenDaoRela();
        Vendedor v = ac.obtener_vendedor(id);

        txtCodigo.setText(Integer.toString(v.getCodigo()));
        txtNombre.setText(v.getNombre());
        txtCaja.setText(Integer.toString(v.getCaja()));
        txtVentas.setText(Integer.toString(v.getVentas()));
        
        jcGenero.addItem(v.getGenero());
        if (v.getGenero().equals("m")) {
            jcGenero.addItem("f");
        } else if (v.getGenero().equals("f")) {
            jcGenero.addItem("m");
        }
        
        txtPass.setText(v.getPass());
    }
    
    private void actualizarVendedor(){
        int codigo = Integer.parseInt(txtCodigo.getText());
        String nombre = txtNombre.getText();
        int ca = Integer.parseInt(txtCaja.getText());
        int ve = Integer.parseInt(txtVentas.getText());
        String ge = String.valueOf(jcGenero.getSelectedItem());
        String pass = txtPass.getText();

        Vendedor in = new Vendedor(codigo,nombre,ca,ve,ge,pass);
        VenDaoRela ac = new VenDaoRela();
        ac.modificar_vendedor(in);
        JOptionPane.showMessageDialog(null, "Vendedor " + nombre + " se actualizo exitosamente!");
        vaciarCampos();       
    }

    private void eliminarVendedor() {
        int id = Integer.parseInt(txtCodigo.getText());
        VenDaoRela ac = new VenDaoRela();
        ac.eliminar_vendedor(id);
        JOptionPane.showMessageDialog(null, "Vendedor eliminado");
        jcGenero.removeAllItems();
        vaciarCampos();
    }

    private void camposVacios() {

        if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aun no colocaste nombre del vendedor");
        } else if (txtCaja.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Te falta el dato de la Caja");
        } else if (txtVentas.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Te falta el dato de la venta");
        } else if (txtPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Te faltan credenciales del vendedor");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBus;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar3;
    private javax.swing.JButton btnCancelarBusqueda;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerarPass;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JDialog jDVen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jScodigo;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JComboBox<String> jcGenero;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JTextField txtCaja;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoBus;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtVentas;
    // End of variables declaration//GEN-END:variables
}
