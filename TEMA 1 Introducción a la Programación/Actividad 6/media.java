import java.util.Scanner;
public class media {

    public static void main(String[] args) {
        
//VARIABLES Y CONSTANTES
int n;
int suma= 0;
int media;

Scanner sc = new Scanner(System.in);

for(n=0; n<5; n++){  
    System.out.println("Introduce un numero");
     int salario = sc.nextInt();
     suma = suma + salario;
}   

     media = suma/5;
     System.out.println("La media es " + media);


sc.close();
    }
}
