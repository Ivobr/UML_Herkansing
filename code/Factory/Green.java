package code.Factory;

import java.util.Random;

public class Green implements Color{
    private String color = "Green";

    private Random Rprijs =new Random();
    private int prijs = Rprijs.nextInt(10000);

    @Override
    public String colorName() {
        return color;
    }

    @Override
    public Integer prijs() {
        return prijs;
    }
}
