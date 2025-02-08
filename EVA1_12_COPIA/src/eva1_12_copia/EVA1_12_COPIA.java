
package eva1_12_copia;


public class EVA1_12_COPIA {

    
    public static void main(String[] args) {
        int datos[] = new int[10];

        // Llenar el arreglo con valores aleatorios
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() * 100);// math random para valores aleatorios
        }

        // Crear un nuevo arreglo con solo 5 elementos
        int copia[] = new int[5];

        // Copiar los primeros 5 elementos del arreglo 
        for (int i = 0; i < copia.length; i++) {
            copia[i] = datos[i];
        }

        // Mostrar ambos arreglos
        System.out.println("Arreglo original:");
        for (int valor : datos) {
            System.out.print("[" + valor + "] ");
        }

        System.out.println("\nArreglo copiado (5 elementos):");
        for (int valor : copia) {
            System.out.print("[" + valor + "] ");
        }
    }
}

