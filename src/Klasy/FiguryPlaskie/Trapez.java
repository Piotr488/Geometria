package Klasy.FiguryPlaskie;

public class Trapez extends FiguryPlaskie {
    public Trapez(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    @Override
    public double pole() {
        return (a+b)*h/2;
    }

    @Override
    public double obwod() {
        return a+b+c+d;
    }
}
