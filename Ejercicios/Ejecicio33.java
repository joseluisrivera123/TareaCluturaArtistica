
package Ejercicios;

import java.util.Scanner;



public class Ejecicio33 {
     public static void main(String[] args) {
 int suma = 0, cont = 0;
      System.out.println("Ingresa nro.");
   Scanner leer = new Scanner (System.in);
   int num = leer.nextInt();
      for (int i = 1; i < num; i++) {
          if (num%i==0) {
              suma = i + suma;
          }
      }
      if (suma == num) {
          System.out.println("Es perfecto");
      }
      else{
          System.out.println("No es perfecto");
      }
      for (int j = 1; j < num; j++) {
        if (num%j==0) {
              cont = cont +1;
          }   
      }
        if (cont == 1) {
            
          System.out.println("Es primo");
      }
      else{
          System.out.println("No es primo");
      }  
        
  }     
}