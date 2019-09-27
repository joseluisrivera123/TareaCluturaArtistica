package funciones;

public class Servicios {

    double rpta = 0.0;

    public double Calcular //método que devuelve un valor
            (double n1, String op, double n2) {
        switch (op) {
            case "+":
                rpta = n1 + n2;
                break;
            case "-":
                rpta = n1 - n2;
                break;
            case "*":
                rpta = n1 * n2;
                break;
            case "/":
                rpta = n1 / n2;
                break;
        }
        return rpta;
    }

    // nro ingresado por la pantalla de la calculadora
    public String NrosPares(int nro) {
        String mensaje = "";
        for (int i = 1; i <= nro; i++) {
            mensaje = mensaje + i * 2 + " ";
        }
        return mensaje;
    }

    //factorial
    public String Factorial(int n) {
        int resultado = 1;
        String mens = "";
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado + mens;
    }

    //Primo
    public String Primo(int n) {
        int a = 0;
        String msg = "";
        for (int i = 1; i < (n + 1); i++) {
            if (n % i == 0) {
                a++;
            }
        }
        if (a != 2) {
            System.out.println("No es Primo");
            msg = "No es Primo";
        } else {
            System.out.println("Si es Primo");
            msg = "Si es Primo";
        }
        return msg;
    }
    
    //Fibonacci
    public String Fibonacci(int numero){
        int fibo1 = 1;
        int fibo2 = 1;
        String mg = "";
     for(int i=2;i<=numero;i++){
             mg =(fibo2 + " ");
             fibo2 = fibo1 + fibo2;
             fibo1 = fibo2 - fibo1;  
    }
     return mg;
    }
    
    //Perfecto
    public String Perfecto(int n){
        int suma = 0;
        String mensaje = "";
        for (int i = 1; i < n; i++) {  // i son los divisores. Se divide desde 1 hasta n-1 
            if (n % i == 0) {
                suma = suma + i;     // si es divisor se suma
            }
        }
        if (suma == n) {  // si el numero es igual a la suma de sus divisores es perfecto
            mensaje = ("Perfecto");
        } else {
            mensaje = ("No es perfecto");
    }
        return mensaje;
    }
    //Potencia
    public String Potencia(int base){
         double exp=2;
       double potencia;
       String retorna;
       
        potencia=Math.pow(base,exp);
         
        retorna = ""+potencia+"";
        return retorna ;
    
    }
    //Raiz
    public String Raiz(int numero){
        double raiz = 2;
        String retorn;
        raiz=Math.sqrt(numero);
        
        retorn = ""+raiz+"";
        return retorn;
    }
}
    

