
import java.util.Scanner;

    public class salario{
        public static void main(String[] args) {
          
Scanner sc = new Scanner(System.in);


final double salario = 1166.67;
final double subida = 5.9;

double incremento = (salario*subida)/100;
double total = incremento + salario;



System.out.println("Tu salario asciende a "+ total);


sc.close();


        }
}