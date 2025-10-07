public class GAutoElektrisch implements ElektrischeAuto{
    private Color kleur;
    private double ProductiePrijs = 21009;

    @Override
    public void zoom(){
        System.out.println("Go zoom");
    }

    @Override
    public void informatie(){
        System.out.println("Goedkoop elektrisch");
    }

    public GAutoElektrisch(Color kleur){
        this.kleur = kleur;
        ProductiePrijs += kleur.prijs();
    }
}
