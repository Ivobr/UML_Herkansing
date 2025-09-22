package code;

public class FabriekManager {

    private BenzineAuto benzineAuto;
    private ElektrischeAuto elektrischeAuto;
    private String color = "";

    public FabriekManager(AutoFabriek fabriek){
        benzineAuto = fabriek.createBenzineAuto(color);
        elektrischeAuto = fabriek.createElektrischeAuto(color);
    }


    public void rij(){
        benzineAuto.vroom();
        benzineAuto.informatie();
        elektrischeAuto.zoom();
        elektrischeAuto.informatie();
    }
}
