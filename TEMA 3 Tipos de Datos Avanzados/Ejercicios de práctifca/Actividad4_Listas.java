package Actividades;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Actividad4_Listas {

	public static void main(String[] args) {
		
		// Iniciamos una String con la secuencia de chocolatinas que queramos que siga, en este caso es (Nombre-Precio-Separador)
		String Chocolatinas = "Mars-1.05#Twix-0.99#Bounty-1.20#Lion-1.25";
		
		// Ahora creamos un StringTokenizer en donde le añadimos la string anterior y los delimitadores que vamos a usar
		StringTokenizer x = new StringTokenizer(Chocolatinas, "-#");
		
		// Creamos un vector que tenga 2 posiciones, una para el nombre de la chocolatina y otra para el precio
		String[] NombreChocolatinas;
		ArrayList<String[]> ListaChocolatinas = new ArrayList<String[]>();
		
		// Ahora creamos las listas de vectores que vamos a usar y le añadimos a la lsita de chocolatinas estos nuevos vectores
		while (x.hasMoreTokens()) {
			NombreChocolatinas = new String[2];
			NombreChocolatinas[0] = x.nextToken();
			NombreChocolatinas[1] = x.nextToken();
			ListaChocolatinas.add(NombreChocolatinas);
		}
		
		// Recorremos la lista y mostramos todas las chocolatinas ; sus precios
		for (String[] Chocolates : ListaChocolatinas) {
			System.out.println("Chocolatina: "+Chocolates[0]+" ,Precio: "+Chocolates[1]);
		}
		
		// Le preguntamos al usuario que Chocolatina de las que le mostramos desea
		Scanner key = new Scanner(System.in);
		while(true) {
			System.out.print("Elige tu chocolatina: ");
			String elección = key.nextLine();
			if (elección.equalsIgnoreCase("No")) {
				break;
			}
			// Ahora cromprobamos que esa chocolatina existe y si existe le mostramos el precio
			boolean correcto = false;
			for (String[] Chocolates: ListaChocolatinas) {
				if (Chocolates[0].equals(elección)) {
					System.out.println("Precio "+elección+": "+Chocolates[1]);
					
					correcto = true;
					break;
				}
			}
			
			if (!correcto) {
				System.out.println("La chocolatina seleccionada no existe");
			}
		}
	}
}