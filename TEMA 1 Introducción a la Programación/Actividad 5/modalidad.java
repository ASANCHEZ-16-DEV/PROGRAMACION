
import java.io.IOException;
import java.util.Scanner;

public class modalidad {

	public static void main(String[] args) throws IOException {
		
		Scanner key = new Scanner(System.in);
		int a;
		char var;
		
		do {
			System.out.print("Introduce la edad del alumno: ");
			a = key.nextInt();
		} while (a <= 0);
		do {
			System.out.print("Introduce la modalidad A (Acceso directo), G (Grado medio y P (Prueba de acceso)");
			var = (char) System.in.read();
		} while (var!= 'A' && var!= 'G' && var!= 'P');
		
		if (a < 18 && var == 'A') {
			System.out.println("Pase por secretaría.");
		} else if (a >= 18 && var== 'G'|| a >= 18 && var== 'P') {
			System.out.println("Solicite su código en jefatura.");
		} else {
			System.out.println("Las clases son en la R03, gracias.");
		}
		key.close();
	}
}