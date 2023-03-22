import javax.swing.*;
import org.omg.CosNaming.NamingContextPackage.AlreadyBound;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Calculadora2  {

        JFrame ventana = new JFrame("Calculadora en java");
        JPanel panelBotones = new JPanel();
        JTextArea areaTexto = new JTextArea();
        String inputnumbers = "";
        double newnumbers = 0;
        double resultado = 0;
        
        public Calculadora2() {
            MuestraVentana();
            TextoInicial();
            Outputnumbers();
            BottomPanels();
        }


        public void MuestraVentana(){ 
                ventana.setSize(300, 510); // Tamaño de la ventana en píxeles
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Al cerrar la ventana, se detiene la ejecución del programa
                ventana.setResizable(false);
                ImageIcon icono = new ImageIcon("calculadora.png");
                ventana.setIconImage(icono.getImage());
                ventana.setLayout(null);
            }
    



        public void TextoInicial() {

            // Crea un JLabel con un texto
                JLabel etiqueta = new JLabel("CALCULADORA STANDARD");
            
            // Crear una fuente con el tamaño deseado
                Font fuente = new Font("Roboto", Font.PLAIN, 20);
            
            // Establecer la fuente de la etiqueta
                etiqueta.setFont(fuente);
            
            // Establecer la posición y tamaño de la etiqueta
                etiqueta.setBounds(12, 30, 400, 20);
            
            // Agrega la etiqueta a la ventana
                ventana.add(etiqueta);
        }
            

        public void Outputnumbers() {

            Font fuente = new Font("Arial", Font.PLAIN, 18);

            // Establece la ubicación del JPanel
            areaTexto.setBounds(12, 75, 260, 60);

            areaTexto.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            areaTexto.setEditable(false);
            areaTexto.setLineWrap(true);
            areaTexto.setWrapStyleWord(true);
            areaTexto.setFont(fuente);

                

            // Agrega el JPanel a la ventana
            ventana.add(areaTexto);
        }
        

         
        private void BottomPanels() {
            // Establecer el diseño del panel de botones
            panelBotones.setLayout(new GridLayout(4, 3, 5, 5));
        
            // Crear los botones y agregarlos al panel
            String[] Stringbotones = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "+", "-", "/", "*", "C", "="};
        
            for (String botonString : Stringbotones) {
                JButton boton = new JButton(botonString);
        
                boton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String botonText = boton.getText();
        
                        if (botonText.equals("C")){
                            areaTexto.setText("");
                            inputnumbers = "";
        
                        } else if (botonText.equals("+") || botonText.equals("-") || botonText.equals("*") || botonText.equals("/")) {
                            inputnumbers += " " + botonText + " ";
                            areaTexto.setText(inputnumbers);
        
                        } else if (botonText.equals("=")) {
                            Calculate();
        
                        } else {
                            inputnumbers += botonText;
                            areaTexto.setText(inputnumbers);
                        }
                    }
                });
        
                boton.setBackground(Color.black);
                boton.setForeground(Color.WHITE);
                boton.setFont(new Font("Arial", Font.BOLD, 23));
                panelBotones.add(boton);
            }
        
            // Establecer el tamaño y la ubicación del panel de botones
            panelBotones.setBounds(17, 175, 250, 250);
        
            ventana.add(panelBotones);
        
            // Hacer visible la ventana
            ventana.setVisible(true);
        }
        
        
        
        public void Calculate() {
            String inputnumbers = areaTexto.getText();
            String[] expression = inputnumbers.split(" ");
        
            double result = 0;
        
            switch (expression[1]) {
                case "+":
                    result = Double.parseDouble(expression[0]) + Double.parseDouble(expression[2]);
                    break;
        
                case "-":
                    result = Double.parseDouble(expression[0]) - Double.parseDouble(expression[2]);
                    break;
        
                case "*":
                    result = Double.parseDouble(expression[0]) * Double.parseDouble(expression[2]);
                    break;
        
                case "/":
                    result = Double.parseDouble(expression[0]) / Double.parseDouble(expression[2]);
                    break;
            }
        
            areaTexto.setText(String.valueOf(result));
        }
        
        
        



        public static void main(String[] args) {
            new Calculadora2();

        }


    }


