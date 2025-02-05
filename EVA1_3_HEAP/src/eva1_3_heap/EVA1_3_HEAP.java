
package eva1_3_heap;

/**
 *
 * @author andyl
 */
public class EVA1_3_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Prueba prueba= new Prueba();// =new Prueba();
       System.out.println(prueba.x);
       //Prueba prueba2;//NECESITO UN RESPALDO DE PRUEBA.X = 100
       //prueba2 = prueba; //NO FUNCIONA, SE DUPLICA LA MISMA DIRECCION
       Prueba prueba2 = new Prueba ();
       prueba2.x = prueba.x;
       System.out.println(prueba2.x);
       prueba.x = 200;
       System.out.println(prueba.x);
       System.out.println(prueba2.x);
       System.out.println(prueba);
       System.out.println(prueba2);
       if(prueba == prueba2)
           System.out.println("Objetos iguales");
       else
           System.out.println("Objetos distintos");
    }
    
}

class Prueba{
    int x =100;
}
