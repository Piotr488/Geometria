import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

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
    TextField tf_h;
    @FXML
    TextField tf_r;
    @FXML
    GridPane setupPane;

    ObservableList<String> figuryPlaskie =  FXCollections.observableArrayList("Kwadrat","Prostokąt","Rownoleglobok","Trapez","Rab","Trojkat","kolo");
    ObservableList<String> figuryPrzestrzenne =  FXCollections.observableArrayList("Sześcian","Stożek","Kula");

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
    public void setup(){
        Setup set = new Setup();
        TextField tf = new TextField();
        if (cb_wyborFigury.getSelectionModel().getSelectedIndex() == 1){
            set.setKwadrat(setupPane);
        }
//        switch(cb_wyborFigury.getSelectionModel().getSelectedIndex()){
//            case 0: setup.setKwadrat();
//                    break;
//            case 1: disableTextFields();
//                    tf_a.setDisable(false);
//                    tf_b.setDisable(false);
//                    break;
//            case 2: disableTextFields();
//                    tf_a.setEditable(false);
//                    tf_b.setEditable(false);
//                    tf_h.setEditable(false);
//                    break;
//            case 3: disableTextFields();
//                    tf_a.setDisable(false);
//                    tf_b.setDisable(false);
//                    tf_c.setDisable(false);
//                    //tf_d.setDisable(false);
//                    tf_h.setDisable(false);
//                    break;
//            case 4: disableTextFields();
//                    tf_a.setDisable(false);
//                    //tf_e.setDisable(false);
//                    //tf_f.setDisable(false);
//                    break;
//            case 5: disableTextFields();
//                    tf_a.setDisable(false);
//                    tf_b.setDisable(false);
//                    tf_c.setDisable(false);
//                    tf_h.setDisable(false);
//                    break;
//            case 6: disableTextFields();
//                    tf_r.setDisable(false);
//                    break;
//
//        }
        System.out.println(cb_wyborFigury.getSelectionModel().getSelectedItem());
    }
    void disableTextFields(){
        tf_a.setDisable(true);
        tf_b.setDisable(true);
        tf_c.setDisable(true);
        tf_h.setDisable(true);
        tf_r.setDisable(true);
    }
}
