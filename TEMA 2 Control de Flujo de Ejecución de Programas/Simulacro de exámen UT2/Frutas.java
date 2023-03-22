import java.util.Scanner;
import java.util.InputMismatchException;

public class Frutas{
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

//VARIABLES Y CONSTANTES

double uvas=0;
double fresas=0;
double peras=0;
double manzanas=0;
int producto=0;
double totalkilos;
boolean seguir=true;

//MENÚ DE SELECCIÓN 

while(seguir){
    try{
    System.out.println("Introduzca la cantidad de uvas en kilos");
    uvas = sc.nextDouble();

    System.out.println("Introduzca la cantidad de fresas en kilos");
    fresas = sc.nextDouble();

    System.out.println("Introduzca la cantidad de peras en kilos");
    peras = sc.nextDouble();
  
    System.out.println("Introduzca la cantidad de manzanas en kilos");
    manzanas = sc.nextDouble();

} catch (InputMismatchException error) {
    System.err.println("Debe introducir un número entero");
 }

seguir=false;
}       

//DATOS ESTADÍSTICOS DE LAS FRUTAS

//FRUTA QUE MÁS KILOS HA RECOGIDO

if(uvas>fresas){
    System.out.println("La fruta con mayores kilos registrados son " + uvas + "kg de uvas");

} else if(fresas>uvas){
    System.out.println("La fruta con mayores kilos registrados son " + fresas + "kg de fresas");

} else if(peras>manzanas){
    System.out.println("La fruta con mayores kilos registrados son " + peras + "kg de peras");

} else if(manzanas>peras){
    System.out.println("La fruta con mayores kilos registrados son " + manzanas + "kg de manzanas");
};


//FRUTA QUE MENOS KILOS HA RECOFGIDO

if(manzanas<peras){
    System.out.println("La fruta con menores kilos registrados son " + manzanas + "kg de manzanas");

} else if(peras<manzanas){
    System.out.println("La fruta con menores kilos registrados son " + peras + "kg de peras");

} else if(fresas<uvas){
    System.out.println("La fruta con menores kilos registrados son " + fresas + "kg de fresas");

} else if(uvas<fresas){
    System.out.println("La fruta con menores kilos registrados son " + uvas + "kg de uvas");
};



//TOTAL DE KILOS 
totalkilos = uvas+fresas+peras+manzanas;
System.out.println("El total de kilos recogidos es " + totalkilos + "Kg");







sc.close();

    }
}