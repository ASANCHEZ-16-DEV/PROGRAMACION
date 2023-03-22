import java.util.Scanner;

public class Libro{
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);        
String titulo = "";
String autor = "";

//SE INTRODUCE EL TÍTULO DEL LIBRO
System.out.println("Introduce el título del libro");
titulo = sc.nextLine();

StringBuffer newtitulo = new StringBuffer();
newtitulo.append(titulo);

//SE INTRODUCE EL NOMBRE DEL AUTOR 
System.out.println("Introduce el nombre del autor");
autor = sc.nextLine();

StringBuffer newautor = new StringBuffer();
newautor.append(autor);




    }
}