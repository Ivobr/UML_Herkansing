package code.Bridge.src;

public class Blue implements Color{
    private String color = "Blue";
    private int prijs = 1300;
    @Override
    public String colorName(){
        this.color = color;
        return color;
    }

    @Override
    public Integer prijs(){
        this.prijs = prijs;
        return prijs;
    }
}
