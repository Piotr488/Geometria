package Klasy.FiguryPlaskie;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class Oblicz {

    private DecimalFormat df = new DecimalFormat("#.###");


    public void obliczKolo(TextField tf_r, TextField tf_pole, TextField tf_obwod){
        Kolo kolo = new Kolo(Double.parseDouble(tf_r.getText()));
        tf_pole.setText("" + df.format(kolo.pole()));
        tf_obwod.setText("" + df.format(kolo.obwod()));
    }
    public void obliczKwadrat(TextField tf_a, TextField tf_pole, TextField tf_obwod){
        Kwadrat kwadrat = new Kwadrat(Double.parseDouble(tf_a.getText()));
        tf_pole.setText("" + df.format(kwadrat.pole()));
        tf_obwod.setText("" + df.format(kwadrat.obwod()));
    }
    public void obliczProstokat(TextField tf_a, TextField tf_b, TextField tf_pole, TextField tf_obwod){
            Prostokat prostokat = new Prostokat(Double.parseDouble(tf_a.getText()), Double.parseDouble(tf_b.getText()));
            tf_pole.setText("" + df.format(prostokat.pole()));
            tf_obwod.setText("" + df.format(prostokat.obwod()));
    }
    public void obliczRomb(TextField tf_a, TextField tf_e, TextField tf_f, TextField tf_pole, TextField tf_obwod){
        Romb romb = new Romb(Double.parseDouble(tf_a.getText()), Double.parseDouble(tf_e.getText()), Double.parseDouble(tf_f.getText()));
        tf_pole.setText("" + df.format(romb.pole()));
        tf_obwod.setText("" + df.format(romb.obwod()));
    }
    public void obliczRownoleglobok(TextField tf_a, TextField tf_b, TextField tf_h, TextField tf_pole, TextField tf_obwod){
        Rownoleglobok rownoleglobok = new Rownoleglobok(Double.parseDouble(tf_a.getText()), Double.parseDouble(tf_b.getText()), Double.parseDouble(tf_h.getText()));
        tf_pole.setText("" + df.format(rownoleglobok.pole()));
        tf_obwod.setText("" + df.format(rownoleglobok.obwod()));
    }
    public void obliczTrapez(TextField tf_a, TextField tf_b, TextField tf_c, TextField tf_d, TextField tf_h, TextField tf_pole, TextField tf_obwod){
        Trapez trapez = new Trapez(Double.parseDouble(tf_a.getText()),Double.parseDouble(tf_b.getText()),Double.parseDouble(tf_c.getText()),Double.parseDouble(tf_d.getText()),Double.parseDouble(tf_h.getText()));
        tf_pole.setText("" + df.format(trapez.pole()));
        tf_obwod.setText("" + df.format(trapez.obwod()));
    }
    public void obliczTrojkat(TextField tf_a, TextField tf_b, TextField tf_c, TextField tf_h, TextField tf_pole, TextField tf_obwod){
        Trojkat trojkat = new Trojkat(Double.parseDouble(tf_a.getText()),Double.parseDouble(tf_b.getText()),Double.parseDouble(tf_c.getText()),Double.parseDouble(tf_h.getText()));
        tf_pole.setText("" + df.format(trojkat.pole()));
        tf_obwod.setText("" + df.format(trojkat.obwod()));
    }
    public boolean validateString(TextField... args) {
        for (TextField arg : args){
            if (!arg.getText().matches("\\d+|\\d+[.]\\d+")){
                return false;
            }
        }
        return true;
    }

}
