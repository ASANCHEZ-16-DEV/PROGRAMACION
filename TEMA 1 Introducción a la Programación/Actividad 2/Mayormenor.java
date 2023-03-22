import java.util.Scanner;
public class Mayormenor{
public static void main(String[] args) {

Scanner sc  = new Scanner(System.in);

 int num1, num2; 
     System.out.println("Introduce el primer número");
        num1=sc.nextInt();
     System.out.println("Introduce el segundo número");
        num2=sc.nextInt();

    if (num1 > num2) {
        System.out.println("El primer número es el mayor");

    } else {
        if (num2 > num1) {
            System.out.println("El segundo número es el mayor");
        }

    }  {
        if (num1==num2) {
            System.out.println("Los números son iguales");
        }
}  

sc.close();
    }
}