import java.util.Scanner;
import java.util.Arrays;

public class Ahorcado2{
    public static void main(String[] args) {
       
//Variables iniciales
boolean repeat1=true;
String start="";
Scanner sc = new Scanner(System.in);


while(repeat1){  // Inicio del juego

System.out.println("PRESIONE 'S' PARA INICIAR LA PARTIDA DE AHORCADO");
start = sc.nextLine();

    if(start.equalsIgnoreCase("S")){
        repeat1=false;

        } else {
            System.out.println("Introduzca la tecla correcta");
        }

} //Cierre del while repeat


//Diccionario de palabras del juego

String[] diccionario = {"juan", "calamardo", "mesa", "lapiz", "cepillo", "botella", 
                        "libreta", "arena", "ordenador", "hoja", "guitarra", "estuche", "mando", "auriculares", "monitor"};


//Selecciona una palabra aleatoriamente

int numero = (int)(Math.random()*14+1);
String palabra = diccionario[numero]; 


//Crea un array con guiones bajos para cifrar la palabra a adivinar

char[] palabraAdivinanza = new char[palabra.length()];
        Arrays.fill(palabraAdivinanza, '_'); //Se detecta la palabra generada aleatoriamente y se cifra
       

        //Ciclo principal del juego
        while (true) {
            System.out.println("Adivina la palabra, la longitud es : " + palabra.length());
                System.out.println(palabraAdivinanza);
                    System.out.print("Ingresa una letra: ");
            char letra = sc.next().charAt(0);
      
                      
    // Verifica si la letra está en la palabra
    
    boolean correcto = false;
    int countletter=0;

    for (int i = 0; i < palabra.length(); i++) {
        if (palabra.charAt(i) == letra) {
            palabraAdivinanza[i] = letra;
            correcto = true;

        }
    }

    //Si la letra no está en la palabra
    if(!correcto){
        System.out.println("La letra no está en la palabra");
    }


    //Si la letra está en la palabra
    
    if(correcto=true){
        countletter++;
        System.out.println(countletter);

    } else if(countletter==palabra.length()){
        System.out.println("Has adivinado la palabra");
    }


/* 
for (int i = 0; i < palabra.length(); i++) {
    if (palabraAdivinada.indexOf('_') == -1) {
        System.out.println("Has adivinado la palabra!!");
    
    } 
}
*/



}    //Se cierra el while true
            


   

  }
   }