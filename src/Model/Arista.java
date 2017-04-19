package Model;

/**
 * Created by Alejandro on 2017-04-14.
 */
public  class Arista<V extends Vertice> {
    private V puntero;
    private int peso;

    public Arista(V puntero) {
        this.setPuntero(puntero);
    }

    public V getPuntero() {
        return puntero;
    }

    public void setPuntero(V puntero) {
        this.puntero = puntero;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
