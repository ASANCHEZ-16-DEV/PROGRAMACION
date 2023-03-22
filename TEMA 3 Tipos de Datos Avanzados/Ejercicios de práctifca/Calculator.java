import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {
    private TextField display = new TextField();
    private String operator = "";
    private double number1 = 0;
    private boolean start = true;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        root.setHgap(5);
        root.setVgap(5);

        display.setEditable(false);
        root.add(display, 0, 0, 4, 1);

        String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", ".", "0", "=", "+"};
        for (int i = 0; i < buttons.length; i++) {
            Button button = new Button(buttons[i]);
            button.setPrefWidth(70);
            button.setPrefHeight(70);
            int row = (i / 4) + 1;
            int col = i % 4;
            root.add(button, col, row);

            button.setOnAction(event -> {
                if (start) {
                    display.clear();
                    start = false;
                }

                String value = button.getText();
                if (value.matches("[0-9.]")) {
                    display.appendText(value);
                } else if (value.matches("[/*+-]")) {
                    operator = value;
                    number1 = Double.parseDouble(display.getText());
                    display.clear();
                } else if (value.equals("=")) {
                    double number2 = Double.parseDouble(display.getText());
                    double result = 0;
                    switch (operator) {
                        case "+":
                            result = number1 + number2;
                            break;
                        case "-":
                            result = number1 - number2;
                            break;
                        case "*":
                            result = number1 * number2;
                            break;
                        case "/":
                            result = number1 / number2;
                            break;
                    }
                    display.setText(String.valueOf(result));
                    start = true;
                }
            });
        }

        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }
}
