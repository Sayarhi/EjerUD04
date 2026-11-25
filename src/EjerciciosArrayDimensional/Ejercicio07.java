package EjerciciosArrayDimensional;

import java.util.Scanner;

/**
 * Programa que genere 100 num aleatorios del 0 al 20 y que los muestre por pantalla separados por espeacios.
 * - Pedirá por teclado 2 valores  
 * Ejercicio07
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        //Array
        int[]num=new int[100];
        int datos1=0;
        int datos2=0;


        for(int i = 0; i<num.length;i++){
            num[i]=(int)(Math.random()*21);
            System.out.print(num[i]+" , ");
        }

        System.out.println("\nVamos a cambiar los valores.");
        System.out.print("Dime el valor que quieres buscar: ");
        datos1=sc.nextInt();
        System.out.println("Dime el valor que vas a cambiarlo: ");
        datos2=sc.nextInt();

        
        /**
         * Aunque no ponga el Math.random, es necesario volver a mostyrar el bucle haciendo su for
         * Este bucle me muestra el resultado con los mismos números de antes
         *
         * for(int i =0; i<num.length;i++){
                System.out.print(num[i]+" , ");
            }
        */
       
        for(int i =0; i<num.length;i++){
            if (num[i]==datos1) {
                System.out.print(" ¡"+datos2+"! , ");
            } else {
                System.out.print(num[i]+" , ");
            }
        }
        sc.close();
    }
}
