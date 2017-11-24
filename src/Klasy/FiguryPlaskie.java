package Klasy;

import java.awt.*;

public abstract class FiguryPlaskie {
    double a,b,h,r;
    final double pi = Math.PI;

    public abstract double pole();
    public abstract double obwod();
    public abstract void displayResult(TextField tf_pole, TextField tf_obwod);



}
