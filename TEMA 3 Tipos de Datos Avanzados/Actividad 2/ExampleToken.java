import java.util.StringTokenizer;

public class ExampleToken{
    public static void main(String[] args) {
     
String colores="blanco azul verde rojo amarillo";
StringTokenizer str=new StringTokenizer(colores);

int numtokens= str.countTokens();        
System.out.println("Hay " + numtokens+ " colores");

        while(str.hasMoreTokens()){
            System.out.println("token: " + str.nextToken());
        }

    

    }

}