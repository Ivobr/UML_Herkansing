package code.Factory;


public interface AutoFabriek {
    BenzineAuto createBenzineAuto(Color kleur, AutoMerk merk);
    ElektrischeAuto createElektrischeAuto(Color kleur, AutoMerk merk);
}
