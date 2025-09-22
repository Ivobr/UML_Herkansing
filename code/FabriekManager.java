package code;

public class FabriekManager {

    private BenzineAuto benzineAuto;
    private ElektrischeAuto elektrischeAuto;

    public FabriekManager(AutoFabriek fabriek){
        benzineAuto = fabriek.createBenzineAuto(new Red());
        elektrischeAuto = fabriek.createElektrischeAuto(new Red());
    }


    public void rij(){
        benzineAuto.vroom();
        benzineAuto.informatie();
        elektrischeAuto.zoom();
        elektrischeAuto.informatie();
    }
}
