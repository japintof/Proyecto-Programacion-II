/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inversiones;

/**
 *
 * @author josea
 */
public class Calculadora {
    private double monto;
    private double tasa;
    private double tiempo;
    private CalculoInteres calculo;

    public Calculadora(CalculoInteres calculo) {
        this.calculo = calculo;
    }

    public CalculoInteres getCalculo() {
        return calculo;
    }

    public void setCalculo(CalculoInteres calculo) {
        this.calculo = calculo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Calculadora{" + "monto=" + monto + ", tasa=" + tasa + ", tiempo=" + tiempo + ", calculo=" + calculo + '}';
    }
    
}
