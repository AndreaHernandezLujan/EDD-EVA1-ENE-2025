/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_numeros_primos;

/**
 *
 * @author andyl
 */
public class EVA1_23_NUMEROS_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int val =15;
        int repe=0;
        System.out.println("El" + val + " es primo?" +esPrimoIneficiente(val));
        System.out.println("El" + val + " es primo?" +esPrimoEficiente(val));
    }
    public static boolean esPrimoIneficiente(int num){
    boolean resu = true;
        for (int i = 2; i < num; i++) {
            int residuo = num % i;
            if(residuo == 0) {//Division exacta, no es primo
                resu = false;
                break; //Ya no es necesario seguir buscando
            } 
        }
        return resu;
    
    }
    public static boolean esPrimoEficiente(int num){
    boolean resu = true;
        int resu2 = (int) Math.sqrt(num);
        for (int i = 2; i <= resu2; i++) {
            int residuo = resu2%i;
            if(residuo == 1){ //Division exacta, no es primo
                resu = false;
                break; //Ya no es necesario seguir buscando
        
        }
    }
    return resu;
}
}
    

    
    
 
    


