
package Ejercicios;

import java.util.Scanner;


public class Ejercicio15 {
    

    public static void main (String[] args){
      Scanner ingreso = new Scanner(System.in);
      String texto = ingreso.next();
      int intentos = 1;
      while (intentos < 3){
          if (texto.equals("yosoy")){
            System.out.println("chevere, lo lograste!!!");
            break;
           }else {  
              System.out.println("ing. otra vez");
              texto = ingreso.next();
            intentos++;
            
            }
         
        }
      if (intentos ==3)
      System.out.println("fuera!!");
    }
    
}
    

