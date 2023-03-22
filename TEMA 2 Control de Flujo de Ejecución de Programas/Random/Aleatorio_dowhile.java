import java.util.Random;

public class Aleatorio_dowhile {
    public static void main(String[] args) {
        

//VARIABLES Y CONSTANTES

Random rd = new Random();
int random;
int counter = 0;


do{
    random = rd.nextInt(5000);

    if(random % 2 ==0 ){
        counter ++;

        System.out.println("El número " + random+ " es par");

    }else{
        System.out.println("El número " + random+ " es impar");
    }

    } while (counter<10 );



















    }
}
