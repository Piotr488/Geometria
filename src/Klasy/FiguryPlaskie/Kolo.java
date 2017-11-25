package Klasy.FiguryPlaskie;

public class Kolo extends FiguryPlaskie {
    public Kolo(double r) {
        this.r = r;
    }

    @Override
    public double pole() {
        return pi*r*r;
    }

    @Override
    public double obwod() {
        return 2*pi*r;
    }
}
