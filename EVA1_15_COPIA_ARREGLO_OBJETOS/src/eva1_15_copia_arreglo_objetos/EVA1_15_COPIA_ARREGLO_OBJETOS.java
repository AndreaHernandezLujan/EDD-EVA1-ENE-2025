
package eva1_15_copia_arreglo_objetos;


public class EVA1_15_COPIA_ARREGLO_OBJETOS {

    
    public static void main(String[] args) {
       
        // Declaramos el arreglo original
        Persona datos[] = new Persona[5];

        // Inicializamos cada objeto en el arreglo original
        for (int i = 0; i < datos.length; i++) {
            datos[i] = new Persona();
        }

        // Asignamos nombres a los objetos
        datos[0].setNombre("NOMBRE 1");
        datos[1].setNombre("NOMBRE 2");
        datos[2].setNombre("NOMBRE 3");
        datos[3].setNombre("NOMBRE 4");
        datos[4].setNombre("NOMBRE 5");

        // Creamos la copia del arreglo con nuevas instancias
        Persona copiaDatos[] = new Persona[5];

        for (int i = 0; i < copiaDatos.length; i++) {
            copiaDatos[i] = new Persona(); // Nueva instancia
            copiaDatos[i].setNombre(datos[i].getNombre()); // Copiamos el valor del nombre
        }

        // Verificamos las direcciones de memoria
        System.out.println("Direcciones de memoria del arreglo original:");
        for (int i = 0; i < datos.length; i++) {
            System.out.println("datos[" + i + "] -> " + datos[i]);
        }

        System.out.println("\nDirecciones de memoria del arreglo copiado:");
        for (int i = 0; i < copiaDatos.length; i++) {
            System.out.println("copiaDatos[" + i + "] -> " + copiaDatos[i]);
        }

        // Imprimimos los nombres de los objetos copiados
        System.out.println("\nNombres en el arreglo copiado:");
        for (int i = 0; i < copiaDatos.length; i++) {
            System.out.println(copiaDatos[i].getNombre());
        }
    }
}

class Persona {
    private String nombre;

    // Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

    


    


    
    

