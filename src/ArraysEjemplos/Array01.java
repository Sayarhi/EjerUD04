package ArraysEjemplos;
/**
 * Ejemplo de uso de arrays
 * Los arrays de una sola dimensión se llaman "Vectores"
 * Array01
 * @author
 */
public class Array01 {
    public static void main(String[] args) {
        //Variables
        int suma;
        int [] n; // se define n como un array de enteros
        n = new int[4]; //se reserva espacio para 4 enteros

        n[0]=26;
        n[1]=-30;
        n[2]=0;
        n[3]=100;

        
        System.out.println("Los valores del array n son los siguientes: ");
        System.out.print(n[0] + "," + n[1] + "," + n[2]+","+ n[3] + ".");
        
        suma=n[0]+n[3];
        System.out.println("\nLa suma del primer número con el último es: "+suma);
    }
}
