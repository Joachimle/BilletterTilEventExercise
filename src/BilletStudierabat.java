public class BilletStudierabat implements Billet{

    private int billetID;
    private double prisStudie;
    private int dageTilEvent;
    private String studieID;

    public BilletStudierabat(int billetID, int dageTilEvent, String studieID) {
        this.billetID = billetID;
        prisStudie = billetPris();
        this.dageTilEvent = dageTilEvent;
        this.studieID = studieID;
    }

    @Override
    public double billetPris() {
        if (dageTilEvent >= 10){
            return prisStudie*0.85;
        }
        return prisStudie;
    }

    @Override
    public String toString() {
        return "Studiebillet{" +
                "Billet ID=" + billetID +
                "Billetpris=" + prisStudie +
                ", studieID='" + studieID + '\'' +
                "Husk at medbringe dit studiekort til eventet!" +
                '}';
    }
}
