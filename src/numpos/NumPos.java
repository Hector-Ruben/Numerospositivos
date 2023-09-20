package numpos;
import java.util.Scanner;
public class NumPos {
    public void Num(){
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un valor entero: ");
        numero = entrada.nextInt();
        if (numero > 0) {
            System.out.println(numero + " es mayor que cero");
        } else if (numero < 0) {
            System.out.println(numero + " es menor que cero");
        } else if (numero == 0){
            System.out.println(numero + " es igual a cero");
        }
    }
    public static void main(String[] args) {
        NumPos numpos = new NumPos();
        numpos.Num();
    }
    
}
