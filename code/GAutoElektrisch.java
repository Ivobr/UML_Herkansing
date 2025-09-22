package code;

public class GAutoElektrisch implements ElektrischeAuto{
    private Color color;
    @Override
    public void zoom() {
        System.out.println("Go zoom");
    }

    @Override
    public void informatie(){}

    public GAutoElektrisch(Color color){
        this.color = color;
    }
}
