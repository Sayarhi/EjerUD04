package EjerciciosArrayDimensional;

import java.util.Scanner;

/**
 * Escribe un programa que pida 10 números por teclado y luego muestre los números introducidos junto con las palabras max y mini al lado del max y mini de num
 * Ejercicio05
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        //Scanner
        Scanner datos= new Scanner(System.in);

        //Array
        int []num=new int[10];
        int max=0;
        int mini=0;

        System.out.println("Introduce 10 números: ");
        for(int i =0;i<num.length;i++){
            System.out.print((i+1)+" : ");
            num[i]=datos.nextInt();

            if(num[i]>max){
                max=num[i];
            }
            if (num[i]<mini) {
                mini=num[i];
            }
        }

        //vamos a mostrar al lado de los número cuál es el max y cual el mini
        System.out.println("\nLos números introducidos son: ");
        for(int i = 0;i<num.length;i++){
            System.out.print(num[i]);
            if(num[i] == max){
                System.out.print(" max");
            }
            if(num[i] == mini){
                System.out.print(" minimo");
            }
            System.out.println();
        }
        datos.close();
    }
}
