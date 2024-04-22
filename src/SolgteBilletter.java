import java.util.ArrayList;

public class SolgteBilletter {

    ArrayList<Billet> solgteBilletter = new ArrayList<>();


    public void tilføjSolgtBillet(Billet billet){
        solgteBilletter.add(billet);
    }

    public void antalBilletterPrType(){}

    public Billet hentAlleStudiekortId(){
        return null;
    }


    @Override
    public String toString() {
        for (Billet billet : solgteBilletter){
            System.out.println(billet);
        }
        return "";
    }
}
