package Model;

/**
 * Created by Alejandro on 2017-04-14.
 */
public class Pagina {
    private String nomPag;
    private String ai;

    public Pagina(String nomPag, String ai) {
        this.nomPag = nomPag;
        this.ai = ai;
    }

    public String getNomPag() {
        return nomPag;
    }

    public void setNomPag(String nomPag) {
        this.nomPag = nomPag;
    }

    public String getAi() {
        return ai;
    }

    public void setAi(String ai) {
        this.ai = ai;
    }

    @Override
    public boolean equals(Object o) {
        if (this.nomPag == o) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Pagina{" +
                "nomPag='" + nomPag + '\'' +
                ", ai='" + ai + '\'' +
                '}';
    }
}
