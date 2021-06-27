package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class DisponibilizarController implements Initializable {
    @FXML AnchorPane anchorPaneIncluir;
    @FXML AnchorPane anchorPaneAlterar;

    @FXML private void inserir() {
        anchorPaneIncluir.setVisible(true);
    }
    @FXML private void alterar() {
        anchorPaneAlterar.setVisible(true);
    }

    @FXML private void cancelarInserir(){
        anchorPaneIncluir.setVisible(false);
    }
    @FXML private void cancelarAlterar(){
        anchorPaneAlterar.setVisible(false);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {   
    }
    
}
