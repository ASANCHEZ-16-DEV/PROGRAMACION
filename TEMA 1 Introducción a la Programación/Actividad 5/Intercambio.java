
import java.util.Scanner;

public class Intercambio {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		int a, b;
		int aux = 0;
		
		System.out.print("Escriba un número a: ");
		a = key.nextInt();
		System.out.print("Escriba un número b: ");
		b = key.nextInt();
		
		aux = a;
		a = b;
		b = aux ;
		System.out.println("El valor de a es: "+a+ " y el valor de b es: "+b);
		key.close();
	}
}
