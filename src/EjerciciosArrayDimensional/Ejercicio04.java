package EjerciciosArrayDimensional;
/**
 * - Define 3 arrays de 20 num enteros ---> numero,cuadrado,cubo
 * - carga el array numero con números aleatorios entre 0 y 100
 * - El array cuadrado debe contener los cuadrados de los valores en el array numero
 * - Array cubo lo mismo pero los cubos
 * - Muestra el resultado de los arraus en 3 columnas
 * Ejercicio04
 * @author Andrea
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        //Arrays
        final int tamanio=20;
        int [] numero=new int[tamanio];
        int [] cubo= new int [tamanio];
        int [] cuadrado = new int[tamanio];

        for(int i =0; i<tamanio;i++){
            numero[i]=(int)(Math.random()*101);
            //cuadrado y cubo de los números dados de manera random
            cuadrado[i]=numero[i]*numero[i];
            cubo[i]=numero[i]*numero[i]*numero[i];
            System.out.println((i+1)+" : "+numero[i]);
        }

        System.out.println("\n---------------------------------");
        System.out.printf("%-10s %-12s %-12s%n","NUMERO","CUADRADO","CUBO");
        System.out.println("---------------------------------");
        for(int i =0; i < tamanio;i++){
            System.out.printf("%-10d %-12d %-12d%n",numero[i],cuadrado[i],cubo[i]);

        }
    }
}
