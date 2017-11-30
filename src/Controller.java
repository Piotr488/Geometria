import Klasy.FiguryPlaskie.Oblicz;
import Klasy.FiguryPlaskie.Rysuj;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

import java.awt.*;

public class Controller {
    @FXML
    RadioButton rb_figuryPlaskie;
    @FXML
    RadioButton rb_figuryPrzestrzenne;
    @FXML
    ComboBox cb_wyborFigury;
    @FXML
    ComboBox cb_jednostki;
    @FXML
    TextField tf_a;
    @FXML
    TextField tf_b;
    @FXML
    TextField tf_c;
    @FXML
    TextField tf_d;
    @FXML
    TextField tf_e;
    @FXML
    TextField tf_f;
    @FXML
    TextField tf_h;
    @FXML
    TextField tf_r;
    @FXML
    TextField tf_pole;
    @FXML
    TextField tf_obwod;
    @FXML
    TextField tf_info;
    @FXML
    Pane drawShapePane;

    Oblicz oblicz = new Oblicz();
    Rysuj rysuj = new Rysuj();

    ObservableList<String> figuryPlaskie =  FXCollections.observableArrayList("Kwadrat","Prostokąt","Równoległobok","Trapez","Romb","Trójkąt","Koło");
    ObservableList<String> figuryPrzestrzenne =  FXCollections.observableArrayList("Sześcian","Stożek","Kula");

    ObservableList<String> jednostki =  FXCollections.observableArrayList("cm","mm");

    public void initialize(){
        cb_wyborFigury.setItems(figuryPlaskie);
        cb_jednostki.setItems(jednostki);

        cb_wyborFigury.getSelectionModel().selectFirst();
        cb_jednostki.getSelectionModel().selectFirst();

        disableAllTF();
        tf_a.setDisable(false);
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
    public void setup() {
        if (rb_figuryPlaskie.isSelected()) {
            switch (cb_wyborFigury.getSelectionModel().getSelectedIndex()) {
                case 0:
                    disableAllTF();
                    tf_a.setDisable(false);
                    break;
                case 1:
                    disableAllTF();
                    tf_a.setDisable(false);
                    tf_b.setDisable(false);
                    break;
                case 2:
                    disableAllTF();
                    tf_a.setDisable(false);
                    tf_b.setDisable(false);
                    tf_h.setDisable(false);
                    break;
                case 3:
                    disableAllTF();
                    tf_a.setDisable(false);
                    tf_b.setDisable(false);
                    tf_c.setDisable(false);
                    tf_d.setDisable(false);
                    tf_h.setDisable(false);
                    break;
                case 4:
                    disableAllTF();
                    tf_a.setDisable(false);
                    tf_e.setDisable(false);
                    tf_f.setDisable(false);
                    break;
                case 5:
                    disableAllTF();
                    tf_a.setDisable(false);
                    tf_b.setDisable(false);
                    tf_c.setDisable(false);
                    tf_h.setDisable(false);
                    break;
                case 6:
                    disableAllTF();
                    tf_r.setDisable(false);
                    break;
            }
        }
    }
    private void disableAllTF() {
        tf_a.setDisable(true);
        tf_a.clear();
        tf_b.setDisable(true);
        tf_b.clear();
        tf_c.setDisable(true);
        tf_c.clear();
        tf_d.setDisable(true);
        tf_d.clear();
        tf_e.setDisable(true);
        tf_e.clear();
        tf_f.setDisable(true);
        tf_f.clear();
        tf_h.setDisable(true);
        tf_h.clear();
        tf_r.setDisable(true);
        tf_r.clear();
    }

   public void wynik(){
       if (rb_figuryPlaskie.isSelected()) {
           switch (cb_wyborFigury.getSelectionModel().getSelectedIndex()) {
               case 0:
                   if (oblicz.validateString(tf_a)) {
                       oblicz.obliczKwadrat(tf_a, tf_pole, tf_obwod);
                       tf_info.setText("Obliczono pole i obwód Kwadratu");
                       rysuj.kwadrat(drawShapePane,tf_a);
                       break;
                   } else {
                       tf_info.setText("Niepoprawne dane");
                       tf_pole.clear();
                       tf_obwod.clear();
                       break;
                   }
               case 1:
                   if (oblicz.validateString(tf_a,tf_b)) {
                       oblicz.obliczProstokat(tf_a, tf_b, tf_pole, tf_obwod);
                       tf_info.setText("Obliczono pole i obwód Prostokątu");
                       rysuj.prostokat(drawShapePane,tf_a,tf_b);
                       break;
                   }
                   else {
                       tf_info.setText("Niepoprawne dane");
                       tf_pole.clear();
                       tf_obwod.clear();
                       break;
                   }
               case 2:
                   if (oblicz.validateString(tf_a,tf_b,tf_h)) {
                       oblicz.obliczRownoleglobok(tf_a,tf_b,tf_h,tf_pole,tf_obwod);
                       tf_info.setText("Obliczono pole i obwód Równoległoboku");
                       break;
                   }
                   else {
                       tf_info.setText("Niepoprawne dane");
                       tf_pole.clear();
                       tf_obwod.clear();
                       break;
                   }
               case 3:
                   if (oblicz.validateString(tf_a,tf_b,tf_c,tf_d,tf_h)) {
                       oblicz.obliczTrapez(tf_a,tf_b,tf_c,tf_d,tf_h,tf_pole,tf_obwod);
                       tf_info.setText("Obliczono pole i obwód Trapezu");
                       break;
                   }
                   else {
                       tf_info.setText("Niepoprawne dane");
                       tf_pole.clear();
                       tf_obwod.clear();
                       break;
                   }
               case 4:
                   if (oblicz.validateString(tf_a,tf_e,tf_f)) {
                       oblicz.obliczRomb(tf_a,tf_e,tf_f,tf_pole,tf_obwod);
                       tf_info.setText("Obliczono pole i obwód Rombu");
                       break;
                   }
                   else {
                       tf_info.setText("Niepoprawne dane");
                       tf_pole.clear();
                       tf_obwod.clear();
                       break;
                   }
               case 5:
                   if (oblicz.validateString(tf_a,tf_b,tf_c,tf_h)) {
                       oblicz.obliczTrojkat(tf_a,tf_b,tf_c,tf_h,tf_pole,tf_obwod);
                       tf_info.setText("Obliczono pole i obwód Trójkąta");
                       break;
                   }
                   else {
                       tf_info.setText("Niepoprawne dane");
                       tf_pole.clear();
                       tf_obwod.clear();
                       break;
                   }
               case 6:
                   if (oblicz.validateString(tf_r)) {
                       oblicz.obliczKolo(tf_r,tf_pole,tf_obwod);
                       tf_info.setText("Obliczono pole i obwód Koła");
                       break;
                   }
                   else {
                       tf_info.setText("Niepoprawne dane");
                       tf_pole.clear();
                       tf_obwod.clear();
                       break;
                   }
           }
       }
       System.out.println(cb_wyborFigury.getSelectionModel().getSelectedItem());
   }
}

