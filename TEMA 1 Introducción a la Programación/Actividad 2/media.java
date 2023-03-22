import java.util.Scanner;
public class media{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int nota1,nota2,nota3;
        double media;
        System.out.println ("Introduce la nota 1");
             nota1=sc.nextInt();
        System.out.println ("Introduce la nota 2");
              nota2=sc.nextInt();
        System.out.println ("Introduce la nota 3");
              nota3=sc.nextInt();

      media = (nota1+nota2+nota3)/3;

System.out.println("La nota media final es:" + media);

if (media>=5) {
System.out.println("Has aprobado");
} else {
System.out.println("Debes hacer la recuperación");
}

sc.close();

    }
}