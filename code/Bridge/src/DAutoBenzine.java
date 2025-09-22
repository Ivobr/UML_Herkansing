public class DAutoBenzine implements BenzineAuto{
    private Color color;
    @Override
    public void vroom() {
        System.out.println("Goes vroom more expensive");
    }

    @Override
    public void informatie(){
        System.out.println("De specificaties van de auto zijn:");
        System.out.println("• Kleur: " + color.colorName());
    }

    public DAutoBenzine(Color color){
        this.color = color;
    }
}
