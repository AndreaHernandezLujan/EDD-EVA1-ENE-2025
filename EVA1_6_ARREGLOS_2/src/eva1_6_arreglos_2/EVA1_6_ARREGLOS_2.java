
package eva1_6_arreglos_2;

/**
 *
 * @author andyl
 */
public class EVA1_6_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int datos[]= new int[50];
        System.out.println(datos);//Nombre del arreglo sin corchetes te da la direccion
        System.out.println(datos.length); //Length te dice cuantos elementos tiene
        //LLENAR EL ARREGLO DE VALORES ALEATORIOS
        for (int i = 0; i < datos.length; i++){     //la i tiene que llegar o compararse con 10
                      //Casting
            datos[i]= (int) (Math.random()* 100);//Si no tuviera el parentesis en Math random saldria 0
        }//El casting convierte el valor a un entero
        for (int i = 0; i < datos.length; i++){
            System.out.print("[" + datos [i]+"]");
        }
    }
    
}
