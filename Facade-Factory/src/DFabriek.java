public class DFabriek implements AutoFabriek {
    @Override
    public BenzineAuto createBenzineAuto() {
        return new DAutoBenzine();
    }

    @Override
    public ElektrischeAuto createElektrischeAuto() {
        return new DAutoElektrisch();
    }
}
