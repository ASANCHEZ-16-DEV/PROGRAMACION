import java.util.Scanner;

    public class Piramide {

        Scanner sc = new Scanner(System.in);
        double ladobase = 0.0;
        double altura = 0.0;
        double Areabase = 0.0;


        public double getAreabase() {
            return Areabase;
        }

        public void setAreabase(double areabase) {
            Areabase = areabase;
        }


        public double getLadobase() {
            return ladobase;
        }

        public void setLadobase(double ladobase) {
            this.ladobase = ladobase;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        @Override
        public String toString() {
            return "Piramide{" +
                    "ladobase=" + ladobase +
                    ", altura=" + altura +
                    '}';
        }

        public Piramide(){

        }


        public void Asignatributos(){

            Piramide asignar = new Piramide();

            System.out.println("Introduce el lado de la base");
            asignar.setLadobase(sc.nextDouble());

            System.out.println("Introduce la altura");
            asignar.setAltura(sc.nextDouble());

        
            /**
             * Calculo del area de la base
             */
            double calcAreaBase = (asignar.getLadobase())*2;
            System.out.println("El area de la base es " + calcAreaBase);



            double calcVolumen = ( calcAreaBase*asignar.getAltura() ) / 3;
            System.out.println("El volumen de la piramide es " + calcVolumen);



        }



        public static void main(String[] args) {

            Piramide Startcalculo = new Piramide();
            
            Startcalculo.Asignatributos();

        }

    }
