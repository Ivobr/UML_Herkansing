package code;

public class GFabriek implements AutoFabriek {
    @Override
    public BenzineAuto createBenzineAuto() {
        return new GAutoBenzine();
    }

    @Override
    public ElektrischeAuto createElektrischeAuto() {
        return new GAutoElektrisch();
    }
}