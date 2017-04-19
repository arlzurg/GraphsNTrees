package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alejandro on 2017-04-14.
 */
public class Vertice<D> {
    private D dato;
    private List<Arista<Vertice>> aristaList;

    public Vertice(D dato) {
        this.setDato(dato);
        setAristaList(new ArrayList<>());
    }

    public D getDato() {
        return dato;
    }

    public void setDato(D dato) {
        this.dato = dato;
    }

    public List<Arista<Vertice>> getAristaList() {
        return aristaList;
    }

    public void setAristaList(List<Arista<Vertice>> aristaList) {
        this.aristaList = aristaList;
    }

    public boolean Coincide(String p1){
        return dato.equals(p1);
    }
}
