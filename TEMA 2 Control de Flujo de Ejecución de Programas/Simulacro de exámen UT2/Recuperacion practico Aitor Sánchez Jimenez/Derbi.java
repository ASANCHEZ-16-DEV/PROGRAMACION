import java.util.Scanner;
import java.io.IOException;

import java.util.InputMismatchException;

public class Derbi{

    public static void main(String[] args)throws IOException {
        
//VARIABLES Y CONSTANTES
Scanner sc = new Scanner(System.in);
char preabonados= ' ';
int posicionabonado=0;
int posicionnoabonado=0;
int mayormenor=0; 
boolean seguir=true;
boolean controlerrores=true;

    //ABONADOS
 int countabonadosmayoresnaciente=0;
 int countabonadosmenoresnaciente=0;

 int countabonadosmayorescurva=0; //NO CUENTAN CON DINERO
 int countabonadosmenorescurva=0; //NO CUENTAN CON DINERO

    //NO ABONADOS
 int countnoabonadosmayoresnaciente=0;
 int countnoabonadosmenoresnaciente=0;


 int countnoabonadosmayorescurva=0; 
 int countnoabonadosmenorescurva=0; 

while(seguir){ 

try{ 
System.out.println("SISTEMA DE VENTA DE ENTRADAS: ¿ESTÁ USTED ABONADO? - PULSE S PARA SÍ y N PARA NO O & PARA FINALIZAR EL PROGRAMA");
preabonados = (char) System.in.read();

if(preabonados== 'S' || preabonados=='N' || preabonados=='&'){
    seguir=false;
}

} catch(InputMismatchException e){
    System.out.println("Ha introducido letras, por favor, introduzca los números correspondientes");    
}


switch (preabonados){

    //CASO ABONADOS
    case 'S': System.out.println("Ha seleccionado abonado, introduzca la posición deseada , 1- Naciente 2- Curva ");
            
        posicionabonado=sc.nextInt();

            if(posicionabonado==1){

                System.out.println("Ha seleccionado la posición Naciente ¿Es usted mayor o menor de edad? 1- Mayor de edad, 2- Menor de edad");
            try{ 
                mayormenor = sc.nextInt();
            } catch(InputMismatchException e){
                System.out.println("Error de tipo de datos, intentalo de nuevo");
                seguir=true;
                break;
            }
                   if(mayormenor==1){
                    System.out.println("Usted es mayor de edad, el precio serán 12€"); //POSICIÓN NACIENTE DE LOS ABONADOS MAYORES DE EDAD
                    countabonadosmayoresnaciente ++;
                    seguir=false;
                    break;
                                                                     
                   } else if(mayormenor==2){
                    System.out.println("Usted es menor de edad, el precio es gratuito");  //POSICIÓN NACIENTE DE LOS ABONADOS MENORES DE EDAD
                    countabonadosmenoresnaciente ++;
                    seguir=false;
                    break;
                   }

            } else if(posicionabonado==2){ 
                System.out.println("Ha seleccionado la posición Curva ¿Es usted mayor o menor de edad? 1- Mayor de edad, 2- Menor de edad");
                
            try{ 
                mayormenor = sc.nextInt();
            } catch(InputMismatchException e){
                    System.out.println("Error de tipo de datos, intentalo de nuevo");
                    seguir=true;
                    break;
                }
                if(mayormenor==1){
                  System.out.println("Usted es mayor de edad, el precio serán 15€"); //POSICIÓN CURVA DE LOS ABONADOS MAYORES DE EDAD
                  countabonadosmayorescurva ++;
                    seguir=false;
                    break;     
                                                                                      
            } else if(mayormenor==2){
                System.out.println("Usted es menor de edad, el precio es gratuito"); //POSICIÓN CURVA DE LOS ABONADOS MENORES DE EDAD
                countabonadosmenorescurva ++;
                   seguir=false;
                    break;

                    }
                } //SE CIERRA EL IF DE ABONADOS
    
    //CASO NO ABONADOS

    case 'N': System.out.println("Ha seleccionado abonado, introduzca la posición deseada , 1- Naciente 2- Curva ");
    posicionabonado=sc.nextInt();
    if(posicionabonado==1){ 

        System.out.println("Ha seleccionado la posición Naciente ¿Es usted mayor o menor de edad? 1- Mayor de edad, 2- Menor de edad");
      
        try{ 
            mayormenor = sc.nextInt();

        } catch(InputMismatchException e){
            System.out.println("Error de tipo de datos, intentalo de nuevo");
            seguir=true;
            break;
        }
           if(mayormenor==1){
            System.out.println("Usted es mayor de edad, el precio serán 20€");   //POSICIÓN NACIENTE DE LOS NO ABONADOS MAYORES DE EDAD
            countnoabonadosmayoresnaciente ++;
            seguir=false;
            break;
                                                                                      
           } else if(mayormenor==2){
            System.out.println("Usted es menor de edad, el precio es de 5€"); //POSICIÓN NACIENTE DE LOS NO ABONADOS MENORES DE EDAD
            countnoabonadosmenoresnaciente ++;
            seguir=false;
            break;
           }

    } else if(posicionabonado==2){ 
        System.out.println("Ha seleccionado la posición Curva ¿Es usted mayor o menor de edad? 1- Mayor de edad, 2- Menor de edad");
         
        try{ 
                mayormenor = sc.nextInt();
            } catch(InputMismatchException e){
                System.out.println("Error de tipo de datos, intentalo de nuevo");
                seguir=true;
                break;
            }

           if(mayormenor==1){
            System.out.println("Usted es mayor de edad, el precio serán 28€");
            countnoabonadosmayorescurva ++;
            seguir=false;
            break;                                                                             //POSICIÓN CURVA DE LOS NO ABONADOS MENORES DE EDAD
           
        } else if(mayormenor==2){
            System.out.println("Usted es menor de edad, el precio es de 10€");
            countnoabonadosmenorescurva ++;
            seguir=false;
            break;
            }    
    } //SE CIERRA EL ELSE

    case '&': System.out.println("Ha seleccionado finalización del programa");
            seguir=false;
            sc.nextLine();

} // SE CIERRA EL SWITCH

} // SE CIERRA EL WHILE DE SEGUIR

int newcountabmayoresnaciente = (countabonadosmayoresnaciente*12);
System.out.println(newcountabmayoresnaciente);

int newcountnoabmenoressnaciente = (countnoabonadosmenoresnaciente*20);
System.out.println(newcountnoabmenoressnaciente);


    }
}