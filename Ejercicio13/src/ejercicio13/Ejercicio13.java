
package ejercicio13;

import java.util.Scanner;
public class Ejercicio13 {

    
    public static void main(String[] args) {
        int PDES;
        //VALCOMP: Valor de la compra.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de la compra: ");
        int VALCOMP = entrada.nextInt();
        
        //COLOR: Color de la bolita.
        System.out.println("Ingrese el color de la bolita: ");
        String COLOR = entrada.next();
        
        PDES = switch (COLOR) {
            case "blanco" -> 0;
            case "verde" -> 10;
            case "amarillo" -> 25;
            case "azul" -> 50;
            default -> 100;
        };

        double VALPAG = VALCOMP - PDES * VALCOMP / 100;
        System.out.println("El cliente debe pagar: $ " +VALPAG);
             
    }
    
}
