import java.util.Scanner;
public class Divisible{
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int n;
   
    System.out.println("Introduce un número");
        n = sc.nextInt();

  if (n % 7==0) {
    System.out.println("El número es divisible por 7");
  } else {
    System.out.println("El número no es divisible por 7");
  } 
  sc.close();
    }
}