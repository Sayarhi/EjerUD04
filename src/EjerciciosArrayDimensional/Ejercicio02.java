package EjerciciosArrayDimensional;
/**
 * Lo mismo que el ejercicio anterior pero con String
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        //array de tipo String
        String[]simbolos=new String[10];

        simbolos[0]="a";
        simbolos[1]="x";
        simbolos[4]="@";
        simbolos[6]=" ";
        simbolos[7]="+";
        simbolos[8]="Q";

        //for normal
        for(int i =0;i<simbolos.length;i++){
            System.out.println("Indice "+i);
            System.out.println("valor "+ simbolos[i]);
        }

        //Con un for-each
        System.out.println("------------------------------\n");
        System.out.println("Ahora con for-each.");
        int indice=0; //contador para mostrar el valor del índice 

        for (String casillas : simbolos) {
            System.out.println("\nIndice "+ indice);
            System.out.println("Valor "+casillas);
            indice++;
        }
            
    }
}
