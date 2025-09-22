package code.Bridge.src;

public class Green implements Color{
    private String color = "Green";
    private int prijs = 600;

    @Override
    public String colorName() {
        this.color = color;
        return color;
    }

    @Override
    public Integer prijs(){
        this.prijs = prijs;
        return prijs;
    }
}
