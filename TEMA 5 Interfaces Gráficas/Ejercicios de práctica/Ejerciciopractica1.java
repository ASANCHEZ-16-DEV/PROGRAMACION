import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.xml.ws.wsaddressing.W3CEndpointReferenceBuilder;    
    
    public class Ejerciciopractica1 {

public static void main(String[] args) {
    
    exampleGUI();

    
}
        static JFrame frame = new JFrame("Ejemplo"); //Creamos un objeto ventana
        static JPanel panel = new JPanel(); //Creamos un objeto panel


        private static void iniComponentes() {  //Creamos un método para declarar que ponemos en la ventana
            frame.setSize(500,600); //Establecemos width y height de la ventana
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  

            JLabel etiqueta1 = new JLabel("Hello world DAM1");  //Creamos una etiqueta con un mensaje
            etiqueta1.setBackground(Color.ORANGE); //Establecemos un color de fondo

            JTextField valor1 = new JTextField(10); //Establecemos un bloque para introducir texto

            panel.add(etiqueta1);   //Añadimos etiqueta1
            panel.add(valor1);  //Añadimos al panel valor1
            frame.add(panel); //Añadimos panel a frame (La ventana)

        }


        public static void exampleGUI() {   //Ponemos visible la variable de ventana frame y llamamos a el metodo inicomponents
            iniComponentes();
            frame.setVisible(true); 
        }




    }



    
    
    