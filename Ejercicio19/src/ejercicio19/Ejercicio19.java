
package ejercicio19;

import java.util.Scanner;
public class Ejercicio19 {

    
    public static void main(String[] args) {
                
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado del triangulo equilatero: ");
        double lado = entrada.nextDouble();
        
        TrianguloEquilatero figura1 = new  TrianguloEquilatero(lado);
        TrianguloEquilatero figura2 = new  TrianguloEquilatero(lado);
        TrianguloEquilatero figura3 = new  TrianguloEquilatero(lado);
        
        System.out.println("El perimetro del triangulo es: " + figura1.calcularPerimetro());
        System.out.println("La altura del triangulo es: " + figura2.calcularAltura());
        System.out.println("El area del triangulo es: " + figura3.calcularArea());
        
        
    }
    
}
