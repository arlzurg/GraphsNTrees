package sample;

import Model.GrafoAdy;
import Model.Pagina;
import Model.Vertice;
import View.Gooey;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("gooey.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();



    }

/*
    public static void main(String[] args) {
        GrafoAdy<Pagina> g1 = new GrafoAdy<>();
        g1.AgregarVertice(new Vertice<Pagina>(new Pagina("p4","a2")));
        g1.AgregarVertice(new Vertice<Pagina>(new Pagina("p5","a2")));
        g1.AgregarVertice(new Vertice<Pagina>(new Pagina("p7","a2")));

        Pagina p = new Pagina("p3","a1");
        if(p.equals("p3")) System.out.println("WEAQL");
        if (g1.VerticeExiste("p7")) System.out.println("FUNKA");
        launch(args);
    }*/

}
