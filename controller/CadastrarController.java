package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class CadastrarController implements Initializable{
    @FXML AnchorPane anchorPane;

    @FXML private void cancelar() {
        anchorPane.setVisible(false);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        
    }
    
}
