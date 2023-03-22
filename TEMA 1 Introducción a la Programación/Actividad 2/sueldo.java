import java.util.Scanner;
public class sueldo{

    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);   
    //Declaramos las dos variables a utilizar de tipo Integer (Int)  
        int paga = 15;
        int sueldo;
    
    System.out.println("Introduce el número de horas trabajadas");
        int horas = sc.nextInt();   

        sueldo = (horas*paga);
        System.out.println("Tu sueldo diario es:" + sueldo);

sc.close();
    }
}