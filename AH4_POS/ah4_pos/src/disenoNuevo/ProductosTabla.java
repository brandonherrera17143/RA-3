package disenoNuevo;

import clases.Producto;
import javax.swing.table.DefaultTableModel;
import model.ProductoDaoRelacional;


public class ProductosTabla extends javax.swing.JPanel {

    DefaultTableModel tablaBandera;
    
    public ProductosTabla() {
        initComponents();
        llenarTablaProductos();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TProductos = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(860, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(860, 410));

        TProductos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TProductos.setMinimumSize(new java.awt.Dimension(860, 410));
        TProductos.setPreferredSize(new java.awt.Dimension(860, 410));
        TProductos.setRowMargin(1);
        TProductos.setShowGrid(true);
        jScrollPane1.setViewportView(TProductos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 410));
    }// </editor-fold>//GEN-END:initComponents

    public void llenarTablaProductos() {
        String columnas[] = {"Codigo","Nombre","Descripcion","cantidad","Precio"};
        tablaBandera = new DefaultTableModel(null, columnas);
        ProductoDaoRelacional obtener = new ProductoDaoRelacional();
        
        for (Producto p: obtener.mostrar()) {
            Object mostrar[] = new Object[5];
            mostrar[0] = p.getCodigo();
            mostrar[1] = p.getNombre();
            mostrar[2] = p.getDescripcion(); 
            mostrar[3] = p.getCantidad();
            mostrar[4] = p.getPrecio();
            tablaBandera.addRow(mostrar);
        }
        TProductos.setModel(tablaBandera);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TProductos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
