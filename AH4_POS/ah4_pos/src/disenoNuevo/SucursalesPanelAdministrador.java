package disenoNuevo;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
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
import model.Conexion;
import model.JsonCargarDatos;
import model.SucursalDaoRelacional;
import clases.Sucursales;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;

public class SucursalesPanelAdministrador extends javax.swing.JPanel {

    public SucursalesPanelAdministrador() {
        initComponents();
        initContent();
        btnRegresarTabla.setVisible(false);
    }

    public void initContent() {
        ShowPaneles(new SucursalesTabla());
    }

    public void ShowPaneles(JPanel a) {
        a.setSize(860, 410);
        a.setLocation(0, 0);

        jpContenidoSucursales.removeAll();
        jpContenidoSucursales.add(a, BorderLayout.CENTER);
        jpContenidoSucursales.revalidate();
        jpContenidoSucursales.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        btbAgregar = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jpContenidoSucursales = new javax.swing.JPanel();
        btnRegresarTabla = new javax.swing.JButton();

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

        btbAgregar.setBackground(new java.awt.Color(84, 166, 234));
        btbAgregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btbAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btbAgregar.setText("MODIFICAR SUCURSAL");
        btbAgregar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btbAgregar.setBorderPainted(false);
        btbAgregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btbAgregar.setIconTextGap(15);
        btbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbAgregarActionPerformed(evt);
            }
        });
        add(btbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 220, 50));

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

        javax.swing.GroupLayout jpContenidoSucursalesLayout = new javax.swing.GroupLayout(jpContenidoSucursales);
        jpContenidoSucursales.setLayout(jpContenidoSucursalesLayout);
        jpContenidoSucursalesLayout.setHorizontalGroup(
            jpContenidoSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        jpContenidoSucursalesLayout.setVerticalGroup(
            jpContenidoSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        add(jpContenidoSucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 860, 410));

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
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        exportarPDF();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbAgregarActionPerformed

        ShowPaneles(new SucursalesPerfil());
        botonRegresar(true);

    }//GEN-LAST:event_btbAgregarActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        ShowPaneles(new Blanco());
        JsonCargarDatos archivo = new JsonCargarDatos();
        String leerarchivo = archivo.leerarchivo();
        cargaMasiva(leerarchivo);
        ShowPaneles(new SucursalesTabla());
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnRegresarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarTablaActionPerformed
        ShowPaneles(new SucursalesTabla());
        botonRegresar(false);
    }//GEN-LAST:event_btnRegresarTablaActionPerformed

    public void botonRegresar(boolean click) {

        if (click) {
            btnRegresarTabla.setVisible(true);
        } else {
            btnRegresarTabla.setVisible(false);
        }

    }

    private void cargaMasiva(String leerarchivo) {
        try {
            String archivo_retorno = leerarchivo;
            JsonParser parse = new JsonParser();
            JsonArray matriz = parse.parse(archivo_retorno).getAsJsonArray();

            for (int i = 0; i < matriz.size(); i++) {
                JsonObject object = matriz.get(i).getAsJsonObject();
                String nombre = object.get("nombre").getAsString();
                String direccion = object.get("direccion").getAsString();
                String correo = object.get("correo").getAsString();
                int telefono = object.get("telefono").getAsInt();

                Sucursales su = new Sucursales(nombre, direccion, correo, telefono);
                SucursalDaoRelacional insertar = new SucursalDaoRelacional();
                insertar.crear_sucursal(su);
            }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "No seleccionaste archivo");
        }
    }

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso = new Conexion();

    public void exportarPDF() {
        Document doc = new Document();
        try {
            FileOutputStream gen = new FileOutputStream("Reporte_Sucursales.pdf");
            PdfWriter.getInstance(doc, gen);
            doc.open();

            Paragraph titulo = new Paragraph("Reporte de Sucursales");
            titulo.setAlignment(Element.ALIGN_CENTER);
            Font fontTitulo = FontFactory.getFont(FontFactory.COURIER, 18, Font.BOLD, new BaseColor(0, 102, 204));
            titulo.setFont(fontTitulo);
            doc.add(titulo);

            doc.add(new Paragraph("\n"));
            PdfPTable tabla = new PdfPTable(4);
            tabla.setWidthPercentage(100);

            float[] cAn = {2f, 2f, 2f, 1f};
            tabla.setWidths(cAn);

            Font fontHeader = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.WHITE);

            PdfPCell celdaNombre = new PdfPCell(new Phrase("Nombre", fontHeader));
            celdaNombre.setBackgroundColor(BaseColor.GRAY);
            tabla.addCell(celdaNombre);

            PdfPCell celdaDireccion = new PdfPCell(new Phrase("Dirección", fontHeader));
            celdaDireccion.setBackgroundColor(BaseColor.GRAY);
            tabla.addCell(celdaDireccion);

            PdfPCell celdaCorreo = new PdfPCell(new Phrase("Correo", fontHeader));
            celdaCorreo.setBackgroundColor(BaseColor.GRAY);
            tabla.addCell(celdaCorreo);

            PdfPCell celdaTelefono = new PdfPCell(new Phrase("Teléfono", fontHeader));
            celdaTelefono.setBackgroundColor(BaseColor.GRAY);
            tabla.addCell(celdaTelefono);
            try {
                String sql = "select * from sucursales";
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
    private javax.swing.JButton btbAgregar;
    private javax.swing.JButton btnRegresarTabla;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpContenidoSucursales;
    // End of variables declaration//GEN-END:variables
}
