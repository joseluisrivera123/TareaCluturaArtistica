package calculadorab;

import java.util.Scanner;

public class CalculadoraB2 {

    public static void main(String[] args) {
        double nro1 = 0.0, nro2 = 0.0, resultado = 0.0;
        int nopcion=1;
        String operador = "";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número1");
        nro1 = leer.nextDouble();
        while (nopcion == 1) {
            System.out.println("Ingresa el operador");
            operador = leer.next();
            System.out.println("Ingresa el número siguiente");
            nro2 = leer.nextDouble();
            switch (operador) {// sólo existe char(1)
                case "+":
                    resultado = nro1 + nro2; break;
                case "-":
                    resultado = nro1 - nro2; break;
                case "*":
                    resultado = nro1 * nro2; break;
                case "/":
                    resultado = nro1 / nro2; break;
            }
            nro1 = resultado;
            System.out.println("Desea continuar presione 1 o 0 para terminar");
            nopcion = leer.nextInt(); // si es 1 o 0            
        }
        System.out.println("El resultado es" + resultado);
    }
}
