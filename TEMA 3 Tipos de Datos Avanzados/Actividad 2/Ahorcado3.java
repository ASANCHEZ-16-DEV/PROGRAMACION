import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado3 {
    public static void main(String[] args) {
        String palabraSecreta = "java";
        char[] palabraAdivinanza = new char[palabraSecreta.length()];
        Arrays.fill(palabraAdivinanza, '*');
        int vidas = 6;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Adivina la palabra: ");
            System.out.println(palabraAdivinanza);
            System.out.print("Ingresa una letra: ");
            char letra = scanner.next().charAt(0);

            boolean letraEncontrada = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    palabraAdivinanza[i] = letra;
                    letraEncontrada = true;
                }
            }

             }
          }
        }
