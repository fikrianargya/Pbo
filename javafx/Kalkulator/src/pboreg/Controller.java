package pboreg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

    @FXML
    private TextField txtDisplay;
    private int decimalClick = 0;
    private String generalOperationObject;
    private double firstDouble;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void buttonGeneralAction(ActionEvent event) {
        generalOperationObject = ((Button) event.getSource()).getText();
        switch (generalOperationObject) {
            case "DEL":
                txtDisplay.setText("");
                decimalClick = 0;
                break;
            case "+/-":
                double plusMinus = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                plusMinus = plusMinus * (-1);
                txtDisplay.setText(String.valueOf(plusMinus));
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                String currentText = txtDisplay.getText();
                firstDouble = Double.parseDouble(currentText);
                txtDisplay.setText("");
                decimalClick = 0;
                break;
            default:
        }
    }

    @FXML
    private void buttonDigitAction(ActionEvent event) {
        String digitObject = ((Button) event.getSource()).getText();
        String oldText = txtDisplay.getText();
        String newText = oldText + digitObject;
        txtDisplay.setText(newText);
    }

    @FXML
    private void buttonEqualAction(ActionEvent event) {
        double secondDouble;
        double result=0;
        String secondText = txtDisplay.getText();
        secondDouble = Double.parseDouble(secondText);

        switch (generalOperationObject) {
            case "+":
                result = firstDouble + secondDouble;
                break;
            case "-":
                result = firstDouble - secondDouble;
                break;
            case "*":
                result = firstDouble * secondDouble;
                break;
            case "/":
                result = firstDouble / secondDouble;
                break;
            default:
        }
        String format = String.format("%.1f", result);
        txtDisplay.setText(format);

    }

    public void buttoonDigitAction(ActionEvent actionEvent) {
    }
}