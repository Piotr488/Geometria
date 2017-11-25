package Klasy;

import java.awt.*;

public class Kwadrat extends FiguryPlaskie {

    public Kwadrat(double a) {
        this.a = a;
    }

    @Override
    public double pole() {
        return a*a;
    }

    @Override
    public double obwod() {
        return 0;
    }


}
