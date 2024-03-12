
package ejercicio24;
/*Se tienen tres esferas (A,B,C) de diferente peso, elaborar un algoritmo que determine cuál es
la esfera de mayor peso
*/
import java.util.Scanner;
public class Ejercicio24 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A: ");
        int PESOA = entrada.nextInt();
        
        System.out.println("Ingrese el peso de la esfera B: ");
        int PESOB = entrada.nextInt();
        
        System.out.println("Ingrese el peso de la esfera C: ");
        int PESOC = entrada.nextInt();
        
        if (PESOA > PESOB && PESOA > PESOC){
            System.out.println("La esfera A es la de mayor peso");
        }else if (PESOB > PESOA && PESOB > PESOC) {
            System.out.println("La esfera B es la de mayor peso.");
        }else {
            System.out.println("La esfera C es la de mayor peso.");
        }
    }
    
}
