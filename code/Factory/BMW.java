package code.Factory;

public class BMW implements AutoMerk{

    private String merk = "BMW";
    private FabriekManager GoedkoopManager;
    private FabriekManager DuurManager;
    private BenzineAuto benzineAuto;
    private ElektrischeAuto elektrischeAuto;

    @Override
    public void print() {
        System.out.println("Van het merk: " + merk);
    }

    public void setManagers(FabriekManager GManager, FabriekManager DManager){
        GoedkoopManager = GManager;
        DuurManager = DManager;
        System.out.println(DuurManager + " " + GoedkoopManager);
    }


    public BenzineAuto UitstootMaken(String Klasse, Color kleur){
        if(Klasse == "Goedkoop"){
            BenzineAuto benzineAuto = GoedkoopManager.makeBenzineAuto(GoedkoopManager.getFabriek(), kleur);
            benzineAuto.informatie();
            return benzineAuto;
        }else if (Klasse == "Duur") {
            BenzineAuto benzineAuto = DuurManager.makeBenzineAuto(DuurManager.getFabriek(), kleur);
            benzineAuto.informatie();
            return benzineAuto;
        }

        return benzineAuto;
    }
}
