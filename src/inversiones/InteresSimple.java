/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inversiones;

/**
 *
 * @author josea
 */
public class InteresSimple implements CalculoInteres {
    @Override
    public double calcularInteres(double monto, double tasa, int tiempo){
        return monto * tasa * tiempo;
    }
}
