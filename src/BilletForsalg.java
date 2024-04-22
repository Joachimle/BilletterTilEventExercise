public class BilletForsalg implements Billet {

    private int billetID;
    private double prisForsalg;
    private int dageTilEvent;

    public BilletForsalg(int billetID, int dageTilEvent) {
        this.billetID = billetID;
        this.prisForsalg = billetPris();
        this.dageTilEvent = dageTilEvent;
    }

    @Override
    public double billetPris() {
        if (dageTilEvent >= 10){
            return prisForsalg*0.85;
        }
        return prisForsalg;
    }

    @Override
    public String toString() {
        return "Forsalgsbillet{" +
                "Billet ID=" + billetID +
                "Billetpris=" + prisForsalg +
                '}';
    }
}
