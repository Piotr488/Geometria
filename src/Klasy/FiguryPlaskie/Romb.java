package Klasy.FiguryPlaskie;

public class Romb extends FiguryPlaskie {
    public Romb(double e, double f, double a) {
        this.e = e;
        this.f = f;
        this.a = a;
    }

    @Override
    public double pole() {
        return (e*f)/2;
    }

    @Override
    public double obwod() {
        return 4*a;
    }
}
