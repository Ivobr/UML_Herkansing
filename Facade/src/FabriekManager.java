public class FabriekManager {

    private BenzineAuto benzineAuto;
    private ElektrischeAuto elektrischeAuto;
    private AutoFabriek autoFabriek;
    private Color kleur;


    public static void main(String Automerk){
        System.out.println("Ga auto maken a drillers: " + Automerk);
    }

    public FabriekManager(AutoFabriek fabriek, Color kleur){
        this.autoFabriek = fabriek;
        this.kleur = kleur;
    }

    public BenzineAuto makeBenzineAuto(AutoFabriek fabriek, Color kleur){
        this.benzineAuto = fabriek.createBenzineAuto(kleur);
        System.out.println("I'm an stupid bitch that makes benzine cars");
        return benzineAuto;
    }

    public ElektrischeAuto makeElektrischeAuto(AutoFabriek fabriek, Color kleur){
        this.elektrischeAuto = fabriek.createElektrischeAuto(kleur);
        System.out.println("I'm an cheap stupid bitch that makes elektrische cars");
        return elektrischeAuto;
    }

    public AutoFabriek getFabriek(){
        return autoFabriek;
    }

    public void rij(){
        if(benzineAuto != null) {
            benzineAuto.vroom();
        }
        if(elektrischeAuto != null) {
            elektrischeAuto.zoom();
        }
    }

    public void informatie(){
        if(benzineAuto != null) {
            benzineAuto.informatie();
        }
        if(elektrischeAuto != null) {
            elektrischeAuto.informatie();
        }
    }
}
