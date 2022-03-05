package sample.Controllers;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class Controller {
    @FXML
    private Button loginbTn;

    @FXML
    private FontAwesomeIconView cancel;


    @FXML
    public void closepage(MouseEvent event){
        System.exit(0);
    }
    @FXML
    private PasswordField passField;

    @FXML
    private TextField usernameField;


    public void onButton(){
        String pass = passField.getText();
        String user = usernameField.getText();
    }


}
