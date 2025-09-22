public class Blue implements Color{
    private String color = "Blue";
    @Override
    public String colorName(){
        this.color = color;
        return color;
    }
}
