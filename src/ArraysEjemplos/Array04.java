package ArraysEjemplos;
/**
 * Array de tipo char
 */
public class Array04 {
    public static void main(String[] args) {
        
        char[] caracter=new char[6];

        caracter[0]='R';        
        caracter[1]='%';
        caracter[2]='&';
        caracter[3]='+';
        caracter[4]='A';
        caracter[5]='2';

        System.out.println("El array caracter contiene los sienguientes elementos:");

        for(int i = 1; i<caracter.length;i++){
            System.out.println(caracter[i]);
        }
        
    }
}
