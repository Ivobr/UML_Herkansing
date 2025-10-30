package code;

public class Blank implements Color{
    private String color = "None";
    private int prijs = 0;

    @Override
    public String colorName() {
        return color;
    }

    @Override
    public Integer prijs() {
        return prijs;
    }
}
