import java.util.Scanner;

public class salarios {
    public static void main(String[] args) {

try (//VARIABLES Y CONSTANTES
Scanner sc = new Scanner(System.in)) {
    int s;
    int salario=0;
    int suma=0;
    
    for(s=0; s<10; s++){  
        System.out.println("Introduce el salario");
         salario = sc.nextInt();
         suma = salario;
         
    }   
    
        int media = suma/10;
         System.out.println("La media es " + media);
    
         if(salario>=1500){
            System.out.print("Los salarios mayores a 1500 son " +salario);
        }
    
         
    sc.close();
}

    }
}
