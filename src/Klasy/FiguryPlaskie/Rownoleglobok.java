package Klasy.FiguryPlaskie;

public class Rownoleglobok extends FiguryPlaskie {
    public Rownoleglobok(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double pole() {
        return a*h;
    }

    @Override
    public double obwod() {

        return 2*a+2*b;
    }
}
