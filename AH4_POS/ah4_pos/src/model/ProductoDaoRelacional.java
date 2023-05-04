
package model;

import clases.Producto;
import dao.ProductosDao;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class ProductoDaoRelacional implements ProductosDao{
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso = new Conexion();
    
    @Override
    public LinkedList<Producto> mostrar() {
       String sql = "select * from productos";

       
            LinkedList<Producto> mostrar = new LinkedList();
            try {
                con = acceso.Conectar();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    mostrar.add(new Producto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getFloat(5)));
                }
                return mostrar;
            } catch (SQLException e) {
                System.out.println(e);
            }
        
        return null;
    }

    @Override
    public Producto obtener_productos(int codigo) {
        String sql = "select * from productos where codigo=?";

        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new Producto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getFloat(5));

            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron Resultados");
            }
            return null;
        } catch (NullPointerException e) {
            System.out.println("Se produjo una excepción NullPointerException: " + e.getMessage());
            return null;
        } catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public void crear_producto(Producto producto) {
         String sql = "insert into productos (nombre,descripcion,cantidad,precio) values(?,?,?,?);";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setInt(3, producto.getCantidad());
            ps.setFloat(4, producto.getPrecio());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void modificar_producto(Producto producto) {
        String sql = "update productos set nombre=?, descripcion=?, cantidad=?, precio=? where codigo=?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setInt(3, producto.getCantidad());
            ps.setFloat(4, producto.getPrecio());
            ps.setInt(5, producto.getCodigo());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void eliminar_producto(int codigo) {
        String sql = "delete from productos where codigo=?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
