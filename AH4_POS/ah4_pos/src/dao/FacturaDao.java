
package dao;

import clases.Factura;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public interface FacturaDao {
    public LinkedList<Factura> mostrar_facturas();

    public Factura obtener_fac(int codigo);

//    public void crear_factura(java.sql.Date fecha, int idVendedor, int idCliente,int idProducto,int cantidad, float precioUni);

    public void modificar_factura(Factura factura);

    public void eliminar_factura(int codigo); 
    
    public int crearFactura(java.sql.Date fecha, int idVen, int idCli, float totalFac);
   
    public void agregarPraFacturas(int idFactura, List<Factura> factura);
    
}
