
package algoritmos;

import java.util.Scanner;

public class Calculadora1 {

    public static void main(String[] args) {
        int nro1,nro2,resul =0;
        String ope="";
        System.out.println("Ingresa el 1er. nro");
        Scanner ingreso; //declaro el objeto
        ingreso = new Scanner(System.in);// instanciando el objeto con new
        //declarando e instanciando el objeto de las clase Scanner
        //Scanner ingreso = new Scanner(System.in);
        nro1 = ingreso.nextInt();
        System.out.println("ingresa el 2do. nro");
        nro2 = ingreso.nextInt();
        System.out.println("ingresa el operador");
        ope = ingreso.next();
        if(ope.equals("+")){
            resul = nro1 + nro2;
        }else if(ope.equals("-")){
            resul = nro1 - nro2;
        }else if(ope.equals("*")){
            resul = nro1 * nro2;   
        }else if(ope.equals("/")){
             if(nro2==0){
                 System.out.println("no seas monse, ingresa un nro. distinto de 0");
                 nro2 = ingreso.nextInt();
             }
              resul = nro1 / nro2;
        }
           
          System.out.println("El resultado es : " + resul);
    }
   
}
