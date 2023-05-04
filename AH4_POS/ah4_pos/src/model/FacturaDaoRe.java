package model;

import clases.Factura;
import com.mysql.cj.xdevapi.Statement;

import dao.FacturaDao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class FacturaDaoRe implements FacturaDao {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso = new Conexion();

    @Override
    public LinkedList<Factura> mostrar_facturas() {
        String sql = "select * from factura";
        LinkedList<Factura> f = new LinkedList();

        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                f.add(new Factura(rs.getInt(1), rs.getDate(2), rs.getInt(3), rs.getInt(4), rs.getFloat(5)));
            }
            return f;

        } catch (Exception e) {

        }
        return null;
    }

    @Override
    public Factura obtener_fac(int codigo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

//    @Override
//    public void crear_factura(Date fecha, int idVendedor, int idCliente, int idProducto, int cantidad, float precioUni) {
//        String sql = "insert INTO factura(fechaEmision,id_vendedor,id_cliente,totalFactura) VALUES (?,?,?,?);";
//        try {
//            con = acceso.Conectar();
//            ps = con.prepareStatement(sql);
//            ps.setDate(1, fecha);
//            ps.setInt(2, idVendedor);
//            ps.setInt(3, idCliente);
//            ps.setFloat(4, (float) 0.0);
//
//            int filasAfectadas = ps.executeUpdate();
//
//            if (filasAfectadas == 1) {
//
//                String sql2 = "SELECT LAST_INSERT_ID()";
//                ps = con.prepareStatement(sql2);
//                rs = ps.executeQuery();
//                rs.next();
//
//                int id_factura = rs.getInt(1);
//
//                String sql3 = "INSERT INTO detalle_venta(id_numeroFactura, id_producto, cantidad, precioUnitario, totalDetalle) VALUES (?, ?, ?, ?, ?)";
//                ps = con.prepareStatement(sql3);
//                ps.setInt(1, id_factura);
//                ps.setInt(2, idProducto);
//                ps.setInt(3, cantidad);
//                ps.setFloat(4, precioUni);
//                ps.setFloat(5, 0);
//                ps.executeUpdate();
//            }
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "No cuentas con las suficientes unidades!");
//        }
//    }
    @Override
    public void modificar_factura(Factura factura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar_factura(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    
    
    @Override
    public int crearFactura(Date fecha, int idVen, int idCli, float totalFac) {
        String sql = "insert into factura(fechaEmision,id_vendedor,id_cliente,totalFactura) values (?,?,?,?);";
        int id_factura = 0;
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setDate(1, fecha);
            ps.setInt(2, idVen);
            ps.setInt(3, idCli);
            //ps.setFloat(4, totalFac);
            ps.setFloat(4, 0);

            int filaAfectada = ps.executeUpdate();
            
            if (filaAfectada == 1) {
                String sql2 = "SELECT LAST_INSERT_ID()";
                ps = con.prepareStatement(sql2);
                rs = ps.executeQuery();
                rs.next();

                id_factura = rs.getInt(1);
            }
            return id_factura;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No cuentas con las suficientes unidades!");
        }
        return 0;

    }
    
    
    @Override
    public void agregarPraFacturas(int idFactura, List<Factura> factura) {
        String sql = "insert into detalle_venta(id_numeroFactura,id_producto,cantidad,precioUnitario,totalDetalle) values(?,?,?,?,?);";

        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            for (Factura f : factura) {
                ps.setInt(1, idFactura);
                ps.setInt(2, f.getId_caodigoPro());
                ps.setInt(3, f.getCantidad());
                ps.setFloat(4, f.getPrecio());
                ps.setFloat(5, 0);
               // ps.setFloat(5, f.getSubTotalProductos());
                ps.executeUpdate();
            }

        } catch (SQLException e) {
            System.out.println("errrror = " +e);
        }
    }
}
