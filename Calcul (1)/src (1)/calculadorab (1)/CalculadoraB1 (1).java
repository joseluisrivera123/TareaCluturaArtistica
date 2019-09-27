package calculadorab;

import java.util.Scanner;

public class CalculadoraB1 {

    public static void main(String[] args) {
        double nro1 = 0.0, nro2 = 0.0, resultado = 0.0;
        String operador = "";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número1");
        nro1 = leer.nextDouble();
        System.out.println("Ingresa el operador");
        operador = leer.next();
        System.out.println("Ingresa el número2");
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
        System.out.println("El resultado es" + resultado);
    }
}
