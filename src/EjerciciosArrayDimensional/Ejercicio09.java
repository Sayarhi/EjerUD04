package EjerciciosArrayDimensional;

import java.util.Scanner;

/**
 * Realiza un programa que pida 8 números enteros y que luego muestre esos números junto
 * con la palabra "par" o "impar" segñun proceda.
 * Ejercicio09
 * @author Andrea Pasapera
 */

public class Ejercicio09 {
    public static void main(String[] args) {
        //Scanner
        Scanner datos = new Scanner(System.in);

        //Arrays y variables
        int[]num=new int[8];
        int elementos;

        System.out.println("Dime 8 números: ");

        for(int i = 0; i<num.length;i++){
            elementos=datos.nextInt();

            if(elementos%2 !=0){
                System.out.print("impar");
            }else{
                System.out.print(" par");
            }
            System.out.println();
        }

        datos.close();
    }
}
