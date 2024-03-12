
package ejercicio15;

import java.util.Scanner;
public class Ejercicio15 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A: ");
        int PESOA = entrada.nextInt();
        
        System.out.println("Ingrese el peso de la esfera B: ");
        int PESOB = entrada.nextInt();
        
        System.out.println("Ingrese el peso de la esfera C: ");
        int PESOC = entrada.nextInt();
        
        System.out.println("Ingrese el peso de la esfera D: ");
        int PESOD = entrada.nextInt();
        
        if (PESOA == PESOB && PESOA == PESOC){
            if (PESOD > PESOA){
                System.out.println("LA ESFERA D ES LA DIFERENTE");
            }else{
                System.out.println("LA ESFERA D NO ES LA DIFERENTE");
            }
        }else{
            if (PESOA == PESOB && PESOA == PESOD){
                System.out.println("LA ESFERA C ES LA DIFERENTE");
                if (PESOC > PESOA){
                    System.out.println("Y ES DE MAYOR PESO");
                }else{
                    System.out.println("Y ES DE MENOR PESO");
                }
            }else{
                if (PESOA == PESOC && PESOA == PESOD){
                    System.out.println("LA ESFERA B ES LA DIFERENTE");
                    if (PESOB > PESOD){
                        System.out.println("Y ES DE MAYOR PESO");
                    }else{
                        System.out.println("Y ES DE MENOR PESO");
                    }
                }else{
                    System.out.println("LA ESFERA A ES LA DIFERENTE");
                    if (PESOA > PESOB){
                        System.out.println("Y ES DE MAYOR PESO");
                    }else{
                        System.out.println("Y ES DE MENOR PESO");
                    }
                }
            }
        }
    }
    
}
