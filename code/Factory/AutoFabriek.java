package code.Factory;


public interface AutoFabriek {
    BenzineAuto createBenzineAuto(Color kleur);
    ElektrischeAuto createElektrischeAuto(Color kleur);
}
