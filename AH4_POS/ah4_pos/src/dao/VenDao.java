
package dao;

import clases.Vendedor;
import java.util.LinkedList;


public interface VenDao {
    public LinkedList<Vendedor> mostrar();

    public Vendedor obtener_vendedor(int codigo);

    public void crear_vendedor(Vendedor vendedor);

    public void modificar_vendedor(Vendedor vendedor);

    public void eliminar_vendedor(int codigo); 
    
    public String verificarCorreo(String correo);
    //public boolean inicioSesion(String correo, String pass);
    
    public Vendedor inicioSesion(String correo, String pass);
}
