
package eva1_13_copia_distintos;


public class EVA1_13_COPIA_DISTINTOS {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int datos[] = new int[20];

        // Llenar el arreglo con valores aleatorios
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() * 100);// math random para valores aleatorios
        }

        // Crear un nuevo arreglo con solo 5 elementos
        int copia[] = new int[10];

        // Copiar los primeros 5 elementos del arreglo 
        for (int i = 0; i < copia.length; i++) {
            copia[i] = datos[i];
        }

        // Mostrar ambos arreglos
        System.out.println("Arreglo original:");
        for (int valor : datos) {
            System.out.print("[" + valor + "] ");
        }

        System.out.println("\nArreglo copiado (10 elementos):");
        for (int valor : copia) {
            System.out.print("[" + valor + "] ");
        }
        System.out.println("");
        System.out.println(datos);
        System.out.println(copia);
    }
}
    
    

