
package eva1_21_mcd;


public class EVA1_21_MCD {

    
    public static void main(String[] args) {
     
        int num1 = 180; //Se declaran dos variables conlos numeros a los que quermos sacarles el maximo comun divisior
        int num2 = 48;  // MCD ENTRE 180 Y 48
        
        int resultado = calcularMCD(num1, num2); //LLAMO A MI METODO
        System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + resultado);
    }
    
    public static int calcularMCD(int a, int b) {
        while (b != 0) { //mientras b no sea 0 se sigue dividiendo entre a y b
            int residuo = a % b; //nos da la división
            a = b; 
            b = residuo;    //48%18= 12
                            //18%12=6
                            //12%6= 0
        }
        return a;
        
        
    }
    
}
   
        
    
    
    
    



    

