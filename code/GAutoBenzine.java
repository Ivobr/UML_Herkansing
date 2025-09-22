package code;

public class GAutoBenzine implements BenzineAuto{
    private Color color;
    @Override
    public void vroom() {
        System.out.println("car go vroom");
    }

    public GAutoBenzine(Color color){
        this.color = color;
    }
    @Override
    public void informatie(){
        System.out.println("De kleur is: " + color.colorName());
    }
}
