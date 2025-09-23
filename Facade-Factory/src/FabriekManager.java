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

    public void makeBMW(AutoFabriek fabriek){
        BenzineAuto BMW = fabriek.createBenzineAuto();
    }
}
