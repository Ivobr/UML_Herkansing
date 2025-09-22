package code.Bridge.src;

public class Blank implements Color{
    private String color = "None";

    private int prijs = 0;

    @Override
    public String colorName() {
        this.color = color;
        return color;
    }

    @Override
    public Integer prijs() {
        this.prijs = prijs;
        return prijs;
    }
}
