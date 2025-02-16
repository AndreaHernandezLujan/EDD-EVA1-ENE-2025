
package eva1_17_cubo;


public class EVA1_17_CUBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cubo [][][]= new int[5][3][4]; //Hay 60 enteros
        for (int i = 0; i < cubo.length; i++) { // PRIMERA POSICION
            for (int j = 0; j < cubo[i].length; j++) { //SEGUNA POSICION
                for (int k = 0; k < cubo[i][j].length; k++) { //TERCERA POSICION
                    cubo[i][j][k]=(int)(Math.random()*100);
                    
                }
                
            }
            
        }
        
        for (int i = 0; i < cubo.length; i++) { // PRIMERA POSICION
            for (int j = 0; j < cubo[i].length; j++) { //SEGUNA POSICION
                for (int k = 0; k < cubo[i][j].length; k++) { //TERCERA POSICION
                    System.out.print("[" + cubo[i][j][k]+ "]");
                    
                }
                System.out.println("");
                
            }
            System.out.println("");
        }
    }
    
}
