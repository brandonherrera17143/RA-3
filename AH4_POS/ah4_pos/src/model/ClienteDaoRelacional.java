package model;

import clases.Cliente;
import dao.ClientesDao;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import ventanasPanelVendedor.NuevaVentaSeleccionarCliente;

public class ClienteDaoRelacional implements ClientesDao {
    
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso = new Conexion();

    @Override
    public LinkedList<Cliente> mostrar() {
        String sql = "select * from clientes";

        LinkedList<Cliente> mostrar = new LinkedList();
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                mostrar.add(new Cliente(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5)));   
            }
            return mostrar;
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

    @Override
    public Cliente obtener_clientes(int codigo) {
        String sql = "select * from clientes where codigo=?";

        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new Cliente(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));

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
    public void crear_cliente(Cliente cliente) {
        String sql = "insert into clientes (nombre,nit,correo,Genero) values(?,?,?,?);";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setInt(2, cliente.getNit());
            ps.setString(3, cliente.getCorreo());
            ps.setString(4, cliente.getGenero());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void modificar_cliente(Cliente cliente) {
        String sql = "update clientes set nombre=?, nit=?, correo=?, Genero=? where codigo=?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setInt(2, cliente.getNit());
            ps.setString(3, cliente.getCorreo());
            ps.setString(4, cliente.getGenero());
            ps.setInt(5, cliente.getCodigo());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void eliminar_cliente(int codigo) {
        String sql = "delete from clientes where codigo=?;";
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
