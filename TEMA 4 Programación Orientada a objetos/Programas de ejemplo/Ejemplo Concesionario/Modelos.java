
    public class Modelos {
            
        String modelo;
        String marca;
        String motor;
        String combustible;
        String tipo;

       
        public Modelos (){  //Constructor de Modelos

        }

        public String getModelo() {
            return modelo;
        }
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }


        public String getMarca() {
            return marca;
        }
        public void setMarca(String marca) {
            this.marca = marca;
        }


        public String getMotor() {
            return motor;
        }
        public void setMotor(String motor) {
            this.motor = motor;
        }


        public String getCombustible() {
            return combustible;
        }
        public void setCombustible(String combustible) {
            this.combustible = combustible;
        }


        public String getTipo() {
            return tipo;
        }
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }


        @Override
        public String toString() {
            return "Modelos [modelo=" + modelo + ", marca=" + marca + ", motor=" + motor + ", combustible="
                    + combustible + ", tipo=" + tipo + "]";
        }

}

    