package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class MainController implements Initializable {

    @FXML TextField textField;
    @FXML PasswordField passwordField;
    @FXML AnchorPane anchorPaneLogin;

    @FXML private void logar() throws IOException{
        if(textField.getText().equals("funcionario") && passwordField.getText().equals("123")) {
                    anchorPaneLogin.getScene().getWindow().hide();
                    Parent mainFuncionario = FXMLLoader.load(getClass().getResource("/view/Funcionario.fxml"));
                    Scene sceneFuncionario = new Scene(mainFuncionario);
                    sceneFuncionario.getStylesheets().add("/view/style.css");
                    Stage stageFuncionario = new Stage();
                    stageFuncionario.setTitle("Funcionario");
                    stageFuncionario.setScene(sceneFuncionario);
                    stageFuncionario.show();
        }
        
        if(textField.getText().equals("aluno") && passwordField.getText().equals("123")) {
            anchorPaneLogin.getScene().getWindow().hide();
            Parent mainAluno = FXMLLoader.load(getClass().getResource("/view/Aluno.fxml"));
            Scene sceneAluno = new Scene(mainAluno);
            sceneAluno.getStylesheets().add("/view/style.css");
            Stage stageAluno = new Stage();
            stageAluno.setTitle("Aluno");
            stageAluno.setScene(sceneAluno);
            stageAluno.show();
        }
    }
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {    
    } 
}
