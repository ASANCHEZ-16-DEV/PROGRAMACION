import java.util.Scanner;
    
    public class calculadora {
        private static final double cambio1 = 0;
        private static final double cambio2 = 0;

        public static void main(String[] args) {

//VARIABLES Y CONSTANTES

int opcion;
double valorpeseta = 166.386;


//MENU DE SELECCIÓN

Scanner sc = new Scanner(System.in);
    System.out.println("1 - Pasar Euros a Pesetas");
    System.out.println("2- Pasar Pesetas a Euros");

System.out.println("Elige tu opción");
     opcion = sc.nextInt();


//MENU DE CAMBIO
if (opcion==1) {
    System.out.println("Introduce la cantidad a cambiar");
    double cambio1  = sc.nextDouble();

} else {
    if(opcion==2) {
    System.out.println("Introduce la cantidad a cambiar");
    double cambio2 = sc.nextDouble();
    }
}

double c1 = cambio1/valorpeseta;
double c2 = cambio2*valorpeseta;

if (opcion==1) {
    System.out.println(c1);

} else {

if (opcion==2) {
    System.out.println(c2);
    }
}


sc.close();

    }
}
