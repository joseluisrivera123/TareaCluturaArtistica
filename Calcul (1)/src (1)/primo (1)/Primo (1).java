/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primo;

import java.util.Scanner;

/**
 *
 * @author 23
 */
public class Primo {
     public static void main(String[] args) {
       Scanner pi = new Scanner(System.in); 
       int a=0,i,n;
         System.out.println("Ingrese numero");
         n=pi.nextInt();
         for(i=1;i<(n+1);i++){
         if(n%i==0){
             a++;
            }
         }
         if(a!=2){
              System.out.println("No es Primo");
            }else{
                System.out.println("Si es Primo");
         }
    }
                 

     }


/**/