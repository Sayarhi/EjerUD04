package ArraysEjemplos;

import java.util.Scanner;

public class Array06AleatorioDeBanderas {
    public static void main(String[] args) {
        //creo el Scanner
        Scanner datos = new Scanner(System.in);

        //Variables y arrays
        String[] color ={"rojo","amarillo","verde","blanco","azul","negro"};
        int franjas;

        System.out.println("Generador aleatorio de banderas");
        System.out.println("¿Cuántas frangas quieres para la bandera?");
        franjas = datos.nextInt();

        for(int i =0;i<franjas;i++){
            //Hacemos un random con el nombre del array y dentro el random con la cantidad de elementos que tiene el array
            System.out.println(color[(int)(Math.random()*6)]);
            System.out.println("---------------------");
        }
        datos.close();
    }    
}
