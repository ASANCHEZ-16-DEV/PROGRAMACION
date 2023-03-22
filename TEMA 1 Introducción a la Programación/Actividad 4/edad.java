import java.util.Scanner;

public class edad {
    public static void main(String[] args) {
        
Scanner teclado= new Scanner (System.in);
System.out.print("Indique la edad:");
int edad = teclado.nextInt();

if (edad <=18) {
    System.out.println("Es mayor de edad");

} else {
System.out.println("Es menor de edad");
}

teclado.close();
    }
}
