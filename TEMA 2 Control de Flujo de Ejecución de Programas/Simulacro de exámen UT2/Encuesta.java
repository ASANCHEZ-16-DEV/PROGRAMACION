import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

public class Encuesta{
    public static void main(String[] args) throws IOException {
        
//VARIABLES Y CONSTANTES

Scanner sc = new Scanner(System.in);
int NSatisfecho1=0;
int Satisfecho1=0;
int Normal1=0; //VARIABLES DE SATISFACCIÓN PARA PEDIATRÍA
int MSatisfecho1=0;

int NSatisfecho2=0;
int Satisfecho2=0;
int Normal2=0; //VARIABLES DE SATISFACCIÓN PARA RADIOLOGíA
int MSatisfecho2=0;

int NSatisfecho3=0;
int Satisfecho3=0;
int Normal3=0; //VARIABLES DE SATISFACCIÓN PARA TRAUMATOLOGÍA
int MSatisfecho3=0;

int mvalorado1=0;
int mvalorado2=0; //VARIABLES PARA CALCULAR EL MEJOR VALORADO
int mvalorado3=0;

int pvalorado1=0;
int pvalorado2=0; //VARIABLES PARA CALCULAR EL MEJOR VALORADO
int pvalorado3=0;


char servicio = ' ';
int valoración= 0 ;
boolean seguir=true;

//ELECCIÓN DE SERVICIO REALIZADO
while(seguir){ 

for(int i=0; i<10; i++){ 

    System.out.println("SERVICIO DE VALORACIÓN DE CONSULTAS: ¿QUE SERVICIO HA UTLIZADO? P- Pediatría R- Radiología T- Traumatología");
      servicio = (char) System.in.read();

//VALORACIÓN DE SERVICIO REALIZADO
switch (servicio){
  
    //SERVICIO DE PEDIATRÍA
    case 'P': System.out.println("Has introducido Pediatría, por favor introduzca su valoración 0- Nada Satisfecho 1- Normal 2- Satisfecho 3- Muy Satisfecho");
    
    try {     
    valoración=sc.nextInt();

    } catch (InputMismatchException e){
          System.out.println("Has introducido carácteres por favor introduce los números correspondientes para cada valoración");
          seguir=true;
          break;
    }  
                switch(valoración){
                    case 0: 
                    System.out.println("Ha introducido Nada Satisfecho");
                        NSatisfecho1++;
                        seguir=false;
                            break;
                            
                    case 1: 
                    System.out.println("Ha introducido Normal");
                          Normal1++;
                          seguir=false;
                            break;

                    case 2: 
                    System.out.println("Ha introducido Satisfecho");
                          Satisfecho1++;
                          seguir=false;
                            break;

                    case 3: 
                    System.out.println("Ha introducido muy Satisfecho");
                         MSatisfecho1++;
                         seguir=false;
                           break;
                 } // SE CIERRA EL PRIMER SWITCH INTERNO
               break;

    //SERVICIO DE RADIOLOGíA
    case 'R': System.out.println("Has introducido Radiología, por favor introduzca su valoración 0- Nada Satisfecho 1- Normal 2- Satisfecho 3- Muy Satisfecho");
    
    try {     
        valoración=sc.nextInt();
      } catch (InputMismatchException e){
            System.out.println("Has introducido carácteres por favor introduce los números correspondientes para cada valoración");
            seguir=true;
            break;
      }  
                    
                switch(valoración){
                    case 0: 
                    System.out.println("Ha introducido Nada Satisfecho");
                        NSatisfecho2++;
                        seguir=false;
                            break;
                            
                    case 1: 
                    System.out.println("Ha introducido Normal");
                          Normal2++;
                          seguir=false;
                            break;

                    case 2: 
                    System.out.println("Ha introducido Satisfecho");
                          Satisfecho2++;
                          seguir=false;
                            break;

                    case 3: 
                    System.out.println("Ha introducido muy Satisfecho");
                         MSatisfecho2++;
                         seguir=false;
                           break;
                    }  // SE CIERRA EL SEGUNDO SWITCH INTERNO

                break;

    //SERVICIO DE TRAUMATOLOGíA
    case 'T': System.out.println("Has introducido Traumatología, por favor introduzca su valoración 0- Nada Satisfecho 1- Normal 2- Satisfecho 3- Muy Satisfecho");
    
    try {     
      valoración=sc.nextInt();
    } catch (InputMismatchException e){
          System.out.println("Has introducido carácteres por favor introduce los números correspondientes para cada valoración");
          seguir=true;
          break;
    }  
                   
                switch(valoración){
                    case 0: 
                    System.out.println("Ha introducido Nada Satisfecho");
                        NSatisfecho3++;
                        seguir=false;
                            break;
                            
                    case 1: 
                    System.out.println("Ha introducido Normal");
                          Normal3++;
                          seguir=false;
                            break;

                    case 2: 
                    System.out.println("Ha introducido Satisfecho");
                          Satisfecho3++;
                          seguir=false;
                            break;

                    case 3: 
                    System.out.println("Ha introducido muy Satisfecho");
                         MSatisfecho3++;
                         seguir=false;
                           break;
                    }  // SE CIERRA EL TERCER SWITCH INTERNO
              break;

}  //SE CIERRA EL SWITCH GENERAL

    } //SE CIERRA EL WHILE GENERAL

} //SE CIERRA EL FOR


// PUNTUACIÓN TOTAL OBTENIDA PARA CADA SERVICIO
System.out.println("La puntuación total obtenida en Pediatría es:");
System.out.println(NSatisfecho1 + " clientes nada satisfechos");
System.out.println(Normal1 + " clientes con satisfacción normal");
System.out.println(Satisfecho1 + " clientes satisfechos");
System.out.println(MSatisfecho1 + " clientes muy satisfechos");


System.out.println("La puntuación total obtenida en Radiología es ");
System.out.println(NSatisfecho2 + " clientes nada satisfechos");
System.out.println(Normal2 + " clientes con satisfacción normal");
System.out.println(Satisfecho2 + " clientes satisfechos");
System.out.println(MSatisfecho2 + " clientes muy satisfechos");

System.out.println("La puntuación total obtenida en Traumatología ");
System.out.println(NSatisfecho3 + " clientes nada satisfechos");
System.out.println(Normal3 + " clientes con satisfacción normal");
System.out.println(Satisfecho3 + " clientes satisfechos");
System.out.println(MSatisfecho3 + " clientes muy satisfechos");

//MEJOR VALORADO
mvalorado1= Satisfecho1+MSatisfecho1;
mvalorado2= Satisfecho2+MSatisfecho2;
mvalorado3= Satisfecho3+MSatisfecho3;

if(mvalorado1>mvalorado2){
  System.out.println("El servicio mejor valorado ha sido Pediatría, con una puntuación total de reseñas positivas de: " + mvalorado1);

} else if(mvalorado2>mvalorado3){
  System.out.println("El servicio mejor valorado ha sido Radiología, con una puntuación total de reseñas positivas de: " + mvalorado2);

} else if(mvalorado3>mvalorado2){
  System.out.println("El servicio mejor valorado ha sido Traumatología, con una puntuación total de reseñas positivas de: " + mvalorado3);
}

//PEOR VALORADO
pvalorado1 = NSatisfecho1;
pvalorado2 = NSatisfecho2;
pvalorado3 = NSatisfecho3;

if(pvalorado1<pvalorado2){
  System.out.println("El servicio peor valorado ha sido Pediatría, con una puntuación total de reseñas negativas de: " + pvalorado1);

} else if(pvalorado2<pvalorado1){
  System.out.println("El servicio peor valorado ha sido Radiología, con una puntuación total de reseñas negativas de: " + pvalorado2);

} else if(pvalorado2<pvalorado3){
  System.out.println("El servicio peor valorado ha sido Radiología, con una puntuación total de reseñas negativas de: " + pvalorado2);

} else if(pvalorado3<pvalorado2){
  System.out.println("El servicio peor valorado ha sido Traumatología, con una puntuación total de reseñas negativas de: " + pvalorado3);
}






sc.close();

    }

}