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
public class Potencia {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        int base = scan.nextInt();
        System.out.println("Ingrese el exponente: ");
        int exponente = scan.nextInt();
        double resultado = Math.pow(base, exponente);
        System.out.println("El resultado es: "+ resultado);
        }
        
    }

