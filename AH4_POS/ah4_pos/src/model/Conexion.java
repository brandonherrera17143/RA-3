
package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    String url = "jdbc:mysql://localhost:3307/pos_ra";
    //String url = "jdbc:mysql://localhost:3306/pos_ra";
    String user = "root";
    String pass = "1234";

    public Connection Conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            System.out.println("error:");
            System.out.println(e);
        }
        return con;
    }
}
