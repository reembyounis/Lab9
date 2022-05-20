package ac.il.haifa.cs.sweng;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textField;

    @FXML
    private Button sayHello;

    @FXML
    void sayHello(ActionEvent event) {
        System.out.println("hello reem 2");
        textField.setText("Hello World");
    }

    @FXML
    void initialize() {
        assert textField != null : "fx:id=\"Text\" was not injected: check your FXML file 'primary.fxml'.";
        assert sayHello != null : "fx:id=\"sayHello\" was not injected: check your FXML file 'primary.fxml'.";

    }

}