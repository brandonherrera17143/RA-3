package disenoNuevo;

import clases.Cliente;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.ClienteDaoRelacional;
import model.Conexion;
import model.JsonCargarDatos;

public class ClientesAdministrarUsuarios extends javax.swing.JPanel {

    
    public ClientesAdministrarUsuarios() {
        initComponents();
        initContent();
        btnRegresarTablaClientes.setVisible(false);
    }
    
    
     public void initContent() {
        ShowPaneles(new ClientesTabla());
    }

    public void ShowPaneles(JPanel a) {
        a.setSize(860, 410);
        a.setLocation(0, 0);

        jpContenidoClientes.removeAll();
        jpContenidoClientes.add(a, BorderLayout.CENTER);
        jpContenidoClientes.revalidate();
        jpContenidoClientes.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        btbAgregarClientes = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jpContenidoClientes = new javax.swing.JPanel();
        btnRegresarTablaClientes = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(910, 520));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton6.setBackground(new java.awt.Color(84, 166, 234));
        jButton6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exportar.png"))); // NOI18N
        jButton6.setText("EXPORTAR A PDF");
        jButton6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        jButton6.setBorderPainted(false);
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.setIconTextGap(15);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 180, 50));

        btbAgregarClientes.setBackground(new java.awt.Color(84, 166, 234));
        btbAgregarClientes.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btbAgregarClientes.setForeground(new java.awt.Color(255, 255, 255));
        btbAgregarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btbAgregarClientes.setText("MODIFICAR CLIENTE");
        btbAgregarClientes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btbAgregarClientes.setBorderPainted(false);
        btbAgregarClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btbAgregarClientes.setIconTextGap(15);
        btbAgregarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbAgregarClientesActionPerformed(evt);
            }
        });
        add(btbAgregarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 200, 50));

        jButton10.setBackground(new java.awt.Color(84, 166, 234));
        jButton10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cargar.png"))); // NOI18N
        jButton10.setText("CARGA MASIVA");
        jButton10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        jButton10.setBorderPainted(false);
        jButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton10.setIconTextGap(15);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 170, 50));

        javax.swing.GroupLayout jpContenidoClientesLayout = new javax.swing.GroupLayout(jpContenidoClientes);
        jpContenidoClientes.setLayout(jpContenidoClientesLayout);
        jpContenidoClientesLayout.setHorizontalGroup(
            jpContenidoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        jpContenidoClientesLayout.setVerticalGroup(
            jpContenidoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        add(jpContenidoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 860, 410));

        btnRegresarTablaClientes.setBackground(new java.awt.Color(84, 166, 234));
        btnRegresarTablaClientes.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRegresarTablaClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresarTablaClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/regresar.png"))); // NOI18N
        btnRegresarTablaClientes.setText("REGRESAR");
        btnRegresarTablaClientes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnRegresarTablaClientes.setBorderPainted(false);
        btnRegresarTablaClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegresarTablaClientes.setIconTextGap(15);
        btnRegresarTablaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarTablaClientesActionPerformed(evt);
            }
        });
        add(btnRegresarTablaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 150, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        exportarPDF();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btbAgregarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbAgregarClientesActionPerformed
        ShowPaneles(new ClientesPerfil());
        botonRegresar(true);
        
    }//GEN-LAST:event_btbAgregarClientesActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        ShowPaneles(new Blanco());
        JsonCargarDatos archivo = new JsonCargarDatos();
        String leerarchivo = archivo.leerarchivo();
        cargaMasiva(leerarchivo);
        ShowPaneles(new ClientesTabla());
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnRegresarTablaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarTablaClientesActionPerformed
        ShowPaneles(new ClientesTabla());
        botonRegresar(false);
    }//GEN-LAST:event_btnRegresarTablaClientesActionPerformed
    
    public void botonRegresar(boolean click) {
        
        if (click) {
            btnRegresarTablaClientes.setVisible(true);
        } else {
            btnRegresarTablaClientes.setVisible(false);
        }

    }
    
     private void cargaMasiva(String leerarchivo) {
        String archivo_retorno = leerarchivo;
        JsonParser parse = new JsonParser();
        JsonArray matriz = parse.parse(archivo_retorno).getAsJsonArray();

        for (int i = 0; i < matriz.size(); i++) {
            JsonObject object = matriz.get(i).getAsJsonObject();
            String nombre = object.get("nombre").getAsString();
            int nit= object.get("nit").getAsInt();
            String correo= object.get("correo").getAsString();
            String gen = object.get("genero").getAsString();

            Cliente c = new Cliente(nombre,nit,correo,gen);
            ClienteDaoRelacional in = new ClienteDaoRelacional();
            in.crear_cliente(c);
        }
    }

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso = new Conexion();

    public void exportarPDF() {
        Document doc = new Document();
        try {
//            String ruta = System.getProperty("user.home");
//            PdfWriter.getInstance(doc, new FileOutputStream(ruta + "/Desktop/Reporte_Productos.pdf"));
            
            FileOutputStream gen = new FileOutputStream("Reporte_Clientes.pdf");
            

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
                String sql = "select * from clientes";
                con = acceso.Conectar();
                ps = con.prepareStatement(sql);
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
    private javax.swing.JButton btbAgregarClientes;
    private javax.swing.JButton btnRegresarTablaClientes;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpContenidoClientes;
    // End of variables declaration//GEN-END:variables
}
