
package eva1_11_copia_falsa;


public class EVA1_11_COPIA_FALSA {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int datos [] = new int [10];
         System.out.println(datos);//IMPRIMIR DIRECCIÓN DEL OBJETO
        for (int i = 0; i < datos.length; i++){
           datos[i]= (int)(Math.random()*100);
        }
        for (int valor: datos){
            System.out.println("[" + valor + "]");
         
        }
        
        int [] copia = datos;
        System.out.println(datos);
        System.out.println(copia);
    }
    
}
