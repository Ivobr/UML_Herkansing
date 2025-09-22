package code.Factory;

import code.Factory.BenzineAuto;

public class DAutoBenzine implements BenzineAuto {
    @Override
    public void vroom() {
        System.out.println("Goes vroom more expensive");
    }
}
