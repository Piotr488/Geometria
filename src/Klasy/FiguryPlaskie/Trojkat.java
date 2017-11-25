package Klasy.FiguryPlaskie;

public class Trojkat extends FiguryPlaskie {
    public Trojkat(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double pole() {
        return 0.5*a*h;
    }

    @Override
    public double obwod() {
        return 0;
    }
}
