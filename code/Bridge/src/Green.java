public class Green implements Color{
    private String color = "Green";

    @Override
    public String colorName() {
        this.color = color;
        return color;
    }
}
