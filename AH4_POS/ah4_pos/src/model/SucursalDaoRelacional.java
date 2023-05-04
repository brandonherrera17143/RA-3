package model;


import dao.SucursalesDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.swing.JOptionPane;
import clases.Sucursales;

public class SucursalDaoRelacional implements SucursalesDao {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso = new Conexion();

    @Override
    public LinkedList<Sucursales> mostrar() {
        String sql = "select * from sucursales";

       
            LinkedList<Sucursales> mostrar = new LinkedList();
            try {
                con = acceso.Conectar();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    mostrar.add(new Sucursales(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));

                }
                return mostrar;
            } catch (SQLException e) {
                System.out.println(e);
            }
        
        return null;
    }

    @Override
    public Sucursales obtener_sucursales(int codigo) {
        String sql = "select * from sucursales where codigo=?";

        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {
                
                return new Sucursales(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));

            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron Resultados");
            }
            return null;
        } catch (NullPointerException e) {
            System.out.println("Se produjo una excepción NullPointerException: " + e.getMessage());
            return null;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public void crear_sucursal(Sucursales sucursal) {
        String sql = "insert into sucursales (nombre,direccion,correo,telefono) values(?,?,?,?);";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, sucursal.getNombre());
            ps.setString(2, sucursal.getDireccion());
            ps.setString(3, sucursal.getCorreo());
            ps.setInt(4, sucursal.getTelefono());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void modificar_sucursales(Sucursales sucursal) {
        String sql = "update sucursales set nombre=?, direccion=?, correo=?, telefono=? where codigo=?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, sucursal.getNombre());
            ps.setString(2, sucursal.getDireccion());
            ps.setString(3, sucursal.getCorreo());
            ps.setInt(4, sucursal.getTelefono());
            ps.setInt(5, sucursal.getCodido());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void eliminar_sucursales(int codigo) {
        String sql = "delete from sucursales where codigo=?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    

}
