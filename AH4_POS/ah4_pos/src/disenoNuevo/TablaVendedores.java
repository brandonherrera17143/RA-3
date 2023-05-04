package disenoNuevo;
import clases.Vendedor;
import javax.swing.table.DefaultTableModel;

import model.VenDaoRela;

public class TablaVendedores extends javax.swing.JPanel {

    DefaultTableModel tablaBandera;
    
    public TablaVendedores() {
        initComponents();
        llenarTablaVendedores();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TVendedores = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(860, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(860, 410));

        TVendedores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TVendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TVendedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TVendedores.setMinimumSize(new java.awt.Dimension(860, 410));
        TVendedores.setPreferredSize(new java.awt.Dimension(860, 410));
        TVendedores.setShowGrid(true);
        jScrollPane1.setViewportView(TVendedores);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 410));
    }// </editor-fold>//GEN-END:initComponents

    public void llenarTablaVendedores() {
        String columnas[] = {"Codigo","Nombre","Caja","Ventas","Genero","Password"};
        tablaBandera = new DefaultTableModel(null, columnas);
        VenDaoRela in = new VenDaoRela();
        
        for (Vendedor c: in.mostrar()) {
            Object mostrar[] = new Object[6];
            mostrar[0] = c.getCodigo();
            mostrar[1] = c.getNombre();
            mostrar[2] = c.getCaja(); 
            mostrar[3] = c.getVentas();
            mostrar[4] = c.getGenero();
            mostrar[5] = c.getPass();
            tablaBandera.addRow(mostrar);
        }
         TVendedores.setModel(tablaBandera);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TVendedores;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
