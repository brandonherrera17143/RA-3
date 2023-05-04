
package clases;


public class Producto {
    private int codigo;
    private String nombre;
    private String descripcion;
    private int cantidad;
    private float precio;
    
    public Producto(){}

    public Producto(int codigo, String nombre, String descripcion, int cantidad, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Producto(String nombre, String descripcion, int cantidad, float precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", nombre=").append(nombre);
        return sb.toString();
    } 
}
