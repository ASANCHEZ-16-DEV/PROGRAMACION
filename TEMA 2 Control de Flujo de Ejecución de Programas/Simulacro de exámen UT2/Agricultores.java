import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Scanner;

public class Agricultores{
    public static void main(String[] args) throws IOException {
        
//VARIABLES Y CONSTANTES
Scanner sc = new Scanner(System.in);
int producto=0;
double uvas=0;
double fresas=0;
double peras=0;
double manzanas=0;
int countproducto=0;
char continuar = ' ';
boolean seguir=true;
boolean controlerrores=true;


while(seguir){ 

try { 
System.out.println("¿Que producto desea entregar 1- Uvas 2- Fresas 3- Peras 4- Manzanas?");
producto = sc.nextInt();

if (producto==1 || producto==2 || producto==3 || producto==4){
    seguir=false;
}

    } catch (InputMismatchException e){
            System.out.println("Has introducido letras, por favor introduce los números correspondientes a cada fruta");
            sc.nextLine();
    }  


switch (producto){
    case 1: 
   
        System.out.println("Introduce los kilos de uvas a entregar");
        uvas= sc.nextDouble();
        countproducto++;
        break;

    case 2: 
        System.out.println("Introduce los kilos de fresas a entregar");
        fresas= sc.nextDouble();
        countproducto++;
        break;

    case 3:
        System.out.println("Introduce los kilos de peras a entregar");
        peras= sc.nextDouble();
        countproducto++;
        break;

    case 4:
        System.out.println("Introduce los kilos de manzanas a entregar");
        manzanas= sc.nextDouble();
        countproducto++;
        break;
    }

    System.out.println("Pulsa C para continuar, o F para finalizar");
    continuar= (char) System.in.read();

    if (continuar=='C'){
        seguir=true;

    } else if(continuar=='F') {
        seguir=false;
    }
    
}   //SE CIERRAN LOS WHILE

//ESTADÍSTICA DE RECOGIDA DE FRUTAS

//FRUTA QUE MÁS KILOS HA RECOGIDO

if(uvas>fresas){
    System.out.println("La fruta con mayores kilos registrados son " + uvas + "kg de uvas");

} else if(fresas>uvas){
    System.out.println("La fruta con mayores kilos registrados son " + fresas + "kg de fresas");

} else if(peras>manzanas){
    System.out.println("La fruta con mayores kilos registrados son " + peras + "kg de peras");

} else if(manzanas>peras){
    System.out.println("La fruta con mayores kilos registrados son " + manzanas + "kg de manzanas");
}


//FRUTA QUE MENOS KILOS HA RECOFGIDO

if(manzanas<peras){
    System.out.println("La fruta con menores kilos registrados son " + manzanas + "kg de manzanas");

} else if(peras<manzanas){
    System.out.println("La fruta con menores kilos registrados son " + peras + "kg de peras");

} else if(fresas<uvas){
    System.out.println("La fruta con menores kilos registrados son " + fresas + "kg de fresas");

} else if(uvas<fresas){
    System.out.println("La fruta con menores kilos registrados son " + uvas + "kg de uvas");
}


//TOTAL DE KILOS RECOGIDOS
double totalkilos = uvas+fresas+peras+manzanas;
System.out.println("El total de kilos de frutas recogidas ha sido " + totalkilos + "kg");


//PORCENTAJE DE FRUTA QUE HA REGOGIDO MÁS DEL 70% DEL TOTAL

double calcporcentaje = (uvas*70)/totalkilos;
System.out.println(calcporcentaje);


sc.close();


    }
}