package code;

public class GFabriek implements AutoFabriek {
    @Override
    public BenzineAuto createBenzineAuto(Color color) {
        return new GAutoBenzine(color);
    }

    @Override
    public ElektrischeAuto createElektrischeAuto(Color color) {
        return new GAutoElektrisch();
    }
}