package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;

public class AlunoController implements Initializable{
    @FXML AnchorPane anchorPane;
    @FXML ComboBox<String> comboBox;

    @FXML private void cancelar(){
        anchorPane.setVisible(false);
    }
    @FXML private void criar(){
        anchorPane.setVisible(true);
    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {     
        quantidade_grupo();
    }   
    private void quantidade_grupo() {
        ObservableList<String> items = FXCollections.observableArrayList(
            "1","2","3","4","5"
        );
        comboBox.setItems(items);
    }

}
