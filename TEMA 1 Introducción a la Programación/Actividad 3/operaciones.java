import java.util.Scanner;

public class operaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

int n1, n2;

    System.out.println("Introduce el primer número");
        n1 = sc.nextInt();
    System.out.println("Introduce el segundo número");
         n2 = sc.nextInt();

    System.out.println("Que operación desea realizar");
    System.out.println("1 Para sumar");
    System.out.println("2 Para restar");
    System.out.println("3 para multiplicar");
    System.out.println("4 para dividir");

int suma = n1 + n2;
int resta = n1 - n2;
int multiplicacion = n1 * n2;
int division = n1 / n2;

int operacion = sc.nextInt();

if (operacion==1) {
    System.out.println(suma);

} else { 
    if (operacion==2){
        System.out.println(resta);
    }
} {
    if (operacion==3) { 
        System.out.println(multiplicacion);
    }
} {
    if (operacion==4){ 
    System.out.println(division);
    }
}

sc.close();

    }
}
