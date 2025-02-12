
package eva1_14_arreglo_objetos;


public class EVA1_14_ARREGLO_OBJETOS {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Persona datos []= new Persona[5];
       /* datos[0] = new Persona();
        datos[1] = new Persona();
        datos[2] = new Persona();
        datos[3] = new Persona();
        datos[4] = new Persona();*/
        for (int i = 0; i < datos.length; i++) {
            datos[i] = new Persona ();
            
        }
        datos[0].setNombre("NOMBRE 1");
        datos[1].setNombre("NOMBRE 2");
        datos[2].setNombre("NOMBRE 3");
        datos[3].setNombre("NOMBRE 4");
        datos[4].setNombre("NOMBRE 5");
        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i].getNombre());
        }
    }
    
}

class Persona{
    private String nombre;
    //Metodos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
