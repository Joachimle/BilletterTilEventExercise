public class Main {
    public static void main(String[] args){
        SolgteBilletter solgteBilletter = new SolgteBilletter();

        solgteBilletter.tilføjSolgtBillet(new BilletIDør(1));
        solgteBilletter.tilføjSolgtBillet(new BilletStudierabat(2, 5, "joel0002"));

        System.out.println(solgteBilletter);

    }
}
