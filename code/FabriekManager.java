package code;

public class FabriekManager {
    // Fabriek niet maken maar aanroepen!

    private BenzineAuto benzineAuto;
    private ElektrischeAuto elektrischeAuto;
    private AutoFabriek fabriek;

    public FabriekManager(AutoFabriek fabriek) {
        this.fabriek = fabriek;
    }

    public BenzineAuto makeBenzineAuto(AutoFabriek fabriek, Color kleur, AutoMerk merk) {
        this.benzineAuto = fabriek.createBenzineAuto(kleur, merk);
        System.out.println("Benzine auto gemaakt");
        return benzineAuto;
    }

    public ElektrischeAuto makeElektrischeAuto(AutoFabriek fabriek, Color kleur, AutoMerk merk) {
        this.elektrischeAuto = fabriek.createElektrischeAuto(kleur, merk);
        System.out.println("Elektrische auto gemaakt");
        return elektrischeAuto;
    }

    public AutoFabriek getFabriek() {
        return fabriek;
    }


    public void informatie(){
        if(benzineAuto != null) {
            benzineAuto.informatie();
        }
        if (elektrischeAuto != null) {
            elektrischeAuto.informatie();
        }
    }
}
