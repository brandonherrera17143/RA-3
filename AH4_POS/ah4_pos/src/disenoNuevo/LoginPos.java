package disenoNuevo;

import clases.Vendedor;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.VenDaoRela;
import ventanasPanelVendedor.NuevaVentaAgregarProductos;
import ventanasPanelVendedor.PanelAdministrador;

public class LoginPos extends javax.swing.JFrame {
    
    int intentos = 3;
    PanelAdmin panel = new PanelAdmin();
    VenDaoRela in = new VenDaoRela();

    public LoginPos() {
        initComponents();
        this.setLocationRelativeTo(null);
        UIManager.put("Button.arc", 999);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPassMala = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtUser = new javax.swing.JTextField();
        txtCorreoNoExiste = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(400, 200));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jpFondo.setBackground(new java.awt.Color(255, 255, 255));
        jpFondo.setAutoscrolls(true);
        jpFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpFondo.setMinimumSize(new java.awt.Dimension(700, 530));
        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Usuario");
        jpFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, 20));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Password");
        jpFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 76, 20));

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INICIAR SESION");
        jpFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 209, 36));

        txtPassMala.setEditable(false);
        txtPassMala.setBackground(new java.awt.Color(255, 255, 255));
        txtPassMala.setForeground(new java.awt.Color(255, 0, 0));
        txtPassMala.setBorder(null);
        txtPassMala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassMalaMousePressed(evt);
            }
        });
        txtPassMala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassMalaActionPerformed(evt);
            }
        });
        txtPassMala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassMalaKeyPressed(evt);
            }
        });
        jpFondo.add(txtPassMala, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 269, 20));

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
        jpFondo.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 269, 20));

        btnIniciarSesion.setBackground(new java.awt.Color(18, 17, 75));
        btnIniciarSesion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("INGRESAR");
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseExited(evt);
            }
        });
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jpFondo.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 120, 40));

        btnSalir.setBackground(new java.awt.Color(18, 17, 75));
        btnSalir.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jpFondo.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 110, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 269, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 269, -1));

        txtUser.setBorder(null);
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserMousePressed(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });
        jpFondo.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 269, 20));

        txtCorreoNoExiste.setEditable(false);
        txtCorreoNoExiste.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreoNoExiste.setForeground(new java.awt.Color(255, 0, 0));
        txtCorreoNoExiste.setBorder(null);
        txtCorreoNoExiste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoNoExisteMousePressed(evt);
            }
        });
        txtCorreoNoExiste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoNoExisteActionPerformed(evt);
            }
        });
        txtCorreoNoExiste.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoNoExisteKeyPressed(evt);
            }
        });
        jpFondo.add(txtCorreoNoExiste, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 269, 20));

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

    private void txtPassMalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassMalaActionPerformed

    }//GEN-LAST:event_txtPassMalaActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed

        InicioLogin();

    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseEntered
        btnIniciarSesion.setBackground(new Color(115, 191, 250));
        btnIniciarSesion.setForeground(new Color(18, 17, 75));

    }//GEN-LAST:event_btnIniciarSesionMouseEntered

    private void btnIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseExited
        btnIniciarSesion.setBackground(new Color(18, 17, 75));
        btnIniciarSesion.setForeground(Color.white);
    }//GEN-LAST:event_btnIniciarSesionMouseExited

    private void txtPassMalaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMalaMousePressed

    }//GEN-LAST:event_txtPassMalaMousePressed

    private void txtPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMousePressed


    }//GEN-LAST:event_txtPassMousePressed

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(115, 191, 250));
        btnSalir.setForeground(new Color(18, 17, 75));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(18, 17, 75));
        btnSalir.setForeground(Color.white);
    }//GEN-LAST:event_btnSalirMouseExited

    private void txtPassMalaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassMalaKeyPressed
        txtPassMala.setForeground(Color.black);
    }//GEN-LAST:event_txtPassMalaKeyPressed

    private void txtUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserMousePressed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtCorreoNoExisteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoNoExisteMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoNoExisteMousePressed

    private void txtCorreoNoExisteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoNoExisteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoNoExisteActionPerformed

    private void txtCorreoNoExisteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoNoExisteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoNoExisteKeyPressed

    // INICIAMOS EL LOGIN  
//    public void InicioLogin() {
//
//        String correo = txtUser.getText();
//        String contra = txtPass.getText();
//        if (correo.equals("admin") && contra.equals("admin")) {
//            panel.setVisible(true);
//            this.dispose();
//        } else {
//            if (in.verificarCorreo(correo).equals(correo)) {
//                if (in.inicioSesion(txtUser.getText(), txtPass.getText())) {
//
//                    System.out.println("devuelvo = " +in.inicioSesion(txtUser.getText(), txtPass.getText()));
//
//                    this.dispose();    
//                } else {
//                    intentos -= 1;
//                    txtPassMala.setText("Contrasenia incorrecta, te quedan " + intentos + " intentos");
//                    txtCorreoNoExiste.setText("");
//                    if (intentos == 1) {
//                        txtPassMala.setText("Contrasenia incorrecta, te queda " + intentos + " intento");
//                        txtCorreoNoExiste.setText("");
//                    }
//                    if (intentos == 0) {
//                        JOptionPane.showMessageDialog(null, "Usuario " + correo + " Bloqueado");
//                        btnIniciarSesion.setEnabled(false);
//                        txtCorreoNoExiste.setText("");
//                        txtPassMala.setText("");
//                    }
//                }
//            } else {
//                txtCorreoNoExiste.setText("Usuario no existe");
//                txtPassMala.setText("");
//            }
//        }
//    }
    public void limpiarTexto(boolean limpiar) {
        if (limpiar) {
            txtCorreoNoExiste.setText("");
            txtPassMala.setText("");
            intentos = 0;
        }
    }

    public void InicioLogin() {

        String correo = txtUser.getText();
        String contra = txtPass.getText();
        if (correo.equals("admin") && contra.equals("admin")) {
            panel.setVisible(true);
            this.dispose();
        } else {
            if (in.verificarCorreo(correo).equals(correo)) {
                
                if (in.inicioSesion(txtUser.getText(), txtPass.getText())!= null) {
                    Vendedor ven = in.inicioSesion(txtUser.getText(), txtPass.getText());
                    NuevaVentaAgregarProductos datos = new NuevaVentaAgregarProductos();
                    datos.datosVendedor(ven);
                    PanelAdministrador panel = new PanelAdministrador();
                    panel.datosCliente(ven);
                    panel.setVisible(true);
                    System.out.println("devuelvo = " + in.inicioSesion(txtUser.getText(), txtPass.getText()));

                    this.dispose();
                } else {
                    intentos -= 1;
                    txtPassMala.setText("Contrasenia incorrecta, te quedan " + intentos + " intentos");
                    txtCorreoNoExiste.setText("");
                    if (intentos == 1) {
                        txtPassMala.setText("Contrasenia incorrecta, te queda " + intentos + " intento");
                        txtCorreoNoExiste.setText("");
                    }
                    if (intentos == 0) {
                        JOptionPane.showMessageDialog(null, "Usuario " + correo + " Bloqueado");
                        btnIniciarSesion.setEnabled(false);
                        txtCorreoNoExiste.setText("");
                        txtPassMala.setText("");
                    }
                }
            } else {
                txtCorreoNoExiste.setText("Usuario no existe");
                txtPassMala.setText("");
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JTextField txtCorreoNoExiste;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPassMala;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
