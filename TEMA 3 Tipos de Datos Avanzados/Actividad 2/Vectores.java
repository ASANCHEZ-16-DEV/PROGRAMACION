import java.lang.reflect.Array;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Vectores{
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);   

String[] certificaciones= new String[10];
certificaciones[0]="A";
certificaciones[1]="B";
certificaciones[2]="C";
certificaciones[3]="D";
certificaciones[4]="E";

int countA=0; 
int countB=0;
int countC=0;
int countD=0;
int countE=0;

String eleccion=""; 

boolean generalrepeat=true;

while(generalrepeat){  
    System.out.println("SISTEMA DE REGISTRO DE CALIFICACIONES ENERGÉTICAS");

        System.out.println("Introduce la calificación de la vivienda, o 'Fin' para finalizar el programa");
        eleccion = sc.nextLine();

    if(eleccion.equalsIgnoreCase("fin")){ 
        System.out.println("El registro ha finalizado");
        break;
     }

switch (eleccion){

    case "A": System.out.println("La vivienda ha sido calificada con la categoría " + certificaciones[0]);
                countA ++;
                break;
                
    case "B": System.out.println("La vivienda ha sido calificada con la categoría " + certificaciones[1]);
                countB ++;
                break;

    case "C": System.out.println("La vivienda ha sido calificada con la categoría " + certificaciones[2]);
                countC ++;
                break;

    case "D": System.out.println("La vivienda ha sido calificada con la categoría " + certificaciones[3]);
                countD ++;
                break;

    case "E": System.out.println("La vivienda ha sido calificada con la categoría " + certificaciones[4]);
                countE ++;
                break;            
       

    } // CIERRE DEL SWITCH DE ELECCIÓN   
} // CIERRE DEL WHILE GENERAL

//CALCULOS 

//CANTIDAD DE VIVIENDAS SEGÚN SU CALIFICACIÓN
System.out.println("La cantidad de viviendas con Categoría A es " + countA);
System.out.println("La cantidad de viviendas con Categoría B es " + countB);
System.out.println("La cantidad de viviendas con Categoría C es " + countC);
System.out.println("La cantidad de viviendas con Categoría D es " + countD);
System.out.println("La cantidad de viviendas con Categoría E es " + countE);

//QUE CALIFICACIONES TIENEN MÁS VIVIENDAS

if(countA>countB){
    System.out.println("La certificación con mayores viviendas registradas es la A");
} else if(countB>countA){
    System.out.println("La certificación con mayores viviendas registradas es la B");
}else if(countB>countC){
    System.out.println("La certificación con mayores viviendas registradas es la B");
} else if(countC>countB){
    System.out.println("La certificación con mayores viviendas registradas es la C");
} else if(countC>countD){
    System.out.println("La certificación con mayores viviendas registradas es la C");
} else if(countD>countE){
    System.out.println("La certificación con mayores viviendas registradas es la D");
} else if(countE>countD){
    System.out.println("La certificación con mayores viviendas registradas es la E");
}

//QUE CALIFICACIONES TIENEN MENOS VIVIENDAS
if(countA<countB){
    System.out.println("La certificación con menores viviendas registradas es la A");
} else if(countB<countA){
    System.out.println("La certificación con menores viviendas registradas es la B");
}else if(countB<countC){
    System.out.println("La certificación con menores viviendas registradas es la B");
} else if(countC<countB){
    System.out.println("La certificación con menores viviendas registradas es la C");
} else if(countC<countD){
    System.out.println("La certificación con menores viviendas registradas es la C");
} else if(countD<countE){
    System.out.println("La certificación con menores viviendas registradas es la D");
} else if(countE<countD){
    System.out.println("La certificación con menores viviendas registradas es la E");
}

//TOTAL DE VISITAS
int totalvisitas = countA+countB+countC+countD+countE;
System.out.println("El total de visitas registradas es " + totalvisitas);

    } 
}


 