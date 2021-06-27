package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
public class FuncionarioController implements Initializable{
    @FXML AnchorPane anchorPane;

    @FXML private void cadastrar() throws IOException {
        AnchorPane paneCadastro = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/Cadastrar.fxml"));
        anchorPane.getChildren().setAll(paneCadastro);
    }
    @FXML private void disponibilizar() throws IOException {
        AnchorPane paneDisponibilizar = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/Disponibilizar.fxml"));
        anchorPane.getChildren().setAll(paneDisponibilizar);
    }
    @FXML private void agendar() throws IOException {
        AnchorPane paneAgendar = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/Agendar.fxml"));
        anchorPane.getChildren().setAll(paneAgendar);
    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    }
}
