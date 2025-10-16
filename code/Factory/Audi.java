package code.Factory;

public class Audi implements AutoMerk{

    private FabriekManager GoedkoopManager;
    private FabriekManager DuurManager;
    private String merk = "Audi";

    @Override
    public String getMerk() {
        return merk;
    }

    @Override
    public void setManagers(FabriekManager GManager, FabriekManager DManager){
        GoedkoopManager = GManager;
        DuurManager = DManager;
        System.out.println(DuurManager + " " + GoedkoopManager);
    }

    @Override
    public BenzineAuto UitstootMaken(String Klasse, Color kleur, AutoMerk merk){
        System.out.println(merk);
        if(Klasse == "Goedkoop"){
            BenzineAuto benzineAuto = GoedkoopManager.makeBenzineAuto(GoedkoopManager.getFabriek(), kleur, merk);
            benzineAuto.informatie();
            return benzineAuto;
        }else if (Klasse == "Duur") {
            BenzineAuto benzineAuto = DuurManager.makeBenzineAuto(DuurManager.getFabriek(), kleur, merk);
            benzineAuto.informatie();
            return benzineAuto;
        }
        return null;
    }
}
