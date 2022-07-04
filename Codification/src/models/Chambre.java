package models;

public class Chambre {
    private int id;
    private int numEtage;
    private int numChambre;
    private TypeChambre type;
    private Pavillon pavillon;

    public Pavillon getPavillon() {
        return pavillon;
    }

    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    }

    public TypeChambre getType() {
        return type;
    }

    public void setType(TypeChambre type) {
        this.type = type;
    }

    public int getNumChambre() {
        return numChambre;
    }

    public void setNumChambre(int numChambre) {
        this.numChambre = numChambre;
    }

    public int getNumEtage() {
        return numEtage;
    }

    public void setNumEtage(int numEtage) {
        this.numEtage = numEtage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Chambre [id=" + id + ", numChambre=" + numChambre + ", numEtage=" + numEtage + ", pavillon=" + pavillon.getIdpav()
                + ", type=" + type + "]";
    }

    public void setPavillon(int numPav) {
    }
}
