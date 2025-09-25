package code.Factory;

public class Green implements Color{
    private String color = "Green";

    private int prijs = 400;

    @Override
    public String colorName() {
        return color;
    }

    @Override
    public Integer prijs() {
        return prijs;
    }
}
