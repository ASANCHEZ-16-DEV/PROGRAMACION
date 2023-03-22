
import java.util.Random;

public class Aleatorio_for {
public static void main(String[] args) {
    

Random nd = new Random();

//VARIABLES Y CONSTANTES

int rnd;


for (int i = 0; i<10; i ++){
    rnd = nd.nextInt(6000);

if(rnd % 2 == 0){
    System.out.println("El número " +rnd+ " es par");

}else{
    System.out.println("El número " +rnd+ " es impar");
    }
}








    }
}  