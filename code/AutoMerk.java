package code;

// interface voor automerk
public interface AutoMerk {
    String getMerk();

    void setManagers(FabriekManager GManager, FabriekManager DManager);

    BenzineAuto UitstootMaken(float budget, Color kleur, AutoMerk merk);

    ElektrischeAuto ZuinigMaken(float budget, Color kleur, AutoMerk merk);
}
