package code.Factory;

public interface AutoMerk {
    void print();
   void setManagers(FabriekManager GManager, FabriekManager DManager);
   BenzineAuto UitstootMaken(String Klasse, Color kleur);
}
