
package ejercicio19;


public class TrianguloEquilatero {
    double lado;
    
    public TrianguloEquilatero(double lado) {
        this.lado = lado;
        
    }
    
    double calcularPerimetro() {
        return (lado * 3);
    }
    
    double calcularAltura() {
        return (lado * Math.sqrt(3))/2;
    }
    
    double calcularArea() {
        return (lado * lado * Math.sqrt(3))/4;
    }
}

