import java.util.ArrayList;
import java.util.Scanner;

    public class Clientes {

            static Scanner sc = new Scanner(System.in);

            String Nif;
            String Nombre;
            String Teléfono;

          public static ArrayList<Clientes> listaclientes = new ArrayList<>();  //Lista para almacenar la información de la cuenta del usuario


    public Clientes (String Nif){ //Constructor de Clientes con parametro Nombre
        this.Nif = Nif;
    }


    public String getNif() {
        return Nif;
    }
    public void setNif(String nif) {
        Nif = nif;
    }

    
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public String getTeléfono() {
        return Teléfono;
    }
    public void setTeléfono(String teléfono) {
        Teléfono = teléfono;
    }


    @Override
    public String toString() {
        return "Clientes [Nif=" + Nif + ", Nombre=" + Nombre + ", Teléfono=" + Teléfono + "]";
    }


    public static Clientes Crearcliente () {

              Clientes addcliente = new Clientes(""); //Inicialización del Cliente

            System.out.println("Sistema de altas");

            System.out.println("Introduce tu DNI/NIF completo");
                addcliente.setNif(sc.nextLine());

            System.out.println("Introduce tu nombre completo");
                addcliente.setNombre(sc.nextLine());

            System.out.println("Introduce tu Teléfono");
                addcliente.setTeléfono(sc.nextLine());

                System.out.println("Bienvenido " + addcliente.getNombre() + " has iniciado sesión");

            listaclientes.add(addcliente);

        return addcliente;
    }



    public static Clientes Iniciarsesion () {

        Clientes signincliente = new Clientes("");
        
         System.out.println("Inicio de sesión, introduce tu DNI/NIF");
           String checkDNI = sc.nextLine();

            boolean clientfound = false;

            for (Clientes searchcliente : listaclientes){

              if (searchcliente.getNif().equals(checkDNI)){
                      System.out.println("Bienvenido " + searchcliente.getNombre() + " has iniciado sesión");
                  clientfound = true;
                  break;

            }  else if (!clientfound) {
                System.out.println("Tu usuario no se encuentra registrado en nuestro banco, intentalo de nuevo");
                }

            } //Cierre del for

            return  signincliente;
            
        } //Cierre del método Iniciarsesion


        public static Clientes Showinfoclientes () {
            
            Clientes showclientes = new Clientes("");

            System.out.println(listaclientes);

            return showclientes;
        }



    }



