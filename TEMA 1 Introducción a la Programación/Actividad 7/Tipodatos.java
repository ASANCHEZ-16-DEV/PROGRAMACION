import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tipodatos{
    public static void main(String[] args) throws IOException {


//VARIABLES Y CONSTANTES

Scanner sc = new Scanner(System.in);
char categoria;        
int nvisitas=0;
boolean seguir=true;
boolean controldatos=true;
int cumpleA=0;
int cumpleB=0;
int cumpleC=0;
int cumpleS=0;
double porcentajeA=0;
double porcentajeB=0;
double porcentajeC=0;
double porcentajeS=0;

//REGISTRADOR DE VISITAS

while(seguir){

    while(controldatos){

System.out.println("Introduce la categoria de la casa con A/B/C o S (Sin Clasificar) - Pulsa F para finalizar y mostrar resultados estadísticos");
categoria = sc.next().charAt(0);

    if ((categoria != 'A' &&  categoria !='B' && categoria !='C' && categoria !='S' && categoria !='F')){
     System.out.println("Debe introducir clasificaciones energeticas o finalización de programa");

    
    } else if(categoria =='A'){
        System.out.println("La casa ha sido clasificada con Categoría A");
        nvisitas ++;
        cumpleA++;
        
    
    } else if(categoria =='B'){
        System.out.println("La casa ha sido clasificada con Categoría B");
        nvisitas ++;
        cumpleB++;
    
    } else if(categoria =='C'){
        System.out.println("La casa ha sido clasificada con Categoría C");
        nvisitas ++;
        cumpleC++;
    
    } else if(categoria =='S'){
        System.out.println("La casa no ha sido clasificada");
        cumpleS++;
        nvisitas ++;
    
    } else if(categoria == 'F'){
        System.out.println("El registro de visitas ha finalizado");
        seguir=false;
    

    //RESULTADOS ESTADÍSTICOS
    
    System.out.println("El numero total de visitas es " + nvisitas); 
    
    System.out.println("El total de casas de categoría A son " + cumpleA);
        System.out.println("EL total de casas de categoría B son " + cumpleB);
            System.out.println("EL total de casas de categoría C son " + cumpleC);
    
    System.out.println("El total de casas sin clasificar son " + cumpleS);

    
porcentajeA = ((double) cumpleA/nvisitas)*100;
System.out.println("El porcentaje de casas de Categoría A es " + porcentajeA + " %");

porcentajeB = ((double) cumpleB/nvisitas)*100;
System.out.println("El porcentaje de casas de Categoría B es " + porcentajeB + " %");

porcentajeC = ((double) cumpleC/nvisitas)*100;
System.out.println("El porcentaje de casas de Categoría C es " + porcentajeC + " %");

porcentajeS = ((double) cumpleS/nvisitas)*100;
System.out.println("El porcentaje de casas de Categoría D es " + porcentajeS + " %");


sc.close();
                   }
              }
         }
    }
}



    

