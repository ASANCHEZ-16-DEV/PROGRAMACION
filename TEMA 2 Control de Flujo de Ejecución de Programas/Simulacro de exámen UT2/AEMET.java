import java.util.Scanner;
import java.util.InputMismatchException;

public class AEMET {
public static void main(String[] args)  {
    
//VARIABLES Y CONSTANTES
Scanner sc = new Scanner(System.in);
double viento1 = 0;
double viento2 = 0;
double viento3 = 0;
int countviento = 0; 
double medprecipitaciones = 0;
double precipitaciones1 = 0;
double precipitaciones2 = 0;
double precipitaciones3 = 0;

//ENTRADA DE DATOS

//DIA 1
System.out.println("Introduce los datos recopilados del viento en el día 1");
    viento1 = sc.nextDouble();

if (viento1>70){
    countviento++;
}

System.out.println("Introduce los datos recopilados de las precipitaciones en el día 1");   
    precipitaciones1 = sc.nextDouble();

if(viento1>=60 && precipitaciones1>=15){
    System.out.println("Alerta naranja activa en el día 1");
}

//DIA 2
System.out.println("Introduce los datos recopilados del viento en el día 2");
    viento2 = sc.nextDouble();

    if (viento2>70){
        countviento++;
    }

System.out.println("Introduce los datos recopilados de las precipitaciones en el día 2");   
    precipitaciones2 = sc.nextDouble();

 if (viento2>=60 && precipitaciones2>=15){
    System.out.println("Alerta naranja activa en el día 2");
}

//DIA 3
System.out.println("Introduce los datos recopilados del viento en el día 3");
viento3 = sc.nextDouble();

if (viento3>70){
    countviento++;
}

System.out.println("Introduce los datos recopilados de las precipitaciones en el día 3");   
precipitaciones3 = sc.nextDouble();

  if (viento3>=60 && precipitaciones3>=15){
    System.out.println("Alerta naranja activa en el día 3");
}



//DATOS ESTADÍSTICOS

if(viento1>viento2){
    System.out.println("La velocidad máxima del viento en los tres días ha sido " + viento1);

} else if (viento2>viento3){
    System.out.println("La velocidad máxima del viento en los tres días ha sido " + viento2);

} else if(viento3>viento2){
    System.out.println("La velocidad máxima del viento en los tres días ha sido " + viento3);
}



medprecipitaciones = (precipitaciones1+precipitaciones2+precipitaciones3)/3;
System.out.println("La media de las precipitaciones es " + medprecipitaciones);

    
System.out.println("El número de veces que el viento ha superado los 70km/h han sido " + countviento);


sc.close();

    }
}


