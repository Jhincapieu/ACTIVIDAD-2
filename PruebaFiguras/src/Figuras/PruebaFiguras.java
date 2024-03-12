
package Figuras;

import java.util.Scanner;
public class PruebaFiguras {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio del circulo: ");
        int radio = entrada.nextInt();        
        Circulo figura1 = new Circulo(radio);
        
        System.out.println("Ingrese el valor de la base del rectangulo: ");
        int base_rectangulo = entrada.nextInt(); 
        System.out.println("Ingrese el valor de la altura del rectangulo: ");
        int altura_rectangulo = entrada.nextInt();
        Rectangulo figura2 = new Rectangulo(base_rectangulo,altura_rectangulo);
        
        System.out.println("Ingrese el valor del lado del cuadrado: ");
        int lado = entrada.nextInt();
        Cuadrado figura3 = new Cuadrado(lado);
        
        System.out.println("Ingrese el valor de la base del triangulo rectangulo: ");
        int base_triangulo_rectangulo = entrada.nextInt(); 
        System.out.println("Ingrese el valor de la altura del triangulo rectangulo: ");
        int altura_triangulo_rectangulo = entrada.nextInt();
        TrianguloRectangulo figura4 = new TrianguloRectangulo(base_triangulo_rectangulo,altura_triangulo_rectangulo);
        
        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());
        System.out.println();
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
    }
    
}
