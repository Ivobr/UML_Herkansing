package code;

public class Red implements Color{
    private String color = "Red";
    private int prijs = 5;

    @Override
    public String colorName(){
        return color;
    }

    @Override
    public Integer prijs(){
        return prijs;
    }

}
