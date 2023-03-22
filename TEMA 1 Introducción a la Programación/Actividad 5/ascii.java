
import java.util.Scanner;

public class ascii {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		int a;
		
		do {
			System.out.print("Introduzca un código ASCII : ");
			a = key.nextInt();
		} while (a > 225 || a < 0);
		char ascii = (char) a;
		
		System.out.println("El valor ASCII es: "+ascii);
		key.close();
	}
}