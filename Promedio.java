
package promedio;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.util.*;
public class Promedio {


    
    public static void main(String[] args) {
        int opcion = 0;
        int vehiculos = 0;
        int vueltas;
        int salida = 0;
        Scanner sc= new Scanner (System.in);
         
        System.out.println("Ingrese una opcion ");
            System.out.println("1.agregar vehiculos");
            System.out.println("2.ingresar vueltas");
            System.out.println("3.salir");
            
            while (salida!=1){
                try {
                   opcion = sc.nextInt();
                }catch(Exception e){
                    System.out.println("Opcion no valida " + e);
                }
                
            }
    }
}
        
                
                  


    
        
    

