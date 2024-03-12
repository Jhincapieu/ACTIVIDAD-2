
package ejercicio12;

import java.util.Scanner;
public class Ejercicio12 {

    
    public static void main(String[] args) {
        //NOM: Nombre del trabajador.
        double SALARIO;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del trabajador: ");
        String NOM = entrada.nextLine();
        
        
        //NHT: Número de horas trabajadas.
        System.out.println("Ingrese el numero de horas trabajadas: ");
        int NHT = entrada.nextInt();
        
        //VHN: Valor hora normal trabajada.
        System.out.println("Ingrese el valor hora normal trabajada: ");
        double VHN = entrada.nextDouble();   
        
        if (NHT > 40){    //HET: Horas extras trabajadas.
            int HET = NHT - 40;
            
            if (HET > 8){
                int HEE8 = HET - 8;   //HEE8: Horas extras que exceden de 8.
                SALARIO = 40 * VHN + 16 * VHN + HEE8 * 3 * VHN;
            }else{
                SALARIO = 40 * VHN + HET * 2 * VHN;
            }
        }else{
            SALARIO = NHT*VHN;  //SALARIO: Pago total que recibe el trabajador.
        }
        System.out.println("El trabajador " +NOM+ " devengo: $" +SALARIO);
    }
    
}
