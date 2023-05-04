package ventanasPanelVendedor;

import clases.Cliente;
import clases.Factura;
import clases.Producto;
import clases.Vendedor;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Conexion;
import model.FacturaDaoRe;
import model.VenDaoRela;

public class NuevaVentaAgregarProductos extends javax.swing.JPanel {

    int idCliente = 0;
    int idVendedor = 0;
    float totalFactura = 0;

    public DefaultTableModel modelo;

    public NuevaVentaAgregarProductos() {

        initComponents();
        fechaFactura();
        asignarFactura();
        Vendedor nombre = null;
        datosVendedor(nombre);

    }

    public void datosCliente(Cliente cliente) {

    }

//
    public void datosVendedor(Vendedor vendedor) {
        // lblNombreC.setText("hoola " +vendedor.getCodigo()+"");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        txtCantidadProducto = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnVender = new javax.swing.JButton();
        btnAgregarProducto = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txtTotalVender = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblNoFac = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAplicarFiltro = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblFechaEmision = new javax.swing.JLabel();
        txtTotalVender1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        txtNombreProFiltro = new javax.swing.JTextField();
        btnFiltroPro = new javax.swing.JButton();
        jcFiltroPro = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtPrecioPro = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        lblNombrePro1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNombrePro = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        lblStock = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(860, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpFondo.setBackground(new java.awt.Color(255, 255, 255));
        jpFondo.setPreferredSize(new java.awt.Dimension(860, 410));
        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("No:");
        jpFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 30, 20));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Total:");
        jpFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 50, 20));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Cantidad Solicitada");
        jpFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 130, 20));

        txtCodigoProducto.setEditable(false);
        txtCodigoProducto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCodigoProducto.setBorder(null);
        txtCodigoProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCodigoProductoMousePressed(evt);
            }
        });
        txtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoActionPerformed(evt);
            }
        });
        jpFondo.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 70, -1));

        txtCantidadProducto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCantidadProducto.setBorder(null);
        txtCantidadProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCantidadProductoMousePressed(evt);
            }
        });
        txtCantidadProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadProductoActionPerformed(evt);
            }
        });
        jpFondo.add(txtCantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 120, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 110, 10));

        btnVender.setBackground(new java.awt.Color(84, 166, 234));
        btnVender.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnVender.setForeground(new java.awt.Color(255, 255, 255));
        btnVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BUSCAR.png"))); // NOI18N
        btnVender.setText("VENDER");
        btnVender.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnVender.setBorderPainted(false);
        btnVender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVender.setIconTextGap(15);
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });
        jpFondo.add(btnVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 170, 30));

        btnAgregarProducto.setBackground(new java.awt.Color(84, 166, 234));
        btnAgregarProducto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadirProducto.png"))); // NOI18N
        btnAgregarProducto.setText("AGREGAR");
        btnAgregarProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnAgregarProducto.setBorderPainted(false);
        btnAgregarProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregarProducto.setIconTextGap(15);
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        jpFondo.add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 130, 40));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 30, 10));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 120, -1));

        txtTotalVender.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtTotalVender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalVender.setBorder(null);
        txtTotalVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTotalVenderMousePressed(evt);
            }
        });
        txtTotalVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalVenderActionPerformed(evt);
            }
        });
        jpFondo.add(txtTotalVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 80, -1));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, 10));

        lblNoFac.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jpFondo.add(lblNoFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 60, 20));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 40, 10));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnAplicarFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnAplicarFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jpFondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 720, 180));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setText("Fecha:");
        jpFondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 50, 20));

        lblFechaEmision.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jpFondo.add(lblFechaEmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 80, 20));

        txtTotalVender1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtTotalVender1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalVender1.setText("Q.");
        txtTotalVender1.setBorder(null);
        txtTotalVender1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTotalVender1MousePressed(evt);
            }
        });
        txtTotalVender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalVender1ActionPerformed(evt);
            }
        });
        jpFondo.add(txtTotalVender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 30, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("Codigo");
        jpFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, 20));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, -1));

        txtNombreProFiltro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombreProFiltro.setBorder(null);
        txtNombreProFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreProFiltroMousePressed(evt);
            }
        });
        txtNombreProFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProFiltroActionPerformed(evt);
            }
        });
        jpFondo.add(txtNombreProFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, -1));

        btnFiltroPro.setBackground(new java.awt.Color(84, 166, 234));
        btnFiltroPro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnFiltroPro.setForeground(new java.awt.Color(255, 255, 255));
        btnFiltroPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BUSCAR.png"))); // NOI18N
        btnFiltroPro.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnFiltroPro.setBorderPainted(false);
        btnFiltroPro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFiltroPro.setIconTextGap(15);
        btnFiltroPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroProActionPerformed(evt);
            }
        });
        jpFondo.add(btnFiltroPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 50, 30));

        jcFiltroPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcFiltroProMouseClicked(evt);
            }
        });
        jcFiltroPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcFiltroProActionPerformed(evt);
            }
        });
        jpFondo.add(jcFiltroPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 220, 30));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel11.setText("Precio");
        jpFondo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 50, 20));

        txtPrecioPro.setEditable(false);
        txtPrecioPro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPrecioPro.setBorder(null);
        txtPrecioPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPrecioProMousePressed(evt);
            }
        });
        txtPrecioPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioProActionPerformed(evt);
            }
        });
        jpFondo.add(txtPrecioPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 100, -1));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 100, 10));

        lblNombrePro1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNombrePro1.setText("Nombre Producto");
        jpFondo.add(lblNombrePro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 20));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setText("Nombre");
        jpFondo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 70, 20));

        txtNombrePro.setEditable(false);
        txtNombrePro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombrePro.setBorder(null);
        txtNombrePro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreProMousePressed(evt);
            }
        });
        txtNombrePro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProActionPerformed(evt);
            }
        });
        jpFondo.add(txtNombrePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 180, -1));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 180, 10));

        lblStock.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblStock.setText("Stock");
        jpFondo.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 50, 20));

        txtStock.setEditable(false);
        txtStock.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtStock.setBorder(null);
        txtStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtStockMousePressed(evt);
            }
        });
        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });
        jpFondo.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 100, -1));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 100, 10));

        add(jpFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoProductoMousePressed

    }//GEN-LAST:event_txtCodigoProductoMousePressed

    private void txtCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProductoActionPerformed

    }//GEN-LAST:event_txtCodigoProductoActionPerformed

    private void txtCantidadProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadProductoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadProductoMousePressed

    private void txtCantidadProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadProductoActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        try {
            // agregarProductoFactura();
            datosFactura();
        } catch (ParseException ex) {
            Logger.getLogger(NuevaVentaAgregarProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        idCliente = NuevaVentaSeleccionarCliente.idCliente;
        idVendedor = VenDaoRela.idVendedor;

        agregarListaProductos();
        totalFacturPorCliente();
        llenar();

    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void txtTotalVenderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTotalVenderMousePressed

    }//GEN-LAST:event_txtTotalVenderMousePressed

    private void txtTotalVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalVenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalVenderActionPerformed

    private void txtTotalVender1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTotalVender1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalVender1MousePressed

    private void txtTotalVender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalVender1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalVender1ActionPerformed

    private void txtNombreProFiltroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreProFiltroMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProFiltroMousePressed

    private void txtNombreProFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProFiltroActionPerformed

    private void btnAplicarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarFiltroActionPerformed

    }//GEN-LAST:event_btnAplicarFiltroActionPerformed

    private void btnFiltroProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroProActionPerformed
        if (txtNombreProFiltro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa nombre de produto para buscar");
        } else {
            String n = txtNombreProFiltro.getText();
            filtroCliente(n);
        }

    }//GEN-LAST:event_btnFiltroProActionPerformed

    private void txtPrecioProMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioProMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioProMousePressed

    private void txtPrecioProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioProActionPerformed

    private void txtNombreProMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreProMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProMousePressed

    private void txtNombreProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProActionPerformed

    private void jcFiltroProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcFiltroProMouseClicked
        //System.out.println("seeee = " + jcFiltroPro.getSelectedItem());
    }//GEN-LAST:event_jcFiltroProMouseClicked

    private void jcFiltroProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcFiltroProActionPerformed

        seleccionarProducto();

    }//GEN-LAST:event_jcFiltroProActionPerformed

    private void txtStockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStockMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockMousePressed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso = new Conexion();

    List<Producto> listas = new ArrayList<>();

    public void filtroCliente(String nombre) {
        jcFiltroPro.removeAllItems();
        System.out.println("nombre = " + nombre);

        String sql = null;

        sql = "select * from productos where nombre like '" + nombre + "%' or nombre like '%" + nombre + "' or nombre like '%" + nombre + "%' or nombre='" + nombre + "';";

        int cont = 0;
        List<Producto> productos = new ArrayList<>();
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                cont++;
                Producto p = new Producto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getFloat(5));
                productos.add(p);
            }

            listas = productos;

            for (Producto p : productos) {
                jcFiltroPro.addItem(p.getNombre());
            }

            if (cont != 0) {
                JOptionPane.showMessageDialog(null, "Se encontraron " + cont + " resultados");
            } else if (cont == 1) {
                JOptionPane.showMessageDialog(null, "Se encontro " + cont + " resultado");
            } else {
                JOptionPane.showMessageDialog(null, "No hay resultados");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void seleccionarProducto() {
        String pSeleccionado = (String) jcFiltroPro.getSelectedItem();
        Producto pSelec = null;
        for (Producto p : listas) {
            if (p.getNombre().equals(pSeleccionado)) {
                pSelec = p;
                break;
            }
        }
        if (pSelec != null) {
            txtCodigoProducto.setText(Integer.toString(pSelec.getCodigo()));
            txtPrecioPro.setText(Float.toString(pSelec.getPrecio()));
            txtNombrePro.setText(pSelec.getNombre());
            txtStock.setText(Integer.toString(pSelec.getCantidad()));
        }
        int a = Integer.parseInt(txtStock.getText());
        if (a == 0) {
            btnAgregarProducto.setEnabled(false);
        } else if (a != 0) {
            btnAgregarProducto.setEnabled(true);
        }
    }

//    public void agregarProductoFactura() throws java.text.ParseException {
//        
//        String fecha = lblFechaEmision.getText();
//        String patron = "dd/MM/yyyy";
//        SimpleDateFormat sdf = new SimpleDateFormat(patron);
//        java.sql.Date fechasql = new java.sql.Date(sdf.parse(fecha).getTime());
//
//        int idVen = idVendedor;
//        int idCli = idCliente;
//        
//        System.out.println("cliente para mandar = " +idCliente);
//        System.out.println("vendedor para mandar = "+ idVendedor);
//        int idProdu = Integer.parseInt(txtCodigoProducto.getText());
//        int cantidad = Integer.parseInt(txtCantidadProducto.getText());
//        float precioUni = Float.parseFloat(txtPrecioPro.getText());
//       // FacturaDaoRe in = new FacturaDaoRe();
//        System.out.println("fecha = " + fechasql + ", vendedor = " + idVen + ", id cliente = " + idCli + ", id producto = " + idProdu + ", cantidad = " + cantidad + ", precion uni =" + precioUni);
//
//        //in.crear_factura(fechasql, idVen, idCli, idProdu, cantidad, precioUni);
//    }
    //Muestra la fecha actual.
    public void fechaFactura() {
        LocalDate fechaAc = LocalDate.now();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fe = fechaAc.format(formatoFecha);
        lblFechaEmision.setText(fe);
    }

    //muestra el numero de factura que sera creada;
    public void asignarFactura() {
        FacturaDaoRe in = new FacturaDaoRe();
        int numeroFactura = 0;
        for (Factura fa : in.mostrar_facturas()) {
            numeroFactura = fa.getId_factura();
        }
        int facturaNext = numeroFactura + 1;
        lblNoFac.setText(facturaNext + "");
    }

    //agrego los productos a una lista y mostrarlo al vendedor cuales selecciona
    LinkedList<Factura> fac = new LinkedList();

    public void agregarListaProductos() {

        int cod = Integer.parseInt(txtCodigoProducto.getText());
        String nom = txtNombrePro.getText();
        int cant = Integer.parseInt(txtCantidadProducto.getText());
        float pre = Float.parseFloat(txtPrecioPro.getText());
        float subTotal = cant * pre;
        Factura f = new Factura(cod, nom, cant, pre, subTotal);
        fac.add(f);
    }

    //calculamos el total de la factura
    public void totalFacturPorCliente() {
        float totalFac = 0;
        for (int i = 0; i < fac.size(); i++) {
            Factura faa = fac.get(i);
            totalFac += faa.getSubTotalProductos();
        }

        BigDecimal bd = new BigDecimal(Float.toString(totalFac));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        float redondeo = bd.floatValue();
        txtTotalVender.setText(Float.toString(redondeo));
        totalFactura = redondeo;
    }

    int factura = 0;

    //mandamos datos para crear la factura:
    public void datosFactura() throws ParseException {
        String fecha = lblFechaEmision.getText();
        String patron = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(patron);
        java.sql.Date fechasql = new java.sql.Date(sdf.parse(fecha).getTime());

        int idCli = idCliente;
        int idVen = idVendedor;
        float totalFac = totalFactura;
        FacturaDaoRe enviar = new FacturaDaoRe();

        System.out.println("datton enviado = " + fechasql + " - id vendedor = " + idVen + ", id cliente = " + idCli + ", total factura = " + totalFac);
        factura = enviar.crearFactura(fechasql, idVen, idCli, totalFac);
        System.out.println("id factura obtenida = " + factura);
        enviar.agregarPraFacturas(factura, fac);

    }

    //agregar productos a facturas
//     public void agregarProductosFactura(){
//        int idFac = factura;
//        
//         FacturaDaoRe enviar = new FacturaDaoRe();
//         enviar.agregarPraFacturas(idFac, fac);
//        
//    }
    //se llena la tabla con el pedido del cliente;
    public void llenar() {
        modelo = new DefaultTableModel(new String[]{"Codigo", "Nombre", "Cantidad", "Precio", "SubTotal"}, fac.size());
        jTable1.setModel(modelo);
        TableModel tabla = jTable1.getModel();
        for (int i = 0; i < fac.size(); i++) {
            Factura faa = fac.get(i);
            tabla.setValueAt(faa.getId_caodigoPro(), i, 0);
            tabla.setValueAt(faa.getNombrePro(), i, 1);
            tabla.setValueAt(faa.getCantidad(), i, 2);
            tabla.setValueAt(faa.getPrecio(), i, 3);
            tabla.setValueAt(faa.getSubTotalProductos(), i, 4);
        }
    }

    //creamos el PDF
//    public void exportarPDF() {
//        Document doc = new Document();
//        try {
////            String ruta = System.getProperty("user.home");
////            PdfWriter.getInstance(doc, new FileOutputStream(ruta + "/Desktop/Reporte_Productos.pdf"));
//            
//            FileOutputStream gen = new FileOutputStream("factura.pdf");
//            
//
//            PdfWriter.getInstance(doc, gen);
//            doc.open();
//            
//            Paragraph titulo = new Paragraph("Reporte de Clientes");
//            titulo.setAlignment(Element.ALIGN_CENTER);
//            Font fontTitulo = FontFactory.getFont(FontFactory.COURIER, 18, Font.BOLD, new BaseColor(0, 102, 204));
//            titulo.setFont(fontTitulo);
//            doc.add(titulo);
//
//            doc.add(new Paragraph("\n"));
//            PdfPTable tabla = new PdfPTable(4);
//            tabla.setWidthPercentage(100);
//
//            float[] cAn = {1f, 1f, 2f, 1f};
//            tabla.setWidths(cAn);
//
//            Font fontHeader = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.WHITE);
//
//            PdfPCell celdaNombre = new PdfPCell(new Phrase("Nombre", fontHeader));
//            celdaNombre.setBackgroundColor(BaseColor.GRAY);
//            tabla.addCell(celdaNombre);
//
//            PdfPCell celdaNit = new PdfPCell(new Phrase("Nit", fontHeader));
//            celdaNit.setBackgroundColor(BaseColor.GRAY);
//            tabla.addCell(celdaNit);
//
//            PdfPCell celdaCorreo = new PdfPCell(new Phrase("Correo", fontHeader));
//            celdaCorreo.setBackgroundColor(BaseColor.GRAY);
//            tabla.addCell(celdaCorreo);
//
//            PdfPCell celdaG = new PdfPCell(new Phrase("Genero", fontHeader));
//            celdaG.setBackgroundColor(BaseColor.GRAY);
//            tabla.addCell(celdaG);
//            try {
//                String sql = "select * from clientes";
//                con = acceso.Conectar();
//                ps = con.prepareStatement(sql);
//                rs = ps.executeQuery();
//                if (rs.next()) {
//                    do {
//                        tabla.addCell(rs.getString(2));
//                        tabla.addCell(rs.getString(3));
//                        tabla.addCell(rs.getString(4));
//                        tabla.addCell(rs.getString(5));
//                    } while (rs.next());
//                    doc.add(tabla);
//                }
//            } catch (DocumentException | SQLException e) {
//            }
//            doc.close();
//            JOptionPane.showMessageDialog(null, "Reporte Creado.");
//        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
//        }
//    }
    public void exportarPDF(int id) throws SQLException {
        Document doc = new Document();
        try {
//            String ruta = System.getProperty("user.home");
//            PdfWriter.getInstance(doc, new FileOutputStream(ruta + "/Desktop/Reporte_Productos.pdf"));
            String sql = "select vendedores.caja, factura.numero_factura, clientes.nit, clientes.nombre, factura.fechaEmision, factura.totalFactura \n"
                    + "from factura \n"
                    + "inner join vendedores on factura.id_vendedor = vendedores.codigo \n"
                    + "inner join clientes on factura.id_cliente = clientes.codigo where numero_factura ='" + id + "';";

            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, 1);
            rs = ps.executeQuery();
            rs.next();

            Document document = new Document(PageSize.A4, 50, 50, 50, 50);
            PdfWriter.getInstance(document, new FileOutputStream("factura.pdf"));
            document.open();

            PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(100);
            table.setSpacingBefore(20f);
            table.setSpacingAfter(20f);
            
            PdfPCell cell;
            cell = new PdfPCell(new Phrase("Fecha: "));
            cell.setBorder(Rectangle.NO_BORDER);
            table.addCell(cell);
            
            cell = new PdfPCell(new Phrase(rs.getDate("fecha").toString()));
            cell.setBorder(Rectangle.NO_BORDER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("Cliente: "));
            cell.setBorder(Rectangle.NO_BORDER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase(rs.getString("cliente")));
            cell.setBorder(Rectangle.NO_BORDER);
            table.addCell(cell);

            document.add(table);
            
            sql = "SELECT * FROM factura WHERE numero_factura='"+id+"';";
            ps = con.prepareStatement(sql);
             ps.setInt(1,);
            rs = ps.executeQuery();
            
            FileOutputStream gen = new FileOutputStream("factura.pdf");

            PdfWriter.getInstance(doc, gen);
            doc.open();

            Paragraph titulo = new Paragraph("Reporte de Clientes");
            titulo.setAlignment(Element.ALIGN_CENTER);
            Font fontTitulo = FontFactory.getFont(FontFactory.COURIER, 18, Font.BOLD, new BaseColor(0, 102, 204));
            titulo.setFont(fontTitulo);
            doc.add(titulo);

            doc.add(new Paragraph("\n"));
            PdfPTable tabla = new PdfPTable(4);
            tabla.setWidthPercentage(100);

            float[] cAn = {1f, 1f, 2f, 1f};
            tabla.setWidths(cAn);

            Font fontHeader = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.WHITE);

            PdfPCell celdaNombre = new PdfPCell(new Phrase("Nombre", fontHeader));
            celdaNombre.setBackgroundColor(BaseColor.GRAY);
            tabla.addCell(celdaNombre);

            PdfPCell celdaNit = new PdfPCell(new Phrase("Nit", fontHeader));
            celdaNit.setBackgroundColor(BaseColor.GRAY);
            tabla.addCell(celdaNit);

            PdfPCell celdaCorreo = new PdfPCell(new Phrase("Correo", fontHeader));
            celdaCorreo.setBackgroundColor(BaseColor.GRAY);
            tabla.addCell(celdaCorreo);

            PdfPCell celdaG = new PdfPCell(new Phrase("Genero", fontHeader));
            celdaG.setBackgroundColor(BaseColor.GRAY);
            tabla.addCell(celdaG);
            try {
                String sqls = "select * from clientes";
                con = acceso.Conectar();
                ps = con.prepareStatement(sqls);
                rs = ps.executeQuery();
                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                    } while (rs.next());
                    doc.add(tabla);
                }
            } catch (DocumentException | SQLException e) {
            }
            doc.close();
            JOptionPane.showMessageDialog(null, "Reporte Creado.");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnAplicarFiltro;
    private javax.swing.JButton btnFiltroPro;
    private javax.swing.JButton btnVender;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcFiltroPro;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JLabel lblFechaEmision;
    private javax.swing.JLabel lblNoFac;
    private javax.swing.JLabel lblNombrePro1;
    private javax.swing.JLabel lblStock;
    private javax.swing.JTextField txtCantidadProducto;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtNombrePro;
    private javax.swing.JTextField txtNombreProFiltro;
    private javax.swing.JTextField txtPrecioPro;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotalVender;
    private javax.swing.JTextField txtTotalVender1;
    // End of variables declaration//GEN-END:variables
}
