package code.Factory;

import code.Factory.AutoFabriek;
import code.Factory.BenzineAuto;
import code.Factory.ElektrischeAuto;

public class FabriekManager {

    private BenzineAuto benzineAuto;
    private ElektrischeAuto elektrischeAuto;

    public FabriekManager(AutoFabriek fabriek, Color kleur){
        benzineAuto = fabriek.createBenzineAuto(kleur);
        elektrischeAuto = fabriek.createElektrischeAuto(kleur);
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
