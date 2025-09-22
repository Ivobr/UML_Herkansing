package code;

public class DFabriek implements AutoFabriek{
    @Override
    public BenzineAuto createBenzineAuto(Color color) {
        return new DAutoBenzine(color);
    }

    @Override
    public ElektrischeAuto createElektrischeAuto(Color color) {
        return new DAutoElektrisch();
    }
}
