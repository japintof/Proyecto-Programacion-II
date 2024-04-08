/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inversiones;

/**
 *
 * @author J
 */
public class Usuario {
   
    private String nombre;
    private double capitalParaInvertir;

    public Usuario(String nombre, double capitalParaInvertir) {
        this.nombre = nombre;
        this.capitalParaInvertir = capitalParaInvertir;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapitalParaInvertir() {
        return capitalParaInvertir;
    }

    public void setCapitalParaInvertir(double capitalParaInvertir) {
        this.capitalParaInvertir = capitalParaInvertir;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", capitalParaInvertir=" + capitalParaInvertir + '}';
    }
    
}
