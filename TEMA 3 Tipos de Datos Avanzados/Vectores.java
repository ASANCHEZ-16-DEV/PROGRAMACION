import java.util.Scanner;


public class Vectores{
    public static void main(String[] args) {
  
//VARIABLES Y CONSTANTES INICIALES

Scanner sc = new Scanner (System.in);        
String categoria [] = {"CATEGORIA A", "CATEGORIA B", "CATEGORIA C", "CATEGORIA D", "CATEGORIA E", "FIN"};
String categoría [] = {"CATEGORÍA A", "CATEGORÍA B", "CATEGORÍA C", "CATEGORÍA D", "CATEGORÍA E"};
int cantidad []=new int  [categoria.length];
String calificacion="";
boolean repeat = true;

System.out.println("Introduzca la categoría energética de la vivienda");
calificacion =  sc.nextLine();
int numero = 0;

while(repeat){

if(calificacion.equalsIgnoreCase(categoria[numero] ) || calificacion.equalsIgnoreCase(categoría[numero])){
    System.out.println("Has introducido la " + categoria[numero]);

cantidad[numero]++;
System.out.println(cantidad[numero]);

} else {numero ++;} 


if(calificacion==categoria[5]){
    break;
} 




}   // SE CIERRA EL WHILE 












    }
}