package ventanasPanelVendedor;

import clases.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import model.ClienteDaoRelacional;
import model.Conexion;

public class NuevaVentaSeleccionarCliente extends javax.swing.JPanel {
    public static int idCliente;

    public String idd = null;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso = new Conexion();

    public NuevaVentaSeleccionarCliente() {
        initComponents();
        llenarCombo();
    }

    private void llenarCombo() {
        jcGenero.addItem("");
        jcGenero.addItem("f");
        jcGenero.addItem("m");
        jcGeneroCli.addItem("m");
        jcGeneroCli.addItem("f");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdAgregarCli = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNombreCli = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        txtNitCli = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        txtCorreoCli = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jcGeneroCli = new javax.swing.JComboBox<>();
        btnInsertarCli = new javax.swing.JButton();
        btnCancelarBusqueda = new javax.swing.JButton();
        jpFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtNit = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jcGenero = new javax.swing.JComboBox<>();
        btnAplicarFiltro = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txtCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jcFiltroObtenido = new javax.swing.JComboBox<>();

        jdAgregarCli.setBackground(new java.awt.Color(255, 255, 255));
        jdAgregarCli.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setText("Genero");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 60, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setText("AGREGAR CLIENTE");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 170, 40));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setText("Nombre");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 60, 20));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setText("Nit");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 40, 30));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setText("Correo");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 50, 40));

        txtNombreCli.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombreCli.setBorder(null);
        txtNombreCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreCliMousePressed(evt);
            }
        });
        txtNombreCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCliActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 250, -1));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 250, 10));

        txtNitCli.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNitCli.setBorder(null);
        txtNitCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNitCliMousePressed(evt);
            }
        });
        txtNitCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNitCliActionPerformed(evt);
            }
        });
        jPanel1.add(txtNitCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 250, -1));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 250, 10));

        txtCorreoCli.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCorreoCli.setBorder(null);
        txtCorreoCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoCliMousePressed(evt);
            }
        });
        txtCorreoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoCliActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 250, -1));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 250, 10));

        jcGeneroCli.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jcGeneroCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcGeneroCliActionPerformed(evt);
            }
        });
        jPanel1.add(jcGeneroCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 250, 36));

        btnInsertarCli.setBackground(new java.awt.Color(84, 166, 234));
        btnInsertarCli.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnInsertarCli.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btnInsertarCli.setText("AGREGAR");
        btnInsertarCli.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnInsertarCli.setBorderPainted(false);
        btnInsertarCli.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInsertarCli.setIconTextGap(15);
        btnInsertarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarCliActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 140, 40));

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
        jPanel1.add(btnCancelarBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 60, 40));

        jdAgregarCli.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 370));

        setPreferredSize(new java.awt.Dimension(860, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpFondo.setBackground(new java.awt.Color(255, 255, 255));
        jpFondo.setPreferredSize(new java.awt.Dimension(860, 410));
        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECCIONAR CLIENTE");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 220, 40));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Cliente");
        jpFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 60, 20));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Filtrados:");
        jpFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 80, 20));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Correo");
        jpFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 50, 20));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("NIT");
        jpFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 30, 20));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("Genero");
        jpFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 50, 20));

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
        jpFondo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 230, 20));

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
        jpFondo.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 230, 20));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 230, 6));

        jcGenero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jcGenero.setBorder(null);
        jcGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcGeneroActionPerformed(evt);
            }
        });
        jpFondo.add(jcGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 160, 30));

        btnAplicarFiltro.setBackground(new java.awt.Color(84, 166, 234));
        btnAplicarFiltro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAplicarFiltro.setForeground(new java.awt.Color(255, 255, 255));
        btnAplicarFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BUSCAR.png"))); // NOI18N
        btnAplicarFiltro.setText("APLICAR FILTRO");
        btnAplicarFiltro.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnAplicarFiltro.setBorderPainted(false);
        btnAplicarFiltro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAplicarFiltro.setIconTextGap(15);
        btnAplicarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarFiltroActionPerformed(evt);
            }
        });
        jpFondo.add(btnAplicarFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 200, 30));

        btnNuevoCliente.setBackground(new java.awt.Color(84, 166, 234));
        btnNuevoCliente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnNuevoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btnNuevoCliente.setText("NUEVO CLIENTE");
        btnNuevoCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnNuevoCliente.setBorderPainted(false);
        btnNuevoCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevoCliente.setIconTextGap(15);
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });
        jpFondo.add(btnNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 190, 40));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 60, 10));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 230, -1));

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
        jpFondo.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 230, 20));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Nombre");
        jpFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 60, 20));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 230, 10));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setText("Filtrar por:");
        jpFondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, 20));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 70, 10));

        jcFiltroObtenido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jcFiltroObtenido.setBorder(null);
        jcFiltroObtenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcFiltroObtenidoActionPerformed(evt);
            }
        });
        jcFiltroObtenido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcFiltroObtenidoKeyReleased(evt);
            }
        });
        jpFondo.add(jcFiltroObtenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 270, 40));

        add(jpFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed

    }//GEN-LAST:event_txtNombreMousePressed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNitMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitMousePressed

    private void txtNitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitActionPerformed

    private void btnAplicarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarFiltroActionPerformed
        String g = jcGenero.getSelectedItem().toString();
        if (txtNombre.getText().isEmpty() && txtNit.getText().isEmpty() && txtCorreo.getText().isEmpty() && (g == null || g.trim().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Debes ingresar por lo menos un dato");
        } else {
            String nombre;
            int nit = 0;
            String correo;

            if (txtNombre.getText().isEmpty()) {
                nombre = null;
            } else {
                nombre = txtNombre.getText();
            }
            try {
                if (txtNit.getText().isEmpty()) {
                    nit = 0;
                } else {
                    nit = Integer.parseInt(txtNit.getText());
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Nit debe ser numero entero");
            }

            if (txtCorreo.getText().isEmpty()) {
                correo = null;
            } else {
                correo = txtCorreo.getText();
            }

            if (g == null || g.trim().isEmpty()) {
                g = null;
            } else {
                g = jcGenero.getSelectedItem().toString();
            }

            filtroCliente(nombre, nit, correo, g);
            String n = null;
        }
    }//GEN-LAST:event_btnAplicarFiltroActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        jdAgregarCli.setVisible(true);
        jdAgregarCli.setSize(510, 370);
        jdAgregarCli.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void jcGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcGeneroActionPerformed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void jcFiltroObtenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcFiltroObtenidoActionPerformed
        idd= Integer.toString(clienteSeleccionado());
        
        
        
    }//GEN-LAST:event_jcFiltroObtenidoActionPerformed

    private void txtNombreCliMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreCliMousePressed

    }//GEN-LAST:event_txtNombreCliMousePressed

    private void txtNombreCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCliActionPerformed

    }//GEN-LAST:event_txtNombreCliActionPerformed

    private void txtNitCliMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNitCliMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitCliMousePressed

    private void txtNitCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNitCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitCliActionPerformed

    private void txtCorreoCliMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoCliMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoCliMousePressed

    private void txtCorreoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoCliActionPerformed

    private void jcGeneroCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcGeneroCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcGeneroCliActionPerformed

    private void btnInsertarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarCliActionPerformed
        if (txtNombreCli.getText().isEmpty() || txtNitCli.getText().isEmpty() || txtCorreoCli.getText().isEmpty()) {
            camposVacios();
        } else {
            guardarCliente();
        }
    }//GEN-LAST:event_btnInsertarCliActionPerformed

    private void btnCancelarBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBusquedaActionPerformed
        jdAgregarCli.setVisible(false);
        vaciarCampos();
    }//GEN-LAST:event_btnCancelarBusquedaActionPerformed

    private void jcFiltroObtenidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcFiltroObtenidoKeyReleased

    }//GEN-LAST:event_jcFiltroObtenidoKeyReleased

    public void guardarCliente() {

        String nombre = txtNombreCli.getText();

        int nit = 0; //= Integer.parseInt(txtNitCli.getText());

        try {
            if (txtNit.getText().isEmpty()) {
                nit = 0;
            } else {
                nit = Integer.parseInt(txtNit.getText());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Nit debe ser numero entero");
        }

        String co = txtCorreoCli.getText();
        String ge = String.valueOf(jcGeneroCli.getSelectedItem());
        Cliente c = new Cliente(nombre, nit, co, ge);
        ClienteDaoRelacional in = new ClienteDaoRelacional();
        in.crear_cliente(c);
        JOptionPane.showMessageDialog(null, "Cliente " + nombre + " se agrego exitosamente!");
        vaciarCampos();
    }

    private void vaciarCampos() {
        txtNombreCli.setText("");
        txtNitCli.setText("");
        txtCorreoCli.setText("");
    }

    public void camposVacios() {

        if (txtNombreCli.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aun no colocaste nombre del Cliente");
        } else if (txtNitCli.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El NIT es muy importante no te olvides de el");
        } else if (txtCorreoCli.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Colocaste el correo del cliente?");
        }
    }

    
    LinkedList<Cliente> result = new LinkedList();
    public void filtroCliente(String nombre, int nit, String correo, String genero) {
        jcFiltroObtenido.removeAllItems();
        System.out.println("nombre = " + nombre + ", nit = " + nit + ", Correo = " + correo + ", genero = " + genero);
        int codigoOb;
        String nombreOb;
        int nitOb;
        String correoOb;
        String generoOb;
        String sql = null;

        if (nombre != null && nit == 0 && correo == null && genero == null) { // NOMBRE
            sql = "select * from clientes where nombre like '" + nombre + "%' or nombre like '%" + nombre + "' or nombre like '%" + nombre + "%' or nombre='" + nombre + "';";
        } else if (nombre == null && nit != 0 && correo == null && genero == null) {// NIT
            sql = "select * from clientes where nit like '" + nit + "%' or nit like '%" + nit + "' or nit like '%" + nit + "%' or nit = '" + nit + "';";
        } else if (nombre == null && nit == 0 && correo != null && genero == null) {// CORREO
            sql = "select * from clientes where correo like '" + correo + "%'or correo like '%" + correo + "%' or correo='" + correo + "';";
        } else if (nombre == null && nit == 0 && correo == null && genero != null) { // GENERO
            sql = "select * from clientes where Genero='" + genero + "';";
        } else if (nombre != null && nit != 0 && correo == null && genero == null) {// NOMBRE   NIT
            sql = "select * from clientes where (nombre like '" + nombre + "%' or nombre like '%" + nombre + "' or nombre like '%" + nombre + "%' or nombre='" + nombre + "')\n"
                    + "and (nit like '" + nit + "%' or nit like '%" + nit + "' or nit like '%" + nit + "%' or nit = '" + nit + "');";
        } else if (nombre != null && nit == 0 && correo != null && genero == null) {//  NOMBRE   CORREO
            sql = "select * from clientes where (nombre like '" + nombre + "%' or nombre like '%" + nombre + "' or nombre like '%" + nombre + "%' or nombre='" + nombre + "') AND (correo like '" + correo + "%' or correo like '%" + correo + "%' or correo='" + correo + "');";
        } else if (nombre != null && nit == 0 && correo == null && genero != null) {// NOMBRE  GENERO
            sql = "select * from clientes where (nombre like '" + nombre + "%' or nombre like '%" + nombre + "' or nombre like '%" + nombre + "%' or nombre='" + nombre + "') AND Genero='" + genero + "';";
        } else if (nombre == null && nit != 0 && correo != null && genero == null) { // NIT   CORREO
            sql = "select * from clientes where (nit like '" + nit + "%' or nit like '%" + nit + "' or nit like '%" + nit + "%' or nit = '" + nit + "')\n"
                    + "AND (correo like '" + correo + "%' or correo like '%" + correo + "%' or correo='" + correo + "');";
        } else if (nombre == null && nit != 0 && correo == null && genero != null) { // NIT   GENERO
            sql = "select * from clientes where (nit like '" + nit + "%' or nit like '%" + nit + "' or nit like '%" + nit + "%' or nit = '" + nit + "') AND Genero='" + genero + "';";
        } else if (nombre == null && nit == 0 && correo != null && genero != null) { // CORREO  GENERO
            sql = "select * from clientes where (correo like '" + correo + "%'or correo like '%" + correo + "%' or correo='" + correo + "') AND Genero='" + genero + "';";
        } else if (nombre != null && nit != 0 && correo != null && genero == null) {// NOMBRE  NIT   CORREO
            sql = "select * from clientes where (nombre like '" + nombre + "%' or nombre like '%" + nombre + "' or nombre like '%" + nombre + "%' or nombre='" + nombre + "')\n"
                    + "AND (nit like '" + nit + "%' or nit like '%" + nit + "' or nit like '%" + nit + "%' or nit = '" + nit + "')\n"
                    + "AND (correo like '" + correo + "%' or correo like '%" + correo + "%' or correo='" + correo + "');";
        } else if (nombre != null && nit != 0 && correo == null && genero != null) { // NOMBRE  NIT  GENERO
            sql = "select * from clientes where (nombre like '" + nombre + "%' or nombre like '%" + nombre + "' or nombre like '%" + nombre + "%' or nombre='" + nombre + "')\n"
                    + "AND (nit like '" + nit + "%' or nit like '%" + nit + "' or nit like '%" + nit + "%' or nit = '" + nit + "')  AND (Genero='" + genero + "');";
        } else if (nombre != null && nit == 0 && correo != null && genero != null) { // NOMBRE  CORREO   GENERO
            sql = "select * from clientes where (nombre like '" + nombre + "%' or nombre like '%" + nombre + "' or nombre like '%" + nombre + "%' or nombre='" + nombre + "')\n"
                    + "AND (correo like '" + correo + "%' or correo like '%" + correo + "%' or correo='" + correo + "') AND (Genero='" + genero + "');";
        } else if (nombre == null && nit != 0 && correo != null && genero != null) { // NIT  CORREO  GENERO
            sql = "select * from clientes where (nit like '" + nit + "%' or nit like '%" + nit + "' or nit like '%" + nit + "%' or nit = '" + nit + "')\n"
                    + "AND (correo like '" + correo + "%' or correo like '%" + correo + "%' or correo='" + correo + "') AND (Genero='" + genero + "');";
        } else if (nombre != null && nit != 0 && correo != null && genero != null) {// NOMBRE  NIT   CORRE  GENERO
            sql = "select * from clientes where (nombre like '" + nombre + "%' or nombre like '%" + nombre + "' or nombre like '%" + nombre + "%' or nombre='" + nombre + "')\n"
                    + "AND (nit like '" + nit + "%' or nit like '%" + nit + "' or nit like '%" + nit + "%' or nit = '" + nit + "')\n"
                    + "AND (correo like '" + correo + "%' or correo like '%" + correo + "%' or correo='" + correo + "') AND (Genero='" + genero + "');";
        }

        LinkedList<Cliente> resultados = new LinkedList();
        int cont = 0;
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                cont++;
                codigoOb = rs.getInt(1);
                nombreOb = rs.getString(2);
                nitOb = rs.getInt(3);
                correoOb = rs.getString(4);
                generoOb = rs.getString(5);
                resultados.add(new Cliente(codigoOb, nombreOb, nitOb, correoOb, generoOb));
            }
            
            result = resultados;
         
            for (Cliente c : resultados) {

                System.out.println("nombre = " + c.getNombre());
                String n = c.getNombre();
                
                jcFiltroObtenido.addItem(n);
            }
 
            if (cont != 0) {
                NuevaVentaPanelAdmin.btnAgregarProducto.setVisible(true);
                
                JOptionPane.showMessageDialog(null, "Se encontraron " + cont + " resultados");
            } else if (cont == 1) {
                NuevaVentaPanelAdmin.btnAgregarProducto.setVisible(true);

                JOptionPane.showMessageDialog(null, "Se encontro " + cont + " resultado");
            } else {
                NuevaVentaPanelAdmin.btnAgregarProducto.setVisible(false);
                JOptionPane.showMessageDialog(null, "No hay resultados");
            }
            System.out.println("contador = " + cont);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    
    public int clienteSeleccionado(){
        String nombre = (String) jcFiltroObtenido.getSelectedItem();
        int id = 0;
        Cliente cliente = null;
        for(Cliente c: result){ 
            if (c.getNombre().equals(nombre)) {
                cliente = c;
                id = c.getCodigo();
                break;
            }
            
        }
        idCliente = id;
        System.out.println("id seleccionadoooooooooooo = " + id);
        if(cliente != null){
           // NuevaVentaAgregarProductos.lblNombreC.setText("Agregar productos a ");
            NuevaVentaAgregarProductos facCliente = new NuevaVentaAgregarProductos();
            facCliente.datosCliente(cliente);
           
               
        }
        return id;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicarFiltro;
    private javax.swing.JButton btnCancelarBusqueda;
    private javax.swing.JButton btnInsertarCli;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JComboBox<String> jcFiltroObtenido;
    private javax.swing.JComboBox<String> jcGenero;
    private javax.swing.JComboBox<String> jcGeneroCli;
    private javax.swing.JDialog jdAgregarCli;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreoCli;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNitCli;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreCli;
    // End of variables declaration//GEN-END:variables

}
