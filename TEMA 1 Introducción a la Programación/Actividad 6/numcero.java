import java.util.Scanner;

public class numcero{
    public static void main(String[] args) {
  
//VARIABLES Y CONSTANTES   

Scanner sc = new Scanner(System.in);        
int n1=1;

do{

System.out.println("Introduce un número");
n1 = sc.nextInt();
System.out.println(n1);

}while(n1<1);




sc.close();

    }

}