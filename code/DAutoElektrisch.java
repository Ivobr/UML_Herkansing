package code;

public class DAutoElektrisch implements ElektrischeAuto{
    private Color color;
    @Override
    public void zoom() {
        System.out.println("Goes zoom more expenisive");
    }

    @Override
    public void informatie(){
        System.out.println(color.colorName());
    }

    public DAutoElektrisch(Color color){
        this.color = color;
    }
}
