package code;

public class Audi implements AutoMerk {

    private FabriekManager GoedkoopManager;
    private FabriekManager DuurManager;
    private String merk = "Audi";

    @Override
    public String getMerk() {
        return merk;
    }

    @Override
    public void setManagers(FabriekManager GManager, FabriekManager DManager) {
        GoedkoopManager = GManager;
        DuurManager = DManager;
        System.out.println(DuurManager + " " + GoedkoopManager);
    }

    @Override
    // Maak goedkoop of dure beinzine auto aan, gebaseerd op budget wordt bepaald of goedkope of dure auto is
    public BenzineAuto UitstootMaken(float budget, Color kleur, AutoMerk merk) {
        if (budget < 30000) {
            BenzineAuto benzineAuto = GoedkoopManager.makeBenzineAuto(GoedkoopManager.getFabriek(), kleur, merk);
            return benzineAuto;
        } else if (budget > 30000) {
            BenzineAuto benzineAuto = DuurManager.makeBenzineAuto(DuurManager.getFabriek(), kleur, merk);
            return benzineAuto;
        }
        return null;
    }

    @Override
    public ElektrischeAuto ZuinigMaken(float budget, Color kleur, AutoMerk merk) {
        // Maak goedkoop of dure elektrische auto aan, gebaseerd op budget wordt bepaald of goedkope of dure auto is
        if (budget < 30000) {
            ElektrischeAuto elektrischeAuto = GoedkoopManager.makeElektrischeAuto(GoedkoopManager.getFabriek(), kleur, merk);
            return elektrischeAuto;
        } else if (budget > 30000) {
            ElektrischeAuto elektrischeAuto = DuurManager.makeElektrischeAuto(DuurManager.getFabriek(), kleur, merk);
            return elektrischeAuto;
        }
        return null;
    }
}
