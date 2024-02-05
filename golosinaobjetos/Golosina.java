/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package golosinaobjetos;

/**
 *
 * @author María Pilar Programación 6J
 */
public class Golosina {

    private String nombre;
    private double precio;
    private int exist;

    public Golosina(String nombre, double precio, int exist) {
        this.nombre = nombre;
        this.precio = precio;
        this.exist = exist;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExist() {
        return exist;
    }

    public void setExist() {
        this.exist--;
    }

    public void setExist(int exist) {
        this.exist = exist;
    }
    
    
/**
 * muestra todos los datos de la golosita
 * @return cadena con los datos
 */
    public String mostrar() {
        return this.nombre + " " + this.precio + " quedan " + exist;
    }

    public String mostrarSinExist() {
        return this.nombre + " " + this.precio;
    }

}
