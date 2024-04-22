/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inversiones;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario("Juan", 1000.0);
        Inversiones inversiones = new Inversiones();
        Informacion informacion = new Informacion();
        int opcion;
        do {
            System.out.println("Menu:");
            System.out.println("Capital a invertir: " +usuario.getCapitalParaInvertir() );

            System.out.println("1. Calcular ganancia de CDT");
            System.out.println("2. Calcular ganancia de Bienes Raíces");
            System.out.println("3. Calcular ganancia de Criptomoneda");
            System.out.println("4. Apartado informativo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    double gananciaCDT = inversiones.calcularGananciaCDT(usuario);
                    System.out.println("Ganancia CDT: " + gananciaCDT);
                    break;
                case 2:
                    double gananciaBienesRaices = inversiones.calcularGananciaBienesRaices(usuario);
                    System.out.println("Ganancia Bienes Raíces: " + gananciaBienesRaices);
                    break;
                case 3:
                    double gananciaCriptomoneda = inversiones.calcularGananciaCriptomoneda(usuario);
                    System.out.println("Ganancia Criptomoneda: " + gananciaCriptomoneda);
                    break;
                case 4:
                    informacion.menu();
                    break;
                case 5:
                    System.out.println("¡Gracias por usar nuestro SGI!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
