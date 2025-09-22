package code.Factory;

import code.Factory.BenzineAuto;

public class GAutoBenzine implements BenzineAuto {
    @Override
    public void vroom() {
        System.out.println("car go vroom");
    }
}
