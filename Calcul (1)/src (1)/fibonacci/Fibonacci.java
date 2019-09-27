/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author alexander
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner fib= new Scanner(System.in);
        int numero, fibo1,fibo2,i;
        do{
            System.out.println("Introduzca un numero mayor que 1: ");
            numero = fib.nextInt(); 
        }while(numero<=1);
        System.out.println("Los "+ numero + " primeros terminos de la serie de Fibonacci son: ");

        fibo1=1;
        fibo2=1;
        
        System.out.println(fibo1 + " ");
        for(i=2;i<=numero;i++){
             System.out.print(fibo2 + " ");
             fibo2 = fibo1 + fibo2;
             fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }
}
