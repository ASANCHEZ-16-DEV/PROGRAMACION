import java.util.ArrayList;

public class Bonoloto {
    public static void main(String[] args) {    


        //DECLARACIÓN DE VARIABLES DE LA PRIMERA APUESTA
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> listagenerated = new ArrayList<>();  


        //GENERAR
        Bonoloto2.Generarapuesta1(listagenerated);

        //SOLICITUD DE LA PRIMERA APUESTA POR TECLADO
        Bonoloto2.Solicitaapuesta1(lista);   
            System.out.println();

                //GENERAR Y COMPROBAR SI LOS NÚMEROS HAN SIDO ACIERTADOS
                System.out.println();
                Bonoloto2.comprobarapuesta1(lista, listagenerated);
                System.out.println("Los números ganadores son " + listagenerated);
                System.out.println();



        //SOLICITUD DE LA SEGUNDA APUESTA POR TECLADO 
        Bonoloto2.Solicitaapuesta2();

            System.out.println();

         
        //Solicitar apuesta 3    
            Bonoloto2.Solicitaapuesta3();

                System.out.println();
                    System.out.println();

//Código incompleto


        
    }  //Finalización del método principal
}




