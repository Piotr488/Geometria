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

    @Override
    public void displayResult(TextField tf_pole, TextField tf_obwod) {
        tf_pole.setText(""+pole());
        tf_obwod.setText(""+obwod());
    }
}
