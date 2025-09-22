package code;

public class DFabriek implements AutoFabriek{
    @Override
    public BenzineAuto createBenzineAuto(String color) {
        return new DAutoBenzine(new Red());
    }

    @Override
    public ElektrischeAuto createElektrischeAuto(String color) {
        return new DAutoElektrisch(new Red());
    }
}
