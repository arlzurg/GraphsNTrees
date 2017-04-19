package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alejandro on 2017-04-14.
 */
public class GrafoAdy<T> {
    private List<Vertice<T>> vertices = null;

    public GrafoAdy() {
        this.vertices=new ArrayList<>();
    }

    public boolean AgregarVertice(Vertice<T> nue){
        getVertices().add(nue);
        return true;
    }

    public boolean AgregarArista(String p1, String p2){
        VerticeExiste(p1);
        return true;
    }

    public boolean VerticeExiste(String p1) {
        for(int i = 0; i< getVertices().size(); i++){
                if(getVertices().get(i).Coincide(p1)==true){
                    return true;
                }
        }
        return false;
    }

    @Override
    public String toString() {
        return "GrafoAdy{" +
                "vertices=" + getVertices() +
                '}';
    }

    public List<Vertice<T>> getVertices() {
        return vertices;
    }

    public List<T> getData() {
        List<T> list =new ArrayList<>();
        for (Vertice<T> v: vertices
             ) {
            System.out.println("FEACH");
            list.add(v.getDato());
        }

        return list;
    }

}
