
package clases;

import java.util.Date;

public class Factura {
    private int id_factura;
    private Date fecha_emision;
    private float total_factura;
    private int id_vendedor;
    private int id_cliente;
    private int id_caodigoPro;
    private int cantidad;
    private float precio;
    private float subTotalProductos;
    private String nombrePro;
    
    
    public Factura(){}
    
    public Factura(int id_factura, Date fecha_emision, float total_factura) {
        this.id_factura = id_factura;
        this.fecha_emision = fecha_emision;
        this.total_factura = total_factura;
    }

    public Factura(int id_factura, Date fecha_emision, int id_vendedor, int id_cliente, float total_factura) {
        this.id_factura = id_factura;
        this.fecha_emision = fecha_emision;
        this.total_factura = total_factura;
        this.id_vendedor = id_vendedor;
        this.id_cliente = id_cliente;
    }

    public Factura(int id_caodigoPro, String nombrePro, int cantidad, float precio, float subTotalProductos ) {
        this.id_caodigoPro = id_caodigoPro;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subTotalProductos = subTotalProductos;
        this.nombrePro = nombrePro;
    }

    public int getId_caodigoPro() {
        return id_caodigoPro;
    }

    public void setId_caodigoPro(int id_caodigoPro) {
        this.id_caodigoPro = id_caodigoPro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getSubTotalProductos() {
        return subTotalProductos;
    }

    public void setSubTotalProductos(float subTotalProductos) {
        this.subTotalProductos = subTotalProductos;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }
    
    

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public float getTotal_factura() {
        return total_factura;
    }

    public void setTotal_factura(float total_factura) {
        this.total_factura = total_factura;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public int getId_cliente() {
        return id_cliente;
    }
    
    
    
}
