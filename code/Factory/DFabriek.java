package code.Factory;

public class DFabriek implements AutoFabriek {
    @Override
    public BenzineAuto createBenzineAuto(Color kleur) {
        return new DAutoBenzine(kleur);
    }

    @Override
    public ElektrischeAuto createElektrischeAuto(Color kleur) {
        return new DAutoElektrisch(kleur);
    }
}
