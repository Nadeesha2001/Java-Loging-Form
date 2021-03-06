package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;

public class Login {

    public Login() {

    }

    @FXML
    private Button button;
    @FXML
    private Label wrongLogin;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    public void userLogin(ActionEvent event) throws IOException{
        checkLogin();
    }

    private void checkLogin() throws IOException{
        Main m =new Main();
        if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
            wrongLogin.setText("Success!");

            m.changeScene("afterLogin.fxml");
        }

        else if(username.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogin.setText("Please Enter Your Data");
        }

        else {
            wrongLogin.setText("invalid Your Login");
        }
    }
}
