package disenoNuevo;

import clases.Producto;
import clases.Vendedor;
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
import model.Conexion;
import model.JsonCargarDatos;
import model.VenDaoRela;

public class PanelAdminVendedores extends javax.swing.JPanel {

   
    public PanelAdminVendedores() {
        initComponents();
        initContent();
        btnRegresarTabla.setVisible(false);
    }

    public void initContent() {
        ShowPaneles(new TablaVendedores());
    }

    public void ShowPaneles(JPanel a) {
        a.setSize(860, 410);
        a.setLocation(0, 0);

        jpContenidoVendedores.removeAll();
        jpContenidoVendedores.add(a, BorderLayout.CENTER);
        jpContenidoVendedores.revalidate();
        jpContenidoVendedores.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        btbAgregar = new javax.swing.JButton();
        btnCargaMasiva = new javax.swing.JButton();
        jpContenidoVendedores = new javax.swing.JPanel();
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
        btbAgregar.setText("MODIFICAR VENDEDOR");
        btbAgregar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btbAgregar.setBorderPainted(false);
        btbAgregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btbAgregar.setIconTextGap(15);
        btbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbAgregarActionPerformed(evt);
            }
        });
        add(btbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 220, 50));

        btnCargaMasiva.setBackground(new java.awt.Color(84, 166, 234));
        btnCargaMasiva.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCargaMasiva.setForeground(new java.awt.Color(255, 255, 255));
        btnCargaMasiva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cargar.png"))); // NOI18N
        btnCargaMasiva.setText("CARGA MASIVA");
        btnCargaMasiva.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnCargaMasiva.setBorderPainted(false);
        btnCargaMasiva.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCargaMasiva.setIconTextGap(15);
        btnCargaMasiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaMasivaActionPerformed(evt);
            }
        });
        add(btnCargaMasiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 170, 50));

        javax.swing.GroupLayout jpContenidoVendedoresLayout = new javax.swing.GroupLayout(jpContenidoVendedores);
        jpContenidoVendedores.setLayout(jpContenidoVendedoresLayout);
        jpContenidoVendedoresLayout.setHorizontalGroup(
            jpContenidoVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        jpContenidoVendedoresLayout.setVerticalGroup(
            jpContenidoVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        add(jpContenidoVendedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 860, 410));

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
        
        ShowPaneles(new VendedoresPerfil());
        botonRegresar(true);

    }//GEN-LAST:event_btbAgregarActionPerformed

    private void btnCargaMasivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaMasivaActionPerformed
        ShowPaneles(new Blanco());
        JsonCargarDatos archivo = new JsonCargarDatos();
        String leerarchivo = archivo.leerarchivo();
        cargaMasiva(leerarchivo);
        ShowPaneles(new TablaVendedores());
    }//GEN-LAST:event_btnCargaMasivaActionPerformed

    private void btnRegresarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarTablaActionPerformed
        ShowPaneles(new TablaVendedores());
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
        String archivo_retorno = leerarchivo;
        JsonParser parse = new JsonParser();
        JsonArray matriz = parse.parse(archivo_retorno).getAsJsonArray();

        for (int i = 0; i < matriz.size(); i++) {
            JsonObject object = matriz.get(i).getAsJsonObject();
            String nombre = object.get("nombre").getAsString();
            int caja = object.get("caja").getAsInt();
            int ven = object.get("ventas").getAsInt();
            String gen = object.get("genero").getAsString();
            String pass = object.get("password").getAsString();

            Vendedor in = new Vendedor(nombre,caja,ven,gen,pass);
            VenDaoRela insertar = new VenDaoRela();
            insertar.crear_vendedor(in);

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
            
            FileOutputStream gen = new FileOutputStream("Reporte_Vendedores.pdf");
            

            PdfWriter.getInstance(doc, gen);
            doc.open();
            
            Paragraph titulo = new Paragraph("Reporte de Vendedores");
            titulo.setAlignment(Element.ALIGN_CENTER);
            Font fontTitulo = FontFactory.getFont(FontFactory.COURIER, 18, Font.BOLD, new BaseColor(0, 102, 204));
            titulo.setFont(fontTitulo);
            doc.add(titulo);

            doc.add(new Paragraph("\n"));
            PdfPTable tabla = new PdfPTable(5);
            tabla.setWidthPercentage(100);

            float[] cAn = {0.70f, 0.45f, 0.45f,0.50f, 2f};
            tabla.setWidths(cAn);

            Font fontHeader = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.WHITE);

            PdfPCell celdaNombre = new PdfPCell(new Phrase("Nombre", fontHeader));
            celdaNombre.setBackgroundColor(BaseColor.GRAY);
            tabla.addCell(celdaNombre);

            PdfPCell celdaC = new PdfPCell(new Phrase("Caja", fontHeader));
            celdaC.setBackgroundColor(BaseColor.GRAY);
            tabla.addCell(celdaC);

            PdfPCell celdaV = new PdfPCell(new Phrase("Ventas", fontHeader));
            celdaV.setBackgroundColor(BaseColor.GRAY);
            tabla.addCell(celdaV);

            PdfPCell celdaG = new PdfPCell(new Phrase("Genero", fontHeader));
            celdaG.setBackgroundColor(BaseColor.GRAY);
            tabla.addCell(celdaG);
            
            PdfPCell celdaP = new PdfPCell(new Phrase("Password", fontHeader));
            celdaP.setBackgroundColor(BaseColor.GRAY);
            tabla.addCell(celdaP);
            try {
                String sql = "select * from vendedores";
                con = acceso.Conectar();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
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
    private javax.swing.JButton btnCargaMasiva;
    private javax.swing.JButton btnRegresarTabla;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpContenidoVendedores;
    // End of variables declaration//GEN-END:variables
}
