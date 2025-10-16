package code.Factory;

public interface AutoMerk {
    String getMerk();
   void setManagers(FabriekManager GManager, FabriekManager DManager);
   BenzineAuto UitstootMaken(int belastingSchaal, Color kleur, AutoMerk merk);
   ElektrischeAuto ZuinigMaken(int belastingSchaal, Color kleur, AutoMerk merk);
}
