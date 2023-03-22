import java.util.Scanner;

public class PracticaString{
    public static void main(String[] args) {
        
String frase1 = " Invertir: ola k ase ";
String frase2 = " Nombre: Pepa Pig ";
String frase3 = " Escribir: esta frase la tendremos que escribir en esta hoja ";
String frase1invertida = "";

System.out.println("Frase 1 sin invertir: " + frase1.trim()); //FRASE 1 SIN INVERTIR


for (int i = frase1.length() -1; i>= 0; i--){
    frase1invertida += frase1.charAt(i); //FRASE 1 INVERTIDA

}

System.out.println("Frase 1 Invertida: " + frase1invertida.trim());


if(frase1invertida.contains(":")){

    String comando = frase1.substring(0, frase1.indexOf(":")); //FRASE 1 HASTA EL DOBLE PUNTO
        System.out.println("Frase hasta el doble punto: " + comando.trim());
    

    if(comando.contains("Invertir")){
        frase1invertida = frase1invertida.substring(0, 10);
            System.out.println("Si el comando es Invertir muestra la String al revés: " + frase1invertida.toUpperCase().trim());

    }
        String comando2 ="Nombre";

    if(comando2.contains("Nombre")){
        String valor2=frase2.substring(frase2.indexOf(":")+1);
            String resultado = "Hola" + valor2;
                System.out.println(resultado);
    }

      String comando3="Escribir";
      
  
      if(frase3.contains("Escribir")){
       String newfrase3 = frase3.replace("esta","una" );
        System.out.println(newfrase3);
      }
    


    String valor = frase1.substring(frase1.indexOf(":")+1) ;  //FRASE 1 A PATRIR DEL DOBLE PUNTO
        System.out.println("Frase a partir del doble punto: " + valor.trim());


    

}




















    }
}