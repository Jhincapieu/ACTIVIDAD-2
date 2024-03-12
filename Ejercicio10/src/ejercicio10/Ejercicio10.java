
package ejercicio10;

import java.util.Scanner;
public class Ejercicio10 {

    
    public static void main(String[] args) {
        
        //NI: numero de inscripcion
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de inscripcion: ");
        String NI = entrada.next();
        
        //NOM: nombres de estudiantes
        System.out.println("Ingrese el nombre del estudiante: ");
        String NOM = entrada.next();
        String APE = entrada.nextLine();
        
        //PAT: patrimonio
        System.out.println("Ingrese el patriminio del estudiante: ");
        double PAT = entrada.nextDouble();
        
        //EST: estrato del estudiante
        System.out.println("Ingrese el estrato del estudiante: ");
        int EST = entrada.nextInt();
        
        int PAGMAT = 50000;
        
        if (PAT > 2000000 && EST > 3){
            PAGMAT = (int) (PAGMAT + (0.03 * PAT));
        }
        System.out.println("El estudiante con numero de inscripcion " +NI + " y nombre " +NOM + APE+ " debe pagar: $ " +PAGMAT);
        
    }
    
}
