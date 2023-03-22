import java.util.Random;


public class Aleatorio_while {
    public static void main(String[] args) {
  
Random rd = new Random();        

//VARIABLES Y CONSTANTES

int counter=0;
int random;

while(counter<10 ){ 

    random = rd.nextInt(5000);
    counter = counter +1;

    if(random % 2 == 0){
        System.out.println("El número " +random+ " es par");

    }else{        
        System.out.println("El número " +random+ " es impar");
   
    }

}
 

    }
}
