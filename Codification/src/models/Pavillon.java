package models;

public class Pavillon {
    public int idpav;
    public int getIdpav() {
        return idpav;
    }

    public void setIdpav(int idpav) {
        this.idpav = idpav;
    }

    private int nbreDetages;
    private int numPav;


    public int getNumPav() {
        return numPav;
    }

    public void setNumPav(int numPav) {
        this.numPav = numPav;
    }

    public int getNbreDetages() {
        return nbreDetages;
    }

    public void setNbreDetages(int nbreDetages) {
        this.nbreDetages = nbreDetages;
    }

    @Override
    public String toString() {
        return "Pavillon [idpav=" + idpav + ", nbreDetages=" + nbreDetages + ", numPav=" + numPav + "]";
    }

 
}
