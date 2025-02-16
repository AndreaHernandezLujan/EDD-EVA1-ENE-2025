
package eva1_19_falso_for;

/**
 *
 * @author andyl
 */
public class EVA1_19_FALSO_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //IMPRIMIR UNA LISTA: 5 - 4 - 3 - 2 -1
        //for (int i = 5; i > 0; i--) {
           // System.out.print(i + "-");
            
        //}
        //LLAMADA RECURSIVA
        listaNumerosRecu(5);
    }
    public static void listaNumerosRecu(int valor){
    //CODIGO PARA RESOLVER EL PROBLEMA
        System.out.print(valor +"-");
        //Como controlamos la ejecucion de esta instruccion:
        if(valor > 1)//Control de recursividad
        listaNumerosRecu(valor -1);//Vuelve a llamar al numero, se hace una resta
    }
}
