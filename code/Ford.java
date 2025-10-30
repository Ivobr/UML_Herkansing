package code;

public class Ford implements AutoMerk{

    private FabriekManager GoedkoopManager;
    private FabriekManager DuurManager;
    private String merk = "Ford";

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
    public BenzineAuto UitstootMaken(int belastingSchaal, Color kleur, AutoMerk merk){
        if(belastingSchaal < 3){
            BenzineAuto benzineAuto = GoedkoopManager.makeBenzineAuto(GoedkoopManager.getFabriek(), kleur, merk);
            benzineAuto.informatie();
            return benzineAuto;
        }else if (belastingSchaal == 3) {
            BenzineAuto benzineAuto = DuurManager.makeBenzineAuto(DuurManager.getFabriek(), kleur, merk);
            benzineAuto.informatie();
            return benzineAuto;
        }
        return null;
    }

    @Override
    public ElektrischeAuto ZuinigMaken(int belastingSchaal, Color kleur, AutoMerk merk){
        if(belastingSchaal < 3){
            ElektrischeAuto elektrischeAuto = GoedkoopManager.makeElektrischeAuto(GoedkoopManager.getFabriek(), kleur, merk);
            elektrischeAuto.informatie();
            return elektrischeAuto;
        }else if (belastingSchaal == 3) {
            ElektrischeAuto elektrischeAuto = DuurManager.makeElektrischeAuto(DuurManager.getFabriek(), kleur, merk);
            elektrischeAuto.informatie();
            return elektrischeAuto;
        }
        return null;
    }
}
