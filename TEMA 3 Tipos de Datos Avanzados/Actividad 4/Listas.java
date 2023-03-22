import java.text.spi.NumberFormatProvider;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class Listas{   
    public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

System.out.println("SISTEMA DE PROVEEDOR DE CHOCOLATINAS");        
    
    String chocolatinas = "Mars-1,05#Twix-0,99#Bounty-1,20#Lion-1,25";  //Declaramos el String de chocolatinas
 
        StringTokenizer separador = new StringTokenizer(chocolatinas,"-#"); //Declaramos el separador
    
    String[] nomchocolatina ; //Declaramos la variable para guardar las chocolatinas separadas con el StirngTokenizer

    ArrayList<String[]> chocolatinaslist = new ArrayList<String[]>(); //Declaramos el arraylist
    

while(separador.hasMoreTokens()) { //Asignamos a las dos posiciones ambas separaciones (#-) para añadirlas al arraylist
    nomchocolatina = new String[2];//en un bucle  mientras que existan separaciones
    nomchocolatina[0] = separador.nextToken();
    nomchocolatina[1] = separador.nextToken();
    chocolatinaslist.add(nomchocolatina);
}


    for (String[] Chocolates : chocolatinaslist) {
            System.out.println("Chocolatina - "+Chocolates[0]+", Precio = "+Chocolates[1]); //Imprimimos las dos posiciones
    }
    
    boolean repeat = true;
    boolean repeat2=true;

while(repeat2){ 

System.out.println("¿De que tipo de chocolatina desea realizar el pedido?"); //Se pregunta que tipo de chocolatina queremos
String pedido = sc.nextLine();


        while(repeat){ 

    for (String[] Chocolates: chocolatinaslist) {
        if (Chocolates[0].equals(pedido)) {
            System.out.println("Precio "+ pedido +": "+Chocolates[1]);  //Hacemos un bucle que comprueba que el pedido introducido
                                                                        //existe en la lista y posteriome te lo imprimimos
            repeat=false;
            break;
        }
    }
}


    System.out.println("¿Desea realizar algún pedido más?, pulse 1 para Sí y 2 para No");
    String continuar = sc.nextLine();


if(continuar.equals("1")){
    repeat2=true;

} else if(continuar.equals("2")){
    repeat2=false;
    
} else {
    System.out.println("Introduce una elección válida");
 }




}


    } //Finaliza el método main
}
 