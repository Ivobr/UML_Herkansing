package code.Factory;
public class FabriekManager {
    // Fabriek niet maken maar aanroepen!

    private BenzineAuto benzineAuto;
    private ElektrischeAuto elektrischeAuto;
    private AutoFabriek fabriek;
    public FabriekManager(AutoFabriek fabriek){
        this.fabriek = fabriek;
    }

    public BenzineAuto makeBenzineAuto(AutoFabriek fabriek, Color kleur){
        this.benzineAuto = fabriek.createBenzineAuto(kleur);
        System.out.println("Benzine auto gemaakt");
//        benzineAuto.informatie();
        return benzineAuto;
    }

    public ElektrischeAuto makeElektrischeAuto(AutoFabriek fabriek, Color kleur){
        this.elektrischeAuto = fabriek.createElektrischeAuto(kleur);
        System.out.println("Elektrische auto gemaakt");
//        elektrischeAuto.informatie();
        return elektrischeAuto;
    }

    public AutoFabriek getFabriek() {
        return fabriek;
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
