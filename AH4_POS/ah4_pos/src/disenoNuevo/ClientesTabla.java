package disenoNuevo;

import clases.Cliente;
import javax.swing.table.DefaultTableModel;
import model.ClienteDaoRelacional;

public class ClientesTabla extends javax.swing.JPanel {

    DefaultTableModel tablaBandera;
    
    public ClientesTabla() {
        initComponents();
        llenarTablaClientes();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaClientes = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(860, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(860, 410));

        TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaClientes.setMinimumSize(new java.awt.Dimension(860, 410));
        TablaClientes.setPreferredSize(new java.awt.Dimension(860, 410));
        TablaClientes.setShowGrid(true);
        jScrollPane1.setViewportView(TablaClientes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 410));
    }// </editor-fold>//GEN-END:initComponents

    public void llenarTablaClientes() {
        String columnas[] = {"Codigo","Nombre","Nit","Genero","Genero"};
        tablaBandera = new DefaultTableModel(null, columnas);
        ClienteDaoRelacional in = new ClienteDaoRelacional();
        
        for (Cliente c: in.mostrar()) {
            Object mostrar[] = new Object[5];
            mostrar[0] = c.getCodigo();
            mostrar[1] = c.getNombre();
            mostrar[2] = c.getNit(); 
            mostrar[3] = c.getCorreo();
            mostrar[4] = c.getGenero();
            tablaBandera.addRow(mostrar);
        }
         TablaClientes.setModel(tablaBandera);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaClientes;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
