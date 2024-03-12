
package ejercicio18;

import java.util.Scanner;
public class Ejercicio18 {

    
    public static void main(String[] args) {
        int codigo_empleado;
        double numero_h_mes, valor_hora, porcentaje_retencion, retencion;
        double salario_bruto, salario_neto;
        String nombre_empleado;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el codigo del empleado: ");
        codigo_empleado = entrada.nextInt();
        
        System.out.println("Ingrese el nombre del empleado: ");
        nombre_empleado = entrada.next();
        
        System.out.println("Ingrese el numero de horas trabajadas al mes: ");
        numero_h_mes = entrada.nextDouble();
        
        System.out.println("Ingrese el valor horas trabajadas al mes: ");
        valor_hora = entrada.nextDouble();
        
        System.out.println("Ingrese el porcentaje de retencion: ");
        porcentaje_retencion = entrada.nextDouble();
        
        salario_bruto = numero_h_mes * valor_hora;
        retencion = salario_bruto * (porcentaje_retencion / 100);
        salario_neto = salario_bruto - retencion;
        
        System.out.println("El codigo de empleado es: " + codigo_empleado);
        System.out.println("El nombre del empleado es: " + nombre_empleado);
        System.out.println("El salario bruto del empleado es: " + salario_bruto);
        System.out.println("El salario neto del empleado es: " + salario_neto);
        
        
    }
    
}
