package code.Factory;

public class GFabriek implements AutoFabriek {
    @Override
    public BenzineAuto createBenzineAuto(Color kleur) {
        return new GAutoBenzine(kleur);
    }

    @Override
    public ElektrischeAuto createElektrischeAuto(Color kleur) {
        return new GAutoElektrisch(kleur);
    }
}