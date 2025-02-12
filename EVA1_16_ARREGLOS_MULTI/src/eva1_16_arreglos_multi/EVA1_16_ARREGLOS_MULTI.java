
package eva1_16_arreglos_multi;

/**
 *
 * @author andyl
 */
public class EVA1_16_ARREGLOS_MULTI {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz [][] = new int [5][];//Tengo un arreglo de 5 filas
        //Este arreglo guarda 20 enteros
        matriz [0] = new int [6];//En un grupo hay 6 alumnos, o sea tiene 6 columnas
        matriz [1] = new int [2];//En un grupo hay 2 alumnos
        matriz [2] = new int [4];//En un grupo hay 4 alumnos
        matriz [3] = new int [7];//En un grupo hay 7 alumnos
        matriz [4] = new int [1];//En un gripo hay 1 alumno
        
        for (int i = 0; i < matriz.length; i++) { //El matriz.length nos regresa 5, el primer for controla las filas, nos dara 0,1,2,3,4
            for (int j = 0; j < matriz[i].length; j++) { //Controla el segundo par 
                matriz[i][j] = (int)(Math.random()*100);
                
            }
            
        }
        for (int i = 0; i < matriz.length; i++) { 
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+matriz[i][j]+ "]");
                
            }
            System.out.println("");
            
        }
    }
}
