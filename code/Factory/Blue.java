package code.Factory;

public class Blue implements Color{
    private String color = "Blue";
    private int prijs = 10;

    @Override
    public String colorName() {
        return color;
    }

    @Override
    public Integer prijs() {
        return prijs;
    }
}
