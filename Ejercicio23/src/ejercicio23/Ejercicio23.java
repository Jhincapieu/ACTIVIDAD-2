
package ejercicio23;
/*Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado,
elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación.
*/
import java.util.Scanner;
public class Ejercicio23 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        double A = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de B: ");
        double B = entrada.nextDouble();
        
        System.out.println("Ingrese el valor de C: ");
        double C = entrada.nextDouble();
        
        double D = (Math.pow(B, 2) - 4*A*C);
        
        if (D >= 0){
            double x1 = (-B + Math.sqrt(D) / (2*A));
            double x2 = (-B - Math.sqrt(D) / (2*A));
            System.out.println("La primera solucion es "+x1+ " y "+x2);
        }else{
            System.out.println("La ecuacion no tiene soluciones reales");
        }
    }
    
}

