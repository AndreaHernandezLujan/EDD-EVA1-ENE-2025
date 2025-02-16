
package eva1_18_promedio;

import java.util.Scanner;


public class EVA1_18_PROMEDIO {

    
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner scanner = new Scanner(System.in); //Crea un objeto Scanner llamado scanner para leer la entrada del usuario.
        
        System.out.print("Ingrese el número de grupos: ");//Solicita al usuario el número de grupos y lo almacena en la variable numGrupos.
        int numGrupos = scanner.nextInt();
        
        int[][] calificaciones = new int[numGrupos][];//Declara un arreglo de calificaciones con numGrupos filas, pero sin definir las columnas porque el número de estudiantes en cada grupo varía.
        double sumaGlobal = 0; //Acumula la suma total de calificaciones
        int totalEstudiantes = 0;//Cuenta el total de estudiantes de los grupos
        
        for (int i = 0; i < numGrupos; i++) { //inicia un bucle for para iterar sobre cada grupo
            System.out.print("Ingrese el número de estudiantes en el grupo " + (i + 1) + ": ");//En el grupo i+1 guarda la cantidad en numEstudiantes
            int numEstudiantes = scanner.nextInt();
            calificaciones[i] = new int[numEstudiantes];//Arreglo tamaño numEstudiantes a la fila i de la matriz calificaciones
            
            double sumaGrupo = 0; //Para almacenar la suma de las calificaciones
            for (int j = 0; j < numEstudiantes; j++) { //Inicia segundo for para recorrer cada estudiante del grupo actual
                System.out.print("Ingrese la calificación del estudiante " + (j + 1) + " en el grupo " + (i + 1) + ": ");//pide la calificacion del estudiante j+1 del grupo i+1
                calificaciones[i][j] = scanner.nextInt();//almacena en calificaciones ij
                sumaGrupo += calificaciones[i][j];//suma la calificacion del estudiante
            }
            
            double promedioGrupo = sumaGrupo / numEstudiantes; //Calcula el promedio del grupo dividiendo entre sumaGrupo entre numEstudiantes
            System.out.println("Promedio del grupo " + (i + 1) + ": " + promedioGrupo);//Muestra el promedio
            
            sumaGlobal += sumaGrupo; //Suma grupo a sumaGlobal y actualiza total estudiantes
            totalEstudiantes += numEstudiantes;
        }
        
        double promedioGlobal = sumaGlobal / totalEstudiantes; //Calcula el promedio global
        System.out.println("Promedio global de todos los grupos: " + promedioGlobal);
        
        
    }
}

       
    



        
        
        
    
    

