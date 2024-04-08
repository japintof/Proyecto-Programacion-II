/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inversiones;

/**
 *
 * @author Sebastian
 */
public class Criptomoneda {
    private double retornoCriptomoneda;

    public Criptomoneda() {
        retornoCriptomoneda = 0.15; // 15/100
    }

    public double getRetornoCriptomoneda() {
        return retornoCriptomoneda;
    }

    public void setRetornoCriptomoneda(double retornoCriptomoneda) {
        this.retornoCriptomoneda = retornoCriptomoneda;
    }

    @Override
    public String toString() {
        return "Criptomoneda{" + "retornoCriptomoneda=" + retornoCriptomoneda + '}';
    }
    public double calcularGanancia(double capital) {
        return capital * retornoCriptomoneda;
    }
}
