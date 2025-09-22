package code;

public class Blue implements Color{

    private String color = "Blue";
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
