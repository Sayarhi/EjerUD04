package EjerciciosArrayDimensionales;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        //creo la clase Scanner
        Scanner datos= new Scanner(System.in);

        //arrays
        int[]num=new int[10];

        //petición de datos
        System.out.println("Dime 10 números: ");
        
        for(int i =0;i<num.length;i++){
            System.out.print((i+1)+": ");
            num[i]=datos.nextInt();
        }
        
        // Mostrar en orden inverso (del índice 9 al 0)
        System.out.println("\nNúmeros en orden inverso:");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }

        datos.close();
    }
}
