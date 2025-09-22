package code.Factory;

import code.Factory.AutoFabriek;
import code.Factory.BenzineAuto;
import code.Factory.ElektrischeAuto;

public class FabriekManager {

    private BenzineAuto benzineAuto;
    private ElektrischeAuto elektrischeAuto;

    public FabriekManager(AutoFabriek fabriek){
        benzineAuto = fabriek.createBenzineAuto();
        elektrischeAuto = fabriek.createElektrischeAuto();
    }


    public void rij(){
        benzineAuto.vroom();
        elektrischeAuto.zoom();
    }
}
