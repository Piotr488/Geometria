package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;

public class Controller {
    @FXML
    RadioButton rb_figuryPlaskie;
    @FXML
    RadioButton rb_figuryPrzestrzenne;
    @FXML
    ComboBox cb_wyborFigury;
    @FXML
    ComboBox cb_jednostki;

    ObservableList<String> figuryPlaskie =  FXCollections.observableArrayList("Kwadrat","Trojkat","Prostokat","Trapez");
    ObservableList<String> figuryPrzestrzenne =  FXCollections.observableArrayList("Szescian","Stozek","Kula");

    ObservableList<String> jednostki =  FXCollections.observableArrayList("cm","mm");

    public void initialize(){
        cb_wyborFigury.setItems(figuryPlaskie);
        cb_jednostki.setItems(jednostki);

        cb_wyborFigury.getSelectionModel().selectFirst();
        cb_jednostki.getSelectionModel().selectFirst();
    }

    public void changeCBContent(){
        if (rb_figuryPrzestrzenne.isSelected()){
            cb_wyborFigury.setItems(figuryPrzestrzenne);
            cb_wyborFigury.getSelectionModel().selectFirst();
        }
        else if (rb_figuryPlaskie.isSelected()){
            cb_wyborFigury.setItems(figuryPlaskie);
            cb_wyborFigury.getSelectionModel().selectFirst();
        }
    }
}
