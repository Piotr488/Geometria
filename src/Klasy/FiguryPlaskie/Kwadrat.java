package Klasy.FiguryPlaskie;

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
        return 4*a;
    }


}
