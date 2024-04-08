/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inversiones;

/**
 *
 * @author Sebastian
 */
public class CDT {
    private double retornoCdt;

    public CDT() {
        retornoCdt = 0.10; // 10/100
    }

    public double getRetornoCdt() {
        return retornoCdt;
    }

    public void setRetornoCdt(double retornoCdt) {
        this.retornoCdt = retornoCdt;
    }

    @Override
    public String toString() {
        return "CDT{" + "retornoCdt=" + retornoCdt + '}';
    }

    public double calcularGanancia(double capital) {
        return capital * retornoCdt;
    }
    
}

    

