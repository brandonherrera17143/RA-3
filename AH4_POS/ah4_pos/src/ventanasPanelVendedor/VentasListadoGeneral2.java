package ventanasPanelVendedor;

import clases.Factura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Conexion;
import model.VenDaoRela;


public class VentasListadoGeneral2 extends javax.swing.JPanel {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso = new Conexion();
    
    public VentasListadoGeneral2() {
        initComponents();
        btnRegresarTabla.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegresarTabla = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        nit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        fac = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jcFacturas = new javax.swing.JComboBox<>();
        btnImprimir = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(910, 520));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        btnBuscar.setBackground(new java.awt.Color(84, 166, 234));
        btnBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BUSCAR.png"))); // NOI18N
        btnBuscar.setText("APLICAR FILTRO");
        btnBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnBuscar.setBorderPainted(false);
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscar.setIconTextGap(15);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 180, 30));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 230, 6));

        nombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombre.setBorder(null);
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreMousePressed(evt);
            }
        });
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 230, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Nombre");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 60, 20));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setText("Fecha");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 50, 20));

        fecha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fecha.setBorder(null);
        fecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fechaMousePressed(evt);
            }
        });
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });
        add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 230, -1));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 230, 6));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 230, -1));

        nit.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nit.setBorder(null);
        nit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nitMousePressed(evt);
            }
        });
        nit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nitActionPerformed(evt);
            }
        });
        add(nit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 230, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("NIT");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 30, 20));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 230, 10));

        fac.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fac.setBorder(null);
        fac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                facMousePressed(evt);
            }
        });
        fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facActionPerformed(evt);
            }
        });
        add(fac, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 230, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("No. Factura");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 80, 20));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setText("Filtrar por:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 80, 20));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 70, 10));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Filtrados:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 80, 20));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 60, 10));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTADO GENERAL");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 220, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setGridColor(new java.awt.Color(102, 102, 102));
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 830, 270));

        add(jcFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 150, -1));

        btnImprimir.setBackground(new java.awt.Color(84, 166, 234));
        btnImprimir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BUSCAR.png"))); // NOI18N
        btnImprimir.setText("IMPRIMIR");
        btnImprimir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnImprimir.setBorderPainted(false);
        btnImprimir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnImprimir.setIconTextGap(15);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarTablaActionPerformed
//        ShowPaneles(new TablaVendedores());
//        botonRegresar(false);
    }//GEN-LAST:event_btnRegresarTablaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (fac.getText().isEmpty() && nit.getText().isEmpty() && nombre.getText().isEmpty() && fecha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes ingresar al menos una dato para filtra! :(");
        } else{
            int f = -1;
            int ni = -1;
            String no = null;
            String fe = null;
            
            if (fac.getText().isEmpty()) {
                f = -1;
            }else{
                f = Integer.parseInt(fac.getText());
            }
            
            if (nit.getText().isEmpty()) {
                ni = -1;
            }else{
                ni = Integer.parseInt(nit.getText());
            }
            if (nombre.getText().isEmpty()) {
                no = null;
            }else{
                no = nombre.getText();
            }
            if (fecha.getText().isEmpty()) {
                fe = null;
            }else{
                fe = fecha.getText();
            }
            int idVen = VenDaoRela.idVendedor;
            filtroCliente(idVen,f,ni,no,fe);
            llenar();
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void nombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreMousePressed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void fechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaMousePressed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed

    private void nitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nitMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nitMousePressed

    private void nitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nitActionPerformed

    private void facMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facMousePressed

    }//GEN-LAST:event_facMousePressed

    private void facActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facActionPerformed

    }//GEN-LAST:event_facActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        try {
            clienteSeleccionado();
        } catch (SQLException ex) {
            Logger.getLogger(VentasListadoGeneral2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    public void botonRegresar(boolean click) {
        
        if (click) {
            btnRegresarTabla.setVisible(true);
        } else {
            btnRegresarTabla.setVisible(false);
        }

    }
    
     LinkedList<Factura> result = new LinkedList();
    public void filtroCliente(int id_vendedor, int fac, int nit, String nombre, String fecha) {
        
        int faOb;
        String nombreOb;
        int nitOb; 
        Date fechaOb;
        float totalFacOb;
        String sql = null;

        if (fac >= 0 && nit == -1 && nombre == null && fecha == null) { // factura   ********
            sql = """
                  select factura.numero_factura, clientes.nit, clientes.nombre, factura.fechaEmision, factura.totalFactura
                  from clientes
                  INNER JOIN factura on clientes.codigo = factura.id_vendedor WHERE id_vendedor = '"""+id_vendedor+"'\n" 
                    + "and (numero_factura like '"+fac+"%' or numero_factura like '%"+fac+"' or numero_factura like '%"+fac+"%' or numero_factura ='"+fac+"');";
        } else if(fac == -1 && nit >= 0 && nombre == null && fecha == null){ // nit   ********
            sql = """
                  select factura.numero_factura, clientes.nit, clientes.nombre, factura.fechaEmision, factura.totalFactura
                  from clientes
                  INNER JOIN factura on clientes.codigo = factura.id_vendedor WHERE id_vendedor = '"""+id_vendedor+"'\n" 
                    + "and (nit like '"+nit+"%' or nit like '%"+nit+"' or nit like '%"+nit+"%' or nit ='"+nit+"');";
        } else if(fac == -1 && nit == -1 && nombre != null && fecha == null){ // NOMBRE   ********
            sql = """
                  select factura.numero_factura, clientes.nit, clientes.nombre, factura.fechaEmision, factura.totalFactura
                  from clientes
                  INNER JOIN factura on clientes.codigo = factura.id_vendedor WHERE id_vendedor = '"""+id_vendedor+"'\n" 
                    + "and (nombre like '"+nombre+"%' or nombre like '%"+nombre+"' or nombre like '%"+nombre+"%' or nombre ='"+nombre+"');";
        } else if(fac == -1 && nit == -1 && nombre == null && fecha != null){ // FECHA   ********
            sql = """
                  select factura.numero_factura, clientes.nit, clientes.nombre, factura.fechaEmision, factura.totalFactura
                  from clientes
                  INNER JOIN factura on clientes.codigo = factura.id_vendedor WHERE id_vendedor = '"""+id_vendedor+"'\n" 
                    + "and (fechaEmision ='"+fecha+"');";
        } else if(fac >= 0 && nit >= 0 && nombre == null && fecha == null) { // factura   nit   ********
            sql = """
                  select factura.numero_factura, clientes.nit, clientes.nombre, factura.fechaEmision, factura.totalFactura
                  from clientes
                  INNER JOIN factura on clientes.codigo = factura.id_vendedor WHERE id_vendedor = '"""+id_vendedor+"'\n" 
                    + "and (numero_factura like '"+fac+"%' or numero_factura like '%"+fac+"' or numero_factura like '%"+fac+"%' or numero_factura ='"+fac+"')\n"
                    + "and (nit like '"+nit+"%' or nit like '%"+nit+"' or nit like '%"+nit+"%' or nit ='"+nit+"');";
        } else if (fac >= 0 && nit == -1 && nombre != null && fecha == null) { // factura   nombre  ********
            sql = """
                  select factura.numero_factura, clientes.nit, clientes.nombre, factura.fechaEmision, factura.totalFactura
                  from clientes
                  INNER JOIN factura on clientes.codigo = factura.id_vendedor WHERE id_vendedor = '"""+id_vendedor+"'\n" 
                    + "and (numero_factura like '"+fac+"%' or numero_factura like '%"+fac+"' or numero_factura like '%"+fac+"%' or numero_factura ='"+fac+"')\n"
                    + "and (nombre like '"+nombre+"%' or nombre like '%"+nombre+"' or nombre like '%"+nombre+"%' or nombre ='"+nombre+"');";
        } else if (fac >= 0 && nit == -1 && nombre == null && fecha != null) { // factura  fecha ********
            sql = """
                  select factura.numero_factura, clientes.nit, clientes.nombre, factura.fechaEmision, factura.totalFactura
                  from clientes
                  INNER JOIN factura on clientes.codigo = factura.id_vendedor WHERE id_vendedor = '"""+id_vendedor+"'\n" 
                    + "and (numero_factura like '"+fac+"%' or numero_factura like '%"+fac+"' or numero_factura like '%"+fac+"%' or numero_factura ='"+fac+"')\n"
                    + "and (fechaEmision ='"+fecha+"');";
        } else if(fac == -1 && nit >= 0 && nombre != null && fecha == null){ // nit nombre  ********
            sql = """
                  select factura.numero_factura, clientes.nit, clientes.nombre, factura.fechaEmision, factura.totalFactura
                  from clientes
                  INNER JOIN factura on clientes.codigo = factura.id_vendedor WHERE id_vendedor = '"""+id_vendedor+"'\n" 
                    + "and (nit like '"+nit+"%' or nit like '%"+nit+"' or nit like '%"+nit+"%' or nit ='"+nit+"')\n"
                    + "and (nombre like '"+nombre+"%' or nombre like '%"+nombre+"' or nombre like '%"+nombre+"%' or nombre ='"+nombre+"');";
        } else if(fac == -1 && nit >= 0 && nombre == null && fecha != null){ // nit fechaaa  ********
            sql = """
                  select factura.numero_factura, clientes.nit, clientes.nombre, factura.fechaEmision, factura.totalFactura
                  from clientes
                  INNER JOIN factura on clientes.codigo = factura.id_vendedor WHERE id_vendedor = '"""+id_vendedor+"'\n" 
                    + "and (nit like '"+nit+"%' or nit like '%"+nit+"' or nit like '%"+nit+"%' or nit ='"+nit+"')\n"
                    + "and (fechaEmision ='"+fecha+"');";
        } else if(fac == -1 && nit == -1 && nombre != null && fecha != null){ // NOMBRE fechaaa  ********
            sql = """
                  select factura.numero_factura, clientes.nit, clientes.nombre, factura.fechaEmision, factura.totalFactura
                  from clientes
                  INNER JOIN factura on clientes.codigo = factura.id_vendedor WHERE id_vendedor = '"""+id_vendedor+"'\n" 
                    + "and (nombre like '"+nombre+"%' or nombre like '%"+nombre+"' or nombre like '%"+nombre+"%' or nombre ='"+nombre+"')\n"
                    + "and (fechaEmision ='"+fecha+"');";
        } else if(fac >= 0 && nit >= 0 && nombre != null && fecha == null) { // factura   nit   nombre  **********
            sql = """
                  select factura.numero_factura, clientes.nit, clientes.nombre, factura.fechaEmision, factura.totalFactura
                  from clientes
                  INNER JOIN factura on clientes.codigo = factura.id_vendedor WHERE id_vendedor = '"""+id_vendedor+"'\n" 
                    + "and (numero_factura like '"+fac+"%' or numero_factura like '%"+fac+"' or numero_factura like '%"+fac+"%' or numero_factura ='"+fac+"')\n"
                    + "and (nit like '"+nit+"%' or nit like '%"+nit+"' or nit like '%"+nit+"%' or nit ='"+nit+"')\n"
                    + "and (nombre like '"+nombre+"%' or nombre like '%"+nombre+"' or nombre like '%"+nombre+"%' or nombre ='"+nombre+"');";
        } else if (fac >= 0 && nit == -1 && nombre != null && fecha != null) { // factura   nombre  fechaaa    ********
            sql = """
                  select factura.numero_factura, clientes.nit, clientes.nombre, factura.fechaEmision, factura.totalFactura
                  from clientes
                  INNER JOIN factura on clientes.codigo = factura.id_vendedor WHERE id_vendedor = '"""+id_vendedor+"'\n" 
                    + "and (numero_factura like '"+fac+"%' or numero_factura like '%"+fac+"' or numero_factura like '%"+fac+"%' or numero_factura ='"+fac+"')\n"
                    + "and (nombre like '"+nombre+"%' or nombre like '%"+nombre+"' or nombre like '%"+nombre+"%' or nombre ='"+nombre+"')\n"
                    + "and (fechaEmision ='"+fecha+"');";
        } else if(fac == -1 && nit >= 0 && nombre != null && fecha != null){ // nit nombre  fecha  ********
            sql = """
                  select factura.numero_factura, clientes.nit, clientes.nombre, factura.fechaEmision, factura.totalFactura
                  from clientes
                  INNER JOIN factura on clientes.codigo = factura.id_vendedor WHERE id_vendedor = '"""+id_vendedor+"'\n" 
                    + "and (nit like '"+nit+"%' or nit like '%"+nit+"' or nit like '%"+nit+"%' or nit ='"+nit+"')\n"
                    + "and (nombre like '"+nombre+"%' or nombre like '%"+nombre+"' or nombre like '%"+nombre+"%' or nombre ='"+nombre+"')\n"
                    + "and (fechaEmision ='"+fecha+"');"; 
        } else if(fac >= 0 && nit >= 0 && nombre != null && fecha != null) { // factura   nit   nombre    fecha **********
            sql = """
                  select factura.numero_factura, clientes.nit, clientes.nombre, factura.fechaEmision, factura.totalFactura
                  from clientes
                  INNER JOIN factura on clientes.codigo = factura.id_vendedor WHERE id_vendedor = '"""+id_vendedor+"'\n" 
                    + "and (numero_factura like '"+fac+"%' or numero_factura like '%"+fac+"' or numero_factura like '%"+fac+"%' or numero_factura ='"+fac+"')\n"
                    + "and (nit like '"+nit+"%' or nit like '%"+nit+"' or nit like '%"+nit+"%' or nit ='"+nit+"')\n"
                    + "and (nombre like '"+nombre+"%' or nombre like '%"+nombre+"' or nombre like '%"+nombre+"%' or nombre ='"+nombre+"')\n"
                    + "and (fechaEmision ='"+fecha+"');";
        }
        
      
        LinkedList<Factura> resultados = new LinkedList();
        int cont = 0;
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                cont++;
                faOb = rs.getInt(1);
                nitOb = rs.getInt(2);
                nombreOb = rs.getString(3);                
                fechaOb = rs.getDate(4);
                totalFacOb = rs.getFloat(5);
                resultados.add(new Factura(faOb,nitOb,nombreOb,fechaOb,totalFacOb));
            }
            
            result = resultados;
            for (Factura ff: resultados) {
                int idFactu = ff.getId_factura();
                jcFacturas.addItem(idFactu + "");
            }
    
            if (cont != 0) {   
                JOptionPane.showMessageDialog(null, "Se encontraron " + cont + " resultados");
            } else if (cont == 1) {
                JOptionPane.showMessageDialog(null, "Se encontro " + cont + " resultado");
            } else {
                JOptionPane.showMessageDialog(null, "No hay resultados");
            }
            System.out.println("contador = " + cont);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
     private DefaultTableModel modelo;
     public void llenar() {
        modelo = new DefaultTableModel(new String[]{"No. Factura", "Nit", "Nombre", "Fecha Compra", "Total Factura"}, result.size());
        jTable1.setModel(modelo);
        TableModel tabla = jTable1.getModel();
        for (int i = 0; i < result.size(); i++) {
            Factura faa = result.get(i);
            tabla.setValueAt(faa.getId_factura(), i, 0);
            tabla.setValueAt(faa.getNitCliente(), i, 1);
            tabla.setValueAt(faa.getNombreCliente(), i, 2);
            tabla.setValueAt(faa.getFecha_emision(), i, 3);
            tabla.setValueAt(faa.getTotal_factura(), i, 4);
        }
    }
     
     public int clienteSeleccionado() throws SQLException{
        int id = Integer.parseInt(jcFacturas.getSelectedItem().toString());
        int idfactura = 0;
        Factura factura = null;
        for(Factura factu: result){ 
            if (factu.getId_factura() == id ) {
                factura = factu;
                idfactura = factu.getId_factura();
                break;
            }
            
        }
        
        if(factura != null){
            int idFacImprimir = idfactura;
           // NuevaVentaAgregarProductos.lblNombreC.setText("Agregar productos a ");
            NuevaVentaAgregarProductos pdf = new NuevaVentaAgregarProductos();
            System.out.println("idfactura"+ idfactura);
            pdf.exportarPDF(idFacImprimir);
           
               
        }
        return id;
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnRegresarTabla;
    private javax.swing.JTextField fac;
    private javax.swing.JTextField fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcFacturas;
    private javax.swing.JTextField nit;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
