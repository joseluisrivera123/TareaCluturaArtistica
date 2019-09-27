package algoritmos;

import java.util.Scanner;

public class NroPar {
    public static void main(String[] args) {
        System.out.println("Ingresa la cant. nros");
        Scanner leer = new Scanner(System.in);
        int nro = leer.nextInt();
        for(int i=1; i <= nro ; i++){
            System.out.print(i*2 + " ");//cadena de texto
        }
    }
}
