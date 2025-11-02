package code;

public class BMW implements AutoMerk {

    private FabriekManager GoedkoopManager;
    private FabriekManager DuurManager;
    private String merkNaam = "BMW";

    @Override
    public String getMerk() {
        return merkNaam;
    }

    @Override
    public void setManagers(FabriekManager GManager, FabriekManager DManager) {
        GoedkoopManager = GManager;
        DuurManager = DManager;
        System.out.println(DuurManager + " " + GoedkoopManager);
    }

    @Override
    // Maak goedkoop of dure benzine auto aan, gebaseerd op budget wordt bepaald of goedkope of dure auto is
    public BenzineAuto UitstootMaken(float budget, Color kleur, AutoMerk merk) {
        if (budget < 30000) {
            BenzineAuto benzineAuto = GoedkoopManager.makeBenzineAuto(GoedkoopManager.getFabriek(), kleur, merk);
            benzineAuto.informatie();
            return benzineAuto;
        } else if (budget > 30000) {
            BenzineAuto benzineAuto = DuurManager.makeBenzineAuto(DuurManager.getFabriek(), kleur, merk);
            benzineAuto.informatie();
            return benzineAuto;
        }
        return null;
    }

    @Override
// Maak goedkoop of dure elektrische auto aan, gebaseerd op budget wordt bepaald of goedkope of dure auto is
    public ElektrischeAuto ZuinigMaken(float budget, Color kleur, AutoMerk merk) {
        if (budget < 30000) {
            ElektrischeAuto elektrischeAuto = GoedkoopManager.makeElektrischeAuto(GoedkoopManager.getFabriek(), kleur, merk);
            elektrischeAuto.informatie();
            return elektrischeAuto;
        } else if (budget > 30000) {
            ElektrischeAuto elektrischeAuto = DuurManager.makeElektrischeAuto(DuurManager.getFabriek(), kleur, merk);
            elektrischeAuto.informatie();
            return elektrischeAuto;
        }
        return null;
    }
}
