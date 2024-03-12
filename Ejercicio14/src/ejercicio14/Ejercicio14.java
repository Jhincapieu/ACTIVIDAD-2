
package ejercicio14;

import java.util.Scanner;
public class Ejercicio14 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //VD1: Ventas del departamento 1
        System.out.println("Ingrese las ventas del departamento1: ");
        double VD1 = entrada.nextDouble();
        //VD2: Ventas del departamento 2
        System.out.println("Ingrese las ventas del departamento2: ");
        double VD2 = entrada.nextDouble();
        //VD3: Ventas del departamento 3
        System.out.println("Ingrese las ventas del departamento3: ");
        double VD3 = entrada.nextDouble();
        //SALAR: Salario que reciben vendedores en cada departamento.
        System.out.println("Ingrese el salario por departamento: ");
        double SALAR = entrada.nextDouble();
        
        double TOTVEN = VD1 + VD2 + VD3;
        double PORVEN = 0.33 * TOTVEN;
        double SALAR1, SALAR2, SALAR3;
        if (VD1 > PORVEN) {
            SALAR1 = SALAR + 0.2 * SALAR;
        }else {
            SALAR1 = SALAR;
        }
        
        if (VD2 > PORVEN){
            SALAR2 = SALAR + 0.2 * SALAR;
        }else {
            SALAR2 = SALAR;
        }
        
        if (VD3 > PORVEN){
            SALAR3 = SALAR + 0.2 * SALAR;
        }else{
            SALAR3 = SALAR;
        }
        System.out.println("Salario vendedores Depto. 1" +SALAR1);
        System.out.println("Salario vendedores Depto. 2" +SALAR2);
        System.out.println("Salario vendedores Depto. 3" +SALAR3);
    }
    
}
