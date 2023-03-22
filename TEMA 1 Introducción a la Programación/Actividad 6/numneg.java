import java.util.Scanner;
public class numneg {
    public static void main(String[] args) {
        
//VARIABLES Y CONSTANTES
Scanner sc = new Scanner(System.in);

int n=0;
int n2=0;
boolean seguir = true;

while(seguir){ 

    System.out.println("Introduce un número");
          n= sc.nextInt();  
          n2=n2+n;
            if(n<0){ 
                 seguir=false;
             }
}






sc.close();

    }
  }
