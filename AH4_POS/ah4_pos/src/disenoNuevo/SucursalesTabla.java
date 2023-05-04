package disenoNuevo;

import javax.swing.table.DefaultTableModel;

import model.SucursalDaoRelacional;
import clases.Sucursales;

public class SucursalesTabla extends javax.swing.JPanel {
    
    DefaultTableModel tablaBandera;
    
    public SucursalesTabla() {
        initComponents();
        llenarTablaSucursales();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TSucursales = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(860, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(860, 410));

        TSucursales.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TSucursales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TSucursales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TSucursales.setMinimumSize(new java.awt.Dimension(860, 410));
        TSucursales.setPreferredSize(new java.awt.Dimension(860, 410));
        TSucursales.setShowGrid(true);
        jScrollPane1.setViewportView(TSucursales);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 410));
    }// </editor-fold>//GEN-END:initComponents
    
    public void llenarTablaSucursales(){
        int numero = 1;
        String columnas[] = {"Codigo","Nombre","Direccion","Correo","Telefono"};
        tablaBandera = new DefaultTableModel(null, columnas);
        SucursalDaoRelacional obtener = new SucursalDaoRelacional();
        
        for (Sucursales sucursal: obtener.mostrar()) {
            Object mostrar[] = new Object[5];
            mostrar[0] = sucursal.getCodido();
            mostrar[1] = sucursal.getNombre();
            mostrar[2] = sucursal.getDireccion(); 
            mostrar[3] = sucursal.getCorreo();
            mostrar[4] = sucursal.getTelefono();
            tablaBandera.addRow(mostrar);
        }
        TSucursales.setModel(tablaBandera);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TSucursales;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
