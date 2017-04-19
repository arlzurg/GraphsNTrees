package Controller;

/**
 * Created by Alejandro on 2017-04-14.
 */

import Model.GrafoAdy;
import Model.Pagina;
import Model.Vertice;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;

import java.awt.*;

import static java.lang.Math.abs;
import static java.lang.Math.random;

public class ControllerGooey {

    @FXML
    private Pane Panel;

    @FXML
    private ListView<Pagina> ListView1;

    GrafoAdy<Pagina> g1 = new GrafoAdy<>();
    //ObservableList<Pagina> obsPag = FXCollections.observableArrayList(g1.getData());

    public void newPageClicked(){
        int n=Panel.getChildren().size();
        StackPane s1 = new StackPane();


        String nom = "p"+ (n+1);
        Label label = new Label(nom,new Circle());
        label.setFont(javafx.scene.text.Font.font(16));

        g1.AgregarVertice(new Vertice<Pagina>(new Pagina(nom,"a2")));

        double nx,ny;

        nx=random()*560;
        ny=random()*560;

        if(!Panel.getChildren().isEmpty()){
            System.out.println("nx: "+nx+"ny: "+ny);
            boolean well=false;
            while(!well){
                well=true;
                for(int i=0;i<n;i++){
                    StackPane sc = (StackPane)Panel.getChildren().get(i);
                    if(abs(sc.getLayoutY()-ny)<150 && abs(sc.getLayoutX()-nx)<150){
                        well = false;
                    }
                }
                if(!well) {
                    nx = random() * 580;
                    ny = random() * 580;
                }
            }

        }
        Circle cv = new Circle(40,Color.AQUAMARINE);
        s1.getChildren().addAll(cv,label);
        s1.setLayoutX(nx);
        s1.setLayoutY(ny);

        Panel.getChildren().add(s1);
        System.out.println("CIRCLES ="+(n+1));
    }

    public void listPagesClicked(){
        System.out.println("B2 CLICKED");
        int n = g1.getVertices().size();
        System.out.println(n);
        //jSystem.out.println(obsPag);
        for (int i=0;i<n;i++){
            ListView1.setItems(FXCollections.observableArrayList(g1.getData()));
        }

    }
}
