package EjerciciosArrayDimensional;

import java.util.Scanner;

/**
 * Programa que pida la temperatura media que ha hecho en cada mes de un determinado año y 
 * que muestre a continuación un diagrama de barras horizontales con esos datos. 
 * Las barras del diagrama se pueden dibujar a base de asteriscos p cualquier cosa 
 * Ejercicio08
 * @author Andrea Pasapera
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        //Scanner 
        Scanner sc=new Scanner(System.in);

        //Arrays y variables
        int[]temperatura=new int[12];
        String[]mes={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        
        for(int i =0; i<temperatura.length;i++){
            System.out.print(mes[i]+" : ");
            temperatura[i]=sc.nextInt(); 
        }

        System.out.println("--------------------------------");
        System.out.println("El diagrama sería el siguiente: ");

        //Bucle for para el diagrama 
        for (int i = 0; i < temperatura.length; i++) {
            System.out.printf("%-12s: ", mes[i]); //muestra el mes
            
            //Este for sirve para mostrar los asteriscos de la temperatura guardada
            for (int j = 0; j < temperatura[i]; j++) {
                System.out.print("*");
            }
            System.out.println(" (" + temperatura[i] + " ºC)");
            System.out.println("------------------------");
        }

        sc.close();
        
    }
}
