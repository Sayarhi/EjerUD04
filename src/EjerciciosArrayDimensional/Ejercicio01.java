package EjerciciosArrayDimensional;
/**
 * Define un array de 12 num enteros con nombre num
 * Ejercicio01
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        //array
        int[]num=new int[12];

        //No es necasrio definir las casillas de las que están vacias
        //si los quisiera en una misma linea sería ---> int[] num = {39, -2, 0, 0, 0, 14, 0, 5, 120, 0, 0};
        num[0]=39;
        num[1]=-2;
        num[4]=0;
        num[6]=14;
        num[8]=5;
        num[9]=120;
  

        //bucle para las casillas del array
        for(int i =0; i<num.length; i++){
            System.out.print("Indice "+i+" \n");
            System.out.println("Valor "+num[i]+"\n");
            
        }

        //con for-each
        //El for-each solo funciona para el momento de imprimir los datos, NO SIRVE PARA PETICIÓN
        System.out.println("\n Y ahora con un for-each");
        int indice=0;

        for (int numero : num) {
            System.out.printf("num[%2d]: %d\n", indice, numero);
            indice++;
            
        }
    }
}
