
    public class Coches {

        Modelos modelo;
        String color;
        String matricula;

        
        public Coches (Modelos modelo){ //Constructor de Coches con parametro modelos
            this.modelo = modelo;
        }


        public Modelos getModelo() {
            return modelo;
        }
        public void setModelo(Modelos modelo) {
            this.modelo = modelo;
        }


        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }


        public String getMatricula() {
            return matricula;
        }
        public void Matricular ( ) {    //Hacer el aleatorio
            String matricula= "1234ABC";
            
            this.matricula = matricula;
        }


        @Override
        public String toString() {
            return "Coches [modelo=" + modelo + ", color=" + color + ", matricula=" + matricula + "]";
        }
        





    }