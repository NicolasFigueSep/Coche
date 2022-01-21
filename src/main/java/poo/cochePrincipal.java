
package poo;

import java.util.Scanner;

/**
 *
 * @author Alumno Tarde
 */
public class cochePrincipal {
    
    public static void main(String[] args) {
        Coche Renault = new Coche();
        Renault.setColor(pedirCosa("color","Texto"));
        Renault.setAsientos(pedirCosa("Asientos" , "Si o No"));
        Renault.setClimatizador(pedirCosa("Climatizador" , "Si o NO"));
        System.out.println(Renault.getDatos());        
    }
    private static String pedirCosa(String cosaPedida, String tipoDato){
        String cosaDevolv;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca " + cosaPedida + " : " +"( " + tipoDato + " ) " );
        cosaDevolv = sc.nextLine();
        return cosaDevolv;
    }
    
}
