
package ejercicio7;

import java.util.Scanner;
public class Ejercicio7 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de A: ");
        double A = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de B: ");
        double B = entrada.nextDouble();
        
        if (A > B) {
            System.out.println("A es mayor que B");
        }else if (A == B){
            System.out.println("A es igual a B");
        } else {
            System.out.println("A es menor que B");
        }
    }
    
}
