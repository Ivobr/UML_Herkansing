package code.Factory;

import java.util.ArrayList;

public class Dealer {
    public String type = "Opium";
    ArrayList<BenzineAuto> BenzineAutos = new ArrayList<BenzineAuto>();
    ArrayList<ElektrischeAuto> ElektrischeAutos = new ArrayList<>();
    AutoMerk bmw;

    public Dealer(){
        System.out.println(type);
    }

    public void SetMerken(AutoMerk bmws){
        bmw = bmws;
    }
    public void WhatForSale(){
        System.out.println("Kleur, soort, merk: " + BenzineAutos);
        System.out.println("Kleur, soort, merk: " + ElektrischeAutos);
    }

    public void makeBenzineCar(AutoMerk autoMerk, Color kleur){

        BenzineAuto newCar = bmw.UitstootMaken("Goedkoop", kleur);

        System.out.println("Holy fuck first try, ");
        autoMerk.print();
        BenzineAutos.add(newCar);
        BenzineAuto BenzineAutoB = BenzineAutos.get(0);
        BenzineAutoB.informatie();
    }
}
