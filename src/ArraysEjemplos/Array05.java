package ArraysEjemplos;
/**
 * Array de tipo double
 * Array05
 */
public class Array05 {
    public static void main(String[] args) {
        
        double [] nota=new double[4];
        double suma =0;

        System.out.println("Pasa calcular la nota media necesito saber la nota de uno de tus exámenes.");
        
        //Este bucle hace que te pida las 4 notas
        for(int i =0;i<4;i++){
            System.out.println("Nota del examen n " +(i+1)+": ");
            nota[i]= Double.parseDouble(System.console().readLine().replace(',','.')); //el raplce hace que podamos usar las , y .
        }

        System.out.println("Tus notas son: ");

        //este bucle sirve para imprimir las notas introducidas y las vaya sumando
        for(int i =0;i<4;i++){
            System.out.println(nota[i]+" ");
            suma += nota[i];
        }

        System.out.println("\nLa media es "+ suma/4 ); //media lista
    }
}
