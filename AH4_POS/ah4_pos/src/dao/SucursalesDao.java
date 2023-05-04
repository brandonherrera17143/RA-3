package dao;

import java.util.LinkedList;
import clases.Sucursales;

public interface SucursalesDao {

    public LinkedList<Sucursales> mostrar();

    public Sucursales obtener_sucursales(int codigo);

    public void crear_sucursal(Sucursales sucursal);

    public void modificar_sucursales(Sucursales sucursal);

    public void eliminar_sucursales(int codigo);

}
