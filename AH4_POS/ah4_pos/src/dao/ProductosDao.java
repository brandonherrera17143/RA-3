
package dao;

import clases.Producto;
import java.util.LinkedList;

public interface ProductosDao {
   public LinkedList<Producto> mostrar();

    public Producto obtener_productos(int codigo);

    public void crear_producto(Producto producto);

    public void modificar_producto(Producto producto);

    public void eliminar_producto(int codigo); 
}
