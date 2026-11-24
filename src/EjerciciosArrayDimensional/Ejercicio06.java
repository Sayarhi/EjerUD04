package EjerciciosArrayDimensional;

import java.util.Scanner;

/**
 * Escribe un programa que lea 15 n;umeros por teclado y que los alamacene en un array.
 * Rota los elementos d ese array, es decir, el elemento de la posición 0 debe pasar
 * a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe
 * pasar a la posición 0. Finalmente, muestra el contenido del array
 * Ejercicio06
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[15];

        System.out.println("Introduce 15 números enteros:");
        for (int i = 0; i < numero.length; i++) {
            System.out.print((i + 1) + ": ");
            numero[i] = sc.nextInt();
        }

        // Rotar a la derecha: guardar el último, mover hacia atrás y colocar el último en 0
        int ultimo = numero[numero.length - 1];
        for (int i = numero.length - 1; i > 0; i--) {
            numero[i] = numero[i - 1];
        }
        numero[0] = ultimo;

        // Mostrar el contenido final del array
        System.out.println("-----------------------------");
        System.out.println("Números rotados:");
        for (int i = 0; i < numero.length; i++) {
            System.out.println(i + " : " + numero[i]);
        }

        sc.close();
    }
}
