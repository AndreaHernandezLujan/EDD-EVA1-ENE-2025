
package eva1_22_fibonacci;

import java.util.Scanner;

public class EVA1_22_FIBONACCI {
    
    public static int fibonacci(int n) { //METODO FIBONACCI, DEVUELVE UN NUMERO ENTERO, RECIBE UN PARAMETRO ENTERO N, QUE REPRESENTA LA POSICION EN LA SERIE DE FIBONACCI 
        if (n == 0) { //SI EN ES IGUAL A 0 O 1
            return 1; //DEVUELVE 1 PORQUE LA SERIE DE FIBONACCI COMIENZA EN 1,1
        } else if (n == 1) { //SIN ESTAS CONDICIONES SE ENTRARIA EN UNA RECURSION INFINITA
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);//Si n es mayor que 1, la función se llama a sí misma con n-1 y n-2, sumando sus valores
        }//F(n)=F(n−1)+F(n−2)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        
        // Imprimir la serie de Fibonacci con índices
        System.out.print("Serie de Fibonacci: ");
        for (int i = 0; i < 10; i++) { // recorre los primeros 10 números de la serie de Fibonacci.
            System.out.print(fibonacci(i) + " "); // llama a la función fibonacci(i) y lo imprime en la misma línea.
        }
        
        System.out.println();
        System.out.println("                0 1 2 3 4 5 6 7 8 9");//imprime los índices correspondientes a la serie
        
        // Mostrar el resultado
        System.out.println("RESULTADO: " + fibonacci(num));
        
      
    }
}//fibonacci(num) calcula el término de Fibonacci en la posición ingresada por el usuario.
//System.out.println("RESULTADO: " + fibonacci(num)); imprime el resultado.


    

    




           
   

    
    
