
package dao;

import clases.Cliente;
import java.util.LinkedList;

public interface ClientesDao {
    public LinkedList<Cliente> mostrar();

    public Cliente obtener_clientes(int codigo);

    public void crear_cliente(Cliente cliente);

    public void modificar_cliente(Cliente cliente);

    public void eliminar_cliente(int codigo); 
    
}
