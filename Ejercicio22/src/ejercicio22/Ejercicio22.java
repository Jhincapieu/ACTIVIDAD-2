
package ejercicio22;
/* Elaborar un algoritmo que entre el nombre de un empleado, su salario básico por hora y el
número de horas trabajadas en el mes; escriba su nombre y salario mensual si éste es mayor
de $450.000, de lo contrario escriba sólo el nombre.
*/
import java.util.Scanner;
public class Ejercicio22 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        String NOMBRE = entrada.nextLine();
        
        System.out.println("Ingrese el salario basico por hora: ");
        double SAL_HORA = entrada.nextDouble();
        
        System.out.println("Ingrese el numero de horas trabajadas: ");
        double HORA_TRAB = entrada.nextDouble();
        
        double SALARIO_MEN = SAL_HORA * HORA_TRAB;
        
        if (SALARIO_MEN > 450000){
            System.out.println("Su nombre es "+NOMBRE + " y su salario es "+SALARIO_MEN);
        }else{
            System.out.println("Su nombre es "+NOMBRE);
        }
        
        
    }
    
}
