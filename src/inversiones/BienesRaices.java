/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inversiones;

/**
 *
 * @author Sebastian
 */
public class BienesRaices {
    private double retornoBienesRaices;

    public BienesRaices() {
        retornoBienesRaices = 0.07; // 7/100
    }

    public double getRetornoBienesRaices() {
        return retornoBienesRaices;
    }

    public void setRetornoBienesRaices(double retornoBienesRaices) {
        this.retornoBienesRaices = retornoBienesRaices;
    }

    @Override
    public String toString() {
        return "BienesRaices{" + "retornoBienesRaices=" + retornoBienesRaices + '}';
    }
    public double calcularGanancia(double capital) {
        return capital * retornoBienesRaices;
    }
}
