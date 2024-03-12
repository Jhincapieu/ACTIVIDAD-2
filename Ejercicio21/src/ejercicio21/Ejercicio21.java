
package ejercicio21;

import java.util.Scanner;
public class Ejercicio21 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado1 del triangulo: ");
        double lado1 = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del lado2 del triangulo: ");
        double lado2 = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del lado3 del triangulo: ");
        double lado3 = entrada.nextDouble();
        
        LadosTriangulo lados = new  LadosTriangulo(lado1,lado2,lado3);
        
        System.out.println("El perimetro del triangulo es: " + lados.calcularPerimetro());
        System.out.println("El semiperimetro del triangulo es: " + lados.calcularSemiperimetro());
        System.out.println("El area del triangulo es: " + lados.calcularArea());
    }
    
}
