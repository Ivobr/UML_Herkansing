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
        BenzineAuto benzineAuto = fabriek.createBenzineAuto(kleur);
        System.out.println("Benzine auto gemaakt");
        benzineAuto.informatie();
        this.benzineAuto = benzineAuto;
        return benzineAuto;
    }

    public ElektrischeAuto makeElektrischeAuto(AutoFabriek fabriek, Color kleur){
        ElektrischeAuto elektrischeAuto = fabriek.createElektrischeAuto(kleur);
        System.out.println("Elektrische auto gemaakt");
        elektrischeAuto.informatie();
        this.elektrischeAuto = elektrischeAuto;
        return elektrischeAuto;
    }

    public AutoFabriek getFabriek() {
        return fabriek;
    }

    public void rij(){
        benzineAuto.vroom();
        elektrischeAuto.zoom();
    }

    public void informatie(){
        benzineAuto.informatie();
        System.out.println(" ");
        elektrischeAuto.informatie();
        System.out.println(" ");
    }
}
