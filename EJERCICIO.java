/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author kspg
 */
public class EJERCICIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el diámetro de la caneca (en cm): ");
        double diameter = sc.nextDouble();
        System.out.print("Ingrese la altura de la caneca (en cm): ");
        double height = sc.nextDouble();
        double radius = diameter / 2;
        double volume = Math.PI * Math.pow(radius, 2) * height;
        double flow = 2.5; // Litros por minuto
        double time = volume / flow;
        System.out.println("El tiempo necesario para llenar la caneca será de " + time + " minutos.");
    }
}
