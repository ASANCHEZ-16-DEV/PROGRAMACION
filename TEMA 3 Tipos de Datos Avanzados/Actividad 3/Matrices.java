              import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//Se pregunta cuantos modulos y alumnos habrán para dimensionar la matriz
    System.out.print("¿Cuántos módulos se van a grabar? ");
        int numModulos = scanner.nextInt();
                                                            
        System.out.print("¿Cuántos alumnos se van a grabar? ");
        int numAlumnos = scanner.nextInt();


//Se declara la String del numero de alumnos y modulos que tenemos sumando uno para iniciar a partir de "Nombre"
String[][] calificaciones = new String[numAlumnos+1][numModulos+1];
    calificaciones[0][0] = "Nombre";
        
    //Se pregunta por los modulos a introducir en las columnas a partir de la primera hasta el número especififado por el usuario
        for (int i = 1; i <= numModulos; i++) {
            System.out.print("Introduce el nombre del módulo " + i + ": ");
            calificaciones[0][i] = scanner.next();
        }

    //Se pide el nombre del alumno para registrar sus calificaciones
        for (int i = 1; i <= numAlumnos; i++) {
            System.out.print("Introduce el nombre del alumno " + i + ": ");

            calificaciones[i][0] = scanner.next();
            for (int j = 1; j <= numModulos; j++) {
                System.out.print("Introduce la calificación del alumno " + calificaciones[i][0] + " en el módulo " + calificaciones[0][j] + ": ");
                calificaciones[i][j] = scanner.next();
            }

    //Se imprime la tabla de calificaciones
        }
        System.out.println("\nTABLA DE CALIFICACIONES ");
        for (int i = 0; i <= numAlumnos; i++) {
            for (int j = 0; j <= numModulos; j++) {
                System.out.print(calificaciones[i][j] + " ");
            }
            System.out.println();
        }

    
    //Se solicita el modulo deseado para calcular su media 
        while (true) {
            System.out.print("\nIntroduce el nombre del módulo para conocer la media (introduce 'salir' para terminar): ");
            String modulo = scanner.next();
            if (modulo.equalsIgnoreCase("salir")) {
                break;
            }

            int moduloIndex = -1;
            for (int i = 1; i <= numModulos; i++) {
                if (calificaciones[0][i].equalsIgnoreCase(modulo)) {        
                    moduloIndex = i;
                    break;
                }
            }
            if (moduloIndex == -1) {
                System.out.println("El módulo introducido no existe.");     //Control de errores para introducción
                continue;
            }

            double total = 0;

            for (int i = 1; i <= numAlumnos; i++) {
                total += Double.parseDouble(calificaciones[i][moduloIndex]);
            }

            //Calculo de media
            double media = total / numAlumnos;          
            System.out.println("La media del módulo " + modulo + " es " + media);

        }
    }
}
