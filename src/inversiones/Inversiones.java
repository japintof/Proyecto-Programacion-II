/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inversiones;

/**
 *
 * @author J
 */
public class Inversiones  {
    private CDT cdt;
    private BienesRaices bienesRaices;
    private Criptomoneda criptomoneda;

    public Inversiones() {
        cdt = new CDT();
        bienesRaices = new BienesRaices();
        criptomoneda = new Criptomoneda();
    }

    public double calcularGananciaCDT(Usuario usuario) {
        return cdt.calcularGanancia(usuario.getCapitalParaInvertir());
    }

    public double calcularGananciaBienesRaices(Usuario usuario) {
        return bienesRaices.calcularGanancia(usuario.getCapitalParaInvertir());
    }

    public double calcularGananciaCriptomoneda(Usuario usuario) {
        return criptomoneda.calcularGanancia(usuario.getCapitalParaInvertir());
    }
}
