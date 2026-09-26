package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class login_page_controler {

    @FXML
    private Button btnsubmit;

    public void sub01OnAction(ActionEvent actionEvent) {
        System.out.println("Submit the Button!");
    }

    public void btnOnAction(ActionEvent actionEvent) {
        System.out.println("New Button");
    }
}
