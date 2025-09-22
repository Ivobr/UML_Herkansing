package code;

public class GFabriek implements AutoFabriek {
    @Override
    public BenzineAuto createBenzineAuto(String color) {

        BenzineAuto Vroom = null;
        switch (color) {
            case "Red":
                Vroom = new GAutoBenzine(new Red());
                break;
            case "Blue":
                Vroom = new GAutoBenzine(new Blue());
                break;
            default:
                Vroom = new GAutoBenzine(new Blank());
                break;
        }

        return Vroom;
    }

    @Override
    public ElektrischeAuto createElektrischeAuto(String color) {
        return new GAutoElektrisch(new Red());
    }
}