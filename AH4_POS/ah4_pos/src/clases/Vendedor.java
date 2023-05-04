package clases;

import java.util.Random;

public class Vendedor {

    private int codigo;
    private String nombre;
    private int caja;
    private int ventas;
    private String genero;
    private String pass;

    public Vendedor() {
    }

    
    public Vendedor(int codigo, String nombre, int caja, int ventas, String genero, String pass) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.caja = caja;
        this.ventas = ventas;
        this.genero = genero;
        this.pass = pass;    
    }

    public Vendedor(String nombre, int caja, int ventas, String genero, String pass) {
        this.nombre = nombre;
        this.caja = caja;
        this.ventas = ventas;
        this.genero = genero;
        this.pass = pass;
    }
    
    
    public int getCodigo() {
        return codigo;
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

    public int getCaja() {
        return this.caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }

    public int getVentas() {
        return this.ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "codigo=" + codigo + ", nombre=" + nombre + ", caja=" + caja + ", ventas=" + ventas + ", genero=" + genero + ", pass=" + pass + '}';
    }

    public String generadorContrasenia() {
        Random random = new Random();
        String setOfCharacters = "abcdefghijklmABCDEFGHIJKLMN1234567890()*&%@";
        String pass = "";
        for (int i = 0; i < 8; i++) {
            int randomInt = random.nextInt(setOfCharacters.length());
            char randomChar = setOfCharacters.charAt(randomInt);
            pass += randomChar;
        }
        return  pass;
    }
}
