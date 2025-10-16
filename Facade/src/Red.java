public class Red implements Color{

    private String color = "Red";

    private int colorPrijs = 200;

    @Override
    public String colorName(){
        return color;
    }

    @Override
    public Integer prijs(){
        return colorPrijs;
    }
}
