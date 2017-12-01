package Klasy.FiguryPlaskie;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Rysuj {
    private double cmToPixel = 37.795276;
    private double mmToPixel = 3.7795276;

    public void kwadrat(Pane drawShapePane, ComboBox cb_jednostki, TextField tf_a){
        drawShapePane.getChildren().clear();
        Rectangle r = new Rectangle();
        if (cb_jednostki.getSelectionModel().getSelectedIndex() == 0) {
            r.setWidth(Double.parseDouble(tf_a.getText()) * cmToPixel);
            r.setHeight(Double.parseDouble(tf_a.getText()) * cmToPixel);
        }
        else if (cb_jednostki.getSelectionModel().getSelectedIndex() == 1){
            r.setWidth(Double.parseDouble(tf_a.getText()) * mmToPixel);
            r.setHeight(Double.parseDouble(tf_a.getText()) * mmToPixel);
        }
        r.setFill(null);
        r.setStroke(Color.BLACK);
        r.setStrokeWidth(2);
        r.setX(drawShapePane.getWidth()/2-r.getWidth()/2);
        r.setY(drawShapePane.getHeight()/2-r.getHeight()/2);

        Label l_a = new Label( tf_a.getText() + "cm");

        l_a.setLayoutX(drawShapePane.getWidth()/2);
        l_a.setLayoutY(drawShapePane.getHeight()/2+r.getHeight()/2+10);

        Label l_b = new Label( tf_a.getText() + "cm");

        l_b.setLayoutX(drawShapePane.getWidth()/2+r.getWidth()/2+10);
        l_b.setLayoutY(drawShapePane.getHeight()/2);

        drawShapePane.getChildren().addAll(r,l_a,l_b);
    }
    public void prostokat(Pane drawShapePane, ComboBox cb_jednostki, TextField tf_a, TextField tf_b){
        drawShapePane.getChildren().clear();
        Rectangle r = new Rectangle();
        if (cb_jednostki.getSelectionModel().getSelectedIndex() == 0) {
            r.setWidth(Double.parseDouble(tf_a.getText()) * cmToPixel);
            r.setHeight(Double.parseDouble(tf_b.getText()) * cmToPixel);
        }
        else if (cb_jednostki.getSelectionModel().getSelectedIndex() == 1){
            r.setWidth(Double.parseDouble(tf_a.getText()) * mmToPixel);
            r.setHeight(Double.parseDouble(tf_b.getText()) * mmToPixel);
        }
        r.setFill(null);
        r.setStroke(Color.BLACK);
        r.setStrokeWidth(2);
        r.setX(drawShapePane.getWidth()/2-r.getWidth()/2);
        r.setY(drawShapePane.getHeight()/2-r.getHeight()/2);

        Label l_a = new Label( tf_a.getText() + "cm");

        l_a.setLayoutX(drawShapePane.getWidth()/2);
        l_a.setLayoutY(drawShapePane.getHeight()/2+r.getHeight()/2+10);

        Label l_b = new Label( tf_b.getText() + "cm");

        l_b.setLayoutX(drawShapePane.getWidth()/2+r.getWidth()/2+10);
        l_b.setLayoutY(drawShapePane.getHeight()/2);

        drawShapePane.getChildren().addAll(r,l_a,l_b);
    }
    public void rownoleglobok(Pane drawShapePane, ComboBox cb_jednostki, TextField tf_a ,TextField tf_b, TextField tf_h){
        drawShapePane.getChildren().clear();

        double x = Math.sqrt(Double.parseDouble(tf_b.getText())*Double.parseDouble(tf_b.getText()) - Double.parseDouble(tf_h.getText())*Double.parseDouble(tf_h.getText()));

        Polygon p = new Polygon();
        Label l_a = new Label();
        Label l_b = new Label();

        if (cb_jednostki.getSelectionModel().getSelectedIndex() == 0) {
            p.getPoints().addAll(x * cmToPixel, 0.0, Double.parseDouble(tf_a.getText())* cmToPixel + x * cmToPixel, 0.0, Double.parseDouble(tf_a.getText()) * cmToPixel, Double.parseDouble(tf_h.getText()) * cmToPixel, 0.0, Double.parseDouble(tf_h.getText()) * cmToPixel);
            p.setLayoutX(drawShapePane.getWidth()/2-((Double.parseDouble(tf_a.getText()) * cmToPixel + x * cmToPixel) / 2));
            p.setLayoutY(drawShapePane.getHeight()/2-(Double.parseDouble(tf_h.getText()) * cmToPixel) / 2);

            l_a.setText(tf_a.getText() + "cm");
            l_a.setLayoutX(drawShapePane.getWidth()/2-((Double.parseDouble(tf_a.getText()) + x) / 2));
            l_a.setLayoutY(drawShapePane.getHeight()/2-(Double.parseDouble(tf_h.getText())) / 2);

            l_b.setText(tf_b.getText() + "cm");
            l_b.setLayoutX(drawShapePane.getWidth()/2-((Double.parseDouble(tf_a.getText()) + x) / 2));
            l_b.setLayoutY(drawShapePane.getHeight()/2-(Double.parseDouble(tf_h.getText())) / 2);
        }
        else if (cb_jednostki.getSelectionModel().getSelectedIndex() == 1){
            p.getPoints().addAll(x * mmToPixel, 0.0, Double.parseDouble(tf_a.getText())* mmToPixel + x * mmToPixel, 0.0, Double.parseDouble(tf_a.getText()) * mmToPixel, Double.parseDouble(tf_h.getText()) * mmToPixel, 0.0, Double.parseDouble(tf_h.getText()) * mmToPixel);
            p.setLayoutX(drawShapePane.getWidth()/2-((Double.parseDouble(tf_a.getText()) * mmToPixel + x * mmToPixel) / 2));
            p.setLayoutY(drawShapePane.getHeight()/2-(Double.parseDouble(tf_h.getText()) * mmToPixel) / 2);
        }
        p.setFill(null);
        p.setStroke(Color.BLACK);
        p.setStrokeWidth(2);


        drawShapePane.getChildren().addAll(p,l_a,l_b);
    }
    public void kolo (Pane drawShapePane, ComboBox cb_jednostki, TextField tf_r){
        drawShapePane.getChildren().clear();

        Circle c = new Circle();
        if (cb_jednostki.getSelectionModel().getSelectedIndex() == 0) {
            c.setRadius(Double.parseDouble(tf_r.getText()) * cmToPixel);
        }
        else if (cb_jednostki.getSelectionModel().getSelectedIndex() == 1){
            c.setRadius(Double.parseDouble(tf_r.getText()) * mmToPixel);
        }
        c.setFill(null);
        c.setStroke(Color.BLACK);
        c.setStrokeWidth(2);

        c.setCenterX(drawShapePane.getWidth()/2);
        c.setCenterY(drawShapePane.getHeight()/2);

        drawShapePane.getChildren().add(c);
    }
    public void trojkat(Pane drawShapePane, ComboBox cb_jednostki, TextField tf_a, TextField tf_b, TextField tf_c, TextField tf_h){
        drawShapePane.getChildren().clear();

        Polygon p = new Polygon();
        if (cb_jednostki.getSelectionModel().getSelectedIndex() == 0) {
        p.getPoints().addAll(0.0, Double.parseDouble(tf_h.getText()) * cmToPixel, Double.parseDouble(tf_a.getText()) * cmToPixel, Double.parseDouble(tf_h.getText()) * cmToPixel, Double.parseDouble(tf_a.getText()) * cmToPixel / 2, 0.0);
            p.setLayoutX(drawShapePane.getWidth()/2-((Double.parseDouble(tf_a.getText()) * cmToPixel) / 2));
            p.setLayoutY(drawShapePane.getHeight()/2-(Double.parseDouble(tf_h.getText()) * cmToPixel) / 2);
        }
        else if (cb_jednostki.getSelectionModel().getSelectedIndex() == 1){
        p.getPoints().addAll(0.0, Double.parseDouble(tf_h.getText()) * mmToPixel, Double.parseDouble(tf_a.getText()) * mmToPixel, Double.parseDouble(tf_h.getText()) * mmToPixel, Double.parseDouble(tf_a.getText()) * mmToPixel / 2, 0.0);
        p.setLayoutX(drawShapePane.getWidth()/2-((Double.parseDouble(tf_a.getText()) * mmToPixel) / 2));
        p.setLayoutY(drawShapePane.getHeight()/2-(Double.parseDouble(tf_h.getText()) * mmToPixel) / 2);
        }
        p.setFill(null);
        p.setStroke(Color.BLACK);
        p.setStrokeWidth(2);

        drawShapePane.getChildren().add(p);
    }
}
