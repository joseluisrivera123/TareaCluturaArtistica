/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author 23
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner fac = new Scanner(System.in);
        int nro;
        System.out.println("Ingrese el numero");
        nro = fac.nextInt();
        System.out.println(factorial(nro));
    }
    public static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
