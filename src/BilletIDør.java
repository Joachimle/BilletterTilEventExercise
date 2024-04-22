public class BilletIDør implements Billet{

    private int billetID;
    private double prisDør;

    public BilletIDør(int billetID) {
        this.billetID = billetID;
        prisDør = billetPris();
    }

    @Override
    public double billetPris() {
        return prisDør;
    }

    @Override
    public String toString() {
        return "Billet købt i dør{" +
                "Billet ID=" + billetID +
                "Billetpris=" + prisDør +
                '}';
    }
}
