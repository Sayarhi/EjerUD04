package EjerciciosArrayDimensional;

/**
 * Escribe un programa que muestre 20 números aleatorios entre el 0 y 100
 * Pares tienen que estar en la primera posición e impares en el resto
 * Ejercicio10
 * @author Andrea
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        // Array y variables
        int[] num = new int[20];
        int[] contenedorPar = new int[20];
        int[] contenedorImpar = new int[20];
        int par = 0;
        int impar = 0;
        int indice = 0;

        // 1. Generar 20 números aleatorios entre 0 y 100 y mostrarlos
        System.out.println("Array original:");
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 101);
            System.out.print(num[i] + "  ");
        }

        // 2. Clasificar en contenedores auxiliares sin dejar huecos
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                contenedorPar[par] = num[i]; // el contenedor lo llenamos como si fuera un aux
                par++;
            } else {
                contenedorImpar[impar] = num[i];
                impar++;
            }
        }

        // 3. Volcar primero los pares y luego los impares de vuelta a 'num'
        for (int i = 0; i < par; i++) {
            num[indice] = contenedorPar[i];
            indice++;
        }
        for (int i = 0; i < impar; i++) {
            num[indice] = contenedorImpar[i];
            indice++;
        }

        //Mostrar el array final ordenado (pares primero, impares después)
        System.out.println("\n\nArray con pares primero e impares después:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "  ");
        }
    }
}