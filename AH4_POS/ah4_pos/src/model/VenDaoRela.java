package model;

import clases.Vendedor;
import dao.VenDao;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class VenDaoRela implements VenDao {
    
    public static int idVendedor = 0;
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso = new Conexion();

    @Override
    public LinkedList<Vendedor> mostrar() {
        String sql = "select * from vendedores";

        LinkedList<Vendedor> mostrar = new LinkedList();
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                mostrar.add(new Vendedor(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6)));
            }
            return mostrar;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    @Override
    public Vendedor obtener_vendedor(int codigo) {
        String sql = "select * from vendedores where codigo=?";

        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new Vendedor(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6));

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
    public void crear_vendedor(Vendedor vendedor) {
        String sql = "insert into vendedores (nombre,caja,ventas,Genero,password) values(?,?,?,?,?);";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, vendedor.getNombre());
            ps.setInt(2, vendedor.getCaja());
            ps.setInt(3, vendedor.getVentas());
            ps.setString(4, vendedor.getGenero());
            ps.setString(5, vendedor.getPass());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void modificar_vendedor(Vendedor vendedor) {
        String sql = "update vendedores set nombre=?, caja=?, ventas=?, Genero=?, password=? where codigo=?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, vendedor.getNombre());
            ps.setInt(2, vendedor.getCaja());
            ps.setInt(3, vendedor.getVentas());
            ps.setString(4, vendedor.getGenero());
            ps.setString(5, vendedor.getPass());
            ps.setInt(6, vendedor.getCodigo());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void eliminar_vendedor(int codigo) {
        String sql = "delete from vendedores where codigo=?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public String verificarCorreo(String usuario) {
        String usuarioEncontrado = null;
        String userValido = null;
        String sql = "SELECT * FROM vendedores WHERE nombre='" + usuario + "'";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                userValido = rs.getString(2);
            }
            if (usuario.equals(userValido)) {
                usuarioEncontrado = userValido;
            } else if (!usuario.equals(userValido)) {
                usuarioEncontrado = "";
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return usuarioEncontrado;
    }

//    @Override
//    public boolean inicioSesion(String usuario, String pass) {
//        boolean intentos = false;
//       // Int  = null;
//        String usuarioRegistrado = null;
//        String passUser = null;
//        String sql = "SELECT * FROM vendedores WHERE nombre='" + usuario + "' and password='" + pass + "'";
//        
//        LinkedList<Vendedor> elegido = new LinkedList();
//        
//        try {
//            con = acceso.Conectar();
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//
//            if (rs.next()) {
//                usuarioRegistrado = rs.getString(2);
//                passUser = rs.getString(6);
//                //elegido.add(new Vendedor(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6)));
//                 
//                
//                if (usuario.equals(usuarioRegistrado) && pass.equals(passUser)) {
//
//                    PanelAdministrador panel = new PanelAdministrador();
//                    panel.mostrarNombreUsuario(usuarioRegistrado);
//                   // panel.datosCliente();
//                    panel.setVisible(true);
//                    intentos = true;
//                } else if (!usuario.equals(usuarioRegistrado) || pass.equals(passUser)) {
//                    intentos = false;
//                }
//            }
//            
//            
//        } 
//
//        catch (HeadlessException | SQLException e) {
//            System.out.println(e);
//        }
//        return intentos;
//    }
    
    
    
    
    
    
    
     @Override
    public Vendedor inicioSesion(String usuario, String pass) {
      //  int idOb = 0;
        String usuarioRegistrado = null;
        String passUser = null;
        String sql = "SELECT * FROM vendedores WHERE nombre='" + usuario + "' and password='" + pass + "'";
           
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                usuarioRegistrado = rs.getString(2);
                passUser = rs.getString(6);
               // idOb = rs.getInt(1);
                
                if (usuario.equals(usuarioRegistrado) && pass.equals(passUser)) {
                    Vendedor ven = new Vendedor(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6));
                    idVendedor = rs.getInt(1);
                    return ven;
                    
                } else if (!usuario.equals(usuarioRegistrado) || pass.equals(passUser)) {
                    return null;
                }
            }

        } 

        catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }
        return null;   
    }
}
