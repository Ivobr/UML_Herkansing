package code.Factory;

import code.Factory.AutoFabriek;
import code.Factory.BenzineAuto;
import code.Factory.ElektrischeAuto;

public class FabriekManager {

    private BenzineAuto benzineAuto;
    private ElektrischeAuto elektrischeAuto;
    private AutoFabriek fabriek;
    private Color kleur;

    public FabriekManager(AutoFabriek fabriek, Color kleur){
        this.fabriek = fabriek;
        this.kleur = kleur;
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
