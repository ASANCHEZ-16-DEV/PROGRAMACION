import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

    public class Cuentas {
       
       static Scanner sc = new Scanner(System.in);


          Clientes Titular;
          Integer Numcuenta;
          double Saldo = 0;
          double Limit;

           static ArrayList<Double> listacuentas = new ArrayList<>();   //Lista para almacenar o retirar el dinero de la cuenta
           

         public Cuentas (Clientes Nif){ //Constructor de Cuenta con parametro NIF obligatorio para creación de cuentas
            
        }
        

          public Cuentas (double Saldo){ //Constructor de Cuenta con parametro NIF obligatorio para creación de cuentas
            this.Saldo = Saldo;
        }

        public Cuentas(){

        }

         public Clientes getTitular() {
            return Titular;
         }
         public void setTitular(Clientes titular) {
            Titular = titular;
         }


         public Integer getNumcuenta() {
            return Numcuenta;
         }
         public void setNumcuenta(Integer numcuenta) {
            Numcuenta = numcuenta;
         }


         public double getSaldo() {
            return Saldo;
         }
         public void setSaldo(double saldo) {
            this.Saldo = saldo;
         }


         public double getLimit() {
            return Limit;
         }
         public void setLimit(double limit) {
            Limit = limit;
         }



         @Override
         public String toString() {
            return "Cuentas [Titular=" + Titular + ", Numcuenta=" + Numcuenta + ", Saldo=" + Saldo + ", Limit=" + Limit
                  + "]";
         }


         public static Cuentas Ingresardinero (double saldoAnterior) {
         
             Cuentas depositmoney = new Cuentas();
             System.out.println("Introduce el dinero a ingresar:");
         
             try {
         
                 double increasesaldo = sc.nextDouble();
                 double nuevoSaldo = 0;
         
                 if (increasesaldo > 0) {
                     if (saldoAnterior > 0) {
                         nuevoSaldo = saldoAnterior + increasesaldo;
                         System.out.println("Ha ingresado " + increasesaldo + " Euros. El nuevo saldo de la cuenta es: " + nuevoSaldo);
                     } else {
                         nuevoSaldo = increasesaldo;
                         System.out.println("Ha ingresado " + increasesaldo + " Euros.");
                     }
                     depositmoney.setSaldo(nuevoSaldo);
                     listacuentas.add(0, depositmoney.getSaldo());
                 } else {
                     System.out.println("Ha introducido un número negativo. Repita la introducción.");
                 }
         
             } catch (InputMismatchException e) {
                 System.out.println("Ha introducido un valor no numérico. Repita la introducción.");
                 sc.next(); // para limpiar el búfer del objeto Scanner y evitar un bucle infinito
             }
             return depositmoney;
         }
         
         
        


        public static Cuentas Retirardinero() { //Metodo para retirar el dinero desde una lista de cuentas donde se almacena
         Cuentas withdrawmoney = new Cuentas();

         System.out.println("Introduce el dinero a retirar, su saldo actual es: " + listacuentas);
         double Operationwithdrawmoney = sc.nextDouble();
     
         double actualmoney = listacuentas.get(0) ; // Se debe guardar el saldo actual en una variable antes de restarle el dinero a retirar
         double newmoney = actualmoney - Operationwithdrawmoney;
         Collections.replaceAll(listacuentas, listacuentas.get(0), newmoney);

         for (Double mostrarlista : listacuentas){
            System.out.println("Ahora dispone de " + mostrarlista + " Euros");
         }


         return withdrawmoney;
     }
     


     public static Cuentas MostrarDinero() {   //Método para mostrar el dinero del cliente desde una lista de cuentas

      Cuentas showmoney = new Cuentas();
      System.out.println("Su dinero actual es " + listacuentas + " Euros");

      return showmoney;

     }



}