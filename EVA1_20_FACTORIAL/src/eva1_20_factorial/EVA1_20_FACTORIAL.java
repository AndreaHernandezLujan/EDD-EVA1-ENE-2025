
package eva1_20_factorial;


public class EVA1_20_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CALCULAR EL FACTORIAL: 5X2X3X2X2=120
        
       	// Numero del que queremos calcular el factorial
	int iNumero = 5;

        // Variable con el valor del factorial
	int iFactorial = 1;

		
	for (int x=2;x<=iNumero;x++) 
	iFactorial = iFactorial * x;
		
	System.out.println("El factorial del número " + Integer.toString(iNumero) +  " es " + Integer.toString(iFactorial));
            
        }
    }
    

