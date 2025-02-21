
package eva1.ejercicios.basicos_21;

import java.util.Scanner;


public class EVA1EJERCICIOSBASICOS_21 {
    

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);//OBJETO SCANNER PARA LEER LOS DATOS EN LA CONSOLA

        
        System.out.println("Descuento en monto de 400: " + calcularDescuento(600));//Aquí estamos llamando al método calcularDescuento con un monto de 600 y mostrando el resultado. 
        System.out.println("Calificación en letras para 70: " + obtenerCalificacion(85));//LLAMO A MI METODO OBTENER CALIFICACION
        System.out.println("Tipo de triángulo (3,3,3): " + tipoTriangulo(3, 3, 3));//LLAMO A MI MÉTODO TIPOTRIANGULO
        System.out.println("Clasificación de edad (20 años): " + clasificarEdad(25));//METODO CLASIFICACION EDAD
        System.out.println("IMC para 57kg y 1.67m: " + evaluarIMC(70, 1.75));//METODO EVALUARIMC
        System.out.println("Mayor entre 3 y 8: " + mayor(3, 8));//LLAMO A MI METODO MAYOR
        System.out.println("Invertir 'hola mundo': " + invertirCadena("hola mundo"));//LLAMO A MI METODO INVERTIR CADENA Y LE CONCATENO "HOLA MUNDO"
        System.out.println("Contar 'o' en 'hola mundo': " + contarCaracter("hola mundo", 'o'));//LLAMO A MI METODO CONTARCARACTER

        System.out.print("Números en rango (5 a 10): "); //LLAMO A MI MÉTODO 5,10
        imprimirRango(5, 10);

        System.out.print("Números pares en rango (1 a 10): ");
        imprimirPares(1, 10);

        System.out.println("Tabla de multiplicar del 5:");
        tablaMultiplicar(5);

        System.out.println("Suma de los primeros 100 números: " + sumaPrimeros100());
        System.out.println("Factorial de 5: " + factorial(5));

        System.out.print("Primeros 10 números de Fibonacci: ");
        fibonacci10();

        System.out.println("Cantidad de primos entre 1 y 100: " + contarPrimos());
        System.out.println("¿El número 17 es primo? " + esPrimo(17));

        System.out.println("Triángulo de 5 niveles:");
        imprimirTriangulo(5);

        System.out.print("Primeros 8 números de Fibonacci: ");
        fibonacciN(8);

        
    }

    // MÉTODOS
    //Calcular el descuento en una compra según el monto total: 
    public static double calcularDescuento(double monto) {
        if (monto < 100) return monto; //SI EL MONTO ES MAYOR NO SE APLICA EL DESCUENTO
        else if (monto <= 500) return monto * 0.9; //Si está entre 100 y 500, se aplica un 10% de descuento.
        else return monto * 0.8; //Si es mayor que 500, se aplica un 20% de descuento.
    }
    
    //Asignar una calificación en letras según la nota numérica (A, B, C, D, F). 
    public static char obtenerCalificacion(int nota) { //MI METODO OBTENER CALIFICACIONES
        if (nota >= 90) return 'A'; //SI NOTA ES MAYOR QUE 90 O MÁS RETORNA A
        else if (nota >= 80) return 'B';//SI NOTA ES 80 O MÁS, O MENOR QUE 90 RETORNA B
        else if (nota >= 70) return 'C';//SI NOTA ES 70 O MÁS, O MENOR QUE 90 RETORNA C
        else if (nota >= 60) return 'D';//SI NOTA ES 60 O MÁS, O MENOR QUE 90 RETORNA D
        else return 'F'; //SI NOTA ES MENOR QUE 60 RETORNA F
    }

    //Determinar si un triángulo es equilátero, isósceles o escaleno. Solicite los valores para cada lado y evalue. 
    public static String tipoTriangulo(int a, int b, int c) { //MI MÉTODO TIPOTRIÁNGULO
        if (a == b && b == c) return "Equilátero"; //SI A,B Y C SON IGUALES DEVUELVE EQUILATERO
        else if (a == b || a == c || b == c) return "Isósceles";//CONDICIÓN PARA EL TRIÁNGULO ISÓCELES
        else return "Escaleno";//SI NO SE CUMPLEN LAS CONDICIONES ANTERIORES ME DEVUELVE ESCALENO
    }
    //Clasificar una persona según su edad: 
    public static String clasificarEdad(int edad) { //MI MÉTODO CLASIFICAREDAD
        if (edad >= 0 && edad <= 12) return "Niño";//SI LA EDAD ESTA ENTRE O Y 12 AÑOS ME DEVUELVE NIÑO
        else if (edad <= 17) return "Adolescente";//SI LA EDAD ESTA ENTRE 13 Y 17 ME DEVUELVE ADOLSCENTE
        else if (edad <= 64) return "Adulto"; //SI LA EDAD ESTA ENTRE 18 Y 64 ME DEVUELVE ADULTO
        else return "Adulto mayor"; //SI NO SE CUMPLE NINGUNA DE LAS CONDICIONES ME DEVUELVE ADULTO MAYOR
    }
    //Evaluar el índice de masa corporal (IMC) de una persona y clasificarlo.
    public static String evaluarIMC(double peso, double altura) { //MI MÉTODO EVALUARIMC RECIBE DOS PARAMETROS DE TIPO DOUBLE, ALTURA Y PESO
        double imc = peso / (altura * altura); //FORMULA
        if (imc < 18.5) return "Bajo peso";  //Si el IMC es menor a 18.5, la persona tiene bajo peso

        else if (imc < 24.9) return "Normal"; //SI EL IMC ESTA ENTRE 18.5 Y 24.9 ME DEVULVE UN PESO NORMAL
        else if (imc < 29.9) return "Sobrepeso";//SI EL IMC ESTA ENTRE 25.0 Y 29.0 ME DEVUELVE UN SOBRE PESO
        else return "Obesidad"; //SI SU IMC ES 30.0 O MAS ME DEVULEVE OBESIDAD
    }
    //**********************EJERCICIOS CON METODOS******************************************************************
    //Crear un método que reciba dos números y regrese el mayor de los dos
    //MI METODO MAYOR
    public static int mayor(int a, int b) {//TENGO DOS PARAMETROS ENTEROS A EL PRIMERO Y B EL SEGUNDO
        return Math.max(a, b);//EL MATH.MAX ME DEVOLVERA EL NUMERO MAYOR DE LOS DOS NUMEROS
    }

    //Crear un método que reciba una cadena de texto y regrese la cadena invertida
    public static String invertirCadena(String cadena) { //MI METODO INVERTIR CADENA
        String invertida = "";//EL LENGTH DEVULEVE LA CANTIDAD DE CARACTERES DE LA CADENA Y RESTO UNO SUS INDICES COMIENZAN EN 0 H(0)  o(1)  l(2)  a(3)
    for (int i = cadena.length() - 1; i >= 0; i--) {//SE RECORRE LA CADENA DESDE EL ULTIMO HASTA EL PRIMER CARACTER
        invertida += cadena.charAt(i);//LE CONCATENO CADA CARACTER AL RESULTADO
    }
    return invertida; //ME DEVUELVE LA CADENA INVERTIDA
}
    
    //Crear un método que reciba una cadena de texto y un carácter y regrese el número de 
    //veces que ese carácter se repite en la cadena. No tomar en cuenta mayúsculas y 
    //minúsculas.
    public static int contarCaracter(String cadena, char caracter) {
        int contador = 0;//CONTADOR VARIABLE QUE INICIALIZA EN 0
        cadena = cadena.toLowerCase();//CONVIERTE LA CADENA EN MINUSCULAS
        caracter = Character.toLowerCase(caracter);//CONVIERTE EL CARACTER A MINUSCULA

        for (int i = 0; i < cadena.length(); i++) {//RECORRE MI CADENA DESDE EL PRIMER CARACTER HASTA EL ULTIMO
            if (cadena.charAt(i) == caracter) {//SI CON IGUALES INCREMENTA EL CONTADOR
                contador++;
            }
        }

        return contador;
    }
    //************************************EJERCICIOS CON FOR************************************
    
    //Imprimir una lista de números solicitando al usuario el número inicial y fina. Ejemplo: 
    //7 y 15 → 7 – 8 – 9 – 10 – 11 – 12 – 13 – 14 – 15 
    public static void imprimirRango(int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) { //DECLARO UNA VARIABLE I E INICIA CON EL VALOR DE INICIO
            System.out.print(i + " "); //ME IMPRIME MI VALOR DE I SIN SALTO DE LINEA
        }
        System.out.println(); 
    }

    //MI METODO IMPRIMIRPARES
    public static void imprimirPares(int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }

    public static void tablaMultiplicar(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static int sumaPrimeros100() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        return suma;
    }

    public static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void fibonacci10() {
        int a = 0, b = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println();
    }

    public static int contarPrimos() {
        int contador = 0;
        for (int i = 2; i <= 100; i++) {
            if (esPrimo(i)) {
                contador++;
            }
        }
        return contador;
    }

    public static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void imprimirTriangulo(int niveles) {
        for (int i = 1; i <= niveles; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void fibonacciN(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println();
    }
}

        
        
   
    
    


        
    
    

