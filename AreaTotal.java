import java.util.Arrays;


public class AreaTotal {
    public static void main(String[] args) {


        //OBJETO PRISMA 1 
     Prisma prisma1 = new Prisma(0, 0);

     double base1 = Math.random();
     double altura1 = Math.random();

        double areaTotalPrisma1 = prisma1.calcularAreaTotalPrisma(base1, altura1);


    //OBJETO PRISMA 2
    Prisma prisma2 = new Prisma(0, 0);

    double base2 = Math.random();
    double altura2 = Math.random();

       double areaTotalPrisma2 = prisma2.calcularAreaTotalPrisma(base2, altura2);


    //OBJETO PRISMA 3
    Prisma prisma3 = new Prisma(0, 0);

    double base3 = Math.random();
    double altura3 = Math.random();

       double areaTotalPrisma3 = prisma3.calcularAreaTotalPrisma(base3, altura3);



    //OBJETO PRISMA 4

    Prisma prisma4 = new Prisma(0, 0);
    
    double base4 = Math.random();
    double altura4 = Math.random();

        double areaTotalPrisma4 = prisma4.calcularAreaTotalPrisma(base4, altura4);


//IMPRESIÓN POR PANTALLA DE AREAS TOTALES
    double[] areasTotales = {areaTotalPrisma1, areaTotalPrisma2, areaTotalPrisma3};

    Arrays.sort(areasTotales);

        double[] areasTotalesDescendentes = new double[areasTotales.length];

    for (int i = 0; i < areasTotales.length; i++) {
         areasTotalesDescendentes[i] = areasTotales[areasTotales.length - 1 - i];
    }

    System.out.println("Áreas totales ordenadas de mayor a menor:");

    for (int i = 0; i < areasTotalesDescendentes.length; i++) {
        System.out.println("Área total prisma " + (i+1) + ": " + areasTotalesDescendentes[i]);
    }

    



        
    }
}
