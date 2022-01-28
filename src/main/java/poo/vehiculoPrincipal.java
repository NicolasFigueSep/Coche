
package poo;

import java.util.Scanner;

/**
 *
 * @author Alumno Tarde
 */
public class vehiculoPrincipal {
    
    public static void main(String[] args) {
//        Vehiculo Renault = new Vehiculo();
//        Renault.setColor(pedirCosa("color","Texto"));
//        Renault.setAsientos(pedirCosa("Asientos" , "Si o No"));
//        Renault.setClimatizador(pedirCosa("Climatizador" , "Si o NO"));
//        System.out.println(Renault.getDatos());        
        Furgoneta furgo1 = new Furgoneta(580,7);
        furgo1.setColor("azul");
        furgo1.setAsientos("no");
        furgo1.setClimatizador("si");
        System.out.println("Furgo 1 " + furgo1.toString());
    }
    private static String pedirCosa(String cosaPedida, String tipoDato){
        String cosaDevolv;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca " + cosaPedida + " : " +"( " + tipoDato + " ) " );
        cosaDevolv = sc.nextLine();
        return cosaDevolv;
    }    
}
