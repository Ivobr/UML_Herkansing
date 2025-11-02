package code;

// goedkope fabriek, maakt goedkopeauto's
public class GFabriek implements AutoFabriek {
    @Override
    public BenzineAuto createBenzineAuto(Color kleur, AutoMerk merk) {
        return new GAutoBenzine(kleur, merk);
    }

    @Override
    public ElektrischeAuto createElektrischeAuto(Color kleur, AutoMerk merk) {
        return new GAutoElektrisch(kleur, merk);
    }
}