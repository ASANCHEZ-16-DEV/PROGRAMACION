import java.lang.annotation.Repeatable;
import java.util.Scanner;
import javax.naming.ldap.ExtendedRequest;
import javax.xml.namespace.QName;

public class Moneda {

    private static double Tasacambio = 1.09;
    private static double euros;
    private static double dolares;

      public static void main(String[] args) {
         
         boolean repeat = true;
         Scanner sc = new Scanner(System.in);
         String eligemoneda = "";
         
         System.out.println("SISTEMA DE CONVERSIÓN DE MONEDAS, PULSE S PARA SALIR DEL PROGRAMA");

     do{ 
            System.out.println("¿Desea convertir euros o dolares?");
               eligemoneda = sc.nextLine();


            switch(eligemoneda.toLowerCase()){

               case "s": System.out.println("El programa ha finalizado");
                         repeat=false;
                         break; 

               case "euros":  System.out.println("Introduce la cantidad de Euros"); //
                                                   euros = sc.nextDouble();
                                                   sc.nextLine();
                                                      double resultado1 = ConversorEurosaDolares(euros);
                                                         System.out.println(euros + " Euros" + " corresponden a " +  resultado1 + " Dolares");
                                                         break;


               case "dolares":   System.out.println("Introduce la cantidad de Dolares");  //Caso Dolares
                                                      dolares = sc.nextDouble();
                                                      sc.nextLine();
                                                         double resultado2 = ConversorDolaresEuros(dolares);
                                                            System.out.println(dolares + " Dolares" + " corresponden a " +  resultado2 + " Euros");
                                                            break;
            
               default:  System.out.println("Error en el tipo de datos introducido, repita la introducción");
                         continue;       
            }                
                                                    
         } while(repeat);
         
   }  //Termina el método main 

  
    public static double ConversorEurosaDolares(double euros) {
       return euros * Tasacambio;
    }
  
    public static double ConversorDolaresEuros(double dolares) {
       return dolares / Tasacambio;
    }

 } //Finalización de la clase Moneda
 