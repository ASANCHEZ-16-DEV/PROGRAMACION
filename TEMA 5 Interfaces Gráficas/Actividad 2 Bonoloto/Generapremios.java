import java.util.ArrayList;
import java.util.Random;

public class Generapremios{


//ATRIBUTOS y VARIABLES

        Integer Primerpremio;
        Integer Premiocomplementario;
        Integer Reintegro;



//GETTERS Y SETTERS
        @Override
        public String toString() {
            return "Generapremios [Primerpremio=" + Primerpremio + ", Premiocomplementario=" + Premiocomplementario
                    + ", Reintegro=" + Reintegro + "]";
        }


        public Integer getPrimerpremio() {
            return Primerpremio;
        }
        public void setPrimerpremio(Integer primerpremio) {
            Primerpremio = primerpremio;
        }


        public Integer getPremiocomplementario() {
            return Premiocomplementario;
        }
        public void setPremiocomplementario(Integer premiocomplementario) {
            Premiocomplementario = premiocomplementario;
        }


        public Integer getReintegro() {
            return Reintegro;
        }
        public void setReintegro(Integer reintegro) {
            Reintegro = reintegro;
        }



//METODOS DE GENERAPREMIOS
        public void Generatepremio1 () {

            Generapremios generateedpremio1 = new Generapremios();
        ArrayList<Integer> listaprimerPremio= new ArrayList<Integer>();

            /**
             * Declaramos las dos variables, una para iniciar el numero aleatorio y
             * otra para almacenarlo en una variable vector con seis posiciones para
             * posteriormente añadirlo a un arraylist que se almacena en la variable objeto
             */
            Random rand  = new Random();
            final int [] numeros = new int[6];

            for (int i = 0; i<numeros.length; i ++){
                numeros[i] = rand.nextInt(49)+1;
                listaprimerPremio.add(numeros[i]);
            }

            generateedpremio1.setPrimerpremio(listaprimerPremio.get(0));

            //Impresión por pantalla de los primeros premios generados
            System.out.println("El primer premio es" + generateedpremio1.getPrimerpremio());
                System.out.println();
        }

/**
 * Añadir la arraylist al setter de el metodo para acceder a los datos mediante objetos
 */


        public void Generatecomplementario () {

            Generapremios generatedcomplementario = new Generapremios();
            ArrayList<Integer> listapremiocomplementario = new ArrayList<>();

            /**
             * Declaramos las dos variables, una para iniciar el numero aleatorio y
             * otra para almacenarlo en una variable vector con seis posiciones para
             * posteriormente añadirlo a un arraylist que se almacena en la variable objeto
             */
            Random rand  = new Random();
            final int [] numeros = new int[1];

            for (int i = 0; i<numeros.length; i ++){
                numeros[i] = rand.nextInt(49)+1;
                listapremiocomplementario.add(numeros[i]);
                
            }

            generatedcomplementario.setPremiocomplementario(listapremiocomplementario.get(0));

            //Impresión por pantalla de el numero complementario generado
            System.out.print("El numero complementario es: ");
            for (Integer recorrer : listapremiocomplementario){
                System.out.println("[" + recorrer + "]");
            }



        }


        public void GenerateReintegro () {

            Generapremios generatedreintegro = new Generapremios();
            ArrayList<Integer> listareintegro = new ArrayList<>();
            /**
             * Declaramos las dos variables, una para iniciar el numero aleatorio y
             * otra para almacenarlo en una variable vector con seis posiciones para
             * posteriormente añadirlo a un arraylist que se almacena en la variable objeto
             */
            Random rand  = new Random();
            final int [] numeros = new int[1];

            for (int i = 0; i<numeros.length; i ++){
                numeros[i] = rand.nextInt(49)+1;
                listareintegro.add(numeros[i]);
            }


            System.out.print("El numero del reintegro es ");
            for (int i = 0; i<numeros.length; i++){
                System.out.print("[" + numeros[i]+ "]");
            }
            System.out.println();
        }







    }