import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Bonoloto2 {
    

    public static void Solicitaapuesta1 (ArrayList<String> lista) {    

        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        String inputapuesta1STR = " ";
        int inputapuesta1INT=0;


        System.out.println("Primera apuesta: Introduzca números del 1 al 49");    
        
        while (repeat){     //Solicitud de la primera apuesta
            
            for (int i = 0; i < 6; i++) {
                inputapuesta1INT = sc.nextInt(); 
                                                                    //Introducción de los números y control de errores
                if(inputapuesta1INT>49 || inputapuesta1INT<1){
                    System.out.println("Error: El número introducido es menor a 1 o mayor al 49, repita la introducción");
                    i--;
                    continue;   //Si el valor es mayor a 49 o menor a 1 se repite el bucle 
                }
                inputapuesta1STR = String.valueOf(inputapuesta1INT);
                lista.add(inputapuesta1STR);  //Conversión a String para poder añadir al arraylist
            }

            if(lista.size()==6){
                System.out.println("Los números de tu primera apuesta son: ");

            for(int i=0; i<lista.size();i++){           //Imprimimos por pantalla los números que el usuario ha apostado
                System.out.print("["+lista.get(i)+"]");
            }
                repeat=false;   //Finalizamos el programa sí la lista contiene seis números
            } 

        }
      
    }   //Finalización del método Solicitarapuesta1()


    
    public static void Solicitaapuesta2 () { 
    
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        ArrayList<String> lista2 = new ArrayList<String>();

        System.out.println("Segunda apuesta, número complementario: Introduzca un número del 1 al 49");    
        while (repeat){     //Solicitud de la primera apuesta

            int inputapuesta2INT=0;

            for (int i = 0; i < 1; i++) {
                inputapuesta2INT = sc.nextInt(); 

                if(inputapuesta2INT>49 || inputapuesta2INT<1){
                    System.out.println("Error: El número introducido es menor a 1 o mayor al 49, repita la introducción");
                    i--;
                    continue;   //Si el valor es mayor a 49 o menor a 1 se repite el bucle 
                }
                String inputapuesta2STR = Integer.toString(inputapuesta2INT);
                lista2.add(inputapuesta2STR);
            }

            if(lista2.size()==1){
                System.out.println("Tu número complementario apostado es: ");

                for(int i=0; i<lista2.size();i++){           //Imprimimos por pantalla los números que el usuario ha apostado
                    System.out.print("["+lista2.get(i)+"]");
                }
                repeat=false;
            }            
        }
      
    }   //Finalización del método Solicitarapuesta2()


    public static void Solicitaapuesta3() { 
    
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;

        System.out.println("Tercera apuesta, reintegro: Introduzca un número del 1 al 9");    
        while (repeat){     //Solicitud de la primera apuesta

            ArrayList<String> lista = new ArrayList<String>();

            int inputapuesta3INT=0;

            for (int i = 0; i < 1; i++) {
                inputapuesta3INT = sc.nextInt(); 

                if(inputapuesta3INT>9 || inputapuesta3INT<0){
                    System.out.println("Error: El número introducido es menor a 0 o mayor al 9, repita la introducción");
                    i--;
                    continue;   //Si el valor es mayor a 9 o menor a 1 se repite el bucle 
                }

                String inputapuesta3STR = Integer.toString(inputapuesta3INT);
                lista.add(0,inputapuesta3STR);
            }

            if(lista.size()==1){
                System.out.println("El reintegro apostado es: ");

            for(int i=0; i<lista.size();i++){           //Imprimimos por pantalla los números que el usuario ha apostado
                System.out.print("["+lista.get(i)+"]");
            }
                repeat=false;
            }
                   
        }
       
    }   //Finalización del método Solicitarapuesta3()



 //Método para generar los números ganadores de la primera apuesta
    public static void Generarapuesta1 (ArrayList<String> listagenerated) { 

        Random randomap1 = new Random();
        
        int generatedap1INT = 0;
        String generatedap1STR =" ";

        for(int i=0; i<6; i++){ 
            generatedap1INT = randomap1.nextInt(49) + 1;
            generatedap1STR = String.valueOf(generatedap1INT);
            listagenerated.add (generatedap1STR);    
        }
    }

    //Método para comprobar si ha ganado la primera apuesta
    public static void comprobarapuesta1 (ArrayList<String> lista, ArrayList<String> listagenerated) { 
        int aciertos = 0;

        for (String s : listagenerated){

            if (lista.contains(s)){
                aciertos ++;        //Contador de aciertos
            }
        }

        System.out.println("El número de aciertos es " + aciertos);

    }





//Código incompleto


    
}  //Finalización de la clase Bonoloto 2
