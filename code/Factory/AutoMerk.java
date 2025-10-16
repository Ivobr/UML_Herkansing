package code.Factory;

public interface AutoMerk {
    String getMerk();
   void setManagers(FabriekManager GManager, FabriekManager DManager);
   BenzineAuto UitstootMaken(String Klasse, Color kleur, AutoMerk merk);
}
