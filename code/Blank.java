package code;

public class Blank implements Color{
    private String color = "Blank";
    private int prijs = 500;

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
