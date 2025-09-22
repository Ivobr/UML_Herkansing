public class DAutoBenzine implements BenzineAuto{
    private Color color;
    @Override
    public void vroom() {
        System.out.println("Goes vroom more expensive");
        System.out.println("En de kleur is een mooie dure: " + color.colorName());
    }

    public DAutoBenzine(Color color){
        this.color = color;
    }
}
