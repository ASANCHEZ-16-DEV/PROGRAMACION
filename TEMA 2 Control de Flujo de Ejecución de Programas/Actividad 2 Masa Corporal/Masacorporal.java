import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Masacorporal{
    public static void main(String[] args) throws IOException {

//VARIABLES Y CONSTANTES

Scanner sc = new Scanner(System.in);
double peso = 0;
double altura = 0;
double IMC = 0;
boolean finalizar = true;
boolean comprobacion = true;


//SE INTRODUCE EL PESO Y LA ALTURA CON EL CONTROL DE ERRORES

 while (finalizar) {
    while (comprobacion) {
        try {
            System.out.println("Introduce tu peso: ");
            peso = sc.nextDouble();
            comprobacion = false;

             } catch (InputMismatchException error) {
            System.err.println("Debe introducir un número entero");
            sc.nextLine();
            }

            } if (peso < 0) {
                finalizar = false;
                System.err.println("El programa ha finalizado");
                break;
            }

            while (!comprobacion) {
                try {
                    System.out.println("Introduce tu altura: ");
                    altura = sc.nextDouble();
                    comprobacion = true;
                } catch (InputMismatchException error) {
                    System.err.println("Debe introducir su altura en metros ");
                    sc.nextLine();
                }
            } if (altura < 0) {
                finalizar = false;
                System.err.println("El programa ha finalizado");
                break;
            }

//CALCULO Y DIAGNOSTICO DEL IMC 

            IMC = (peso/(altura*altura));

            if ((IMC>0 && IMC<=18.49)) {
                System.out.println("Su IMC corresponde a un peso bajo");

            } else if ((IMC>=18.5 && IMC<=24.9 )) {
                System.out.println("Su IMC corresponde a un peso normal");

            } else if ((IMC>=25 && IMC<=29.9)) {
                System.out.println("Su IMC corresponde a un sobrepeso");

            } else if ((IMC>=30 && IMC<=34.9)) {
                System.out.println("Su IMC corresponde a una obesidad leve");

            } else if ((IMC>=35 && IMC<=39.9)) {
                System.out.println("Su IMC corresponde a una obesidad media");

            } else if (IMC==40 && IMC>40){
                System.out.println("Su IMC corresponde a una obesidad mórbida");



                sc.close();
            }
        }
    }
}
