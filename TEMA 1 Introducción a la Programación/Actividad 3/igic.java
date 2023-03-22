import java.util.Scanner;

    public class igic{
         public static void main(String[] args) {

Scanner sc = new Scanner (System.in);
    final int igic = 7;          

System.out.println("Introduce el importe del producto");
    double importe = sc.nextDouble();

double incremento = (importe*igic)/100;
double resultado = incremento + importe;

System.out.println("El precio final con IGIC es:" + resultado);


sc.close();

        }


}