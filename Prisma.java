import java.util.Scanner;

public class Prisma {

    Scanner sc = new Scanner(System.in);

//ATRIBUTOS MÍNIMOS
    int baseTriangulo;
    int alturaPrisma;
    
//CONSTRUCTORES


public Prisma(int baseTriangulo, int alturaPrisma) {
        this.baseTriangulo = baseTriangulo;
        this.alturaPrisma = alturaPrisma;
    }


    //GETTERS Y SETTERS
    public int getBaseTriangulo() {
        return baseTriangulo;
    }


    public void setBaseTriangulo(int baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }


    public int getAlturaPrisma() {
        return alturaPrisma;
    }


    public void setAlturaPrisma(int alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }




//MÉTODOS DE PRISMA

    public double leervalor () {
        double leervalor = sc.nextDouble();
        return leervalor;
    }


    public void imprimirValor (String valor) {
        System.out.println(valor);
    }


    public static boolean esNumero(String valor) {
        try {
            Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public static double alturatriangulo (double base) {
        return Math.sqrt(3) / 2 * base;
    }


    public double calcularPerimetroPrisma(double ladoBase, double altura) {
        double perimetroBase = 3 * ladoBase;
        double perimetroLateral = 3 * (Math.sqrt(Math.pow(ladoBase / 2, 2) + Math.pow(altura, 2)));
        return perimetroBase + perimetroLateral;
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularAreaBasePrisma(double base) {
        return 2 * calcularAreaTriangulo(base, alturatriangulo(base));
    }

    public double calcularAreaTotalPrisma(double base, double altura) {
        double areaBase = calcularAreaBasePrisma(base);
        double areaLateral = calcularAreaRectangulo(base, altura) * 3;
        return areaBase + areaLateral;
    }

}
