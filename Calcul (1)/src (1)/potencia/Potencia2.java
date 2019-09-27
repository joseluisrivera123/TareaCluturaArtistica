/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia;

import java.util.Scanner;

/**
 *
 * @author alexander
 */
public class Potencia2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
          double base, exponente, potencia;
        System.out.print("Ingrese el valor de base: ");
        base = in.nextDouble();
        System.out.print("Ingrese el valor de exponente: ");
        exponente = in.nextDouble();
        potencia=Math.pow(base,exponente);
        System.out.println("Valor de potencia: " + potencia);
    }
}
