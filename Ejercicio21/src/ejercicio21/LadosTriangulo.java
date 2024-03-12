
package ejercicio21;


public class LadosTriangulo {
    double lado1, lado2, lado3;
    
    public LadosTriangulo(double lado1,double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    double calcularPerimetro() {
        return (lado1 + lado2 + lado3);
    }
    
    double calcularSemiperimetro() {
        return (calcularPerimetro()/2);
    }
    
    double calcularArea() {
        return (Math.sqrt(calcularSemiperimetro()*(calcularSemiperimetro() - lado1) *(calcularSemiperimetro() - lado2)*(calcularSemiperimetro()-lado3)));
    }
}
