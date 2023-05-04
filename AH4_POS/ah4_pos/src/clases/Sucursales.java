
package clases;

public class Sucursales {
    private int codido;
    private String nombre;
    private String direccion;
    private String correo;
    private int telefono;
    
    
    public Sucursales() {}

    public Sucursales(int codido, String nombre, String direccion, String correo, int telefono) {
        this.codido = codido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }
     public Sucursales(String nombre, String direccion, String correo, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getCodido() {
        return this.codido;
    }

    public void setCodido(int codido) {
        this.codido = codido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
}
