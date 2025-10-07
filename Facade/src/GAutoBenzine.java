public class GAutoBenzine implements BenzineAuto {

    private Color kleur;
    private double Productieprijs = 20100;

    @Override
    public void vroom(){
        System.out.println("car go vroom");
    }

    @Override
    public void informatie(){
        System.out.println("Goedkoop");
    }

    public GAutoBenzine(Color kleur){
        this.kleur = kleur;
        Productieprijs += kleur.prijs();
    }
}
