package code;

public class DFabriek implements AutoFabriek {
    @Override
    public BenzineAuto createBenzineAuto(Color kleur, AutoMerk merk) {
        return new DAutoBenzine(kleur, merk);
    }

    @Override
    public ElektrischeAuto createElektrischeAuto(Color kleur, AutoMerk merk) {
        return new DAutoElektrisch(kleur, merk);
    }
}
