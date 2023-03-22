import java.util.Scanner;
    
    public class Principal {

      static Scanner sc = new Scanner(System.in);
      static boolean repeat = true;

    public static void main (String[] args) {

        // Sistema de altas/inicio de sesión
        System.out.println("SISTEMA DIGITAL DE BANCOS BARTOLO");

        System.out.println("1- Darse de alta, 2- Iniciar sesión");
        int enteraccount = sc.nextInt();
        

        if (enteraccount == 1) {
          Clientes.Crearcliente();
          
        } else if (enteraccount == 2) {
          Clientes.Iniciarsesion();
        }
      
    
    while (repeat) { 

   
        System.out.println("¿Que operación desea realizar? -1 Ingresar Dinero, -2 Retirar Dinero, -3 Mostrar Saldo, -4 Mostrar información de las cuentas");
        int operacion = sc.nextInt();

      switch (operacion){

        case 1: Cuentas.Ingresardinero(operacion); break;


        case 2: Cuentas.Retirardinero(); break;


        case 3: Cuentas.MostrarDinero(); break;


        case 4: Clientes.Showinfoclientes(); break;

        
      } //Cierre del switch

      sc.nextLine();

      System.out.println("¿Desea realizar alguna operación más? - Sí, No");
      String choosefinalizar = sc.nextLine();

      if (choosefinalizar.equalsIgnoreCase("Si") || choosefinalizar.equalsIgnoreCase("Sí")){
        continue;
      
      } else if (choosefinalizar.equalsIgnoreCase("No")){
        repeat = false;
      }
  
  
    } //Cierre del while repeat

} // Cierre del main



} //Finalización de la clase Principal


/* 
INTENTAR IMPLEMENTAR EN EL CÓDIGO LA OPCION DE CAMBIAR DE CUENTA UNA VEZ FINALIZADAS LAS OPERACIONES 

*/


