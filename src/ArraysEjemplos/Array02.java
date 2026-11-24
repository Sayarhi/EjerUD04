package ArraysEjemplos;
/**
 * Ejemplo de uso de arrays
 * Array02
 * @author Andrea
 */
public class Array02 {
    public static void main(String[] args) {
        //definición del array y reserva de memoria en la misma línea
        int []x = new int[5];
        x[0] =8;
        x[1] =33;
        x[2] =200;
        x[3] =150;
        x[4] =11;

        /**
         * Otra forma de hacer el array con sus datos(si es que ya los tenemos) es colocarlos en la misma línea
         * 
         * ----> int[]x={8,33,200,150,11};
         */

        System.out.println("El array x tiene 5 elementos ¿cuál de ellos quieres ver?");
        System.out.print("Introduzca un número del 0 al 4: ");
        int indice =Integer.parseInt(System.console().readLine()); //El Integer.parseInt lo que hace es convertir texto en número

        System.out.print("El elemento que se encuentra en la posición "+ indice); //Este índice solo captura el número introducido por teclado
        System.out.println(" es el "+ x[indice]);//Nos muestra el valor de esa casilla siempre y cuuando coincida con el número introducido
    }
}
